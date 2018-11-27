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
			Integer idBalicku = (Integer)request.getSession().getAttribute("id_balicek");
			Balicek nactenyBalicek = instanceDao.loadBalicek(idBalicku);
			nactenyBalicek
			return "/SeznamBalicku.jsp";
		
		
	}

}
