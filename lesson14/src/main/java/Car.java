import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {
    private String brand;
    private Engine engine;
    private Tank tank;
    private int speed;
    private int price;

}
