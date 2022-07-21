package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarController {

    private static final List<Car> carsList = Collections.unmodifiableList(new ArrayList<>() {{
        carsList.add(new Car(1L, 1, 1));
        carsList.add(new Car(2L, 2, 2));
        carsList.add(new Car(3L, 3, 3));
        carsList.add(new Car(4L, 4, 4));
        carsList.add(new Car(5L, 5, 5));
    }});


    @GetMapping(value = "/cars")
    public String getAllCars(Model model) {
        model.addAttribute("carList", carsList);
        return "cars";
    }

    @GetMapping(value = "/cars?count={count}")
    public String getCars(Model model, @PathVariable int count) {
        model.addAttribute("carList1", count >= carsList.size() ? carsList : carsList.subList(0, count));
        return "cars";
    }
}
