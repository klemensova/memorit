package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpakKontrolaCtrl   implements ControllerInterface{

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String zadany = request.getParameter("dopln");
		String zapsany = request.getParameter("back_karta");
	
	    String odpoved = "";
		
					if (zadany != null && zadany.equals(zapsany)) {
						odpoved ="ano";
		                request.setAttribute("odpoved", odpoved);
		           	return  "/MemoritServlet?action=opakdoplnKarticku";
					} else if (zadany != null && !zadany.equals(zapsany)) {
						odpoved = "ne";
				
						request.setAttribute("odpoved", odpoved);
						
						return  "/opakdoplnovani.jsp";
						
							}  else  {
								odpoved = "neni";
								request.setAttribute("odpoved", odpoved);
								return  "/opakdoplnovani.jsp";
								}
	
			
	
		// TODO Auto-generated method stub

	}
	

}
