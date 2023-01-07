package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(HttpServletRequest request, Model model) {
        String count = request.getParameter("count");
        if (count != null) {
            int carCounter = Integer.parseInt(count);
            model.addAttribute("carList", carService.showCars(carCounter));
        } else model.addAttribute("carList", carService.showCars());
        return "cars";
    }


}
