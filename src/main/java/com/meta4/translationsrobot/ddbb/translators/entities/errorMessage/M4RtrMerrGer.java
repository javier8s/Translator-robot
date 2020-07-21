package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MERR_GER", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMerrGerPK.class)
public class M4RtrMerrGer {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private Integer idFmodRedirNum;
    private Integer idFsmodRedirNum;
    private String idTi;
    private String nErrorMsgger;
    private String translatorGer;
    private Integer validateGer;
    private String commnetGer;
    private Timestamp insDate;
    private String bckp;
    private Integer ownerFlag;
    private Timestamp modDateGer;

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
    @Column(name = "N_ERROR_MSGGER", nullable = true, length = -1)
    public String getnErrorMsgger() {
        return nErrorMsgger;
    }

    public void setnErrorMsgger(String nErrorMsgger) {
        this.nErrorMsgger = nErrorMsgger;
    }

    @Basic
    @Column(name = "TRANSLATOR_GER", nullable = true, length = 30)
    public String getTranslatorGer() {
        return translatorGer;
    }

    public void setTranslatorGer(String translatorGer) {
        this.translatorGer = translatorGer;
    }

    @Basic
    @Column(name = "VALIDATE_GER", nullable = true, precision = 0)
    public Integer getValidateGer() {
        return validateGer;
    }

    public void setValidateGer(Integer validateGer) {
        this.validateGer = validateGer;
    }

    @Basic
    @Column(name = "COMMNET_GER", nullable = true, length = 50)
    public String getCommnetGer() {
        return commnetGer;
    }

    public void setCommnetGer(String commnetGer) {
        this.commnetGer = commnetGer;
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
    @Column(name = "OWNER_FLAG", nullable = true, precision = 0)
    public Integer getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(Integer ownerFlag) {
        this.ownerFlag = ownerFlag;
    }

    @Basic
    @Column(name = "MOD_DATE_GER", nullable = true)
    public Timestamp getModDateGer() {
        return modDateGer;
    }

    public void setModDateGer(Timestamp modDateGer) {
        this.modDateGer = modDateGer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrGer that = (M4RtrMerrGer) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(idFmodRedirNum, that.idFmodRedirNum) &&
                Objects.equals(idFsmodRedirNum, that.idFsmodRedirNum) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(nErrorMsgger, that.nErrorMsgger) &&
                Objects.equals(translatorGer, that.translatorGer) &&
                Objects.equals(validateGer, that.validateGer) &&
                Objects.equals(commnetGer, that.commnetGer) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(bckp, that.bckp) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(modDateGer, that.modDateGer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, idFmodRedirNum, idFsmodRedirNum, idTi, nErrorMsgger, translatorGer, validateGer, commnetGer, insDate, bckp, ownerFlag, modDateGer);
    }
}
