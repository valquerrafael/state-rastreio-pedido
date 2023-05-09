import order.Order;

import java.util.Scanner;

import static util.Timeout.timeout;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to place an order? (yes or no)");
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Goodbye!");
            return;
        }

        System.out.println("Placing order");
        timeout();

        Order order = new Order();

        order.flow();
    }

}
