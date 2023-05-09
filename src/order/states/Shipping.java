package order.states;

import order.Order;

public class Shipping implements OrderState {

    @Override
    public void prepare(Order order) {
        System.out.println("Order is already shipping.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order is shipping.");
    }

    @Override
    public void receive(Order order) {
        order.setState(new Received());
        System.out.println("Order received.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order cannot be completed until it is received.");
    }

}
