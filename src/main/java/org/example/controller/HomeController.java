package org.example.controller;

import org.example.domain.entity.User;
import org.example.service.ServiceModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    private final ServiceModule serviceModule;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public HomeController(ServiceModule serviceModule) {
        this.serviceModule = serviceModule;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> index(@RequestBody User user) {
//        logger.info("Response", serviceModule.doEquals(user));
        return serviceModule.doEquals(user);
    }
}
