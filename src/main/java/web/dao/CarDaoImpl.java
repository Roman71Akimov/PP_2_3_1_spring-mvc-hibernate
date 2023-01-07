package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("VAZ", 1, "Bejevi"));
        cars.add(new Car("VAZ", 2, "Red"));
        cars.add(new Car("VAZ", 3, "Black"));
        cars.add(new Car("VAZ", 4, "Green"));
        cars.add(new Car("VAZ", 5, "Yellow"));
    }
    @Override
    public List<Car> showCars() {
        return cars.stream().toList();
    }
    @Override
    public List<Car> showCars (int count){
        return  cars.stream().limit(count).toList();
    }



}
