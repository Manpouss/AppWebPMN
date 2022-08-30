package com.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formation.model.Database;
import com.formation.model.Employee;
import com.formation.model.EmployeeDAO;

/**
 * Servlet implementation class DisplayEmployee
 */
@WebServlet("/DisplayEmployee")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database.Connect();
		EmployeeDAO e_dao = new EmployeeDAO();
		Employee duchatel = e_dao.getById(4);
		System.out.println("test "+duchatel);
		request.setAttribute("duchatel", duchatel);
		this.getServletContext().getRequestDispatcher("/WEB-INF/employe.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
