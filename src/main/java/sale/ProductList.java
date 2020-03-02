package sale;

import java.util.Arrays;

public class ProductList {
    private Product[] listOfProduct = new Product[0];

    public boolean add(Product prod){
        if (listOfProduct.length == 5)
            return false;
        Product[] res = Arrays.copyOf(this.listOfProduct, this.listOfProduct.length + 1);
        res[res.length-1] = prod;
        this.listOfProduct = res;
        return true;
    }

    public Product get(int index){
        if (index < 0 || index > listOfProduct.length-1)
            return null;
        return listOfProduct[index];
    }

    public int length(){
        return listOfProduct.length;
    }

    public boolean isDuplicated(String name){
        if (listOfProduct.length == 0)
            return false;
        for (int i = 0; i < listOfProduct.length; i++) {
            if (listOfProduct[i].getName().equals(name))
                return true;
        }
        return false;
    }
    
    public boolean isFull (){
        return listOfProduct.length == 5;
    }
    
    public boolean isEmpty (){
        return listOfProduct.length == 0;
    }
     
    public String[] toStr(){
        String[] res = new String[listOfProduct.length];        
        for (int i = 0; i < listOfProduct.length; i++) {
            res[i] = String.format("%-30s\n%-3d%-2d", listOfProduct[i].getName(),
                    listOfProduct[i].getQtyOnHand(),
                    listOfProduct[i].getMinOrderQty());  
        }
        return res;
    }
    
    public Product[] getProducts(){
        return listOfProduct;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < listOfProduct.length; i++) {
            res += listOfProduct[i] + "\n";
            res += "------------\n";
        }
        return res;
    }

    

   

}
