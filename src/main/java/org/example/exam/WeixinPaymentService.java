package org.example.exam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeixinPaymentService implements PaymentService {

    @Override
    public String create() {
        log.info("----- 微信支付 -----");

        return "微信支付链接";
    }
}
