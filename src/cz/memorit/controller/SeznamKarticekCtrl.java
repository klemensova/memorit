package cz.memorit.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cz.memorit.bean.Karticka;
import cz.memorit.bean.SeznamBalicku;
import cz.memorit.bean.SeznamKarticek;
import cz.memorit.dao.MemoritDao;

public class SeznamKarticekCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();
	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String id_balicek = request.getParameter("vytvorKarticku");
		
		request.getSession().setAttribute(, value);
		SeznamKarticek seznam = instanceDao.loadSeznamKarticek();
		request.setAttribute("seznamKarticek", seznam);
		return "seznamBalicku.jsp";
	}

}
