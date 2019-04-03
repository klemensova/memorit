package cz.memorit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.controller.DoplnKartickuCtrl;
import cz.memorit.controller.KontrolaCtrl;
import cz.memorit.controller.OpakDoplnKartickuCtrl;
import cz.memorit.controller.OpakKontrolaCtrl;
import cz.memorit.controller.SeznamBalickuCtrl;
import cz.memorit.controller.SeznamKarticekCtrl;
import cz.memorit.controller.SmazatBalicekCtrl;
import cz.memorit.controller.UlozitBalicekCtrl;
import cz.memorit.controller.UlozitKartickuCtrl;
import cz.memorit.controller.VybratBalicekCtrl;
import cz.memorit.controller.VybratKartickuCtrl;
import cz.memorit.controller.VybratPetKarticekCtrl;

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
		    	String smazatBalicek = request.getParameter("smazatBalicek");
		    	VybratBalicekCtrl vybrctrl = new VybratBalicekCtrl();
		    	SeznamKarticekCtrl sezKartctrl = new SeznamKarticekCtrl();
		    	SmazatBalicekCtrl smazctrl = new SmazatBalicekCtrl();
		    	if (vybratBalicek != null) {
		    		redirect=vybrctrl.handle(request,response);
		    	} else if (vytvorKarticku != null){
		    		redirect=sezKartctrl.handle(request,response);
		    	} else if (smazatBalicek != null) {
		    		redirect=smazctrl.handle(request,response);
		    	}
		    break;
		    case "vyberKarticku":
		    	VybratKartickuCtrl seznamKart = new VybratKartickuCtrl ();
		    	redirect = seznamKart.handle(request,response);
		    break;
		    case "vyberPetKarticek":
		    	VybratPetKarticekCtrl sezPetKart = new VybratPetKarticekCtrl();
		    	redirect = sezPetKart.handle(request,response);	    	
		    break;
		    case "karticka":
		    	UlozitKartickuCtrl karticka = new UlozitKartickuCtrl();
		    	redirect = karticka.handle(request,response);	    	
		    break;
		    case "uvod":
		       redirect = "/index.jsp";	
		    break;
		 
		    case "ulozitBalicek":
                UlozitBalicekCtrl ulozBalicek = new UlozitBalicekCtrl();
                redirect = ulozBalicek.handle(request,response);
            break;
		    case "doplnKarticku":
		    	DoplnKartickuCtrl doplnKarticku = new DoplnKartickuCtrl();
		    	redirect = doplnKarticku.handle(request,response);
		    	break;
		    case "opakdoplnKarticku":
		    	OpakDoplnKartickuCtrl opakdoplnKarticku = new OpakDoplnKartickuCtrl();
		    	redirect = opakdoplnKarticku.handle(request,response);
		    	break;
		    case"kontrola":
		    	KontrolaCtrl kontrolaKarticky = new KontrolaCtrl();
		    	redirect = kontrolaKarticky.handle(request, response);
		    	break;
		    case"opakkontrola":
		    	OpakKontrolaCtrl opakkontrolaKarticky = new OpakKontrolaCtrl();
		    	redirect = opakkontrolaKarticky.handle(request, response);
		    	break;
		}
		
		
		getServletConfig().getServletContext().getRequestDispatcher(redirect).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
