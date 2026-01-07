package org.example.designPattern;

public class TestThreadSafeSingleton {
        public static void main(String[] args) {
            Runnable task = () -> {
                ThreadSafeSingleton singleton =
                        ThreadSafeSingleton.getInstance();
                System.out.println("Instance HashCode: "
                        + singleton.hashCode());
            };

            Thread t1 = new Thread(task, "Thread-1");
            Thread t2 = new Thread(task, "Thread-2");
            Thread t3 = new Thread(task, "Thread-3");

            t1.start();
            t2.start();
            t3.start();
        }
}


