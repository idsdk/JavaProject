package Kiosk;

public abstract class Knowledge {
    protected String title;
    protected int price;

    public Knowledge(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getDescription();
}