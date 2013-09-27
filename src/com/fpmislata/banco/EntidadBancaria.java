package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

public class EntidadBancaria {
    
//Propiedades siempre privadas
    private String idEntidad;
    private String codigoEntidad;
    private String codigo;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
 //lista de entidades bancarias
    private List<SucursalBancaria> sucursalBancarias=new ArrayList();

    //Constructor
    public EntidadBancaria(String idEntidad, String codigoEntidad, String codigo, String cif, TipoEntidadBancaria tipoEntidadBancaria) {
        this.idEntidad = idEntidad;
        this.codigoEntidad = codigoEntidad;
        this.codigo = codigo;
        this.cif = cif;
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }

    /**
     * @return the idEntidad
     */
    public String getIdEntidad() {
        return idEntidad;
    }

    /**
     * @param idEntidad the idEntidad to set
     */
    public void setIdEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    /**
     * @return the codigoEntidad
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the tipoEntidadBancaria
     */
    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    /**
     * @param tipoEntidadBancaria the tipoEntidadBancaria to set
     */
    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }


}

