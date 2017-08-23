package SklepInternetowyPolimorfizm;


public abstract class Book implements Product {

    protected int _price;
    protected  String _name;
    protected String _title;
    protected String _Author;
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
    public String getAuthor() {
        return _Author;
    }
    public void setAuthor(String author) {
        _Author = author;
    }
}
