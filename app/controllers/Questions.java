package controllers;

import java.util.List;

import play.Logger;

import models.Question;

//@With(Secure.class)
public class Questions extends CRUD {

	public static void listXML() {
		renderXml(Question.all().fetch());
	}
	
	public static void answer(long id, String answer) {
		Question question = Question.findById(id);
		
		if (question != null) {
			if (answer.equals("yes")) question.yes++;
			if (answer.equals("no")) question.no++;
			
			question.save();
		}
		
		ok();
	}
}
