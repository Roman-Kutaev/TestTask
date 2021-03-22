package org.example.controller;

import org.example.domain.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> index(@RequestBody User user) {
        logger.info("info");
        if (user.getId() == 1) {
            return ResponseEntity.ok(user);
        } else
            return ResponseEntity.ok().body(null);
    }
}
