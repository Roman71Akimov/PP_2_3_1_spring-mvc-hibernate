package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List <Car> showCars();

    public List <Car> showCars(int count);


}
