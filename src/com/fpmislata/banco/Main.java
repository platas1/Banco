package com.fpmislata.banco;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class Main {
             
    
public static void main(String[] args){
               
    EntidadBancaria entidadBancaria1 = new EntidadBancaria("Banesto","1","1","1",TipoEntidadBancaria.Banco);
    EntidadBancaria entidadBancaria2 = new EntidadBancaria("Banesto","2","2","2",TipoEntidadBancaria.Banco);

    
    SucursalBancaria sucursalBancaria1 = new SucursalBancaria(5,entidadBancaria1,5,"Banesto");
    SucursalBancaria sucursalBancaria2 = new SucursalBancaria(10,entidadBancaria1,10,"Banesto");    

       
    BigDecimal a=new BigDecimal("1000");
    BigDecimal b=new BigDecimal("1200");
    CuentaBancaria cuentaBancaria1= new CuentaBancaria (5,sucursalBancaria1,3,a,6);
    CuentaBancaria cuentaBancaria2= new CuentaBancaria (12,sucursalBancaria1,3,b,8);
    
    
  //Crear objeto gregorian calendar  
    MovimientoBancario movimientoBancario1 = new MovimientoBancario("5",TipoMovimientoBancario.Debe,500,"ayer",1000,"Prueba");
    MovimientoBancario movimientoBancario2 = new MovimientoBancario("5",TipoMovimientoBancario.Haber,300,"ayer",1200,"Prueba2");    

    //Lista en Entidad Bancaria --para-- SucursalBancaria --para-- CuentaBancaria --para-- MovimientoBancario
    
    List<MovimientoBancario> movimientoBancarios=cuentaBancaria1.getMovimientoBancarios();

   movimientoBancarios.add(movimientoBancario1);  
   movimientoBancarios.add(movimientoBancario2);
      
               System.out.println("Movimientos: "+movimientoBancarios.get(1)+"\n");
     
 imprimeDatosCuentaBancaria(cuentaBancaria1);
}     
              
static void imprimeDatosCuentaBancaria(CuentaBancaria cuentaBancaria){
        
for(MovimientoBancario movimientoBancarios:cuentaBancaria.getMovimientoBancarios()){
       System.out.println(""+cuentaBancaria.getMovimientoBancarios());
         System.out.println(""+cuentaBancaria.getSaldo());
          System.out.println(""+cuentaBancaria.getDc());
          System.out.println(""+cuentaBancaria.getSucursalBancaria());
          System.out.println(""+cuentaBancaria.getIdCuentaBancaria());
          //Ojo al imprimir objetos sale churro !!!
}

}
}
    
    /*
   //Los BigDecimal son objetos y el valor de donde apunta va cambiando con el tiempo según su uso.
    BigDecimal a=new BigDecimal("0.2"); //valor de A
    BigDecimal b=new BigDecimal("0.3"); //valor de B
    BigDecimal c=a.add(b); //valor de c es igual a la suba de A y B
   */


