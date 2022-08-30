package com.formation.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDAO {
	public static ResultSet result;
	public static PreparedStatement ps;
	
	public Employee getById(int id) {
		try {
			
			ps  = Database.connexion.prepareStatement(
					"SELECT * FROM employe WHERE numemp=?");
			ps.setInt(1,id);
			
			result =ps.executeQuery();
			
			Employee employee = new Employee();
			if(result.next()) {
				employee.setNumemp(result.getInt( "NUMEMP" ));
				employee.setNomemp(result.getString( "NOMEMP" ));
				employee.setPrenomemp(result.getString( "PRENOMEMP" ));
				employee.setPoste(result.getString( "POSTE" ));
				employee.setSalaire(result.getFloat( "SALAIRE" ));
				employee.setPrime(result.getFloat( "PRIME" ));
				employee.setCodeprojet(result.getString( "CODEPROJET" ));
				employee.setSuperieur(result.getInt( "SUPERIEUR" ));
			}
			return employee;
			
		} catch (Exception ex) {
	    	ex.printStackTrace();
	    	return null;
	    }
	}
}
