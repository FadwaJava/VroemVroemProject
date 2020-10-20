package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.ProductDao;
import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Product;

import javax.persistence.EntityManager;

public class ProductDaoJpaImpl implements ProductDao {

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();

    @Override
    public Product readProduct(String productCode) {

        return entityManager.find(Product.class, productCode);
    }

    @Override
    public void addNewProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }
}
