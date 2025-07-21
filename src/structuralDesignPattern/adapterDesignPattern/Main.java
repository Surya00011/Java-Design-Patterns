package structuralDesignPattern.adapterDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();
        List<Car> foreignAndIndianCars = carDealer.getListOfCars();
        System.out.println(foreignAndIndianCars);
        for(Car car: foreignAndIndianCars){
            System.out.println("Car Name: "+car.getName()+", "+ "Brand Name: "+car.getBrand()+", "+ "Price: "+car.getPrize());
        }
    }
}
