package com.meta4.translationsrobot.ddbb.functional.entities.item;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RCH_ITEMS_OWR", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RchItemsOwrPK.class)
public class M4RchItemsOwr {
    private String idTi;
    private String idItemTi;
    private String idItem;
    private String idTransItemeng;
    private String idTransItemesp;
    private String idTransItemfra;
    private String idTransItemger;
    private String idTransItembra;
    private String idTransItemita;
    private String idTransItemgen;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;

    @Id
    @Column(name = "ID_TI", nullable = false, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Id
    @Column(name = "ID_ITEM_TI", nullable = false, length = 30)
    public String getIdItemTi() {
        return idItemTi;
    }

    public void setIdItemTi(String idItemTi) {
        this.idItemTi = idItemTi;
    }

    @Id
    @Column(name = "ID_ITEM", nullable = false, length = 30)
    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMENG", nullable = true, length = 50)
    public String getIdTransItemeng() {
        return idTransItemeng;
    }

    public void setIdTransItemeng(String idTransItemeng) {
        this.idTransItemeng = idTransItemeng;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMESP", nullable = true, length = 50)
    public String getIdTransItemesp() {
        return idTransItemesp;
    }

    public void setIdTransItemesp(String idTransItemesp) {
        this.idTransItemesp = idTransItemesp;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMFRA", nullable = true, length = 50)
    public String getIdTransItemfra() {
        return idTransItemfra;
    }

    public void setIdTransItemfra(String idTransItemfra) {
        this.idTransItemfra = idTransItemfra;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMGER", nullable = true, length = 50)
    public String getIdTransItemger() {
        return idTransItemger;
    }

    public void setIdTransItemger(String idTransItemger) {
        this.idTransItemger = idTransItemger;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMBRA", nullable = true, length = 50)
    public String getIdTransItembra() {
        return idTransItembra;
    }

    public void setIdTransItembra(String idTransItembra) {
        this.idTransItembra = idTransItembra;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMITA", nullable = true, length = 50)
    public String getIdTransItemita() {
        return idTransItemita;
    }

    public void setIdTransItemita(String idTransItemita) {
        this.idTransItemita = idTransItemita;
    }

    @Basic
    @Column(name = "ID_TRANS_ITEMGEN", nullable = true, length = 50)
    public String getIdTransItemgen() {
        return idTransItemgen;
    }

    public void setIdTransItemgen(String idTransItemgen) {
        this.idTransItemgen = idTransItemgen;
    }

    @Basic
    @Column(name = "ID_APPROLE", nullable = true, length = 30)
    public String getIdApprole() {
        return idApprole;
    }

    public void setIdApprole(String idApprole) {
        this.idApprole = idApprole;
    }

    @Basic
    @Column(name = "ID_SECUSER", nullable = true, length = 30)
    public String getIdSecuser() {
        return idSecuser;
    }

    public void setIdSecuser(String idSecuser) {
        this.idSecuser = idSecuser;
    }

    @Basic
    @Column(name = "DT_LAST_UPDATE", nullable = true)
    public Timestamp getDtLastUpdate() {
        return dtLastUpdate;
    }

    public void setDtLastUpdate(Timestamp dtLastUpdate) {
        this.dtLastUpdate = dtLastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RchItemsOwr that = (M4RchItemsOwr) o;
        return Objects.equals(idTi, that.idTi) &&
                Objects.equals(idItemTi, that.idItemTi) &&
                Objects.equals(idItem, that.idItem) &&
                Objects.equals(idTransItemeng, that.idTransItemeng) &&
                Objects.equals(idTransItemesp, that.idTransItemesp) &&
                Objects.equals(idTransItemfra, that.idTransItemfra) &&
                Objects.equals(idTransItemger, that.idTransItemger) &&
                Objects.equals(idTransItembra, that.idTransItembra) &&
                Objects.equals(idTransItemita, that.idTransItemita) &&
                Objects.equals(idTransItemgen, that.idTransItemgen) &&
                Objects.equals(idApprole, that.idApprole) &&
                Objects.equals(idSecuser, that.idSecuser) &&
                Objects.equals(dtLastUpdate, that.dtLastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTi, idItemTi, idItem, idTransItemeng, idTransItemesp, idTransItemfra, idTransItemger, idTransItembra, idTransItemita, idTransItemgen, idApprole, idSecuser, dtLastUpdate);
    }
}
