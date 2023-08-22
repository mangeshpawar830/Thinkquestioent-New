package com.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.DatabaseConnection;


@WebServlet("/PatientAccountRegister")
public class PatientAccountRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pemail = request.getParameter("pemail");
		String pmobile = request.getParameter("pmobile");
		String paddress = request.getParameter("paddress");
		String pdisease = request.getParameter("disease");
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		HttpSession hs = request.getSession();
		try {
			int vendor = DatabaseConnection.insertUpdateFromSqlQuery("insert into tblpatient(patient_id,patient_full_name,patient_email,patient_mobile,patient_address,patient_disease,user_name,password)values('" + pid + "','"
							+ pname + "','" + pemail + "','" + pmobile + "','" + paddress + "','" + pdisease + "','"
							+ uname + "','"+upass+"')");
			if (vendor > 0) {
				String message = "Account Created Sucessfully";
				hs.setAttribute("credential", message);
				hs.setAttribute("pid", pid);
				hs.setAttribute("uname", uname);
				response.sendRedirect("patient-sign-up.jsp");
			} else {
				response.sendRedirect("patient-sign-up.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
