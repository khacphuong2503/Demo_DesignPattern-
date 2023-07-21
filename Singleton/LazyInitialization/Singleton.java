package DP.Singleton.LazyInitialization;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Creating Singleton object");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
