package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs1;
import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunErrorMessageEsp  extends JpaRepository<M4RsyErrorMsgs2,Long> {
    List<M4RsyErrorMsgs2> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);}