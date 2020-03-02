package sale;

import java.util.Arrays;

public class SaleTransaction {

    private Product[] item = new Product[0];
    private int saleCode;
    private double totalCost;

    public SaleTransaction(int saleCode) {
        this.saleCode = saleCode;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(int saleCode) {
        this.saleCode = saleCode;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Product[] getItem() {
        return Arrays.copyOf(item, item.length);
    }

    public boolean add(Product product){
        if (item.length==3)
            return false;
        Product[] res = Arrays.copyOf(item,item.length+1);
        res[res.length-1] = product;
        this.item = res;
        this.totalCost += product.getPrice()*product.getMinOrderQty();
        return true;
    }

    public int length(){
        return item.length;
    }

    public Product get(int index){
        if (index<0 || index>item.length-1)
            return null;
        return item[index];
    }

    public boolean remove(int index){
        if (index<0 || index>item.length-1)
            return false;
        this.totalCost -= item[index].getPrice()*item[index].getMinOrderQty();
        Product[] res = new Product[item.length - 1];
        int indRes = 0;
        item[index] = null;
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null){
                res[indRes] = item[i];
                indRes++;
            }
        }
        item = res;
        return true;
    }

    public Product[] clean(){
        return this.item = new Product[0];
    }

    public int countProducts (Product product){
        if (product == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals(product))
                count++;
        }
        return count;
    }
    
    public boolean isFull(){
        return item.length == 3;
    }
    
    public boolean isEmpty(){
        return item.length == 0;
    }
    
    public String[] toStr(){
        String[] res = new String[item.length];
        for (int i = 0; i < item.length; i++) {
            res[i] = item[i].getName();            
        }
        return res;
    }
    
    public Product[] getProducts(){
        return item;
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < item.length; i++) {
            res += item[i] + "\n";
            res += "------------\n";
        }
        return res;
    }

}
