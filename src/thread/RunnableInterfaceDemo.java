//package thread;
//
//public class GreetingTwo implements Runnable {​​​​
//	 
//    @Override
//    public void run() {​​​​
//        String[] names = {​​​​"John", "Nancy", "David"}​​​​;
//
//        for (String name : names) {​​​​
//            try {​​​​
//                Thread.sleep(2000);
//            }​​​​ catch (InterruptedException e) {​​​​
//                System.out.println("Thread sleep interrupted...");
//                e.printStackTrace();
//            }​​​​
//            System.out.println("Hello " + name + " " + Thread.currentThread().getName());
//        }​​​​
//    }​​​​
//
//    public static void main(String[] args) {​​​​
//
//        Runnable r1 = new GreetingTwo();
//        Thread t1 = new Thread(r1, "T1");
//
//        Thread t2 = new Thread(new GreetingTwo(), "T2");    
//        Thread t3 = new Thread(new GreetingTwo(), "T3");
//
//        t1.start();
//        try {​​​​
//            // t2 will start after 5 seconds
//            t1.join(5000);
//
//        }​​​​ catch (InterruptedException e) {​​​​
//            e.getMessage();
//            e.printStackTrace();
//        }​​​​
//
//        t2.start();
//        t3.start();
//
//        try {​​​​
//            t1.join();
//            t2.join();
//            t3.join();
//        }​​​​ catch (InterruptedException e) {​​​​
//            e.getMessage();
//            e.printStackTrace();
//        }​​​​
//
//        System.out.println("All threads dead, exiting main thread");
//    }​​​​
//}​​​​