package com.cts.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Question {
	private int qid;
	private String question;
	//@Autowired //field Injection
	private List<String> answers;

	
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	public List<String> getAnswers() {
		return answers;
	}

	@Autowired//setter Injection
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answers=" + answers + "]";
	}
	
	//@Autowired //constructor Injection
	public Question(int qid, String question, List<String> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
