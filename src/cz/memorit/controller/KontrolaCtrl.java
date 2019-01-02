package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KontrolaCtrl  implements ControllerInterface {

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String zadany = request.getParameter("dopln");
		String zapsany = request.getParameter("back_karta");
		String puvodni = request.getParameter("front_karta");
	    String odpoved = "";
		
					if (zadany != null && zadany.equals(zapsany)) {
						odpoved ="ano";
		                request.setAttribute("odpoved", odpoved);
		           	return  "/MemoritServlet?action=doplnKarticku";
					} else if (zadany != null && !zadany.equals(zapsany)) {
						odpoved = "ne";
				
						request.setAttribute("odpoved", odpoved);
						
						return  "/doplnovani.jsp";
						
							}  else  {
								odpoved = "neni";
								request.setAttribute("odpoved", odpoved);
								return  "/doplnovani.jsp";
								}
	
			
	
		// TODO Auto-generated method stub

	}

}
