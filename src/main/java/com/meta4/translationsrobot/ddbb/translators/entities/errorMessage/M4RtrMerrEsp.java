package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MERR_ESP", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMerrEspPK.class)
public class M4RtrMerrEsp {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private Integer idFmodRedirNum;
    private Integer idFsmodRedirNum;
    private String idTi;
    private String nErrorMsgesp;
    private String translatorEsp;
    private Integer validateEsp;
    private String commnetEsp;
    private Timestamp insDate;
    private String bckp;
    private String developer;
    private Integer ownerFlag;
    private Timestamp modDateEsp;

    @Id
    @Column(name = "ID_FUN_MOD_NUM", nullable = false, precision = 0)
    public int getIdFunModNum() {
        return idFunModNum;
    }

    public void setIdFunModNum(int idFunModNum) {
        this.idFunModNum = idFunModNum;
    }

    @Id
    @Column(name = "ID_FUN_SMOD_NUM", nullable = false, precision = 0)
    public int getIdFunSmodNum() {
        return idFunSmodNum;
    }

    public void setIdFunSmodNum(int idFunSmodNum) {
        this.idFunSmodNum = idFunSmodNum;
    }

    @Id
    @Column(name = "ID_ERROR_MSG", nullable = false, precision = 0)
    public int getIdErrorMsg() {
        return idErrorMsg;
    }

    public void setIdErrorMsg(int idErrorMsg) {
        this.idErrorMsg = idErrorMsg;
    }

    @Basic
    @Column(name = "ID_FMOD_REDIR_NUM", nullable = true, precision = 0)
    public Integer getIdFmodRedirNum() {
        return idFmodRedirNum;
    }

    public void setIdFmodRedirNum(Integer idFmodRedirNum) {
        this.idFmodRedirNum = idFmodRedirNum;
    }

    @Basic
    @Column(name = "ID_FSMOD_REDIR_NUM", nullable = true, precision = 0)
    public Integer getIdFsmodRedirNum() {
        return idFsmodRedirNum;
    }

    public void setIdFsmodRedirNum(Integer idFsmodRedirNum) {
        this.idFsmodRedirNum = idFsmodRedirNum;
    }

    @Basic
    @Column(name = "ID_TI", nullable = true, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Basic
    @Column(name = "N_ERROR_MSGESP", nullable = true, length = -1)
    public String getnErrorMsgesp() {
        return nErrorMsgesp;
    }

    public void setnErrorMsgesp(String nErrorMsgesp) {
        this.nErrorMsgesp = nErrorMsgesp;
    }

    @Basic
    @Column(name = "TRANSLATOR_ESP", nullable = true, length = 30)
    public String getTranslatorEsp() {
        return translatorEsp;
    }

    public void setTranslatorEsp(String translatorEsp) {
        this.translatorEsp = translatorEsp;
    }

    @Basic
    @Column(name = "VALIDATE_ESP", nullable = true, precision = 0)
    public Integer getValidateEsp() {
        return validateEsp;
    }

    public void setValidateEsp(Integer validateEsp) {
        this.validateEsp = validateEsp;
    }

    @Basic
    @Column(name = "COMMNET_ESP", nullable = true, length = 50)
    public String getCommnetEsp() {
        return commnetEsp;
    }

    public void setCommnetEsp(String commnetEsp) {
        this.commnetEsp = commnetEsp;
    }

    @Basic
    @Column(name = "INS_DATE", nullable = true)
    public Timestamp getInsDate() {
        return insDate;
    }

    public void setInsDate(Timestamp insDate) {
        this.insDate = insDate;
    }

    @Basic
    @Column(name = "BCKP", nullable = true, length = 1000)
    public String getBckp() {
        return bckp;
    }

    public void setBckp(String bckp) {
        this.bckp = bckp;
    }

    @Basic
    @Column(name = "DEVELOPER", nullable = true, length = 50)
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
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
    @Column(name = "MOD_DATE_ESP", nullable = true)
    public Timestamp getModDateEsp() {
        return modDateEsp;
    }

    public void setModDateEsp(Timestamp modDateEsp) {
        this.modDateEsp = modDateEsp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrEsp that = (M4RtrMerrEsp) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(idFmodRedirNum, that.idFmodRedirNum) &&
                Objects.equals(idFsmodRedirNum, that.idFsmodRedirNum) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(nErrorMsgesp, that.nErrorMsgesp) &&
                Objects.equals(translatorEsp, that.translatorEsp) &&
                Objects.equals(validateEsp, that.validateEsp) &&
                Objects.equals(commnetEsp, that.commnetEsp) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(bckp, that.bckp) &&
                Objects.equals(developer, that.developer) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(modDateEsp, that.modDateEsp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, idFmodRedirNum, idFsmodRedirNum, idTi, nErrorMsgesp, translatorEsp, validateEsp, commnetEsp, insDate, bckp, developer, ownerFlag, modDateEsp);
    }
}
