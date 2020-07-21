package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MERR_FRA", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMerrFraPK.class)
public class M4RtrMerrFra {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private Integer idFmodRedirNum;
    private Integer idFsmodRedirNum;
    private String idTi;
    private String nErrorMsgfra;
    private String translatorFra;
    private Integer validateFra;
    private String commnetFra;
    private Timestamp insDate;
    private String bckp;
    private Integer ownerFlag;
    private Timestamp modDateFra;

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
    @Column(name = "N_ERROR_MSGFRA", nullable = true, length = -1)
    public String getnErrorMsgfra() {
        return nErrorMsgfra;
    }

    public void setnErrorMsgfra(String nErrorMsgfra) {
        this.nErrorMsgfra = nErrorMsgfra;
    }

    @Basic
    @Column(name = "TRANSLATOR_FRA", nullable = true, length = 30)
    public String getTranslatorFra() {
        return translatorFra;
    }

    public void setTranslatorFra(String translatorFra) {
        this.translatorFra = translatorFra;
    }

    @Basic
    @Column(name = "VALIDATE_FRA", nullable = true, precision = 0)
    public Integer getValidateFra() {
        return validateFra;
    }

    public void setValidateFra(Integer validateFra) {
        this.validateFra = validateFra;
    }

    @Basic
    @Column(name = "COMMNET_FRA", nullable = true, length = 50)
    public String getCommnetFra() {
        return commnetFra;
    }

    public void setCommnetFra(String commnetFra) {
        this.commnetFra = commnetFra;
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
    @Column(name = "MOD_DATE_FRA", nullable = true)
    public Timestamp getModDateFra() {
        return modDateFra;
    }

    public void setModDateFra(Timestamp modDateFra) {
        this.modDateFra = modDateFra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrFra that = (M4RtrMerrFra) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(idFmodRedirNum, that.idFmodRedirNum) &&
                Objects.equals(idFsmodRedirNum, that.idFsmodRedirNum) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(nErrorMsgfra, that.nErrorMsgfra) &&
                Objects.equals(translatorFra, that.translatorFra) &&
                Objects.equals(validateFra, that.validateFra) &&
                Objects.equals(commnetFra, that.commnetFra) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(bckp, that.bckp) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(modDateFra, that.modDateFra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, idFmodRedirNum, idFsmodRedirNum, idTi, nErrorMsgfra, translatorFra, validateFra, commnetFra, insDate, bckp, ownerFlag, modDateFra);
    }
}
