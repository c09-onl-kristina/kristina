package by.teachmeskills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"created"})

public class Product {
    private int id;
    private String name;
    private int price;
    private long created;


}
