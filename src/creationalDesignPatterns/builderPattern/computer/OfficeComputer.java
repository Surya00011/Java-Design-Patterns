package creationalDesignPatterns.builderPattern.computer;

public class OfficeComputer implements ComputerBuilder{
    private String CPU;
    private String GPU;
    private String MOTHER_BOARD;
    private String HHD;
    private String SSD;
    private String RAM;
    private boolean WIFI;
    private boolean BLUETOOTH;
    @Override
    public ComputerBuilder isBluetoothNeeded(boolean isNeeded) {
        this.BLUETOOTH=isNeeded;
        return this;
    }

    public  ComputerBuilder enableHHD(String hhdSize){
        this.HHD=hhdSize;
        return this;
    }


    @Override
    public ComputerBuilder isWifiNeeded(boolean isNeeded) {
        this.WIFI=isNeeded;
        return this;
    }

    @Override
    public ComputerBuilder enableCPU(String cpuName) {
        this.CPU=cpuName;
        return this;
    }

    @Override
    public ComputerBuilder enableMotherBoard(String motherBoard) {
        this.MOTHER_BOARD=motherBoard;
        return this;
    }

    @Override
    public ComputerBuilder enableGPU(String gpuName) {
        this.GPU=gpuName;
        return this;
    }

    @Override
    public ComputerBuilder enableRam(String ramSize) {
        this.RAM=ramSize;
        return this;
    }

    @Override
    public ComputerBuilder enableSSD(String ssdSize) {
        this.SSD=ssdSize;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(CPU,GPU,MOTHER_BOARD,SSD,HHD,WIFI,RAM,BLUETOOTH);
    }
}
