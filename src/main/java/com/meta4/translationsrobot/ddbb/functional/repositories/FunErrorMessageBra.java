package com.meta4.translationsrobot.ddbb.functional.repositories;


import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs5;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunErrorMessageBra  extends JpaRepository<M4RsyErrorMsgs5,Long> {
    List<M4RsyErrorMsgs5> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}