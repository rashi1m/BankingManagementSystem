package com.playQuiz;

import java.util.Scanner;

public class QuestionService {

	Question[] questions=new Question[5];
	String selection[]=new String[5];
    
	public QuestionService()
	{
		questions[0] = new Question(1,"What is the capital of west bengal?","Kolkata","Jaipur","Agartla","Gandhi Nagar","Kolkata");
		questions[1] = new Question(2, "What is the capital of Maharastra?", "Panji", "Jaipur", "Mumbai", "Chandigarh", "Mumbai");
		questions[2] = new Question(3, "Who is the father of computer?", "Charles Babbage", "Karl Benz", "Qwert yuiop", "John J.Loud", "Charles Babbage");
		questions[3] = new Question(4, "Who was the first women prime minister? ", "Indira Gandhi", "Yuri Gagarian", "Sirimavo Bandaranaike", "Pratibha Patel", "Sirimavo Bandaranaike");
		questions[4] = new Question(5, "What is the capital of Australia?", "Canberra", "Bhutan", "Washington", "Spain", "Canberra");
	}
	
	
	
	public void quizPlay()
	{
		int i=0;
		for(Question q: questions)
		{
		System.out.println("Question no. :" + q.getId());
		System.out.println(q.getQuestion());
		System.out.println(q.getOpt1());
		System.out.println(q.getOpt2());
		System.out.println(q.getOpt3());
		System.out.println(q.getOpt4());
		
		Scanner sc = new Scanner(System.in);
		selection[i] = sc.nextLine();
		i++;
	}
		for(String s: selection)
		{
			System.out.println(s);
		}
	
	}
     public void printScore()
        {
        int score = 0;
        
        for(int i=0;i<questions.length;i++)
        {
    	 Question que=questions[i];
    	 String actualAnswer = que.getAnswer();
    	 
    	 String userAnswer =selection[i];
    	 
    	 if(actualAnswer.equals(userAnswer))
    	 {
    		 score++;
    	 }
    	 
    	 System.out.println("your score is: " + score);
    	 
        }
}
}