
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calc", urlPatterns = { "/Calc" })
public class Calculator extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String First = request.getParameter("firstNumber");
		String Second = request.getParameter("secondNumber");
		String operation =  request.getParameter("operation");
		
		int FirstNumber = Integer.parseInt(First);
		int SecondNumber = Integer.parseInt(Second);
		int result;
		
		  out.println("<!DOCTYPE html>");
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<meta charset=\"utf-8\">");  // escape the quote marks
		  out.println("<title>Calculator || Result </title>");
		  out.println("<link rel='stylesheet' type='text/css' href='style.css' />");     
		  out.println("</head>");	  
		  out.println("<body>");
		  out.println("<div class='formcontainer'>");
		  out.println("<div class='container'>");
		  out.println("<label>Your Answer is :</label>");
		  
		  if(operation.equals("+")){ 
			  result = FirstNumber + SecondNumber; 
			  out.print(result);
		  }
		  else if(operation.equals("-")){
			  result = FirstNumber - SecondNumber; 
			  out.print(result);
		  }
		  else if(operation.equals("*")){
			  result = FirstNumber * SecondNumber; 
			  out.print(result);
		  }
		  else if(operation.equals("/")){
			  result = FirstNumber / SecondNumber; 
			  out.print(result);
		  }
		  
		  out.println("<br><br><a href='index.html'>back</a>");
		  out.println("</form>");
		  out.println("</body>");
		  out.println("</html>");
		
	}

}
