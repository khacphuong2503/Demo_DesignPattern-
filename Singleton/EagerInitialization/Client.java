package DP.Singleton.EagerInitialization;

import DP.Singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance(); // Creating Singleton object
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
        System.out.println(singleton2 == singleton3); // true
    }
}