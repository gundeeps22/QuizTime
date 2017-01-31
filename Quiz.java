import java.util.Scanner;
public class Quiz {
	private Question[] quiz;
	public Quiz (int size){
		quiz = new Question [size];
	}
	public void add (int index, String newQuestion, String newAnswer){
		Question q1 = new Question (newQuestion,newAnswer);
		quiz [index] = q1;
	}
	public String giveQuiz (){
		Scanner scan = new Scanner (System.in);

		int correctnumber = 0;
		for (int i = 0; i < quiz.length; i++){
			System.out.println(quiz[i].getQuestion());
			System.out.println();
			System.out.println("What is your response: ");
			String UserAnswer = scan.nextLine();
			String output = null;
			if (quiz[i].getAnswer().equalsIgnoreCase(UserAnswer)){
				output = "Your answer is correct";
				correctnumber = correctnumber + 1;
			}else{
				output = "Your answer is incorrect";
			}
			return output;
		}
		return ("The total amount you got correct is " + correctnumber);
	}
}
