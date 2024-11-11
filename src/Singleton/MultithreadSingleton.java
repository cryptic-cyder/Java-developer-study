package Singleton;

public class MultithreadSingleton {

    private static MultithreadSingleton multithreadSingleton = null;

    private MultithreadSingleton(){

    }

    public static MultithreadSingleton getInstance(){

        if(multithreadSingleton==null){

            synchronized (MultithreadSingleton.class){

                if(multithreadSingleton==null){
                    multithreadSingleton = new MultithreadSingleton();
                }
            }
        }

        return  multithreadSingleton;
    }
}
