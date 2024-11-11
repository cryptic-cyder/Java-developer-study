package Singleton;

public class Driver {
    public static void main(String[] args) {

       SingletonLazy singletonLazy = SingletonLazy.getInstance();
       EagerSingleton eagerSingleton = EagerSingleton.getInstance();
       MultithreadSingleton multithreadSingleton = MultithreadSingleton.getInstance();

    }
}
