package br.usp.pcs.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Cliente> lista;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
    	super();
    	lista = new ArrayList<Cliente>();
    	
    	lista.add(new Cliente("Vitor Sanches", "vitor.sanches@gmail.com", "11 94997-6437","879.564.879-87","15, rua Augusta, Sao Paulo", 120));
    	lista.add(new Cliente("Paulo Sanches", "paulo.sanches@gmail.com", "11 66497-6437","649.567.879-87","15, rua Augusta, Sao Paulo", 120));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.getWriter().append("Served at: ").append(request.getContextPath());
	    request.setAttribute("Clientes",lista);
	    
	    RequestDispatcher requestDispatcher =
	    getServletContext().getRequestDispatcher("/detalhe.jsp");
	    requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
