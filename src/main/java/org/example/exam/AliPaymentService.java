package org.example.exam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AliPaymentService implements PaymentService {

    @Override
    public String create() {
        log.info("----- 支付宝支付 -----");

        return "支付宝支付链接";
    }
}
