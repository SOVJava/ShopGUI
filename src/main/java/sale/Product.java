package sale;

import java.util.Objects;

public class Product {

    private String name;
    private String desc;
    private double price;
    private int qtyOnHand;
    private int minOrderQty;

    public Product() {
        this.name = "";
        this.desc = "";
    }

    public Product(String name, String desc, int qtyOnHand, double price, int minOrderQty) {
        this.name = name;
        this.desc = desc;
        this.qtyOnHand = qtyOnHand;
        this.price = price;
        this.minOrderQty = minOrderQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public int getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(int minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product: " + name + 
                ", \ndescription: " + desc +
                ", \nprice: " + price + ", qtyOnHand: " + qtyOnHand +
                ", minOrderQty: " + minOrderQty;
    }


}
