import controller.Dispatcher;
import controller.DispatcherImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dispatcher dispatcher = new DispatcherImpl();
        String input;
        while (!(input = sc.nextLine()).equals("CLOSE")) {
            try {
                dispatcher.run(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}