package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.OfficeDao;
import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Office;

import javax.persistence.EntityManager;

public class OfficeDaoJpaImpl implements OfficeDao {

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();


    @Override
    public void addNewOffice(Office office) {

    }

    @Override
    public void deleteOffice(String officeCode) {

    }

    @Override
    public void updateOffice(Office office) {

    }

    @Override
    public Office readOffice(String officeCode) {
        return entityManager.find(Office.class, officeCode);
    }
}
