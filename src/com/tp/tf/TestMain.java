package com.tp.tf;

import java.sql.SQLException;

import com.tp.entities.Connexion;
import com.tp.entities.User;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Connexion c=new Connexion();
		User u=new User(1,"khalil","lakhdhar","test@test.com","teste",89,30);
		//u.ajout();
		try {
			System.out.println(u.authentifier());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
