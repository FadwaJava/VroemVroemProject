package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Product;

public interface ProductDao {

    Product readProduct (String productCode);
    void addNewProduct (Product product);
    void deleteProduct(Product product);
    void updateProduct (Product product);
}
