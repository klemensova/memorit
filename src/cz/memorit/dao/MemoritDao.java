package cz.memorit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


import cz.memorit.bean.Balicek;
import cz.memorit.bean.SeznamBalicku;

public class MemoritDao {
	private static final String INSERTBALICEK = "INSERT INTO Balicek(nazev_balicek) VALUES (?)";
	private static final String LOADBALICEK = "SELECT * FROM Balicek";
	
	public void saveBalicek (Balicek novyBalicek) {
		DataSource ds = getDataSource();
		
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(INSERTBALICEK))
		{		
			stmt.setString(1, novyBalicek.getNazev_balicek());
			stmt.executeUpdate();
			//con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public SeznamBalicku load() {
		SeznamBalicku ret = new SeznamBalicku();
		ArrayList<Balicek> list = new ArrayList<>();
		DataSource ds = getDataSource();
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(LOADBALICEK)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Balicek bal = new Balicek();
				bal.setNazev_balicek(rs.getString("nazev_balicek"));
				bal.setId_balicek(rs.getInt("id_balicek"));
				list.add(bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ret.setBaliceklist(list);
		return ret;
	}
	
	
	
	private DataSource getDataSource( ) {
		try {
			Context ctx = new InitialContext();
			return (DataSource)ctx.lookup("java:/comp/env/jdbc/procvicovacipomuckaResource");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
