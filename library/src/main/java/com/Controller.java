package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface Controller {
	
public String rquestHandler(HttpServletRequest request, HttpServletResponse rseponse) 
        throws ServletException, IOException;

}
