package com.meta4.translationsrobot.ddbb.functional.entities.tis;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RCH_TIS", schema = "dbo", catalog = "GLOBALHRPRO140619")
public class M4RchTis {
    private String idTi;
    private String nTieng;
    private String nTifra;
    private String nTiesp;
    private String nTiger;
    private String nTiita;
    private String nTigen;
    private String idReadSentence;
    private Integer idWriteSentence;
    private String idTiBase;
    private Integer idInheritType;
    private String idTransTigen;
    private String idTransTiita;
    private String idTransTieng;
    private String idTransTiger;
    private String idTransTifra;
    private String idTransTiesp;
    private String idReadObject;
    private String idWriteObject;
    private Integer idTemporary;
    private BigInteger complete;
    private BigInteger corrected;
    private BigInteger isSystemTi;
    private Timestamp dtLastUpdate;
    private Integer ownerFlag;
    private Integer creationType;
    private BigInteger idCstype;
    private Integer idSyncType;
    private BigInteger isExternal;
    private String idSecuser;
    private String idTransTibra;
    private String nTibra;
    private String idApprole;
    private BigInteger isDefault;
    private BigInteger hasRptMethods;
    private Timestamp dtConcurrency;
    private BigInteger generateSql;
    private Timestamp dtCreate;

    @Id
    @Column(name = "ID_TI", nullable = false, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Basic
    @Column(name = "N_TIENG", nullable = true, length = 50)
    public String getnTieng() {
        return nTieng;
    }

    public void setnTieng(String nTieng) {
        this.nTieng = nTieng;
    }

    @Basic
    @Column(name = "N_TIFRA", nullable = true, length = 50)
    public String getnTifra() {
        return nTifra;
    }

    public void setnTifra(String nTifra) {
        this.nTifra = nTifra;
    }

    @Basic
    @Column(name = "N_TIESP", nullable = true, length = 50)
    public String getnTiesp() {
        return nTiesp;
    }

    public void setnTiesp(String nTiesp) {
        this.nTiesp = nTiesp;
    }

    @Basic
    @Column(name = "N_TIGER", nullable = true, length = 50)
    public String getnTiger() {
        return nTiger;
    }

    public void setnTiger(String nTiger) {
        this.nTiger = nTiger;
    }

    @Basic
    @Column(name = "N_TIITA", nullable = true, length = 50)
    public String getnTiita() {
        return nTiita;
    }

    public void setnTiita(String nTiita) {
        this.nTiita = nTiita;
    }

    @Basic
    @Column(name = "N_TIGEN", nullable = true, length = 50)
    public String getnTigen() {
        return nTigen;
    }

    public void setnTigen(String nTigen) {
        this.nTigen = nTigen;
    }

    @Basic
    @Column(name = "ID_READ_SENTENCE", nullable = true, length = 50)
    public String getIdReadSentence() {
        return idReadSentence;
    }

    public void setIdReadSentence(String idReadSentence) {
        this.idReadSentence = idReadSentence;
    }

    @Basic
    @Column(name = "ID_WRITE_SENTENCE", nullable = true, precision = 0)
    public Integer getIdWriteSentence() {
        return idWriteSentence;
    }

    public void setIdWriteSentence(Integer idWriteSentence) {
        this.idWriteSentence = idWriteSentence;
    }

    @Basic
    @Column(name = "ID_TI_BASE", nullable = true, length = 30)
    public String getIdTiBase() {
        return idTiBase;
    }

    public void setIdTiBase(String idTiBase) {
        this.idTiBase = idTiBase;
    }

    @Basic
    @Column(name = "ID_INHERIT_TYPE", nullable = true, precision = 0)
    public Integer getIdInheritType() {
        return idInheritType;
    }

    public void setIdInheritType(Integer idInheritType) {
        this.idInheritType = idInheritType;
    }

    @Basic
    @Column(name = "ID_TRANS_TIGEN", nullable = true, length = 30)
    public String getIdTransTigen() {
        return idTransTigen;
    }

    public void setIdTransTigen(String idTransTigen) {
        this.idTransTigen = idTransTigen;
    }

    @Basic
    @Column(name = "ID_TRANS_TIITA", nullable = true, length = 30)
    public String getIdTransTiita() {
        return idTransTiita;
    }

    public void setIdTransTiita(String idTransTiita) {
        this.idTransTiita = idTransTiita;
    }

    @Basic
    @Column(name = "ID_TRANS_TIENG", nullable = true, length = 30)
    public String getIdTransTieng() {
        return idTransTieng;
    }

    public void setIdTransTieng(String idTransTieng) {
        this.idTransTieng = idTransTieng;
    }

    @Basic
    @Column(name = "ID_TRANS_TIGER", nullable = true, length = 30)
    public String getIdTransTiger() {
        return idTransTiger;
    }

    public void setIdTransTiger(String idTransTiger) {
        this.idTransTiger = idTransTiger;
    }

    @Basic
    @Column(name = "ID_TRANS_TIFRA", nullable = true, length = 30)
    public String getIdTransTifra() {
        return idTransTifra;
    }

    public void setIdTransTifra(String idTransTifra) {
        this.idTransTifra = idTransTifra;
    }

    @Basic
    @Column(name = "ID_TRANS_TIESP", nullable = true, length = 30)
    public String getIdTransTiesp() {
        return idTransTiesp;
    }

    public void setIdTransTiesp(String idTransTiesp) {
        this.idTransTiesp = idTransTiesp;
    }

    @Basic
    @Column(name = "ID_READ_OBJECT", nullable = true, length = 30)
    public String getIdReadObject() {
        return idReadObject;
    }

    public void setIdReadObject(String idReadObject) {
        this.idReadObject = idReadObject;
    }

    @Basic
    @Column(name = "ID_WRITE_OBJECT", nullable = true, length = 30)
    public String getIdWriteObject() {
        return idWriteObject;
    }

    public void setIdWriteObject(String idWriteObject) {
        this.idWriteObject = idWriteObject;
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
    @Column(name = "COMPLETE", nullable = true, precision = 0)
    public BigInteger getComplete() {
        return complete;
    }

    public void setComplete(BigInteger complete) {
        this.complete = complete;
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
    @Column(name = "IS_SYSTEM_TI", nullable = true, precision = 0)
    public BigInteger getIsSystemTi() {
        return isSystemTi;
    }

    public void setIsSystemTi(BigInteger isSystemTi) {
        this.isSystemTi = isSystemTi;
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
    @Column(name = "OWNER_FLAG", nullable = true, precision = 0)
    public Integer getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(Integer ownerFlag) {
        this.ownerFlag = ownerFlag;
    }

    @Basic
    @Column(name = "CREATION_TYPE", nullable = true, precision = 0)
    public Integer getCreationType() {
        return creationType;
    }

    public void setCreationType(Integer creationType) {
        this.creationType = creationType;
    }

    @Basic
    @Column(name = "ID_CSTYPE", nullable = true, precision = 0)
    public BigInteger getIdCstype() {
        return idCstype;
    }

    public void setIdCstype(BigInteger idCstype) {
        this.idCstype = idCstype;
    }

    @Basic
    @Column(name = "ID_SYNC_TYPE", nullable = true, precision = 0)
    public Integer getIdSyncType() {
        return idSyncType;
    }

    public void setIdSyncType(Integer idSyncType) {
        this.idSyncType = idSyncType;
    }

    @Basic
    @Column(name = "IS_EXTERNAL", nullable = true, precision = 0)
    public BigInteger getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(BigInteger isExternal) {
        this.isExternal = isExternal;
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
    @Column(name = "ID_TRANS_TIBRA", nullable = true, length = 30)
    public String getIdTransTibra() {
        return idTransTibra;
    }

    public void setIdTransTibra(String idTransTibra) {
        this.idTransTibra = idTransTibra;
    }

    @Basic
    @Column(name = "N_TIBRA", nullable = true, length = 50)
    public String getnTibra() {
        return nTibra;
    }

    public void setnTibra(String nTibra) {
        this.nTibra = nTibra;
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
    @Column(name = "IS_DEFAULT", nullable = true, precision = 0)
    public BigInteger getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(BigInteger isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "HAS_RPT_METHODS", nullable = true, precision = 0)
    public BigInteger getHasRptMethods() {
        return hasRptMethods;
    }

    public void setHasRptMethods(BigInteger hasRptMethods) {
        this.hasRptMethods = hasRptMethods;
    }

    @Basic
    @Column(name = "DT_CONCURRENCY", nullable = true)
    public Timestamp getDtConcurrency() {
        return dtConcurrency;
    }

    public void setDtConcurrency(Timestamp dtConcurrency) {
        this.dtConcurrency = dtConcurrency;
    }

    @Basic
    @Column(name = "GENERATE_SQL", nullable = true, precision = 0)
    public BigInteger getGenerateSql() {
        return generateSql;
    }

    public void setGenerateSql(BigInteger generateSql) {
        this.generateSql = generateSql;
    }

    @Basic
    @Column(name = "DT_CREATE", nullable = true)
    public Timestamp getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Timestamp dtCreate) {
        this.dtCreate = dtCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RchTis m4RchTis = (M4RchTis) o;
        return Objects.equals(idTi, m4RchTis.idTi) &&
                Objects.equals(nTieng, m4RchTis.nTieng) &&
                Objects.equals(nTifra, m4RchTis.nTifra) &&
                Objects.equals(nTiesp, m4RchTis.nTiesp) &&
                Objects.equals(nTiger, m4RchTis.nTiger) &&
                Objects.equals(nTiita, m4RchTis.nTiita) &&
                Objects.equals(nTigen, m4RchTis.nTigen) &&
                Objects.equals(idReadSentence, m4RchTis.idReadSentence) &&
                Objects.equals(idWriteSentence, m4RchTis.idWriteSentence) &&
                Objects.equals(idTiBase, m4RchTis.idTiBase) &&
                Objects.equals(idInheritType, m4RchTis.idInheritType) &&
                Objects.equals(idTransTigen, m4RchTis.idTransTigen) &&
                Objects.equals(idTransTiita, m4RchTis.idTransTiita) &&
                Objects.equals(idTransTieng, m4RchTis.idTransTieng) &&
                Objects.equals(idTransTiger, m4RchTis.idTransTiger) &&
                Objects.equals(idTransTifra, m4RchTis.idTransTifra) &&
                Objects.equals(idTransTiesp, m4RchTis.idTransTiesp) &&
                Objects.equals(idReadObject, m4RchTis.idReadObject) &&
                Objects.equals(idWriteObject, m4RchTis.idWriteObject) &&
                Objects.equals(idTemporary, m4RchTis.idTemporary) &&
                Objects.equals(complete, m4RchTis.complete) &&
                Objects.equals(corrected, m4RchTis.corrected) &&
                Objects.equals(isSystemTi, m4RchTis.isSystemTi) &&
                Objects.equals(dtLastUpdate, m4RchTis.dtLastUpdate) &&
                Objects.equals(ownerFlag, m4RchTis.ownerFlag) &&
                Objects.equals(creationType, m4RchTis.creationType) &&
                Objects.equals(idCstype, m4RchTis.idCstype) &&
                Objects.equals(idSyncType, m4RchTis.idSyncType) &&
                Objects.equals(isExternal, m4RchTis.isExternal) &&
                Objects.equals(idSecuser, m4RchTis.idSecuser) &&
                Objects.equals(idTransTibra, m4RchTis.idTransTibra) &&
                Objects.equals(nTibra, m4RchTis.nTibra) &&
                Objects.equals(idApprole, m4RchTis.idApprole) &&
                Objects.equals(isDefault, m4RchTis.isDefault) &&
                Objects.equals(hasRptMethods, m4RchTis.hasRptMethods) &&
                Objects.equals(dtConcurrency, m4RchTis.dtConcurrency) &&
                Objects.equals(generateSql, m4RchTis.generateSql) &&
                Objects.equals(dtCreate, m4RchTis.dtCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTi, nTieng, nTifra, nTiesp, nTiger, nTiita, nTigen, idReadSentence, idWriteSentence, idTiBase, idInheritType, idTransTigen, idTransTiita, idTransTieng, idTransTiger, idTransTifra, idTransTiesp, idReadObject, idWriteObject, idTemporary, complete, corrected, isSystemTi, dtLastUpdate, ownerFlag, creationType, idCstype, idSyncType, isExternal, idSecuser, idTransTibra, nTibra, idApprole, isDefault, hasRptMethods, dtConcurrency, generateSql, dtCreate);
    }
}
