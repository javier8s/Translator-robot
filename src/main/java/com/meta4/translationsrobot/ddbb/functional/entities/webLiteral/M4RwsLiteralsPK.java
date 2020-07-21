package com.meta4.translationsrobot.ddbb.functional.entities.webLiteral;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class M4RwsLiteralsPK implements Serializable {
    private String idOrganization;
    private BigInteger idType;
    private String pathInfo;
    private String baseName;
    private String idLiteral;

    @Column(name = "ID_ORGANIZATION", nullable = false, length = 4)
    @Id
    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Column(name = "ID_TYPE", nullable = false, precision = 0)
    @Id
    public BigInteger getIdType() {
        return idType;
    }

    public void setIdType(BigInteger idType) {
        this.idType = idType;
    }

    @Column(name = "PATH_INFO", nullable = false, length = 255)
    @Id
    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    @Column(name = "BASE_NAME", nullable = false, length = 255)
    @Id
    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Column(name = "ID_LITERAL", nullable = false, length = 255)
    @Id
    public String getIdLiteral() {
        return idLiteral;
    }

    public void setIdLiteral(String idLiteral) {
        this.idLiteral = idLiteral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RwsLiteralsPK that = (M4RwsLiteralsPK) o;
        return Objects.equals(idOrganization, that.idOrganization) &&
                Objects.equals(idType, that.idType) &&
                Objects.equals(pathInfo, that.pathInfo) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(idLiteral, that.idLiteral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrganization, idType, pathInfo, baseName, idLiteral);
    }
}
