package cz.memorit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import cz.memorit.bean.Balicek;

public class MemoritDao {
	private static final String INSERTBALICEK = "INSERT INTO BALICEK(nazev_balicek) VALUES (?)";
	
	public void saveBalicek (Balicek novyBalicek) {
		DataSource ds = getDataSource();
		
		try (Connection con = ds.getConnection();
				PreparedStatement stmt = con.prepareStatement(INSERTBALICEK))
		{		
			stmt.setString(1, novyBalicek.getNazev_balicek());
			stmt.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
