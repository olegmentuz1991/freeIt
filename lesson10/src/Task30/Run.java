package Task30;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        for (int i =0;i<10;i++){
            list.add((int)(Math.random()*10));
        }
        System.out.println(list);
    }
}
