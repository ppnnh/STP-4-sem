package com.company;

import java.sql.SQLException;

public interface IModificated {
    void CheckSouvenirs() throws SQLException;
    void CheckCountry() throws SQLException;
    void CheckManufacturer() throws SQLException;
    void DeleteManufacturer() throws SQLException;
}
