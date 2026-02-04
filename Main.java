import java.util.ArrayList;
import java.util.Scanner;

class Question {
    String question;
    String option1, option2, option3, option4;
    int correctOption;

    Question(String question, String option1, String option2, String option3, String option4, int correctOption) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }

    boolean checkAnswer(int answer) {
        return answer == correctOption;
    }

    void displayQuestion() {
        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }
}

public class Main {

    static ArrayList<Question> questions = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        loadQuestions();

        int score = 0;

        System.out.println("🎯 Quiz Application developed by Monty");

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int ans = scanner.nextInt();

            if (q.checkAnswer(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
            System.out.println();
        }

        System.out.println("🏆 Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.size());
    }

    static void loadQuestions() {
        questions.add(new Question(
                "What is Java?",
                "Programming Language",
                "Animal",
                "Car",
                "City",
                1));

        questions.add(new Question(
                "Which keyword is used to create object?",
                "class",
                "new",
                "void",
                "static",
                2));

        questions.add(new Question(
                "Which method is entry point of Java program?",
                "start()",
                "run()",
                "main()",
                "init()",
                3));
    }
}
