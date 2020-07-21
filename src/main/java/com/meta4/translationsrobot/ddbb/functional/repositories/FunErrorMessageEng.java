package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunErrorMessageEng extends JpaRepository<M4RsyErrorMsgs1,Long> {
    List<M4RsyErrorMsgs1> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod,int idFunSmod,int idError);
}
