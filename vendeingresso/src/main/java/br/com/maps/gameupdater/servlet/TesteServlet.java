package br.com.maps.gameupdater.servlet;

import java.io.IOException;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="TesteServlet",urlPatterns="/teste")
public class TesteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	    
	    JobOperator jobOperator = BatchRuntime.getJobOperator();
	    long execID = jobOperator.start("phonebilling", null);	    
		resp.getWriter().print("uhu! Processo:" + execID);
	}
}