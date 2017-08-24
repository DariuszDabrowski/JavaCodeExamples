package SklepInternetowyPolimorfizm;


public abstract class MusicCD implements Product{
    protected int _price;
    protected  String _name;
    protected String _title;
    protected String _performer;

    public MusicCD(int price, String name, String title, String performer){
        _price = price;
        _name = name;
        _title = title;
        _performer = performer;
    }
    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public void setProductName(String name) {
        _name = name;
    }

    @Override
    public String getProductName() {
        return _name;
    }

    @Override
    public void setPrice(int price) {
        _price = price;
    }
    public String getTitle() {
        return _title;
    }
    public void setTitle(String title) {
        _title = title;
    }
    public String getPerformer() {
        return _performer;
    }
    public void setPerformer(String performer) {
        _performer = performer;
    }
}
