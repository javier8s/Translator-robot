package com.meta4.translationsrobot.ddbb.translators.entities.errorMessage;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class M4RtrMerrBraPK implements Serializable {
    private int idFunModNum;
    private int idFunSmodNum;
    private int idErrorMsg;

    @Column(name = "ID_FUN_MOD_NUM", nullable = false, precision = 0)
    @Id
    public int getIdFunModNum() {
        return idFunModNum;
    }

    public void setIdFunModNum(int idFunModNum) {
        this.idFunModNum = idFunModNum;
    }

    @Column(name = "ID_FUN_SMOD_NUM", nullable = false, precision = 0)
    @Id
    public int getIdFunSmodNum() {
        return idFunSmodNum;
    }

    public void setIdFunSmodNum(int idFunSmodNum) {
        this.idFunSmodNum = idFunSmodNum;
    }

    @Column(name = "ID_ERROR_MSG", nullable = false, precision = 0)
    @Id
    public int getIdErrorMsg() {
        return idErrorMsg;
    }

    public void setIdErrorMsg(int idErrorMsg) {
        this.idErrorMsg = idErrorMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMerrBraPK that = (M4RtrMerrBraPK) o;
        return idFunModNum == that.idFunModNum &&
                idFunSmodNum == that.idFunSmodNum &&
                idErrorMsg == that.idErrorMsg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFunModNum, idFunSmodNum, idErrorMsg);
    }
}
