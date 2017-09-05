package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public abstract class Nalewka {
    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract int alkohol();
}
