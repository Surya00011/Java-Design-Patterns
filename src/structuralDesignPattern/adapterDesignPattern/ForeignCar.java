package structuralDesignPattern.adapterDesignPattern;

public class ForeignCar {

    private String carName;
    private String brandName;
    private double price;

    public ForeignCar(String carName, String brandName, double price) {
        this.carName = carName;
        this.brandName = brandName;
        this.price = price;
    }

    public String getCarName(){
        return carName;
    }
    public String getBrandName(){
        return  brandName;
    }

    @Override
    public String toString() {
        return "ForeignCar{" +
                "carName='" + carName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }

    public double getCarPrice(){
        return price;
    }

}
