import java.util.*;

public class accessCode {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER PASSWORD");
        String password = sim.next();
      System.out.println("CONFIRM PASSWORD");
        String pass = sim.next();
       boolean result = pass.equals(password);
    
       if(result == true ){
             System.out.println("WELCOME");
       }else if (result == false){
        System.out.println("INCORRECT PASSWORD");
       }
    }
}
