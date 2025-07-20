package creationalDesignPatterns.builderPattern.computer;

public interface ComputerBuilder {
    ComputerBuilder isBluetoothNeeded(boolean isNeeded);
    ComputerBuilder isWifiNeeded(boolean isNeeded);
    ComputerBuilder enableCPU(String cpuName);
    ComputerBuilder enableMotherBoard(String motherBoard);
    ComputerBuilder enableGPU(String gpuName);
    ComputerBuilder enableRam(String ramSize);
    ComputerBuilder enableSSD(String ssdSize);
    ComputerBuilder enableHHD(String hhdSize);
    Computer build();
}
