package com.meta4.translationsrobot.ddbb.functional.entities.node;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class M4RchNodesPK implements Serializable {
    private String idT3;
    private String idNode;

    @Column(name = "ID_T3", nullable = false, length = 30)
    @Id
    public String getIdT3() {
        return idT3;
    }

    public void setIdT3(String idT3) {
        this.idT3 = idT3;
    }

    @Column(name = "ID_NODE", nullable = false, length = 30)
    @Id
    public String getIdNode() {
        return idNode;
    }

    public void setIdNode(String idNode) {
        this.idNode = idNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RchNodesPK that = (M4RchNodesPK) o;
        return Objects.equals(idT3, that.idT3) &&
                Objects.equals(idNode, that.idNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idT3, idNode);
    }
}
