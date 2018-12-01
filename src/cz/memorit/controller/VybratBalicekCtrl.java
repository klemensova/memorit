package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.bean.Karticka;
import cz.memorit.bean.SeznamBalicku;
import cz.memorit.bean.SeznamKarticek;
import cz.memorit.dao.MemoritDao;

public class VybratBalicekCtrl implements ControllerInterface {
	MemoritDao instanceDao = new MemoritDao();

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Integer id_balicek = Integer.valueOf(request.getParameter("vybratBalicek"));
		Balicek balicek = instanceDao.loadBalicek(id_balicek);
		request.getSession().setAttribute("id_balicek", balicek.getId_balicek());
		request.getSession().setAttribute("nazev_balicek", balicek.getNazev_balicek());
		return "/MemoritServlet?action=vypisSeznam";
	}

}
