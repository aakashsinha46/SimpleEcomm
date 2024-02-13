package in.aakashsinha.InventoryService.controller;

import in.aakashsinha.InventoryService.config.RabbitMqConfig;
import in.aakashsinha.InventoryService.event.StockCheckEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody StockCheckEvent message) {
        message.setProductId(UUID.randomUUID().toString());
        //message.setLocation("simple test message");
        template.convertAndSend(RabbitMqConfig.EXCHANGE,
                RabbitMqConfig.ROUTING_KEY, message);

        return "Message Published";
    }
}
