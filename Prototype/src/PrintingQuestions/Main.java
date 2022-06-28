package PrintingQuestions;

public class Main {
    public static void main(String[] args) {

        QuestionBank bank = new QuestionBank();

        bank.addQuestion(new Range("What is your minimum and maximum stride"));
        bank.addQuestion(new Boolean("Are you a boy"));
        bank.addQuestion(new MultipleChoice(
                "Which of these is the skeleton of the web",
                new String[]{"A. Html", "B. Css", "C. Javascript", "D. PHP"}
        ));


        Quiz quiz = new Quiz();
        quiz.printQuiz(bank);

    }
}
