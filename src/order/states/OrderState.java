package order.states;

import order.Order;

public interface OrderState {

    void prepare(Order order);
    void ship(Order order);
    void receive(Order order);
    void complete(Order order);

}
