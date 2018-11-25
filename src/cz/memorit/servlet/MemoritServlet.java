package cz.memorit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.controller.SeznamBalickuCtrl;
import cz.memorit.controller.SeznamKarticekCtrl;
import cz.memorit.controller.UlozitKartickuCtrl;
import cz.memorit.controller.VybratKartickuCtrl;
import cz.memorit.controller.VybratPetKarticekCtrl;
import cz.memorit.controller.vybratBalicekCtrl;
import cz.memorit.dao.MemoritDao;

@WebServlet("/MemoritServlet")
public class MemoritServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemoritServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect = "";
		
	
		String action = request.getParameter("action");
		switch (action) {
		
		
		    case "vypisSeznam":
		    	SeznamBalickuCtrl vypisctrl = new SeznamBalickuCtrl();
		        redirect = vypisctrl.handle(request,response);
		    break;
		    case "vybernebovytvor":
		    	String vybratBalicek = request.getParameter("vybratBalicek");
		    	String vytvorKarticku =request.getParameter("vytvorKarticku");
		    	vybratBalicekCtrl vybrctrl = new vybratBalicekCtrl();
		    	SeznamKarticekCtrl sezKartctrl = new SeznamKarticekCtrl();
		    	if (vybratBalicek != null) {
		    		redirect=vybrctrl.handle(request,response);
		    	} else if (vytvorKarticku != null){
		    		redirect=sezKartctrl.handle(request,response);
		    	}
		    case "vyberKarticku":
		    	VybratKartickuCtrl seznamKart = new VybratKartickuCtrl ();
		    	redirect = seznamKart.handle(request,response);
		    	
		    case "vyberPetKarticek":
		    	VybratPetKarticekCtrl sezPetKart = new VybratPetKarticekCtrl();
		    	redirect = sezPetKart.handle(request,response);	    	

		}
		/*
		 * 1) vzit parametr action
		 * 2) pokud action == vybernebovytvor vezmeme parametry vybratBalicek a vytvorKarticku
		 * 3)  podle toho, ktery parametr nebude null pustime controller
		 * 4) Pokud nebude null vybratBalicek zavolam metodu handle z controlleru vybratBalicekCtrl
		 * 5) metoda vrati /MemoritServlet?action="vypisSeznam" -> ulozit do redirect
		 * 
		 * switch (action)
			{
			    case "vypisSeznam":
			        vypisSeznamCtrl.handle(request,response);
			    break;
			}
		 * 
		 * 
		 * 
		 */
		getServletConfig().getServletContext().getRequestDispatcher(redirect).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
