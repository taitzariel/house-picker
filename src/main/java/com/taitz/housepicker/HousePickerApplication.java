package com.taitz.housepicker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HousePickerApplication {

    @RequestMapping("/")
    String home(@Value("${magic.value}") int key) {
        return "Hello World! The magic value is " + key ;
    }

    public static void main(String[] args) {
		SpringApplication.run(HousePickerApplication.class, args);
	}
}
