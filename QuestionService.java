
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String Selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(
                1,
                "Which keyword is used to inherit a class in Java?",
                "this",
                "super",
                "extends",
                "implements",
                "extends"
        );

        questions[1] = new Question(
                2,
                "Which of the following is not a Java feature?",
                "Object-oriented",
                "Use of pointers",
                "Platform independent",
                "Secure",
                "Use of pointers"
        );

        questions[2] = new Question(
                3,
                "Which method is the entry point of a Java program?",
                "start()",
                "main()",
                "run()",
                "init()",
                "main()"
        );

        questions[3] = new Question(
                4,
                "Which keyword is used to create an object in Java?",
                "class",
                "new",
                "object",
                "create",
                "new"
        );

        questions[4] = new Question(
                5,
                "Which of these is a checked exception?",
                "NullPointerException",
                "ArrayIndexOutOfBoundsException",
                "IOException",
                "ArithmeticException",
                "IOException"
        );

    }

    public void playQuizz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no.:" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            Selection[i] = sc.nextLine();
            i++;
        }
        for (String s : Selection) {
            System.out.println(s);
        }
    }
public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (Selection[i].equalsIgnoreCase(questions[i].getAnswer())) {
                score++;
            }
        }
        System.out.println("Your total score is: " + score + " out of " + questions.length);
    }
}
