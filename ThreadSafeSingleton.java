package org.example.designPattern;

public class ThreadSafeSingleton {
        private static volatile ThreadSafeSingleton instance;

        private ThreadSafeSingleton() {
            System.out.println("Singleton Instance Created by "
                    + Thread.currentThread().getName());
        }

        public static ThreadSafeSingleton getInstance() {


            if (instance == null) {

                synchronized (ThreadSafeSingleton.class) {


                    if (instance == null) {
                        instance = new ThreadSafeSingleton();
                    }
                }
            }
            return instance;
        }
}


