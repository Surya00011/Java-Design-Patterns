package creationalDesignPatterns.builderPattern.computer;

public class ComputerDirector {

    public Computer createGamingComputer(){
        return new GamingComputer("I7","RTX:4090","16GB","1TB").build();
    }

    public Computer createOfficeComputer(){
        return new OfficeComputer().enableCPU("I3")
                .enableRam("8GB").build();
    }
}
