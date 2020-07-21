package com.meta4.translationsrobot.ddbb.translators.entities.item;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class M4RtrMitemsPK implements Serializable {
    private String idTi;
    private String idItem;
    private String idItemTi;

    @Column(name = "ID_TI", nullable = false, length = 30)
    @Id
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Column(name = "ID_ITEM", nullable = false, length = 30)
    @Id
    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    @Column(name = "ID_ITEM_TI", nullable = false, length = 30)
    @Id
    public String getIdItemTi() {
        return idItemTi;
    }

    public void setIdItemTi(String idItemTi) {
        this.idItemTi = idItemTi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMitemsPK that = (M4RtrMitemsPK) o;
        return Objects.equals(idTi, that.idTi) &&
                Objects.equals(idItem, that.idItem) &&
                Objects.equals(idItemTi, that.idItemTi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTi, idItem, idItemTi);
    }
}
