package com.sunbase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbase.model.Numbers;

@RestController
@RequestMapping("/api")

public class AdditionController {

	@PostMapping("/add")
    public int addNumbers(@RequestBody Numbers numbers) {
        int sum = numbers.getNumber1() + numbers.getNumber2();
        System.out.println("Sum of numbers is : " + sum);
        return sum;
    }
}

