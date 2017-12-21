package springapp.service;

import springapp.domain.Product;

import java.util.List;

/**
 * Created by GODFATHER.
 */
public class SimpleProductManager implements ProductManager {


    private List<Product> products;

    @Override
    public void increasePrice(int percentage) {
        if (null != products) {
            for (Product product : products) {
                double newPrice = product.getPrice() * (100 + percentage) / 100;
                product.setPrice(newPrice);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
