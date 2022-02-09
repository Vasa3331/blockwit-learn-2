package com.blockwit.learn2.vasa3331;
import java.util.Random;

public class ListsEvaluation {
    public void  evalMyList(MyIntArrayList a) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            a.add(random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
