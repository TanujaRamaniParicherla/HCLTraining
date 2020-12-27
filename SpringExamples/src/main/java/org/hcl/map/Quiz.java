package org.hcl.map;

import java.util.Map;

public class Quiz {
	private String question;
	private Map<String,String> answers;
	public Quiz() {
		// TODO Auto-generated constructor stub
	}
	public Quiz(String question, Map<String, String> answers) {
		super();
		this.question = question;
		this.answers = answers;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	

}
