package com.fpmislata.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntidadBancariaDAO {
    
/*
    
    EntidadBancaria read(int idEntidadBancaria){
        
  //solo obtiene UNA LINEA busca por clave primaria
if (resultSet.next()==true){
    codigo=resultSet.getString("codigo");
   
    if(resultSet.next==true){
    throw new RuntimeException("ERROR. Existe mas de una entidad."+idEntidadBancaria);
    }
    
  }else{
        throw new RuntimeException("No existe la entidad."+idEntidadBancaria);
    }

    }
    
    
    */
void insert(EntidadBancaria entidadBancaria) throws ClassNotFoundException, SQLException{
    
Class.forName("com.mysql.jdbc.Driver");
Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco","root","root");
        
        String insertTableSQL = "INSERT INTO entidadbancaria"
		+ "(idEntidad, codigoEntidad, nombre, cif, tipoEntidadBancaria) VALUES"
		+ "(?,?,?,?,?)";
        
PreparedStatement preparedStatement2 = conexion.prepareStatement(insertTableSQL);
preparedStatement2.setInt(1, entidadBancaria.getIdEntidad());
preparedStatement2.setString(2, entidadBancaria.getCodigoEntidad());
preparedStatement2.setString(3, entidadBancaria.getNombre());
preparedStatement2.setString(4, entidadBancaria.getCif());
preparedStatement2.setString(5, entidadBancaria.getTipoEntidadBancaria().name()); //name me da el nombre del enum
// execute insert SQL stetement
preparedStatement2 .executeUpdate();

conexion.close(); 
System.out.println("Conexion creada con exito");
       
}
    
    void update(EntidadBancaria entidadBancaria){
    
    }
    
    void delete(int entidadBancaria){
    
    }
    /*
 List<EntidadBancaria>findAll();
 
 List<EntidadBancaria>findByCodigo(String codigo);
    */
}
