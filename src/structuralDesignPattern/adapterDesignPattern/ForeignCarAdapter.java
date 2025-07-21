package structuralDesignPattern.adapterDesignPattern;

public class ForeignCarAdapter implements  Car{
    ForeignCar foreignCar;

    public ForeignCarAdapter(ForeignCar foreignCar){
        this.foreignCar=foreignCar;
    }

    @Override
    public String toString() {
        return "ForeignCarAdapter{" +
                "foreignCar=" + "Car name: "+foreignCar.getCarName()+", " +"Brand name: "+ foreignCar.getBrandName()+", " + "Price: "+foreignCar.getCarPrice()+
                " }";
    }

    @Override
    public String getName() {
        return foreignCar.getCarName();
    }

    @Override
    public String getBrand() {
        return foreignCar.getBrandName();
    }

    @Override
    public double getPrize() {
        return foreignCar.getCarPrice();
    }
}
