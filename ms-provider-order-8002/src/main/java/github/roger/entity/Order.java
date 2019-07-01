package github.roger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    private Integer id;
    private BigDecimal orderMoney;
    private Date dateCreated;
    private String dataSource;

}
