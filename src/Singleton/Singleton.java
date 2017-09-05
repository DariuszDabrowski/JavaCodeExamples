package Singleton;

/**
 * Created by Darek on 2017-09-05.
 */
public class Singleton {
    private static Singleton _instancja;

    private Singleton(){}

    public static Singleton getInstance(){
        if(_instancja == null){
            _instancja = new Singleton();
        }
        return _instancja;
    }
}
