package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MERR_BRA", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMerrBraPK.class)
public class M4RtrMerrBra {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private Integer idFmodRedirNum;
    private Integer idFsmodRedirNum;
    private String idTi;
    private String nErrorMsgbra;
    private String translatorBra;
    private Integer validateBra;
    private String commnetBra;
    private Timestamp insDate;
    private String bckp;
    private String developer;
    private Integer ownerFlag;
    private Timestamp modDateBra;

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
    @Column(name = "N_ERROR_MSGBRA", nullable = true, length = -1)
    public String getnErrorMsgbra() {
        return nErrorMsgbra;
    }

    public void setnErrorMsgbra(String nErrorMsgbra) {
        this.nErrorMsgbra = nErrorMsgbra;
    }

    @Basic
    @Column(name = "TRANSLATOR_BRA", nullable = true, length = 30)
    public String getTranslatorBra() {
        return translatorBra;
    }

    public void setTranslatorBra(String translatorBra) {
        this.translatorBra = translatorBra;
    }

    @Basic
    @Column(name = "VALIDATE_BRA", nullable = true, precision = 0)
    public Integer getValidateBra() {
        return validateBra;
    }

    public void setValidateBra(Integer validateBra) {
        this.validateBra = validateBra;
    }

    @Basic
    @Column(name = "COMMNET_BRA", nullable = true, length = 254)
    public String getCommnetBra() {
        return commnetBra;
    }

    public void setCommnetBra(String commnetBra) {
        this.commnetBra = commnetBra;
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
    @Column(name = "MOD_DATE_BRA", nullable = true)
    public Timestamp getModDateBra() {
        return modDateBra;
    }

    public void setModDateBra(Timestamp modDateBra) {
        this.modDateBra = modDateBra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrBra that = (M4RtrMerrBra) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(idFmodRedirNum, that.idFmodRedirNum) &&
                Objects.equals(idFsmodRedirNum, that.idFsmodRedirNum) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(nErrorMsgbra, that.nErrorMsgbra) &&
                Objects.equals(translatorBra, that.translatorBra) &&
                Objects.equals(validateBra, that.validateBra) &&
                Objects.equals(commnetBra, that.commnetBra) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(bckp, that.bckp) &&
                Objects.equals(developer, that.developer) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(modDateBra, that.modDateBra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, idFmodRedirNum, idFsmodRedirNum, idTi, nErrorMsgbra, translatorBra, validateBra, commnetBra, insDate, bckp, developer, ownerFlag, modDateBra);
    }
}
