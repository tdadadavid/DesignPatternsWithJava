package PrintingQuestions;

public class Boolean implements Question{

    private String question;

    Boolean(String question){
        this.question = question;
    }

    public void print(){
        System.out.println(this.question);
        System.out.println("A. True");
        System.out.println("B. False");
    }

}
