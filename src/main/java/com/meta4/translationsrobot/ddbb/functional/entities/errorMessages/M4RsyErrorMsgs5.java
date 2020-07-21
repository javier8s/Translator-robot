package com.meta4.translationsrobot.ddbb.functional.entities.errorMessages;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "M4RSY_ERROR_MSGS5", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RsyErrorMsgs5PK.class)
public class M4RsyErrorMsgs5 {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;
    private String nErrorMsgbra;

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
    @Column(name = "N_ERROR_MSGBRA", nullable = true, length = -1)
    public String getnErrorMsgbra() {
        return nErrorMsgbra;
    }

    public void setnErrorMsgbra(String nErrorMsgbra) {
        this.nErrorMsgbra = nErrorMsgbra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RsyErrorMsgs5 that = (M4RsyErrorMsgs5) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg &&
                Objects.equals(nErrorMsgbra, that.nErrorMsgbra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg, nErrorMsgbra);
    }
}
