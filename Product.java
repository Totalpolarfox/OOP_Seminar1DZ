/**
 * Продукт
 */

 public class Product {
    protected String brand;
    protected String name;
    protected double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<BRAND>";
        } else {
            this.brand = brand;
        }
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<NAME>";
        } else {
            this.name = name;
        }
    }

    private void checkPrice(double price) {
        if (price < 100) {
            this.price = 250;
        } else {
            this.price = price;
        }
    }

    // конструкторы
    public Product(String brand, String name, double price) {
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
    }

    public Product(String name, double price) { // ссылается на предыдущий
        this("<BRAND>", name, price);
    }

    public Product(String name) { // ссылается на предыдущий
        this(name, 250);
    }

    public Product() { // ссылается на предыдущий
        this("<NAME>");
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }
}
