package epam.stream;

public class Product {
    private int price;
    private String name;

    public Product(int count, String name) {
        this.price = count;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
