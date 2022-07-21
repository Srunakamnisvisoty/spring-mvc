package web.config.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static final List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("1", 1, 1));
        carsList.add(new Car("2", 2, 2));
        carsList.add(new Car("3", 3, 3));
        carsList.add(new Car("4", 4, 4));
        carsList.add(new Car("5", 5, 5));
    }

    public List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>(count);
        if (count >= carsList.size()) {
            return carsList;
        }
        for (int i = 0; i <= count; i++) {
            result.add(carsList.get(i));
        }
        return result;
    }
}
