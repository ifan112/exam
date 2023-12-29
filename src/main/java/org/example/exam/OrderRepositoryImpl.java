package org.example.exam;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderRepositoryImpl implements OrderRepository {

    public Optional<Order> getById(Integer id) {
        // 访问数据库

        Order order = new Order();
        order.setId(id);

        return Optional.of(order);
    }

}
