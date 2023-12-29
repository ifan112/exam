package org.example.exam;

import lombok.Builder;
import lombok.Data;

/**
 * 订单支付响应
 */

@Data
@Builder
public class OrderPaymentResponse {

    private final String payUrl;
}
