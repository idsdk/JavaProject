package Kiosk;

public class Subject {
    private String name;
    private Knowledge[] knowledges;

    public Subject(String name, Knowledge[] knowledges) {
        this.name = name;
        this.knowledges = knowledges;
    }

    public String getName() {
        return name;
    }

    public Knowledge[] getKnowledges() {
        return knowledges;
    }
}