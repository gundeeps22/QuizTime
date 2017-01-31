import java.util.Scanner;
public class QuizTimedriver {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("How many questions would you like in the the quiz: ");
		int quizsize = scan.nextInt();
		Quiz quiz1 = new Quiz (quizsize);

		for (int i = -1; i < quizsize; i++){
			System.out.println("What would you like question " + (i + 1) + " to be: ");
			String question = scan.nextLine();
			System.out.println("What is the answer to the question " + (i + 1));
			String answer = scan.nextLine();

			if (i < 0){
				System.out.println("An index less than one cannot be inputed.");
			}else
				quiz1.add(i, question, answer);
		}
		quiz1.giveQuiz();
	}
}
