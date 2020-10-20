package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Office;

public interface OfficeDao {

    void addNewOffice (Office office);
    void deleteOffice (String officeCode);
    void updateOffice (Office office);
    Office readOffice (String officeCode);

}
