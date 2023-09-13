package com.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.DatabaseConnection;


@WebServlet("/PatientProfileUpdate")
public class PatientProfileUpdate extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String disease = request.getParameter("disease");
		String address = request.getParameter("address");
		HttpSession hs = request.getSession();
		try {
			int updateProfile = DatabaseConnection.insertUpdateFromSqlQuery("update tblpatient set patient_full_name='" + fname
					+ "',patient_email='" + email + "',patient_mobile='" + mobile + "',patient_disease='" + disease + "',patient_address='" + address
					+ "' where user_name='" + hs.getAttribute("uname") + "'");
			if (updateProfile > 0) {
				String message = "You profile updated successfully.";
				hs.setAttribute("success", message);
				response.sendRedirect("user-profile-update.jsp");
			} else {
				response.sendRedirect("user-profile-update.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
