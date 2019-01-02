package cz.memorit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cz.memorit.bean.Balicek;
import cz.memorit.dao.MemoritDao;

public class SmazatBalicekCtrl  implements ControllerInterface {
	
	MemoritDao instanceDao = new MemoritDao();
	
	
	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Integer id_balicek = Integer.valueOf(request.getParameter("smazatBalicek"));
		Balicek balicek = instanceDao.delBalicek(id_balicek);
		// TODO Auto-generated method stub
		return "/MemoritServlet?action=vypisSeznam";
	}

}
