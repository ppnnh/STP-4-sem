package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here

        Functional functional = new Functional();
        functional.connect();
        functional.CheckSouvenirs();
        functional.CheckCountry();
        functional.CheckManufacturer();

    }
}
