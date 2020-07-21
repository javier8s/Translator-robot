package com.meta4.translationsrobot.ddbb.translators.entities.memoriaTBL;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class M4RtrAlstTblPK implements Serializable {
    private String nombre;
    private String tipo;
    private String pais;

    @Column(name = "NOMBRE", nullable = false, length = 128)
    @Id
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "TIPO", nullable = false, length = 50)
    @Id
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name = "PAIS", nullable = false, length = 50)
    @Id
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrAlstTblPK that = (M4RtrAlstTblPK) o;
        return Objects.equals(nombre, that.nombre) &&
                Objects.equals(tipo, that.tipo) &&
                Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, pais);
    }
}
