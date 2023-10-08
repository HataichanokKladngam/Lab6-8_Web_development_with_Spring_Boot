//Hataichanok Kladngam ,ID 6410451512

package ku.cs.kafe.model;


import lombok.Data;
import java.util.UUID;


@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}

