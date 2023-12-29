package org.example.exam;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService paymentService;

    /**
     * 支付订单
     */
    @PostMapping("/pay")
    public ApiResponse<OrderPaymentResponse> pay(@RequestBody OrderPaymentRequest request) {
        return ApiResponse.success(paymentService.pay(request));
    }

}
