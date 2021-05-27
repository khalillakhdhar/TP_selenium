package com.tp.entities;

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





}
