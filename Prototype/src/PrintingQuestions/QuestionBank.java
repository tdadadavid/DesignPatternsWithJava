package PrintingQuestions;


public class QuestionBank{
   private final int max = 10;
   private int length;
    Question[] bank = new Question[max];


    public void addQuestion(Question question){
        if (length >= max){
            System.out.println("Oga think of the students, this life should not be hard");
        }

        bank[length++] = question;
    }

    public Question[] getQuestions() {
        return bank;
    }
}
