package edu.itplus.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
        private int orderDetailId;
        private int orderId;
        private int quantity;
        private double unitPrice;
}
