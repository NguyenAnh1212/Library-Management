public class Book {
    private String name;
    private String author;
    private int price;
    private int quantity;
    private double weight;

    public Book() {
    }

    public Book(String name, String author, int price, int quantity, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTotalPrice() {
      int totalPrime = price*quantity;
      return totalPrime;
    }

    public double getTotalWeight() {
        double totalWeight = weight*quantity;
        return totalWeight;
    }
}
