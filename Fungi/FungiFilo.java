package Fungi;

import java.util.Scanner;

public class FungiFilo extends Fungi {

    Scanner scan = new Scanner(System.in);
    private String filo;

    public FungiFilo() {
        super();
    }

    public FungiFilo(String filo) {
        super();
        this.filo = filo;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

}
