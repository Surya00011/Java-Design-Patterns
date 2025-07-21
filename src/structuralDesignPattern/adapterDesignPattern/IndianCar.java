package structuralDesignPattern.adapterDesignPattern;

public class IndianCar implements Car{

    private String carName;
    private String brandName;
    private double price;

    public IndianCar(String carName, double price, String brandName) {
        this.carName = carName;
        this.price = price;
        this.brandName = brandName;
    }

    @Override
    public String getName() {
        return carName;
    }

    @Override
    public String getBrand() {
        return brandName;
    }

    @Override
    public String toString() {
        return "IndianCar{" +
                "carName='" + carName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrize() {
        return price;
    }
}
