package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParolaDAO {
	
	public boolean esisteParola(String parola) {
		String sql = "SELECT nome FROM parola WHERE nome = ?";
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, parola);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				conn.close();
				return true;
			} else {
				conn.close();
				return false;
			}
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	

}
