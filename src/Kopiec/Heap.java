package Kopiec;


public class Heap {
    private int[] _data;
    private int _iterator = 0;

    Heap(int lenght){
        _data = new int[lenght];
    }
    public void addElement(int element){
        int i = _iterator;
        _iterator++;
        int j = Math.floorDiv(i - 1, 2);
        while(i > 0 && _data[j] < element){
            _data[i] = _data[j];
            i = j;
            j = Math.floorDiv(i - 1, 2);
        }
        _data[i] = element;
    }
    public int removeElement() {
        int root = 0;
        if (_iterator > 0) {
            _iterator--;
            root = _data[0];
            int v = _data[_iterator];
            int i = 0;
            int j = 1;
            while (j < _iterator) {
                if ((j + 1 < _iterator) && (_data[j + 1] > _data[j])) {
                    j = j + 1;
                }
                if (_data[j] <= v) {
                    break;
                }
                _data[i] = _data[j];
                i = j;
                j = 2 * j + 1;
            }
            _data[i] = v;
        }
        return root;
    }
}
