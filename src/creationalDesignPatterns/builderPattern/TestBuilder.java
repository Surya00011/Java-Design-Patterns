package creationalDesignPatterns.builderPattern;

import creationalDesignPatterns.builderPattern.computer.Computer;
import creationalDesignPatterns.builderPattern.computer.ComputerDirector;
import creationalDesignPatterns.builderPattern.computer.GamingComputer;

public class TestBuilder {
   public static void main(String[] args) {
      Computer myComputer = new GamingComputer()
              .enableCPU("I5")
              .enableGPU("RTX3050")
              .isWifiNeeded(true)
              .isBluetoothNeeded(true)
              .enableMotherBoard("ROG")
              .enableSSD("1TB")
              .enableRam("32GB")
              .build();
      Computer defaultBuild = new ComputerDirector().createGamingComputer();
      Computer defaultOffice = new ComputerDirector().createOfficeComputer();
      System.out.println(defaultOffice);
      System.out.println(defaultBuild);
      System.out.println(myComputer);
   }
}
