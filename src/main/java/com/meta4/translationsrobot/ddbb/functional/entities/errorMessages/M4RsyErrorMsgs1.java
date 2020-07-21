package com.meta4.translationsrobot.ddbb.functional.entities.errorMessages;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "M4RSY_ERROR_MSGS1", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RsyErrorMsgs1PK.class)
public class M4RsyErrorMsgs1 {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private String nErrorMsgeng;

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
    @Column(name = "N_ERROR_MSGENG", nullable = true, length = -1)
    public String getnErrorMsgeng() {
        return nErrorMsgeng;
    }

    public void setnErrorMsgeng(String nErrorMsgeng) {
        this.nErrorMsgeng = nErrorMsgeng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RsyErrorMsgs1 that = (M4RsyErrorMsgs1) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(nErrorMsgeng, that.nErrorMsgeng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, nErrorMsgeng);
    }
}
