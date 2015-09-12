import skilstak.c;
import java.util.Scanner;

public class eightball {


    private static String[] list = {"Yes.","No.","Maybe."};

    private static final String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    private static final String choice(String[] list) {
        int index = (int)(Math.random()*list.length);
        return list[index];
    }

    public static final void main (String[] args) {
        System.out.println(c.cl + c.red + "\nWelcome to the Magic Eightball!\n"
                                    + "Enter your question below\n\n");
        while(true) {
            String question = input(c.x + c.y + "> ");
            System.out.println(choice(list));
        }

    }
}
