package Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[i] <= tab[j]){
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }

            }
        }
        return new int[tab.length];
    }
}
