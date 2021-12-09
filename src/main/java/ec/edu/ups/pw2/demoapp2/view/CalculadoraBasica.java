package ec.edu.ups.pw2.demoapp2.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.pw2.demoapp2.ON.CalculadoraON;
import ec.edu.ups.pw2.demoapp2.ON.CalculadoraONLocal;

/**
 * Servlet implementation class CalculadoraBasica
 */
@WebServlet("/CalculadoraBasica")
public class CalculadoraBasica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraONLocal calcON;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraBasica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		double n = calcON.suma(30, 60);
		response.getOutputStream().println("<h1>UPS</h1>" + n);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
