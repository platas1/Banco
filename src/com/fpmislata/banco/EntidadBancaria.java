package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

public class EntidadBancaria {
    
//Propiedades siempre privadas
    private String idEntidad;
    private int codigoEntidad;
    private int codigo;
    private int cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
 //lista de entidades bancarias
    private List<EntidadBancaria> entidades=new ArrayList();
    

    
//Constructor
    public EntidadBancaria(String idEntidad, int codigoEntidad, int codigo, int cif, TipoEntidadBancaria tipoEntidadBancaria) {
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
    public int getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(int codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cif
     */
    public int getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(int cif) {
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

