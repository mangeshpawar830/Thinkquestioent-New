package com.patient;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.connection.DatabaseConnection;


@WebServlet("/AddPrescription")
public class AddPrescription extends HttpServlet {
	private final String UPLOAD_DIRECTORY = "C:/Users/Admin/git/ThinkQuestioent/E-PassGenerationSystem/WebContent/";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				String imageName = null;
				String source = null;
				String destination = null;
				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						imageName = new File(item.getName()).getName();
						item.write(new File(UPLOAD_DIRECTORY + File.separator + imageName));
						FileItem tsource = (FileItem) multiparts.get(0);
						source = tsource.getString();
						FileItem tdestination = (FileItem) multiparts.get(1);
						destination = tdestination.getString();
					}
				}
				try {
					int id = 0;
					String imagePath = UPLOAD_DIRECTORY + imageName;
					String status = "Pending";
					if (source.equals(destination)) {
						String failMessage="source and destination city can not be same, please choose different";
						session.setAttribute("fail", failMessage);
						response.sendRedirect("apply-epass.jsp");
					} else {
						int i = DatabaseConnection.insertUpdateFromSqlQuery(
								"update tblpatient set patient_prescription_path='" + imagePath + "',e_pass_status='"
										+ status + "',source_city='" + source + "',destination_city='" + destination
										+ "' where user_name='" + session.getAttribute("uname") + "'");
						if (i > 0) {
							String success = "Prescription added successfully.";
							session.setAttribute("message", success);
							response.sendRedirect("apply-epass.jsp");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (Exception ex) {
				request.setAttribute("message", "Medical Prescription Upload Failed due to " + ex);
			}

		} else {
			request.setAttribute("message", "Sorry this code only handles file upload request");
		}

	}

}
