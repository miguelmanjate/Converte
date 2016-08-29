package mz.com.convet.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adiciona")
public class Convet extends HttpServlet {
	String roma = "";
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String numeroString = request.getParameter("natural");
		int vlr = Integer.parseInt(numeroString);
		// int sobra = 0;
		roma = "";
		if (vlr < 4000) {

			while (vlr >= 1000) {
				roma += "M";
				vlr -= 1000;
			}

			while (vlr >= 900) {
				roma += "CM";
				vlr -= 900;
			}
			while (vlr >= 500) {
				roma += "D";
				vlr -= 500;
			}
			while (vlr >= 400) {
				roma += "CD";
				vlr -= 400;
			}
			while (vlr >= 100) {
				roma += "C";
				vlr -= 100;
			}
			while (vlr >= 90) {
				roma += "XC";
				vlr -= 90;
			}
			while (vlr >= 50) {
				roma += "L";
				vlr -= 50;
			}
			while (vlr >= 40) {
				roma += "XL";
				vlr -= 40;
			}
			while (vlr >= 10) {
				roma += "X";
				vlr -= 10;
			}
			while (vlr >= 9) {
				roma += "IX";
				vlr -= 9;
			}

			while (vlr >= 5) {
				roma += "V";
				vlr -= 5;
			}
           if(vlr <= 4 && vlr >0){
        	   roma = converteUnidades(vlr);
           }
		
			request.setAttribute("romano", roma);
			RequestDispatcher rd = request.getRequestDispatcher("/formulario.jsp");
			rd.forward(request, response);

			// System.out.println("O Algarismo Romano correspondente a " + " é "
			// + roma);
		} else {
			RequestDispatcher rb = request.getRequestDispatcher("/romanos.jsp");
			rb.forward(request, response);

		}
		
	}
	public String converteUnidades(int vlr) {
		while (vlr >= 4) {
			roma += "IV";
			vlr -= 4;
		}

		while (vlr >= 1) {
			roma += "I";
			vlr -= 1;
		}
		
		return roma;
		
		
	}
}
