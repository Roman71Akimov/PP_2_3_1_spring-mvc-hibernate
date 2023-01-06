package web.service;

import web.dao.CarDaoImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final CarDaoImpl carDao;

    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> showCars() {
        return carDao.showCars();
    }
    @Override
    public List<Car> showCars(int count) {
        return carDao.showCars(count);
    }

}
