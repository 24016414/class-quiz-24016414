import java.util.Scanner;

public class kea {
    public static void main(String []args){

        Scanner sim = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE MARKS OF STUDENT ");
        int marks = sim.nextInt();

        if( marks <= 100 && marks >= 80){
            System.out.println("Level:7 - Outstanding Achievement");
        }else if(marks <= 79 && marks >= 70 ){
            System.out.println("Level:6 - Meritorious Achievement");
        }else if(marks <= 69 && marks >= 60 ){
            System.out.println("Level:5 - Substential Achievement");
        }else if(marks <= 59 && marks >= 50 ){
            System.out.println("Level:4 - Adequate Achievement");
        }else if(marks <= 49 && marks >= 40 ){
            System.out.println("Level:3 - Moderate Achievement");
        }else if(marks <= 39 && marks >= 30 ){
            System.out.println("Level:2 - Elementary Achievement");
        }else if(marks <= 0 && marks >= 29 ){
            System.out.println("Level:1 - Not Achieved");
        }else if(marks < 0 || marks > 100 ){
            System.out.println("Please re-enter the correct marks");
        }
    }
}
