package ma.emsi.myautoprojetpfa.Services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.myautoprojetpfa.Entities.Car;
import ma.emsi.myautoprojetpfa.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    private final CarRepository carRepository;

    //Ctor
    @Autowired
    public CarService(CarRepository carRepository)
    {
        this.carRepository = carRepository;
    }
    //Save method
    public Car addCar(Car car)
    {
        return carRepository.save(car);
    }

    public List<Car> findAllCars()
    {
        return carRepository.findAll();
    }

    public Car updateCar(Car car)
    {
        return carRepository.save(car);
    }

    public void deleteCarById(Long id)
    {
        carRepository.deleteById(id);
    }




}
