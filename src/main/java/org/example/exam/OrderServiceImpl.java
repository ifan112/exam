package org.example.exam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderPaymentResponse pay(OrderPaymentRequest request) {
        // 1 - 参数校验：订单是否存在、是否是支持的支付方式
        Order order = orderRepository.getById(request.getOrderId())
                .orElseThrow(() -> new BizException(10001, "订单不存在"));

        // 2 - 业务逻辑校验。订单不能重复支付

        // 3 - 执行业务逻辑。选择支付方式的实现类，调用支付接口

        String payUrl = null;

        if ("WeixinPay".equals(request.getPayMethod())) {
            PaymentService paymentService = new WeixinPaymentService();
            payUrl = paymentService.create();
        } else if ("AliPay".equals(request.getPayMethod())) {
            PaymentService paymentService = new AliPaymentService();
            payUrl = paymentService.create();
        }

        // 4 - 返回响应

        return OrderPaymentResponse.builder()
                .payUrl(payUrl)
                .build();
    }
}
