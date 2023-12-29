package org.example.exam;

import lombok.Data;

/**
 * 订单支付请求
 */

@Data
public class OrderPaymentRequest {

    /**
     * 订单号
     */
    private Integer orderId;

    /**
     * 支付方式
     * <p>
     * WeixinPay - 微信支付
     * AliPay - 支付宝支付
     */
    private String payMethod;

}
