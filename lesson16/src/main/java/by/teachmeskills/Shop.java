package by.teachmeskills;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Shop {

    private LinkedList<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        boolean isContainId = false;

        for (Product value : products)
            if (value.getId() == product.getId()) {
                isContainId = true;
                break;
            }

        if (!isContainId) {
            products.add(product);
        }
    }

    public LinkedList<Product> getAllProducts() {
        return products;
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);

    }

    public void editProduct(Product product) {
        for (Product value : products)
            if (value.getId() == product.getId()) {
                value.setName(product.getName());
                value.setPrice(product.getPrice());

            }
    }


}
