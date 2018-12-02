package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KontrolaCtrl  implements ControllerInterface {

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String zadany = request.getParameter("dopln");
		String zapsany = request.getParameter("back_karta");
		String vysledek = "";
		
					if (zadany != null && zadany.equals(zapsany)) {
							 vysledek = "OK"; 
					}else if (zadany != null && !zadany.equals(zapsany)) {
						vysledek = "NOK";
							}  else {
								vysledek = "NULL";
								}
					request.setAttribute("vysledek", vysledek);
			
	
		// TODO Auto-generated method stub
		return "/doplnovani.jsp";
	}

}
