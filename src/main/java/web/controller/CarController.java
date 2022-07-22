package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private List<Car> carsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, 1, 1));
        cars.add(new Car(2L, 2, 2));
        cars.add(new Car(3L, 3, 3));
        cars.add(new Car(4L, 4, 4));
        cars.add(new Car(5L, 5, 5));
        return cars;
    }

    @GetMapping(value = "/count={count}")
    public String getCars(@PathVariable("count") int count, ModelMap model) {
        model.addAttribute("carList", count >= carsList().size() ? carsList() : carsList().subList(0, count));
        return "cars";
    }

    @GetMapping()
    public String getAllCars(ModelMap model) {
        model.addAttribute("carList", carsList());
        return "cars";
    }

}
