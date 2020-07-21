package com.meta4.translationsrobot.ddbb.functional.entities.t3s;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RCH_T3S", schema = "dbo", catalog = "GLOBALHRPRO140619")
public class M4RchT3S {
    private String idT3;
    private String nT3Eng;
    private String nT3Esp;
    private String nT3Fra;
    private String nT3Gen;
    private String nT3Ger;
    private String nT3Ita;
    private Integer idStreamType;
    private String idTransT3Eng;
    private String idTransT3Esp;
    private String idTransT3Fra;
    private String idTransT3Gen;
    private String idTransT3Ger;
    private String idTransT3Ita;
    private Timestamp dtCreate;
    private Integer ownerFlag;
    private Integer creationType;
    private String oleClassId;
    private String idMaskQuery;
    private BigInteger checkConcurrency;
    private Integer environmentVars;
    private BigInteger isSeparable;
    private BigInteger csExeType;
    private BigInteger isCacheable;
    private BigDecimal cacheMaxPeriod;
    private BigInteger haveSecurity;
    private Integer vmCapacityReq;
    private BigInteger isExternal;
    private BigInteger depCrossMod;
    private BigInteger isCacheRam;
    private BigInteger simplified;
    private String idService;
    private String idServiceAlt;
    private BigInteger isMdCacheable;
    private BigInteger idOrgType;
    private Timestamp dtConcurrency;
    private String idTransT3Bra;
    private String nT3Bra;
    private BigInteger isDefault;
    private String buffer1;
    private String buffer2;
    private String buffer3;
    private BigInteger dataLanguage;
    private BigInteger metaLanguage;
    private String idCategory;
    private String idSubcategory;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;

    @Id
    @Column(name = "ID_T3", nullable = false, length = 30)
    public String getIdT3() {
        return idT3;
    }

    public void setIdT3(String idT3) {
        this.idT3 = idT3;
    }

    @Basic
    @Column(name = "N_T3ENG", nullable = true, length = 50)
    public String getnT3Eng() {
        return nT3Eng;
    }

    public void setnT3Eng(String nT3Eng) {
        this.nT3Eng = nT3Eng;
    }

    @Basic
    @Column(name = "N_T3ESP", nullable = true, length = 50)
    public String getnT3Esp() {
        return nT3Esp;
    }

    public void setnT3Esp(String nT3Esp) {
        this.nT3Esp = nT3Esp;
    }

    @Basic
    @Column(name = "N_T3FRA", nullable = true, length = 50)
    public String getnT3Fra() {
        return nT3Fra;
    }

    public void setnT3Fra(String nT3Fra) {
        this.nT3Fra = nT3Fra;
    }

    @Basic
    @Column(name = "N_T3GEN", nullable = true, length = 50)
    public String getnT3Gen() {
        return nT3Gen;
    }

    public void setnT3Gen(String nT3Gen) {
        this.nT3Gen = nT3Gen;
    }

    @Basic
    @Column(name = "N_T3GER", nullable = true, length = 50)
    public String getnT3Ger() {
        return nT3Ger;
    }

    public void setnT3Ger(String nT3Ger) {
        this.nT3Ger = nT3Ger;
    }

    @Basic
    @Column(name = "N_T3ITA", nullable = true, length = 50)
    public String getnT3Ita() {
        return nT3Ita;
    }

    public void setnT3Ita(String nT3Ita) {
        this.nT3Ita = nT3Ita;
    }

    @Basic
    @Column(name = "ID_STREAM_TYPE", nullable = true, precision = 0)
    public Integer getIdStreamType() {
        return idStreamType;
    }

    public void setIdStreamType(Integer idStreamType) {
        this.idStreamType = idStreamType;
    }

    @Basic
    @Column(name = "ID_TRANS_T3ENG", nullable = true, length = 30)
    public String getIdTransT3Eng() {
        return idTransT3Eng;
    }

    public void setIdTransT3Eng(String idTransT3Eng) {
        this.idTransT3Eng = idTransT3Eng;
    }

    @Basic
    @Column(name = "ID_TRANS_T3ESP", nullable = true, length = 30)
    public String getIdTransT3Esp() {
        return idTransT3Esp;
    }

    public void setIdTransT3Esp(String idTransT3Esp) {
        this.idTransT3Esp = idTransT3Esp;
    }

    @Basic
    @Column(name = "ID_TRANS_T3FRA", nullable = true, length = 30)
    public String getIdTransT3Fra() {
        return idTransT3Fra;
    }

    public void setIdTransT3Fra(String idTransT3Fra) {
        this.idTransT3Fra = idTransT3Fra;
    }

    @Basic
    @Column(name = "ID_TRANS_T3GEN", nullable = true, length = 30)
    public String getIdTransT3Gen() {
        return idTransT3Gen;
    }

    public void setIdTransT3Gen(String idTransT3Gen) {
        this.idTransT3Gen = idTransT3Gen;
    }

    @Basic
    @Column(name = "ID_TRANS_T3GER", nullable = true, length = 30)
    public String getIdTransT3Ger() {
        return idTransT3Ger;
    }

    public void setIdTransT3Ger(String idTransT3Ger) {
        this.idTransT3Ger = idTransT3Ger;
    }

    @Basic
    @Column(name = "ID_TRANS_T3ITA", nullable = true, length = 30)
    public String getIdTransT3Ita() {
        return idTransT3Ita;
    }

    public void setIdTransT3Ita(String idTransT3Ita) {
        this.idTransT3Ita = idTransT3Ita;
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
    @Column(name = "OLE_CLASS_ID", nullable = true, length = 40)
    public String getOleClassId() {
        return oleClassId;
    }

    public void setOleClassId(String oleClassId) {
        this.oleClassId = oleClassId;
    }

    @Basic
    @Column(name = "ID_MASK_QUERY", nullable = true, length = 30)
    public String getIdMaskQuery() {
        return idMaskQuery;
    }

    public void setIdMaskQuery(String idMaskQuery) {
        this.idMaskQuery = idMaskQuery;
    }

    @Basic
    @Column(name = "CHECK_CONCURRENCY", nullable = true, precision = 0)
    public BigInteger getCheckConcurrency() {
        return checkConcurrency;
    }

    public void setCheckConcurrency(BigInteger checkConcurrency) {
        this.checkConcurrency = checkConcurrency;
    }

    @Basic
    @Column(name = "ENVIRONMENT_VARS", nullable = true, precision = 0)
    public Integer getEnvironmentVars() {
        return environmentVars;
    }

    public void setEnvironmentVars(Integer environmentVars) {
        this.environmentVars = environmentVars;
    }

    @Basic
    @Column(name = "IS_SEPARABLE", nullable = true, precision = 0)
    public BigInteger getIsSeparable() {
        return isSeparable;
    }

    public void setIsSeparable(BigInteger isSeparable) {
        this.isSeparable = isSeparable;
    }

    @Basic
    @Column(name = "CS_EXE_TYPE", nullable = true, precision = 0)
    public BigInteger getCsExeType() {
        return csExeType;
    }

    public void setCsExeType(BigInteger csExeType) {
        this.csExeType = csExeType;
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
    @Column(name = "CACHE_MAX_PERIOD", nullable = true, precision = 6)
    public BigDecimal getCacheMaxPeriod() {
        return cacheMaxPeriod;
    }

    public void setCacheMaxPeriod(BigDecimal cacheMaxPeriod) {
        this.cacheMaxPeriod = cacheMaxPeriod;
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
    @Column(name = "VM_CAPACITY_REQ", nullable = true, precision = 0)
    public Integer getVmCapacityReq() {
        return vmCapacityReq;
    }

    public void setVmCapacityReq(Integer vmCapacityReq) {
        this.vmCapacityReq = vmCapacityReq;
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
    @Column(name = "DEP_CROSS_MOD", nullable = true, precision = 0)
    public BigInteger getDepCrossMod() {
        return depCrossMod;
    }

    public void setDepCrossMod(BigInteger depCrossMod) {
        this.depCrossMod = depCrossMod;
    }

    @Basic
    @Column(name = "IS_CACHE_RAM", nullable = true, precision = 0)
    public BigInteger getIsCacheRam() {
        return isCacheRam;
    }

    public void setIsCacheRam(BigInteger isCacheRam) {
        this.isCacheRam = isCacheRam;
    }

    @Basic
    @Column(name = "SIMPLIFIED", nullable = true, precision = 0)
    public BigInteger getSimplified() {
        return simplified;
    }

    public void setSimplified(BigInteger simplified) {
        this.simplified = simplified;
    }

    @Basic
    @Column(name = "ID_SERVICE", nullable = true, length = 30)
    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Basic
    @Column(name = "ID_SERVICE_ALT", nullable = true, length = 30)
    public String getIdServiceAlt() {
        return idServiceAlt;
    }

    public void setIdServiceAlt(String idServiceAlt) {
        this.idServiceAlt = idServiceAlt;
    }

    @Basic
    @Column(name = "IS_MD_CACHEABLE", nullable = true, precision = 0)
    public BigInteger getIsMdCacheable() {
        return isMdCacheable;
    }

    public void setIsMdCacheable(BigInteger isMdCacheable) {
        this.isMdCacheable = isMdCacheable;
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
    @Column(name = "DT_CONCURRENCY", nullable = true)
    public Timestamp getDtConcurrency() {
        return dtConcurrency;
    }

    public void setDtConcurrency(Timestamp dtConcurrency) {
        this.dtConcurrency = dtConcurrency;
    }

    @Basic
    @Column(name = "ID_TRANS_T3BRA", nullable = true, length = 30)
    public String getIdTransT3Bra() {
        return idTransT3Bra;
    }

    public void setIdTransT3Bra(String idTransT3Bra) {
        this.idTransT3Bra = idTransT3Bra;
    }

    @Basic
    @Column(name = "N_T3BRA", nullable = true, length = 50)
    public String getnT3Bra() {
        return nT3Bra;
    }

    public void setnT3Bra(String nT3Bra) {
        this.nT3Bra = nT3Bra;
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
    @Column(name = "BUFFER1", nullable = true, length = 254)
    public String getBuffer1() {
        return buffer1;
    }

    public void setBuffer1(String buffer1) {
        this.buffer1 = buffer1;
    }

    @Basic
    @Column(name = "BUFFER2", nullable = true, length = 50)
    public String getBuffer2() {
        return buffer2;
    }

    public void setBuffer2(String buffer2) {
        this.buffer2 = buffer2;
    }

    @Basic
    @Column(name = "BUFFER3", nullable = true, length = 50)
    public String getBuffer3() {
        return buffer3;
    }

    public void setBuffer3(String buffer3) {
        this.buffer3 = buffer3;
    }

    @Basic
    @Column(name = "DATA_LANGUAGE", nullable = true, precision = 0)
    public BigInteger getDataLanguage() {
        return dataLanguage;
    }

    public void setDataLanguage(BigInteger dataLanguage) {
        this.dataLanguage = dataLanguage;
    }

    @Basic
    @Column(name = "META_LANGUAGE", nullable = true, precision = 0)
    public BigInteger getMetaLanguage() {
        return metaLanguage;
    }

    public void setMetaLanguage(BigInteger metaLanguage) {
        this.metaLanguage = metaLanguage;
    }

    @Basic
    @Column(name = "ID_CATEGORY", nullable = true, length = 10)
    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "ID_SUBCATEGORY", nullable = true, length = 10)
    public String getIdSubcategory() {
        return idSubcategory;
    }

    public void setIdSubcategory(String idSubcategory) {
        this.idSubcategory = idSubcategory;
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
        M4RchT3S m4RchT3S = (M4RchT3S) o;
        return Objects.equals(idT3, m4RchT3S.idT3) &&
                Objects.equals(nT3Eng, m4RchT3S.nT3Eng) &&
                Objects.equals(nT3Esp, m4RchT3S.nT3Esp) &&
                Objects.equals(nT3Fra, m4RchT3S.nT3Fra) &&
                Objects.equals(nT3Gen, m4RchT3S.nT3Gen) &&
                Objects.equals(nT3Ger, m4RchT3S.nT3Ger) &&
                Objects.equals(nT3Ita, m4RchT3S.nT3Ita) &&
                Objects.equals(idStreamType, m4RchT3S.idStreamType) &&
                Objects.equals(idTransT3Eng, m4RchT3S.idTransT3Eng) &&
                Objects.equals(idTransT3Esp, m4RchT3S.idTransT3Esp) &&
                Objects.equals(idTransT3Fra, m4RchT3S.idTransT3Fra) &&
                Objects.equals(idTransT3Gen, m4RchT3S.idTransT3Gen) &&
                Objects.equals(idTransT3Ger, m4RchT3S.idTransT3Ger) &&
                Objects.equals(idTransT3Ita, m4RchT3S.idTransT3Ita) &&
                Objects.equals(dtCreate, m4RchT3S.dtCreate) &&
                Objects.equals(ownerFlag, m4RchT3S.ownerFlag) &&
                Objects.equals(creationType, m4RchT3S.creationType) &&
                Objects.equals(oleClassId, m4RchT3S.oleClassId) &&
                Objects.equals(idMaskQuery, m4RchT3S.idMaskQuery) &&
                Objects.equals(checkConcurrency, m4RchT3S.checkConcurrency) &&
                Objects.equals(environmentVars, m4RchT3S.environmentVars) &&
                Objects.equals(isSeparable, m4RchT3S.isSeparable) &&
                Objects.equals(csExeType, m4RchT3S.csExeType) &&
                Objects.equals(isCacheable, m4RchT3S.isCacheable) &&
                Objects.equals(cacheMaxPeriod, m4RchT3S.cacheMaxPeriod) &&
                Objects.equals(haveSecurity, m4RchT3S.haveSecurity) &&
                Objects.equals(vmCapacityReq, m4RchT3S.vmCapacityReq) &&
                Objects.equals(isExternal, m4RchT3S.isExternal) &&
                Objects.equals(depCrossMod, m4RchT3S.depCrossMod) &&
                Objects.equals(isCacheRam, m4RchT3S.isCacheRam) &&
                Objects.equals(simplified, m4RchT3S.simplified) &&
                Objects.equals(idService, m4RchT3S.idService) &&
                Objects.equals(idServiceAlt, m4RchT3S.idServiceAlt) &&
                Objects.equals(isMdCacheable, m4RchT3S.isMdCacheable) &&
                Objects.equals(idOrgType, m4RchT3S.idOrgType) &&
                Objects.equals(dtConcurrency, m4RchT3S.dtConcurrency) &&
                Objects.equals(idTransT3Bra, m4RchT3S.idTransT3Bra) &&
                Objects.equals(nT3Bra, m4RchT3S.nT3Bra) &&
                Objects.equals(isDefault, m4RchT3S.isDefault) &&
                Objects.equals(buffer1, m4RchT3S.buffer1) &&
                Objects.equals(buffer2, m4RchT3S.buffer2) &&
                Objects.equals(buffer3, m4RchT3S.buffer3) &&
                Objects.equals(dataLanguage, m4RchT3S.dataLanguage) &&
                Objects.equals(metaLanguage, m4RchT3S.metaLanguage) &&
                Objects.equals(idCategory, m4RchT3S.idCategory) &&
                Objects.equals(idSubcategory, m4RchT3S.idSubcategory) &&
                Objects.equals(idApprole, m4RchT3S.idApprole) &&
                Objects.equals(idSecuser, m4RchT3S.idSecuser) &&
                Objects.equals(dtLastUpdate, m4RchT3S.dtLastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idT3, nT3Eng, nT3Esp, nT3Fra, nT3Gen, nT3Ger, nT3Ita, idStreamType, idTransT3Eng, idTransT3Esp, idTransT3Fra, idTransT3Gen, idTransT3Ger, idTransT3Ita, dtCreate, ownerFlag, creationType, oleClassId, idMaskQuery, checkConcurrency, environmentVars, isSeparable, csExeType, isCacheable, cacheMaxPeriod, haveSecurity, vmCapacityReq, isExternal, depCrossMod, isCacheRam, simplified, idService, idServiceAlt, isMdCacheable, idOrgType, dtConcurrency, idTransT3Bra, nT3Bra, isDefault, buffer1, buffer2, buffer3, dataLanguage, metaLanguage, idCategory, idSubcategory, idApprole, idSecuser, dtLastUpdate);
    }
}
