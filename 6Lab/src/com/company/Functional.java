package com.company;

import java.sql.*;

public class Functional implements IConnected, IModificated {
    public static Connection connection;
    public static Statement statement;
    public static Driver driver;
    Savepoint savepointOne;


    static {

    }

    @Override
    public void connect() throws SQLException {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
            statement = connection.createStatement();
            connection.setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.rollback();
        }


    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }

    @Override
    public void CheckSouvenirs() throws SQLException {
        String sqlCommand = "SELECT * FROM souvenirs WHERE Name='Trinket' ";
        ResultSet resultset = statement.executeQuery(sqlCommand);
        System.out.printf("CheckSouvenirs");

        while (resultset.next()) {

            int Price = resultset.getInt(1);
            String Name = resultset.getString(3);
            String Requisites = resultset.getString(4);
            System.out.print("\nSouvenir " + " Name:  " + Name + " Requisites:  " + Requisites + " Price:  " + Price + "\n");
            connection.commit();
        }
    }

    @Override
    public void CheckCountry() throws SQLException {
        try {
            String sqlCommand2 = "SELECT Name FROM Manufacturer WHERE Country='Belarus'";
            ResultSet resultset = statement.executeQuery(sqlCommand2);
            System.out.print("CheckCountry");

            while (resultset.next()) {

                String Name = resultset.getString(1);
                System.out.print("\nSouvenir " + " Name:  " + Name + "\n");


            }
            connection.commit();
        }
        catch (SQLException e) {
            System.out.println("SQLException. Executing rollback to savepoint...");
            connection.rollback(savepointOne);
        }

    }

    @Override
    public void CheckManufacturer() throws SQLException {
        try {
            String sqlCommand3 = "SELECT Manufacturer.Name FROM Manufacturer,Souvenirs WHERE Souvenirs.Price<20";
            String sqlCommand4 = "SELECT Manufacturer.Name FROM Manufacturer,Souvenirs WHERE Souvenirs.Date='2020-01-01'";
            ResultSet results1 = statement.executeQuery(sqlCommand4);
            System.out.print("CheckManufacturer(Date)");
            while (results1.next()) {

                String Name = results1.getString(1);
                System.out.print("\nSouvenir " + " Name:  " + Name + "\n");

            }
            savepointOne = connection.setSavepoint("SavepointOne");
            ResultSet resultset = statement.executeQuery(sqlCommand3);
            System.out.print("\nCheckManufacturer(Price)");
            while (resultset.next()) {

                String Name = resultset.getString(1);
                System.out.print("\nSouvenir  Name:  " + Name + "\n");

            }
            connection.commit();
        }
        catch (SQLException e) {
            System.out.println("SQLException. Executing rollback to savepoint...");
            connection.rollback(savepointOne);
        }

    }

    @Override
    public void DeleteManufacturer() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("DELETE Manufacturer.Name,Souvenirs.Name FROM Manufacturer,Souvenirs WHERE Manufacturer.Name=?");
        stmt.setString(1, "OZ");
        connection.commit();
    }
}

