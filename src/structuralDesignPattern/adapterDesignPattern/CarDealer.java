package structuralDesignPattern.adapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    public List<Car> getListOfCars(){
        return new ArrayList<>(CarDatabase.getCarList());
    }
}
