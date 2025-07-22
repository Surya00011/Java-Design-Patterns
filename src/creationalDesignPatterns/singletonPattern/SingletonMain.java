package creationalDesignPatterns.singletonPattern;

import java.util.concurrent.*;

public class SingletonMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        multiThreaded();
        singleThread();
    }

    /**
     * Method spawns 2 threads to and tries to get singleton instance
     * @exception  ExecutionException
     * @exception  InterruptedException
     */
    public static void multiThreaded() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Singleton> task1 = Singleton::getInstance;
        Callable<Singleton> task2 = Singleton::getInstance;
        Future<Singleton> future1 = executorService.submit(task1);
        Future<Singleton> future2 = executorService.submit(task2);
        Singleton instance1 = future1.get();
        Singleton instance2 = future2.get();
        System.out.println("Multiple Threads "+ (instance1==instance2));
        executorService.shutdown();
    }

    /**
     * Single Thread
     */
    public static void singleThread(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Single Thread: "+(instance1==instance2));
    }
}
