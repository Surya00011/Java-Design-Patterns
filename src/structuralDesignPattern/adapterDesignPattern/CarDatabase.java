package structuralDesignPattern.adapterDesignPattern;

import java.util.List;

public class CarDatabase {

    public static List<Car> getCarList(){
        return List.of(new IndianCar("Tata Nexon",2000000,"Tata"),
                new IndianCar("Tata Punch",1500000,"Tata"),
                new ForeignCarAdapter(new ForeignCar("Lamborghini huracan","Lamborghini",5000000)),
                new ForeignCarAdapter(new ForeignCar("RR Phantom","Rolls-Royce",600000)));
    }
}
