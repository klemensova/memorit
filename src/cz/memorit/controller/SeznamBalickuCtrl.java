package cz.memorit.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.bean.SeznamBalicku;
import cz.memorit.dao.MemoritDao;

public class SeznamBalickuCtrl implements ControllerInterface {
	private MemoritDao instanceDao = new MemoritDao();

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
	
		
		SeznamBalicku seznam = instanceDao.loadSeznamBalicku();
		request.setAttribute("seznamBalicku", seznam);
		return "/MemoritServlet?action=vypisSeznam";
	}

}
