package Kopiec;

/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {
        Heap kopiec = new Heap(14);
        kopiec.addElement(12);
        kopiec.addElement(11);
        kopiec.addElement(9);
        kopiec.addElement(8);
        kopiec.addElement(10);
        kopiec.addElement(6);
        kopiec.addElement(3);
        kopiec.addElement(6);
        kopiec.addElement(7);
        kopiec.addElement(9);
        kopiec.addElement(3);
        kopiec.addElement(5);
        kopiec.addElement(4);
        kopiec.addElement(25);
        kopiec.removeElement();
    }
}
