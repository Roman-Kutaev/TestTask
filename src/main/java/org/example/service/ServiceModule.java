package org.example.service;

import org.example.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceModule {

    public ResponseEntity<?> doEquals(User user) {
        if (user.getId() == 1) {
            return ResponseEntity.ok(user);
        } else
            return ResponseEntity.ok().body(null);
    }
}
