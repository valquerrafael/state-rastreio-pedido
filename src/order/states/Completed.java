package order.states;

import order.Order;

public class Completed implements OrderState {

    @Override
    public void prepare(Order order) {
        System.out.println("Order has already been completed.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order has already been completed.");
    }

    @Override
    public void receive(Order order) {
        System.out.println("Order has already been completed.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order has already been completed.");
    }

}
