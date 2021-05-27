package com.tp.entities;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class User {
private int id;
private String nom,prenom,email,password;
private int score,age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(int id, String nom, String prenom, String email, String password, int score, int age) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.password = password;
	this.score = score;
	this.age = age;
}
public User() {
}
@Override
public String toString() {
	return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password
			+ ", score=" + score + ", age=" + age + "]";
}

public boolean authentifier() throws SQLException
{
Connexion c = new Connexion(); //appel de connexion à la BD
  PreparedStatement pst; 
  pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM `user` WHERE `email`='"+this.getEmail()+"' AND password='"+this.getPassword()+"' "); // lister les admins
  pst.executeQuery(); // lister les admins
  ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
  if(rs.next()) {
     // System.out.println(rs.getString("nom")); //teste d’affichage
     return true;
  }
  else
      return false;


}
public void ajout() {
    try {
//TODO add your handling code here:
        Connexion c = new Connexion();
        java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `user`( `nom`, `prenom`, `email`, `password`, `age`, `score`) VALUES('" + this.getNom()+ "','" + this.getPrenom() + "','" + this.getEmail() + "','" + this.getPassword() + "','" + this.getAge() + "','" + this.getScore() + "')");
        statement.executeUpdate();
    } catch (SQLException ex) {
                    System.out.println(ex);

    }
}

}
