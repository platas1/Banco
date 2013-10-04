package com.fpmislata.banco;

import java.sql.Connection;

public interface ConnectionFactory {
    
 Connection getConnection();
    
}
