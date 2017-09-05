package Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by RENT on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < 10 ; i++) {
            tab[i] = i;
        }
        Integer[] tab2 = new Integer[10];
        for (int i = 0; i < 10 ; i++) {
            tab2[i] = i;
        }
        Integer[] intg = new Integer[] {11,12,13,14,15};
        List l1 = Arrays.asList(tab);
        List l2 = Arrays.asList(tab2);
        List l22 = Arrays.asList(intg);


        List l3 = new ArrayList();
        l3.addAll(l2);
        List l4 = new ArrayList();
        Collections.reverse(l3);
        l4.addAll(l22);



    }
}
