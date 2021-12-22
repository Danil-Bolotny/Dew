import java.util.Scanner;
public class St2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("H A N G M A N");
        System.out.println("The game will be available soon.");
        System.out.println("Guess the word:");
        String slovo= String.valueOf(in.nextInt());
        if (slovo== "java") {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        } 
    }
}
