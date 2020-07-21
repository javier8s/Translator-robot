package com.meta4.translationsrobot.ddbb.functional.entities.logicObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RDC_LOGIC_OBJECT", schema = "dbo", catalog = "GLOBALHRPRO140619")
public class M4RdcLogicObject {
    private String idObject;
    private String idTransObjeng;
    private String idTransObjesp;
    private String idTransObjfra;
    private String idTransObjgen;
    private String idTransObjger;
    private String idTransObjita;
    private String idTransObjbra;
    private String realName;
    private Integer idObjectType;
    private Integer idTemporary;
    private Integer idNpType;
    private BigInteger corrected;
    private BigInteger isCacheable;
    private String idClsDate;
    private BigInteger depCrossMod;
    private BigInteger haveSecurity;
    private BigInteger hasAuditory;
    private String idAuditObject;
    private Integer ownerFlag;
    private Timestamp dtMod;
    private Timestamp dtCreate;
    private Timestamp dteClosed;
    private Timestamp dtModScript;
    private Timestamp dtPk;
    private BigInteger idOrgType;
    private BigDecimal idOrgLevel;
    private BigInteger inheritsData;
    private BigInteger hasTableI;
    private String idMirrorObject;
    private BigInteger typeMirror;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;
    private String transRealName;

    @Id
    @Column(name = "ID_OBJECT", nullable = false, length = 30)
    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJENG", nullable = true, length = 30)
    public String getIdTransObjeng() {
        return idTransObjeng;
    }

    public void setIdTransObjeng(String idTransObjeng) {
        this.idTransObjeng = idTransObjeng;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJESP", nullable = true, length = 30)
    public String getIdTransObjesp() {
        return idTransObjesp;
    }

    public void setIdTransObjesp(String idTransObjesp) {
        this.idTransObjesp = idTransObjesp;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJFRA", nullable = true, length = 30)
    public String getIdTransObjfra() {
        return idTransObjfra;
    }

    public void setIdTransObjfra(String idTransObjfra) {
        this.idTransObjfra = idTransObjfra;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJGEN", nullable = true, length = 30)
    public String getIdTransObjgen() {
        return idTransObjgen;
    }

    public void setIdTransObjgen(String idTransObjgen) {
        this.idTransObjgen = idTransObjgen;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJGER", nullable = true, length = 30)
    public String getIdTransObjger() {
        return idTransObjger;
    }

    public void setIdTransObjger(String idTransObjger) {
        this.idTransObjger = idTransObjger;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJITA", nullable = true, length = 30)
    public String getIdTransObjita() {
        return idTransObjita;
    }

    public void setIdTransObjita(String idTransObjita) {
        this.idTransObjita = idTransObjita;
    }

    @Basic
    @Column(name = "ID_TRANS_OBJBRA", nullable = true, length = 30)
    public String getIdTransObjbra() {
        return idTransObjbra;
    }

    public void setIdTransObjbra(String idTransObjbra) {
        this.idTransObjbra = idTransObjbra;
    }

    @Basic
    @Column(name = "REAL_NAME", nullable = true, length = 30)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "ID_OBJECT_TYPE", nullable = true, precision = 0)
    public Integer getIdObjectType() {
        return idObjectType;
    }

    public void setIdObjectType(Integer idObjectType) {
        this.idObjectType = idObjectType;
    }

    @Basic
    @Column(name = "ID_TEMPORARY", nullable = true, precision = 0)
    public Integer getIdTemporary() {
        return idTemporary;
    }

    public void setIdTemporary(Integer idTemporary) {
        this.idTemporary = idTemporary;
    }

    @Basic
    @Column(name = "ID_NP_TYPE", nullable = true, precision = 0)
    public Integer getIdNpType() {
        return idNpType;
    }

    public void setIdNpType(Integer idNpType) {
        this.idNpType = idNpType;
    }

    @Basic
    @Column(name = "CORRECTED", nullable = true, precision = 0)
    public BigInteger getCorrected() {
        return corrected;
    }

    public void setCorrected(BigInteger corrected) {
        this.corrected = corrected;
    }

    @Basic
    @Column(name = "IS_CACHEABLE", nullable = true, precision = 0)
    public BigInteger getIsCacheable() {
        return isCacheable;
    }

    public void setIsCacheable(BigInteger isCacheable) {
        this.isCacheable = isCacheable;
    }

    @Basic
    @Column(name = "ID_CLS_DATE", nullable = true, length = 30)
    public String getIdClsDate() {
        return idClsDate;
    }

    public void setIdClsDate(String idClsDate) {
        this.idClsDate = idClsDate;
    }

    @Basic
    @Column(name = "DEP_CROSS_MOD", nullable = true, precision = 0)
    public BigInteger getDepCrossMod() {
        return depCrossMod;
    }

    public void setDepCrossMod(BigInteger depCrossMod) {
        this.depCrossMod = depCrossMod;
    }

    @Basic
    @Column(name = "HAVE_SECURITY", nullable = true, precision = 0)
    public BigInteger getHaveSecurity() {
        return haveSecurity;
    }

    public void setHaveSecurity(BigInteger haveSecurity) {
        this.haveSecurity = haveSecurity;
    }

    @Basic
    @Column(name = "HAS_AUDITORY", nullable = true, precision = 0)
    public BigInteger getHasAuditory() {
        return hasAuditory;
    }

    public void setHasAuditory(BigInteger hasAuditory) {
        this.hasAuditory = hasAuditory;
    }

    @Basic
    @Column(name = "ID_AUDIT_OBJECT", nullable = true, length = 30)
    public String getIdAuditObject() {
        return idAuditObject;
    }

    public void setIdAuditObject(String idAuditObject) {
        this.idAuditObject = idAuditObject;
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
    @Column(name = "DT_MOD", nullable = true)
    public Timestamp getDtMod() {
        return dtMod;
    }

    public void setDtMod(Timestamp dtMod) {
        this.dtMod = dtMod;
    }

    @Basic
    @Column(name = "DT_CREATE", nullable = true)
    public Timestamp getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Timestamp dtCreate) {
        this.dtCreate = dtCreate;
    }

    @Basic
    @Column(name = "DTE_CLOSED", nullable = true)
    public Timestamp getDteClosed() {
        return dteClosed;
    }

    public void setDteClosed(Timestamp dteClosed) {
        this.dteClosed = dteClosed;
    }

    @Basic
    @Column(name = "DT_MOD_SCRIPT", nullable = true)
    public Timestamp getDtModScript() {
        return dtModScript;
    }

    public void setDtModScript(Timestamp dtModScript) {
        this.dtModScript = dtModScript;
    }

    @Basic
    @Column(name = "DT_PK", nullable = true)
    public Timestamp getDtPk() {
        return dtPk;
    }

    public void setDtPk(Timestamp dtPk) {
        this.dtPk = dtPk;
    }

    @Basic
    @Column(name = "ID_ORG_TYPE", nullable = true, precision = 0)
    public BigInteger getIdOrgType() {
        return idOrgType;
    }

    public void setIdOrgType(BigInteger idOrgType) {
        this.idOrgType = idOrgType;
    }

    @Basic
    @Column(name = "ID_ORG_LEVEL", nullable = true, precision = 2)
    public BigDecimal getIdOrgLevel() {
        return idOrgLevel;
    }

    public void setIdOrgLevel(BigDecimal idOrgLevel) {
        this.idOrgLevel = idOrgLevel;
    }

    @Basic
    @Column(name = "INHERITS_DATA", nullable = true, precision = 0)
    public BigInteger getInheritsData() {
        return inheritsData;
    }

    public void setInheritsData(BigInteger inheritsData) {
        this.inheritsData = inheritsData;
    }

    @Basic
    @Column(name = "HAS_TABLE_I", nullable = true, precision = 0)
    public BigInteger getHasTableI() {
        return hasTableI;
    }

    public void setHasTableI(BigInteger hasTableI) {
        this.hasTableI = hasTableI;
    }

    @Basic
    @Column(name = "ID_MIRROR_OBJECT", nullable = true, length = 30)
    public String getIdMirrorObject() {
        return idMirrorObject;
    }

    public void setIdMirrorObject(String idMirrorObject) {
        this.idMirrorObject = idMirrorObject;
    }

    @Basic
    @Column(name = "TYPE_MIRROR", nullable = true, precision = 0)
    public BigInteger getTypeMirror() {
        return typeMirror;
    }

    public void setTypeMirror(BigInteger typeMirror) {
        this.typeMirror = typeMirror;
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

    @Basic
    @Column(name = "TRANS_REAL_NAME", nullable = true, length = 30)
    public String getTransRealName() {
        return transRealName;
    }

    public void setTransRealName(String transRealName) {
        this.transRealName = transRealName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RdcLogicObject that = (M4RdcLogicObject) o;
        return Objects.equals(idObject, that.idObject) &&
                Objects.equals(idTransObjeng, that.idTransObjeng) &&
                Objects.equals(idTransObjesp, that.idTransObjesp) &&
                Objects.equals(idTransObjfra, that.idTransObjfra) &&
                Objects.equals(idTransObjgen, that.idTransObjgen) &&
                Objects.equals(idTransObjger, that.idTransObjger) &&
                Objects.equals(idTransObjita, that.idTransObjita) &&
                Objects.equals(idTransObjbra, that.idTransObjbra) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(idObjectType, that.idObjectType) &&
                Objects.equals(idTemporary, that.idTemporary) &&
                Objects.equals(idNpType, that.idNpType) &&
                Objects.equals(corrected, that.corrected) &&
                Objects.equals(isCacheable, that.isCacheable) &&
                Objects.equals(idClsDate, that.idClsDate) &&
                Objects.equals(depCrossMod, that.depCrossMod) &&
                Objects.equals(haveSecurity, that.haveSecurity) &&
                Objects.equals(hasAuditory, that.hasAuditory) &&
                Objects.equals(idAuditObject, that.idAuditObject) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(dtMod, that.dtMod) &&
                Objects.equals(dtCreate, that.dtCreate) &&
                Objects.equals(dteClosed, that.dteClosed) &&
                Objects.equals(dtModScript, that.dtModScript) &&
                Objects.equals(dtPk, that.dtPk) &&
                Objects.equals(idOrgType, that.idOrgType) &&
                Objects.equals(idOrgLevel, that.idOrgLevel) &&
                Objects.equals(inheritsData, that.inheritsData) &&
                Objects.equals(hasTableI, that.hasTableI) &&
                Objects.equals(idMirrorObject, that.idMirrorObject) &&
                Objects.equals(typeMirror, that.typeMirror) &&
                Objects.equals(idApprole, that.idApprole) &&
                Objects.equals(idSecuser, that.idSecuser) &&
                Objects.equals(dtLastUpdate, that.dtLastUpdate) &&
                Objects.equals(transRealName, that.transRealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObject, idTransObjeng, idTransObjesp, idTransObjfra, idTransObjgen, idTransObjger, idTransObjita, idTransObjbra, realName, idObjectType, idTemporary, idNpType, corrected, isCacheable, idClsDate, depCrossMod, haveSecurity, hasAuditory, idAuditObject, ownerFlag, dtMod, dtCreate, dteClosed, dtModScript, dtPk, idOrgType, idOrgLevel, inheritsData, hasTableI, idMirrorObject, typeMirror, idApprole, idSecuser, dtLastUpdate, transRealName);
    }
}
