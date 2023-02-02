package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Mitarbeiter mitarbeiter1=new Mitarbeiter("Jackson", "Michael", "Performer", 1971);
        Mitarbeiter mitarbeiter2=new Mitarbeiter("Jackson", "Michael", "Performer", 1971);
        Mitarbeiter mitarbeiter3=new Mitarbeiter("Jackson", "Michael", "Performer", 1971);
        Mitarbeiter mitarbeiter4=new Mitarbeiter("Jackson", "Michael", "Performer", 1971);

        output(mitarbeiter1.getProperties("#familyName"));
        output(mitarbeiter1.getProperties("#firstName"));
        output(mitarbeiter1.getProperties("#role"));
        output(mitarbeiter1.getProperties("#yearOfEntry"));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

