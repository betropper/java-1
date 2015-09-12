import skilstak.c;
import java.util.Scanner;

public class HelloQuestion {
    public static void main(String[] args) {
        System.out.println(c.clear + c.cyan + "Hello." + c.green + " What's your name?" + c.x); 
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(c.cyan + "Well " + c.c + c.r + name + c.cyan + ", it's nice to meet you.");
    }
}
