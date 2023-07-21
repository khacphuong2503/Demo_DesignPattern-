package DP.Singleton.EagerInitialization;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Creating Singleton object");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
