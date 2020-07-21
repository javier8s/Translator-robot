package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrBra;
import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrEng;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraErrorMessageEng extends JpaRepository<M4RtrMerrEng,Long> {
    List<M4RtrMerrEng> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}