package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.dao.MemoritDao;

public class UlozitBalicekCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();
	
	

	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String novyNazevBalicek = request.getParameter("nazev_balicek");
		Balicek novyBalicek = new Balicek();
		novyBalicek.setNazev_balicek(novyNazevBalicek);
		instanceDao.saveBalicek(novyBalicek);
		return "/MemoritServlet?action=vypisSeznam";
		
	}
}
