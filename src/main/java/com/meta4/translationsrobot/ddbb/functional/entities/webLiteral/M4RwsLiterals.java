package com.meta4.translationsrobot.ddbb.functional.entities.webLiteral;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RWS_LITERALS", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RwsLiteralsPK.class)
public class M4RwsLiterals {
    private String idOrganization;
    private BigInteger idType;
    private String pathInfo;
    private String baseName;
    private String idLiteral;
    private BigInteger operation;
    private String zvalueeng;
    private String zvalueesp;
    private String zvaluefra;
    private String zvalueger;
    private String zvaluebra;
    private String zvaluegen;
    private String zvalueita;
    private Integer ownerFlag;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;

    @Id
    @Column(name = "ID_ORGANIZATION", nullable = false, length = 4)
    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Id
    @Column(name = "ID_TYPE", nullable = false, precision = 0)
    public BigInteger getIdType() {
        return idType;
    }

    public void setIdType(BigInteger idType) {
        this.idType = idType;
    }

    @Id
    @Column(name = "PATH_INFO", nullable = false, length = 255)
    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    @Id
    @Column(name = "BASE_NAME", nullable = false, length = 255)
    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Id
    @Column(name = "ID_LITERAL", nullable = false, length = 255)
    public String getIdLiteral() {
        return idLiteral;
    }

    public void setIdLiteral(String idLiteral) {
        this.idLiteral = idLiteral;
    }

    @Basic
    @Column(name = "OPERATION", nullable = true, precision = 0)
    public BigInteger getOperation() {
        return operation;
    }

    public void setOperation(BigInteger operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "ZVALUEENG", nullable = true, length = 2000)
    public String getZvalueeng() {
        return zvalueeng;
    }

    public void setZvalueeng(String zvalueeng) {
        this.zvalueeng = zvalueeng;
    }

    @Basic
    @Column(name = "ZVALUEESP", nullable = true, length = 2000)
    public String getZvalueesp() {
        return zvalueesp;
    }

    public void setZvalueesp(String zvalueesp) {
        this.zvalueesp = zvalueesp;
    }

    @Basic
    @Column(name = "ZVALUEFRA", nullable = true, length = 2000)
    public String getZvaluefra() {
        return zvaluefra;
    }

    public void setZvaluefra(String zvaluefra) {
        this.zvaluefra = zvaluefra;
    }

    @Basic
    @Column(name = "ZVALUEGER", nullable = true, length = 2000)
    public String getZvalueger() {
        return zvalueger;
    }

    public void setZvalueger(String zvalueger) {
        this.zvalueger = zvalueger;
    }

    @Basic
    @Column(name = "ZVALUEBRA", nullable = true, length = 2000)
    public String getZvaluebra() {
        return zvaluebra;
    }

    public void setZvaluebra(String zvaluebra) {
        this.zvaluebra = zvaluebra;
    }

    @Basic
    @Column(name = "ZVALUEGEN", nullable = true, length = 2000)
    public String getZvaluegen() {
        return zvaluegen;
    }

    public void setZvaluegen(String zvaluegen) {
        this.zvaluegen = zvaluegen;
    }

    @Basic
    @Column(name = "ZVALUEITA", nullable = true, length = 2000)
    public String getZvalueita() {
        return zvalueita;
    }

    public void setZvalueita(String zvalueita) {
        this.zvalueita = zvalueita;
    }

    @Basic
    @Column(name = "OWNER_FLAG", nullable = true, precision = 0)
    public Integer getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(Integer ownerFlag) {
        this.ownerFlag = ownerFlag;
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
        M4RwsLiterals that = (M4RwsLiterals) o;
        return Objects.equals(idOrganization, that.idOrganization) &&
                Objects.equals(idType, that.idType) &&
                Objects.equals(pathInfo, that.pathInfo) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(idLiteral, that.idLiteral) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(zvalueeng, that.zvalueeng) &&
                Objects.equals(zvalueesp, that.zvalueesp) &&
                Objects.equals(zvaluefra, that.zvaluefra) &&
                Objects.equals(zvalueger, that.zvalueger) &&
                Objects.equals(zvaluebra, that.zvaluebra) &&
                Objects.equals(zvaluegen, that.zvaluegen) &&
                Objects.equals(zvalueita, that.zvalueita) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(idApprole, that.idApprole) &&
                Objects.equals(idSecuser, that.idSecuser) &&
                Objects.equals(dtLastUpdate, that.dtLastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrganization, idType, pathInfo, baseName, idLiteral, operation, zvalueeng, zvalueesp, zvaluefra, zvalueger, zvaluebra, zvaluegen, zvalueita, ownerFlag, idApprole, idSecuser, dtLastUpdate);
    }
}
