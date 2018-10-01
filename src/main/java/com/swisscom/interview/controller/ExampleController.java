package com.swisscom.interview.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final RestTemplate restTemplate;

    public ExampleController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/something/{id}")
    public ResponseEntity<String> getSomething(@PathVariable final String id) {
        return restTemplate.exchange(
                "https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&api_key=DEMO_KEY",
                HttpMethod.GET,
                null,
                String.class
        );
    }

}
