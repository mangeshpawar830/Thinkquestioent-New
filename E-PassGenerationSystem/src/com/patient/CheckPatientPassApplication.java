package com.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.DatabaseConnection;

/**
 * Servlet implementation class CheckPatientPassApplication
 */
@WebServlet("/CheckPatientPassApplication")
public class CheckPatientPassApplication extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullText = null;
		String patient_prescription_path = null;
		String patient_id = request.getParameter("patient_id");
		String applicationStatus = "Approved";
		String patientName = null;
		HttpSession session = request.getSession();
		try {
			ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select * from tblpatient where patient_id='" + patient_id + "'");
			if (resultset.next()) {
				patient_prescription_path = resultset.getString("patient_prescription_path");
			}
		} catch (Exception e) {

		}

		try {
			Tesseract tesseract = new Tesseract();
			tesseract.setDatapath("F:/project-workspace/E-PassGenerationSystem/WebContent/upload/testdata/");
			fullText = tesseract.doOCR(new File(patient_prescription_path));
			System.out.println("Prescription image extracted data.: " + fullText);

			String[] splited = fullText.split("\\s");
			System.out.println("Splitted length is " + splited.length);

			boolean ismatched = false;
			ResultSet rs = DatabaseConnection.getResultFromSqlQuery("SELECT * FROM tblpatient WHERE patient_id='" + patient_id + "'");
			if (rs.next()) {
				patientName = rs.getNString("patient_full_name");
				
				for (int i = 0; i < splited.length; i++) {
					if (splited[i].equalsIgnoreCase(patientName)) {
						ismatched = true;
						System.out.println("Patient Name Matched" + splited[i] + " Patient Name -" + patientName);
						break;
					} else if (splited[i].equalsIgnoreCase(patient_id)) {
						ismatched = true;
						System.out.println("Patient Id Matched" + splited[i]+" Patient Id -" + patient_id);
						break;
					}
				}
			}
			if (ismatched) {
				DatabaseConnection.insertUpdateFromSqlQuery("update tblpatient set e_pass_status='" + applicationStatus+ "' where patient_id='" + patient_id + "'");
				String message = "Your medical prescription data matched hence your application have approved";
				session.setAttribute("success", message);
				response.sendRedirect("e-pass-application.jsp");

			} else {
				DatabaseConnection.insertUpdateFromSqlQuery("update tblpatient set e_pass_status='Rejected' where patient_id='" + patient_id + "'");
				String fail = "Your medical prescription data not matched hence your application have rejected";
				session.setAttribute("fail", fail);
				response.sendRedirect("e-pass-application.jsp");
			}

		} catch (TesseractException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
