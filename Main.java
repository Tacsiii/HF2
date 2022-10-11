package hu.nye.progtech.helloworld;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Név?:");
            String nev = scanner.nextLine();
            System.out.println("Nyelv? hun/eng/fr");
            String nyelv = scanner.nextLine();

            Udvozles.udvozles(nev,nyelv);
        }
        else if (args.length == 1){
            String nev = args[0];
            String nyelv = "hun";
            System.out.println("Nem adott meg nyelvet, de tessek itt van magyarul \n");
            Udvozles.udvozles(nev,nyelv);
        }
        else{

        String nev = args[0];
        String nyelv = args[1];

        Udvozles.udvozles(nev,nyelv);

    }}
}