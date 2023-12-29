package org.example.exam;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单
 */

@Data
public class Order {

    /**
     * 订单 ID
     */
    private Integer id;

    /**
     * 用户 ID
     */
    private Integer userId;

    /**
     * 订单总金额
     */
    private BigDecimal amount;

    /**
     * 订单状态
     * <p>
     * 1 - 已下单
     * 2 - 已支付
     * 3 - 已发货
     * 4 - 确认收货
     */
    private Integer state;

    /**
     * 订单创建时间
     */
    private LocalDateTime createTime;

    /**
     * 订单支付时间
     */
    private LocalDateTime payTime;

}
