package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Mitarbeiter mitarbeiter1=new Mitarbeiter("Jackson", "Michael", "Performer", 1971);
        Mitarbeiter mitarbeiter2=new Mitarbeiter("Hathaway", "Anna", "Actor", 1984);
        Mitarbeiter mitarbeiter3=new Mitarbeiter("Schulz", "Olaf", "Chancelor", 2021);

        pollMitarbeiter(mitarbeiter1);
	    pollMitarbeiter(mitarbeiter2);
	    pollMitarbeiter(mitarbeiter3);
    }
    private static void pollMitarbeiter(Mitarbeiter ma){
        output(ma.getProperties("#familyName"));
        output(ma.getProperties("#firstName"));
        output(ma.getProperties("#role"));
        output(ma.getProperties("#yearOfEntry"));
        output("--------------------");

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

