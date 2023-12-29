package org.example.exam;

import java.util.Optional;

public interface OrderRepository {

    Optional<Order> getById(Integer id);
}
