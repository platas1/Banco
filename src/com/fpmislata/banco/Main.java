package com.fpmislata.banco;

import java.math.BigDecimal;


public class Main {
    
   //Los BigDecimal son objetos y el valor de donde apunta va cambiando con el tiempo según su uso.
    BigDecimal a=new BigDecimal("0.2"); //valor de A
    BigDecimal b=new BigDecimal("0.3"); //valor de B
    BigDecimal c=a.add(b); //valor de c es igual a la suba de A y B
   
    
}
