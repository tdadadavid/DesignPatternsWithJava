package PrintingQuestions;

// implements create "IS-A" relationship

import java.util.Arrays;

public class Range implements Question{

    private String question;

    Range(String question){
        this.question = question;
    }

    @Override
    public void print() {
        System.out.println(this.question);
        System.out.println("Minimum __________________________");
        System.out.println("Maximum __________________________");
    }
}
