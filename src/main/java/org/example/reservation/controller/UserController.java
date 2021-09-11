package org.example.reservation.controller;

import org.example.reservation.domain.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Контроллер для создания добавления события
 */

@RestController
public class UserController {

    @PostMapping("/user")
    public ResponseEntity<String> create(
            @RequestBody UserDTO userDTO
    ) {
        System.out.println(userDTO.getInfoEvent());
        System.out.println(userDTO.getDateReservation());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}