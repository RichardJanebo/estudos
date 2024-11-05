package devdojo.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class InnerThreadSafeTest01  {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void  remuveFirst(){
        if(names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));

        }
    }
    
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        InnerThreadSafeTest01 test = new InnerThreadSafeTest01();
        test.add("Junkrat");

        Runnable r = test::remuveFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
