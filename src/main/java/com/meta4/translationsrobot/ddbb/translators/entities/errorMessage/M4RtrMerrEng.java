package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MERR_ENG", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMerrEngPK.class)
public class M4RtrMerrEng {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private Integer idFmodRedirNum;
    private Integer idFsmodRedirNum;
    private String idTi;
    private String nErrorMsgeng;
    private String translatorEng;
    private String validateEng;
    private String commnetEng;
    private Timestamp insDate;
    private String bckp;
    private Integer ownerFlag;
    private Timestamp modDateEng;

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
    @Column(name = "N_ERROR_MSGENG", nullable = true, length = -1)
    public String getnErrorMsgeng() {
        return nErrorMsgeng;
    }

    public void setnErrorMsgeng(String nErrorMsgeng) {
        this.nErrorMsgeng = nErrorMsgeng;
    }

    @Basic
    @Column(name = "TRANSLATOR_ENG", nullable = true, length = 30)
    public String getTranslatorEng() {
        return translatorEng;
    }

    public void setTranslatorEng(String translatorEng) {
        this.translatorEng = translatorEng;
    }

    @Basic
    @Column(name = "VALIDATE_ENG", nullable = true, length = 10)
    public String getValidateEng() {
        return validateEng;
    }

    public void setValidateEng(String validateEng) {
        this.validateEng = validateEng;
    }

    @Basic
    @Column(name = "COMMNET_ENG", nullable = true, length = 50)
    public String getCommnetEng() {
        return commnetEng;
    }

    public void setCommnetEng(String commnetEng) {
        this.commnetEng = commnetEng;
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
    @Column(name = "MOD_DATE_ENG", nullable = true)
    public Timestamp getModDateEng() {
        return modDateEng;
    }

    public void setModDateEng(Timestamp modDateEng) {
        this.modDateEng = modDateEng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrEng that = (M4RtrMerrEng) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(idFmodRedirNum, that.idFmodRedirNum) &&
                Objects.equals(idFsmodRedirNum, that.idFsmodRedirNum) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(nErrorMsgeng, that.nErrorMsgeng) &&
                Objects.equals(translatorEng, that.translatorEng) &&
                Objects.equals(validateEng, that.validateEng) &&
                Objects.equals(commnetEng, that.commnetEng) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(bckp, that.bckp) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(modDateEng, that.modDateEng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, idFmodRedirNum, idFsmodRedirNum, idTi, nErrorMsgeng, translatorEng, validateEng, commnetEng, insDate, bckp, ownerFlag, modDateEng);
    }
}
