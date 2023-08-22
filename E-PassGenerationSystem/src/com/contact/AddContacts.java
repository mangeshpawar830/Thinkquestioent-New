package com.contact;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.DatabaseConnection;

/**
 * Servlet implementation class AddContacts
 */
@WebServlet("/AddContacts")
public class AddContacts extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cid = 0;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		try {
			int addContact = DatabaseConnection.insertUpdateFromSqlQuery("insert into tblcontact(contact_id,name,email,subject,message)values('" + cid
							+ "','" + name + "','" + email + "','" + subject + "','" + message + "')");
			if (addContact > 0) {
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
