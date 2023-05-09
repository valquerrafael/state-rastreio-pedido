package order;

import order.states.Completed;
import order.states.OrderState;
import order.states.Preparing;

import java.util.Scanner;

import static util.Timeout.timeout;

public class Order {

    OrderState state;

    public Order() {
        state = new Preparing();
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void prepare() {
        state.prepare(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void receive() {
        state.receive(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void flow() {
        this.prepare();
        timeout();

        this.ship();
        timeout();

        this.receive();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Did you have any issues with your order? (yes or no)");
        String feedback = scanner.nextLine();

        if (feedback.equalsIgnoreCase("yes")) {
            this.flow();
        } else {
            this.complete();
        }
    }

}
