package order.states;

import order.Order;

public class Preparing implements OrderState {

    @Override
    public void prepare(Order order) {
        System.out.println("Order is being prepared.");
    }

    @Override
    public void ship(Order order) {
        order.setState(new Shipping());
        System.out.println("Order is shipping.");
    }

    @Override
    public void receive(Order order) {
        System.out.println("Order is not yet in transit.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order cannot be completed until it is received.");
    }

}
