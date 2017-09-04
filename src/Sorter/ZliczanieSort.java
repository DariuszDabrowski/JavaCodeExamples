package Sorter;


public class ZliczanieSort implements ISort {
    @Override
    public int[] sort(int[] tab) {

        int max = Integer.MIN_VALUE;


        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        int[] zliczanie = new int[max+1];
        for (int i = 0; i < tab.length; i++) {
            int liczba = tab[i];
            zliczanie[liczba]++;
        }
        int liczba = 0;
        for (int indeks = 0; indeks < zliczanie.length; indeks++) {
            if (zliczanie[indeks] > 0) {
                for (int ileLiczb = zliczanie[indeks]; ileLiczb > 0 ; ileLiczb--) {
                    tab[liczba] = indeks;
                    liczba++;
                }
            }
        }
        return tab;
    }
}



