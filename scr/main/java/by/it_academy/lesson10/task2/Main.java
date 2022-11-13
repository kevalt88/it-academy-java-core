package by.it_academy.lesson10.task2;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("OOP", "Object Oriented Programming");
        abbreviations.addAbbreviation("UN", "United Nations");
        abbreviations.addAbbreviation("USA", "United States of America");
        System.out.println(abbreviations.hasAbbreviation("OO"));
        System.out.println(abbreviations.findExplanationFor("USA"));
        abbreviations.printAbbreviations();
        abbreviations.printAbbreviationsWhere("N");
        abbreviations.printExplanationOfAbbreviationsWhere("OP");
    }
}
