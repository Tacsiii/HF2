package hu.nye.progtech.helloworld;

public class Udvozles {
    String nev;
    String nyelv;

    public Udvozles(String nev, String nyelv) {
        this.nev = nev;
        this.nyelv = nyelv;

    }

    public static void udvozles(String nev, String nyelv) {

        switch (nyelv) {
            case "hun":
                System.out.println("Szia " + nev);
                break;
            case "eng":
                System.out.println("Hi " + nev);
                break;
            case "fr":
                System.out.println("Salut " + nev);
                break;
            default:
                System.out.println("Nem ismerem a nyelvet \n Szia " + nev);
                break;
        }

    }}