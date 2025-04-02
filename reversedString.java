import java.util.Scanner;

public class reversedString {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        
        System.out.println("ENTER NAME");
        String m = reverse(sim.next());
        System.out.println(m);
        }
    
 public static String reverse(String b){
   char [] letters = new char[b.length()];
    
   int letterIndex = 0 ;
   for(int s = b.length()-1;s>=0; s--){
    letters[letterIndex] = b.charAt(s);
    letterIndex++;
   }
   String reverse = "";
   for(int s = 0 ; s < b.length();s++){
    reverse = reverse + letters[s];
   }
    return reverse;
 }
}