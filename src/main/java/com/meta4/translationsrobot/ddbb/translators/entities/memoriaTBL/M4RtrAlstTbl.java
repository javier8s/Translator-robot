package com.meta4.translationsrobot.ddbb.translators.entities.memoriaTBL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_ALST_TBL", schema = "dbo", catalog = "TRANSHRMS60")
@IdClass(M4RtrAlstTblPK.class)
public class M4RtrAlstTbl {
    private String nombre;
    private String tipo;
    private String pais;
    private String base;
    private String transFieldReal;
    private String fieldReal;
    private String fieldLoca;
    private String procesar;
    private String pkCompReal;
    private String pkCompLoca;
    private String nTablaReal;
    private String tipoReal;

    @Id
    @Column(name = "NOMBRE", nullable = false, length = 128)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @Column(name = "TIPO", nullable = false, length = 50)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Id
    @Column(name = "PAIS", nullable = false, length = 50)
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Basic
    @Column(name = "BASE", nullable = true, length = 5)
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Basic
    @Column(name = "TRANS_FIELD_REAL", nullable = true, length = 100)
    public String getTransFieldReal() {
        return transFieldReal;
    }

    public void setTransFieldReal(String transFieldReal) {
        this.transFieldReal = transFieldReal;
    }

    @Basic
    @Column(name = "FIELD_REAL", nullable = true, length = 60)
    public String getFieldReal() {
        return fieldReal;
    }

    public void setFieldReal(String fieldReal) {
        this.fieldReal = fieldReal;
    }

    @Basic
    @Column(name = "FIELD_LOCA", nullable = true, length = 60)
    public String getFieldLoca() {
        return fieldLoca;
    }

    public void setFieldLoca(String fieldLoca) {
        this.fieldLoca = fieldLoca;
    }

    @Basic
    @Column(name = "PROCESAR", nullable = true, length = 1)
    public String getProcesar() {
        return procesar;
    }

    public void setProcesar(String procesar) {
        this.procesar = procesar;
    }

    @Basic
    @Column(name = "PK_COMP_REAL", nullable = true, length = 255)
    public String getPkCompReal() {
        return pkCompReal;
    }

    public void setPkCompReal(String pkCompReal) {
        this.pkCompReal = pkCompReal;
    }

    @Basic
    @Column(name = "PK_COMP_LOCA", nullable = true, length = 255)
    public String getPkCompLoca() {
        return pkCompLoca;
    }

    public void setPkCompLoca(String pkCompLoca) {
        this.pkCompLoca = pkCompLoca;
    }

    @Basic
    @Column(name = "N_TABLA_REAL", nullable = true, length = 128)
    public String getnTablaReal() {
        return nTablaReal;
    }

    public void setnTablaReal(String nTablaReal) {
        this.nTablaReal = nTablaReal;
    }

    @Basic
    @Column(name = "TIPO_REAL", nullable = true, length = 20)
    public String getTipoReal() {
        return tipoReal;
    }

    public void setTipoReal(String tipoReal) {
        this.tipoReal = tipoReal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrAlstTbl that = (M4RtrAlstTbl) o;
        return Objects.equals(nombre, that.nombre) &&
                Objects.equals(tipo, that.tipo) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(base, that.base) &&
                Objects.equals(transFieldReal, that.transFieldReal) &&
                Objects.equals(fieldReal, that.fieldReal) &&
                Objects.equals(fieldLoca, that.fieldLoca) &&
                Objects.equals(procesar, that.procesar) &&
                Objects.equals(pkCompReal, that.pkCompReal) &&
                Objects.equals(pkCompLoca, that.pkCompLoca) &&
                Objects.equals(nTablaReal, that.nTablaReal) &&
                Objects.equals(tipoReal, that.tipoReal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, pais, base, transFieldReal, fieldReal, fieldLoca, procesar, pkCompReal, pkCompLoca, nTablaReal, tipoReal);
    }
}
