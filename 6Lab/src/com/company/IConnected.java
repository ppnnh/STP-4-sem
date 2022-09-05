package com.company;

import java.sql.SQLException;

public interface IConnected {
    void connect() throws SQLException;
    void close() throws SQLException;
}
