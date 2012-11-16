package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Question extends Model {

	public String question;
	
	public int yes = 0;
	
	public int no = 0;
	
	public String toString() {
		return question;
	}
}
