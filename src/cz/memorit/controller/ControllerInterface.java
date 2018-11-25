package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerInterface {
	
	public void handle(HttpServletRequest request, HttpServletResponse response);

}
