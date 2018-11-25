package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Karticka;
import cz.memorit.bean.SeznamKarticek;
import cz.memorit.dao.MemoritDao;

public class VybratKartickuCtrl implements ControllerInterface{
	private MemoritDao instanceDao = new MemoritDao();
	
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Integer idBalicku = (Integer)request.getSession().getAttribute("id_balicek");
		SeznamKarticek seznam = instanceDao.loadKarticka(idBalicku, 1);
		if(seznam != null) {
			Karticka nactenaKarticka = seznam.getKartaList().get(0);
			request.setAttribute("randomKarticka", nactenaKarticka);
		} 
		return "/karticky.jsp";
	}
	
}
