package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs1;
import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs4;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunErrorMessageGer  extends JpaRepository<M4RsyErrorMsgs4,Long> {
    List<M4RsyErrorMsgs4> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);}