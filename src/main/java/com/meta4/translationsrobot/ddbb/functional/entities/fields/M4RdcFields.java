package com.meta4.translationsrobot.ddbb.functional.entities.fields;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RDC_FIELDS", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RdcFieldsPK.class)
public class M4RdcFields {
    private String idObject;
    private String idField;
    private String idTransFldbra;
    private String idTransFldesp;
    private String idTransFldger;
    private String idTransFldgen;
    private String idTransFldfra;
    private String idTransFldeng;
    private String idTransFldita;
    private String realName;
    private Integer position;
    private Integer posList;
    private Integer posPk;
    private String idType;
    private BigInteger notNull;
    private Integer idInternalField;
    private BigInteger ctrlRepetition;
    private BigInteger replyAllTables;
    private Integer idGroupNull;
    private BigInteger isNotPluged;
    private String idFieldAux;
    private Timestamp dtMod;
    private Timestamp dtModScript;
    private Timestamp dtCreate;
    private Timestamp dteClosed;
    private BigInteger haveSecurity;
    private Integer ownerFlag;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;
    private BigInteger isPrivate;

    @Id
    @Column(name = "ID_OBJECT", nullable = false, length = 30)
    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    @Id
    @Column(name = "ID_FIELD", nullable = false, length = 30)
    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDBRA", nullable = true, length = 30)
    public String getIdTransFldbra() {
        return idTransFldbra;
    }

    public void setIdTransFldbra(String idTransFldbra) {
        this.idTransFldbra = idTransFldbra;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDESP", nullable = true, length = 30)
    public String getIdTransFldesp() {
        return idTransFldesp;
    }

    public void setIdTransFldesp(String idTransFldesp) {
        this.idTransFldesp = idTransFldesp;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDGER", nullable = true, length = 30)
    public String getIdTransFldger() {
        return idTransFldger;
    }

    public void setIdTransFldger(String idTransFldger) {
        this.idTransFldger = idTransFldger;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDGEN", nullable = true, length = 30)
    public String getIdTransFldgen() {
        return idTransFldgen;
    }

    public void setIdTransFldgen(String idTransFldgen) {
        this.idTransFldgen = idTransFldgen;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDFRA", nullable = true, length = 30)
    public String getIdTransFldfra() {
        return idTransFldfra;
    }

    public void setIdTransFldfra(String idTransFldfra) {
        this.idTransFldfra = idTransFldfra;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDENG", nullable = true, length = 30)
    public String getIdTransFldeng() {
        return idTransFldeng;
    }

    public void setIdTransFldeng(String idTransFldeng) {
        this.idTransFldeng = idTransFldeng;
    }

    @Basic
    @Column(name = "ID_TRANS_FLDITA", nullable = true, length = 30)
    public String getIdTransFldita() {
        return idTransFldita;
    }

    public void setIdTransFldita(String idTransFldita) {
        this.idTransFldita = idTransFldita;
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
    @Column(name = "POSITION", nullable = true, precision = 0)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "POS_LIST", nullable = true, precision = 0)
    public Integer getPosList() {
        return posList;
    }

    public void setPosList(Integer posList) {
        this.posList = posList;
    }

    @Basic
    @Column(name = "POS_PK", nullable = true, precision = 0)
    public Integer getPosPk() {
        return posPk;
    }

    public void setPosPk(Integer posPk) {
        this.posPk = posPk;
    }

    @Basic
    @Column(name = "ID_TYPE", nullable = true, length = 30)
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "NOT_NULL", nullable = true, precision = 0)
    public BigInteger getNotNull() {
        return notNull;
    }

    public void setNotNull(BigInteger notNull) {
        this.notNull = notNull;
    }

    @Basic
    @Column(name = "ID_INTERNAL_FIELD", nullable = true, precision = 0)
    public Integer getIdInternalField() {
        return idInternalField;
    }

    public void setIdInternalField(Integer idInternalField) {
        this.idInternalField = idInternalField;
    }

    @Basic
    @Column(name = "CTRL_REPETITION", nullable = true, precision = 0)
    public BigInteger getCtrlRepetition() {
        return ctrlRepetition;
    }

    public void setCtrlRepetition(BigInteger ctrlRepetition) {
        this.ctrlRepetition = ctrlRepetition;
    }

    @Basic
    @Column(name = "REPLY_ALL_TABLES", nullable = true, precision = 0)
    public BigInteger getReplyAllTables() {
        return replyAllTables;
    }

    public void setReplyAllTables(BigInteger replyAllTables) {
        this.replyAllTables = replyAllTables;
    }

    @Basic
    @Column(name = "ID_GROUP_NULL", nullable = true, precision = 0)
    public Integer getIdGroupNull() {
        return idGroupNull;
    }

    public void setIdGroupNull(Integer idGroupNull) {
        this.idGroupNull = idGroupNull;
    }

    @Basic
    @Column(name = "IS_NOT_PLUGED", nullable = true, precision = 0)
    public BigInteger getIsNotPluged() {
        return isNotPluged;
    }

    public void setIsNotPluged(BigInteger isNotPluged) {
        this.isNotPluged = isNotPluged;
    }

    @Basic
    @Column(name = "ID_FIELD_AUX", nullable = true, length = 30)
    public String getIdFieldAux() {
        return idFieldAux;
    }

    public void setIdFieldAux(String idFieldAux) {
        this.idFieldAux = idFieldAux;
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
    @Column(name = "DT_MOD_SCRIPT", nullable = true)
    public Timestamp getDtModScript() {
        return dtModScript;
    }

    public void setDtModScript(Timestamp dtModScript) {
        this.dtModScript = dtModScript;
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
    @Column(name = "HAVE_SECURITY", nullable = true, precision = 0)
    public BigInteger getHaveSecurity() {
        return haveSecurity;
    }

    public void setHaveSecurity(BigInteger haveSecurity) {
        this.haveSecurity = haveSecurity;
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

    @Basic
    @Column(name = "IS_PRIVATE", nullable = true, precision = 0)
    public BigInteger getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(BigInteger isPrivate) {
        this.isPrivate = isPrivate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RdcFields that = (M4RdcFields) o;
        return Objects.equals(idObject, that.idObject) &&
                Objects.equals(idField, that.idField) &&
                Objects.equals(idTransFldbra, that.idTransFldbra) &&
                Objects.equals(idTransFldesp, that.idTransFldesp) &&
                Objects.equals(idTransFldger, that.idTransFldger) &&
                Objects.equals(idTransFldgen, that.idTransFldgen) &&
                Objects.equals(idTransFldfra, that.idTransFldfra) &&
                Objects.equals(idTransFldeng, that.idTransFldeng) &&
                Objects.equals(idTransFldita, that.idTransFldita) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(position, that.position) &&
                Objects.equals(posList, that.posList) &&
                Objects.equals(posPk, that.posPk) &&
                Objects.equals(idType, that.idType) &&
                Objects.equals(notNull, that.notNull) &&
                Objects.equals(idInternalField, that.idInternalField) &&
                Objects.equals(ctrlRepetition, that.ctrlRepetition) &&
                Objects.equals(replyAllTables, that.replyAllTables) &&
                Objects.equals(idGroupNull, that.idGroupNull) &&
                Objects.equals(isNotPluged, that.isNotPluged) &&
                Objects.equals(idFieldAux, that.idFieldAux) &&
                Objects.equals(dtMod, that.dtMod) &&
                Objects.equals(dtModScript, that.dtModScript) &&
                Objects.equals(dtCreate, that.dtCreate) &&
                Objects.equals(dteClosed, that.dteClosed) &&
                Objects.equals(haveSecurity, that.haveSecurity) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(idApprole, that.idApprole) &&
                Objects.equals(idSecuser, that.idSecuser) &&
                Objects.equals(dtLastUpdate, that.dtLastUpdate) &&
                Objects.equals(isPrivate, that.isPrivate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObject, idField, idTransFldbra, idTransFldesp, idTransFldger, idTransFldgen, idTransFldfra, idTransFldeng, idTransFldita, realName, position, posList, posPk, idType, notNull, idInternalField, ctrlRepetition, replyAllTables, idGroupNull, isNotPluged, idFieldAux, dtMod, dtModScript, dtCreate, dteClosed, haveSecurity, ownerFlag, idApprole, idSecuser, dtLastUpdate, isPrivate);
    }
}
