package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/add")  //주소
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Add() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet............");
		
		//요청 파라미터에서 'a'와 'b'를 가져옴 
		String aParam = request.getParameter("a");
		String bParam = request.getParameter("b");
		
		int a = (aParam != null) ? Integer.parseInt(aParam) : 0;
		int b = (bParam != null) ? Integer.parseInt(bParam) : 0;
		
		int sum = a+b;
		
		//응당 콘텐츠 타입 설정(text/html)
		response.setContentType("text/html");
	
		//출력 스트림을 이용하여 브라우저로 결과 전송
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>The sum of a and b is" + sum + "</h1>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String aParam = request.getParameter("a");
		String bParam = request.getParameter("b");
		
		int a = (aParam != null) ? Integer.parseInt(aParam) : 0;
		int b = (bParam != null) ? Integer.parseInt(bParam) : 0;
		
		int sum = a+b;
		
		//응당 콘텐츠 타입 설정(text/html)
		response.setContentType("text/html");
	
		//출력 스트림을 이용하여 브라우저로 결과 전송
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1> Post Response!! </h1>");
		out.println("</body></html>");
	}

		
		
		
}


