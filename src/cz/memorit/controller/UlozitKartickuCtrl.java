package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Karticka;
import cz.memorit.dao.MemoritDao;

public class UlozitKartickuCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();
	
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String novyFrontKarta = request.getParameter("front_karta");
		String novyBackKarta = request.getParameter("back_karta");
		Karticka novaKarticka = new Karticka();
		novaKarticka.setFront_karta(novyFrontKarta);
		novaKarticka.setBack_karta(novyBackKarta);
		Integer idBalicku = (Integer)request.getSession().getAttribute("id_balicek");
		novaKarticka.setId_balicek(idBalicku);
		instanceDao.saveKarticka(novaKarticka);
		
		return "/MemoritServlet?action=vybernebovytvor&vytvorKarticku="+idBalicku;
	}

}
