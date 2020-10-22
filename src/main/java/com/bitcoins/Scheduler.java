package com.bitcoins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class Scheduler {
    private static final Logger log =
            LoggerFactory.getLogger(Scheduler.class);

    RestTemplate restTemplate = new RestTemplate();

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }



    @Scheduled(fixedRate = 30000)
    public void scheduler(){
        ResponseEntity<Price[]> response = restTemplate.getForEntity(
                "https://api.n.exchange/en/api/v1/price/BTCLTC/latest/?format=json&market_code=nex", Price[].class);
        log.info(Arrays.toString(response.getBody()));
    }
}
