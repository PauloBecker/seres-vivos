package Fungi;

import java.util.Scanner;

public class Filo extends Fungi {

    Scanner scan = new Scanner(System.in);
    private String filo;

    public Filo() {
        super();
    }

    public Filo(String filo) {
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
