package com.study._33_Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private int stock;
    private boolean onSale;
    private int price;
}
