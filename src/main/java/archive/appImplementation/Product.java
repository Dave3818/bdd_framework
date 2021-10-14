package archive.appImplementation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Product {
    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    private String productName;
    private int productPrice;

    public Product( String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public List<String> getProductList(){
        List<String> productList = new ArrayList<>();
        productList.add("Apple Macbook Pro");
        productList.add("Apple Macbook Air");
        productList.add("Apple Macbook Air2");
        return productList;
    }

}
