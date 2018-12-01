package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.bean.SeznamKarticek;
import cz.memorit.dao.MemoritDao;

public class SeznamKarticekCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();
	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Integer id_balicek = Integer.valueOf(request.getParameter("vytvorKarticku"));
		Balicek balicek = instanceDao.loadBalicek(id_balicek);
		request.getSession().setAttribute("id_balicek", balicek.getId_balicek());
		request.getSession().setAttribute("nazev_balicek", balicek.getNazev_balicek());
		SeznamKarticek seznam = instanceDao.loadSeznamKarticek(balicek.getId_balicek());
		request.setAttribute("seznamKarticek", seznam);
		return "/vytvorKarticku.jsp";
	}

}
