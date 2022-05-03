package ma.emsi.myautoprojetpfa.Controllers;


import ma.emsi.myautoprojetpfa.Entities.Car;
import ma.emsi.myautoprojetpfa.Services.CarService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService)
    {
        this.carService = carService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(Car car)
    {
        List<Car> listeallcars = carService.findAllCars();
        return new ResponseEntity<>(listeallcars, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestBody Car car)
    {
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Car> updateCar(@RequestBody Car car)
    {
        Car updateCar = carService.updateCar(car);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id)
    {
        carService.deleteCarById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
