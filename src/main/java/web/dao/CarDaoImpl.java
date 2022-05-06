package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = List.of(new Car("Model1", 1, 1995),
            new Car("Model2", 2, 1996),
            new Car("Model3", 3, 1997),
            new Car("Model4", 4, 1998),
            new Car("Model5", 5, 1999));

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
