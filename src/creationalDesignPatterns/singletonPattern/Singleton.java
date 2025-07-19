package creationalDesignPatterns.singletonPattern;

public class Singleton {
    /**
     * static variable holds Singleton instance
     */
    private static volatile Singleton instance;

    /**
     * private constructor prevent from external initialization
     */
    private Singleton(){

    }

    /**
     * static method to get singleton instance
     * @return Singleton instance
     */
    public static  Singleton getInstance(){
        if(instance==null){
           synchronized (Singleton.class){  //Ensures only one thread enters inside this block
               if (instance==null){
                   instance= new Singleton();
               }
           }
        }
        return instance;
    }
}
