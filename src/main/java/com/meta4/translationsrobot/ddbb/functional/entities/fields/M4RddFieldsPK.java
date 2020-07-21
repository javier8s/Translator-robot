package com.meta4.translationsrobot.ddbb.functional.entities.fields;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class M4RddFieldsPK implements Serializable {
    private String idObject;
    private String idField;

    @Column(name = "ID_OBJECT", nullable = false, length = 30)
    @Id
    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    @Column(name = "ID_FIELD", nullable = false, length = 30)
    @Id
    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RddFieldsPK that = (M4RddFieldsPK) o;
        return Objects.equals(idObject, that.idObject) &&
                Objects.equals(idField, that.idField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObject, idField);
    }
}
