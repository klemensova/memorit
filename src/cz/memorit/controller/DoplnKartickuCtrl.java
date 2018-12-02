package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Karticka;
import cz.memorit.bean.SeznamKarticek;
import cz.memorit.dao.MemoritDao;

public class DoplnKartickuCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();

	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Integer idBalicku = (Integer) request.getSession().getAttribute("id_balicek");
		if (idBalicku != null) {
			SeznamKarticek seznam = instanceDao.loadKarticka(idBalicku, 1);
			if (seznam != null && seznam.getKartaList().size() > 0) {
				Karticka doplnKarticku = seznam.getKartaList().get(0);
				request.setAttribute("doplnKarticku", doplnKarticku);
			}
		}
		return "/doplnovani.jsp";
	}

}
