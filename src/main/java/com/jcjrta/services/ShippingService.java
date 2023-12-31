package com.jcjrta.services;

import com.jcjrta.entities.Order;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20.00;
        } else if (order.getBasic() < 200) {
           return 12.00;
        }
          return  0.00;
    }
}