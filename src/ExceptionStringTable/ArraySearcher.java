package ExceptionStringTable;

/**
 * Created by RENT on 2017-09-06.
 */
public class ArraySearcher {
    public String findElement(String[] strArr, String element){
        for (int i = 0; i < strArr.length; i++) {
            if (element.equals(strArr[i]))
                return element;
        }
        throw new ArrayStoreException("Not found");
    }
}
