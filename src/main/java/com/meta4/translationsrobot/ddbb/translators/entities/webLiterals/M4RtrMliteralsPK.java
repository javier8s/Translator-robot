package com.meta4.translationsrobot.ddbb.translators.entities.webLiterals;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class M4RtrMliteralsPK implements Serializable {
    private BigInteger idType;
    private String pathInfo;
    private String baseName;
    private String idLiteral;
    private String idOrganization;

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

    @Column(name = "ID_ORGANIZATION", nullable = false, length = 4)
    @Id
    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMliteralsPK that = (M4RtrMliteralsPK) o;
        return Objects.equals(idType, that.idType) &&
                Objects.equals(pathInfo, that.pathInfo) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(idLiteral, that.idLiteral) &&
                Objects.equals(idOrganization, that.idOrganization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, pathInfo, baseName, idLiteral, idOrganization);
    }
}
