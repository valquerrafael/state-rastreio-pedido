package order.states;

import order.Order;

public class Received implements OrderState {
    @Override
    public void prepare(Order order) {
        order.setState(new Preparing());
        System.out.println("Order is preparing.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order has already been received.");
    }

    @Override
    public void receive(Order order) {
        System.out.println("Order has been received.");
    }

    @Override
    public void complete(Order order) {
        order.setState(new Completed());
        System.out.println("Order completed.");
    }
}
