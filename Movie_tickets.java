import java.util.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
public class Movie_tickets {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int num;
    static String[] movielist = {"1. Annabelle:- " ,
                                 "2. The Conjuring: The Devil Made Me Do It:- " ,
                                 "3. No One Gets Out Alive:- " ,
                                 "4. Insidious:- " ,
                                 "5. Veronica:- " ,
                                 "6. The Grudge:- "};

    public static void getName(){
        System.out.println("What's your name? ");
        name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
    }
    public static void getMovie(){
        System.out.println("What Movie do you want to watch? ");
        for (String s : movielist) {
            System.out.println(s);
        }
        num = sc.nextInt();
        System.out.println("You selected the movie: "+ movielist[num-1].substring(3));
    }
    public static void getSeats(){
        System.out.println("How many seats do you want? ");
        String seats = sc.next();
        System.out.println("Congratulation! \nYou have selected " + seats + " seats for the movie: "+ movielist[num-1].substring(3));
    }

    public static void main(String []args){

        getName();
        getMovie();
        getSeats();
    }
}
