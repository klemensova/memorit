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
import cz.memorit.bean.Karticka;
import cz.memorit.bean.SeznamBalicku;
import cz.memorit.bean.SeznamKarticek;

public class MemoritDao {
	private static final String INSERTBALICEK = "INSERT INTO Balicek(nazev_balicek) VALUES (?)";
	private static final String LOADSEZNAMBALICKU = "SELECT * FROM Balicek";
	private static final String INSERTKARTA = "INSERT INTO Karta(front_karta, back_karta) VALUES (?,?)";
	private static final String LOADSEZNAMKARTICEK = "SELECT * FROM Karta WHERE id_balicek = ?";
	private static final String LOADBALICEK = "SELECT * FROM Balicek WHERE id_balicek = ?";
	private static final String LOADKARTICKA = "SELECT * FROM Karta WHERE id_balicek = ? ORDER BY RAND() LIMIT ?";
	
	
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
	
	public SeznamBalicku loadSeznamBalicku() {
		SeznamBalicku ret = new SeznamBalicku();
		ArrayList<Balicek> list = new ArrayList<>();
		DataSource ds = getDataSource();
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(LOADSEZNAMBALICKU)) {
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
	
	public void saveKarticka (Karticka novaKarticka) {
		DataSource ds = getDataSource();
		
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(INSERTKARTA))
		{		
			stmt.setString(1, novaKarticka.getFront_karta());
			stmt.setString(2, novaKarticka.getBack_karta());
			stmt.executeUpdate();
			//con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public SeznamKarticek loadSeznamKarticek(Integer id_balicek) {
		SeznamKarticek ret = new SeznamKarticek();
		ArrayList<Karticka> list = new ArrayList<>();
		DataSource ds = getDataSource();
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(LOADSEZNAMKARTICEK)) {
			stmt.setInt(1, id_balicek);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Karticka kar = new Karticka();
				kar.setFront_karta(rs.getString("front_karta"));
				kar.setBack_karta(rs.getString("back_karta"));
				kar.setId_balicek(rs.getInt("id_karta"));
				list.add(kar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ret.setKartaList(list);
		return ret;
	}
	
	public Balicek loadBalicek(Integer id_balicek) {
		DataSource ds = getDataSource();
		try (Connection con = ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(LOADBALICEK)) {
			stmt.setInt(1, id_balicek);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Balicek bal = new Balicek();
				bal.setNazev_balicek(rs.getString("nazev_balicek"));
				bal.setId_balicek(rs.getInt("id_balicek"));
				return bal;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public SeznamKarticek loadKarticka(Integer id_balicek, Integer pocet) {
		SeznamKarticek ret = new SeznamKarticek();
		ArrayList<Karticka> list = new ArrayList<>();
		DataSource ds = getDataSource();
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(LOADKARTICKA)) {
			stmt.setInt(1, id_balicek);
			stmt.setInt(2, pocet);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Karticka kar = new Karticka();
				kar.setFront_karta(rs.getString("front_karta"));
				kar.setBack_karta(rs.getString("back_karta"));
				kar.setId_balicek(rs.getInt("id_karta"));
				list.add(kar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ret.setKartaList(list);
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
