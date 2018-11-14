package openclassrom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Calculatrice() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String numberOne = request.getParameter("premier");
		String annotherOne = request.getParameter("deuxieme");
		String operation = request.getParameter("operateur");
		int nombre1,nombre2,resultat = 0;
		if(operation != null) {
		if(!numberOne.isEmpty()) 
			nombre1 = Integer.parseInt(numberOne);
		else  nombre1 = 0;
		
		if(!annotherOne.isEmpty()) 
			nombre2 = Integer.parseInt(annotherOne);
		else  nombre2 = 0;
		
		switch (operation) {
		case "+": resultat = nombre1 + nombre2;
			break;
		case "-": resultat = nombre1 - nombre2;
		break;
		case "*": resultat = nombre1 * nombre2;
		break;
		case "/": resultat = (int)(nombre1 / nombre2);
		break;

		}
		
		
		request.setAttribute("premier1", Integer.toString(nombre1));
		request.setAttribute("deuxieme2", Integer.toString(nombre2));
		request.setAttribute("operation", operation);
		request.setAttribute("resultat", Integer.toString(resultat));

		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/Calculatrice.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
