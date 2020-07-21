package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs1;
import com.meta4.translationsrobot.ddbb.functional.entities.errorMessages.M4RsyErrorMsgs3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunErrorMessageFra  extends JpaRepository<M4RsyErrorMsgs3,Long> {
    List<M4RsyErrorMsgs3> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);}