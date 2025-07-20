package creationalDesignPatterns.builderPattern.computer;

public class Computer {
    private String CPU;
    private String GPU;
    private String MOTHER_BOARD;
    private String SSD;
    private String HHD;
    private String RAM;
    private boolean WIFI;
    private boolean BLUETOOTH;

    Computer(String CPU, String GPU, String MOTHER_BOARD, String SSD, String HHD, boolean WIFI, String RAM, boolean BLUETOOTH) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.MOTHER_BOARD = MOTHER_BOARD;
        this.SSD = SSD;
        this.HHD = HHD;
        this.WIFI = WIFI;
        this.RAM = RAM;
        this.BLUETOOTH = BLUETOOTH;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", MOTHER_BOARD='" + MOTHER_BOARD + '\'' +
                ", SSD='" + SSD + '\'' +
                ", HHD='" + HHD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", WIFI=" + WIFI +
                ", BLUETOOTH=" + BLUETOOTH +
                '}';
    }
}
