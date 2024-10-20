package com.playQuiz;

public class Main {

	public static void main(String[] args) {
		
	QuestionService service= new QuestionService();
    service.quizPlay();
    service.printScore();
	}

}
