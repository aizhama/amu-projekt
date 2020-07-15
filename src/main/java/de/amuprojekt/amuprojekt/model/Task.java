package de.amuprojekt.amuprojekt.model;

public class Task {
    private String firstAufgabe;
    private String secondAufgabe;

    public Task(){
    }

    public Task(String firstAufgabe, String secondAufgabe){
        this.firstAufgabe = firstAufgabe;
        this.secondAufgabe = secondAufgabe;
    }
    public String getFirstAufgabe(){
        return firstAufgabe;
    }
    public void setFirstAufgabe(String firstAufgabe)
    {
        this.firstAufgabe= firstAufgabe;
    }
    public String getSecondAufgabe()
    {
        return secondAufgabe;
    }
    public void setSecondAufgabe(String secondAufgabe){

        this.secondAufgabe = secondAufgabe;
    }
}