package com.crud.springbootdataforcrud.controllers;

import com.crud.springbootdataforcrud.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCarTable(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2020, "Black", 50000.0, 150.0, "Petrol", 25000.0));
        cars.add(new Car("Honda", "Civic", 2019, "White", 40000.0, 140.0, "Diesel", 22000.0));
        cars.add(new Car("Ford", "Focus", 2018, "Blue", 60000.0, 160.0, "Petrol", 27000.0));

        model.addAttribute("cars", cars);
        return "cars"; // Şablon adı
    }
}
