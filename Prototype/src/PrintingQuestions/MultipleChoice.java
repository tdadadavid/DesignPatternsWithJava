package PrintingQuestions;

public class MultipleChoice implements Question {
    private String question;
    private String[] options;

    MultipleChoice(String question, String[] options){
        this.question = question;
        this.options = options;
    }

    public void print(){
        System.out.println(this.question);
        for (String option: this.options){
            System.out.println(option);
        }
    }
}
