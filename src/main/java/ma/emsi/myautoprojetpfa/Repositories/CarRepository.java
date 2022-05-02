package ma.emsi.myautoprojetpfa.Repositories;

import ma.emsi.myautoprojetpfa.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
