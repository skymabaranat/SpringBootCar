package com.project.springbootcar.controller;


import com.project.springbootcar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/private")
public class CarController {
        @Autowired
        private CarService carService;

        @GetMapping("/status")
        @ResponseStatus(HttpStatus.OK)
        @ResponseBody
        public String getStatus() {
            return "OK";
        }

}
