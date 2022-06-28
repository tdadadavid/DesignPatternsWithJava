package PrintingQuestions;

public class Quiz {
    Question[] questions;

    public void printQuiz(QuestionBank bank){
        this.questions = bank.getQuestions();

        for (Question question: questions){
            if (question == null) return;
            question.print();
            System.out.println("");
        }
    }
}
