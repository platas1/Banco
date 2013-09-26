package com.fpmislata.banco;

public enum TipoEntidadBancaria {       
    Banco,CajaAhorro,CoopCredito,EstabCredito;
   
private String TipoEntidadBancaria;
    

public String getTipoEntidadBancaria(){      
        return TipoEntidadBancaria;
    }

    public void setNombre(String tipoEntidadBancaria){
       TipoEntidadBancaria=tipoEntidadBancaria;
    }
    
}
