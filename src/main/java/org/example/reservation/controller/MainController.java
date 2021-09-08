package org.example.reservation.controller;

import org.example.reservation.domain.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/main")
    public String create(
            @RequestBody UserDTO userDTO
    ) {
        System.out.println(userDTO.getInfoEvent());
        System.out.println(userDTO.getDateReservation());
        return "/main";
    }

}