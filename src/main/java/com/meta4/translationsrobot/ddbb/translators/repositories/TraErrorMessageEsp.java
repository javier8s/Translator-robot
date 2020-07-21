package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrBra;
import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrEsp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraErrorMessageEsp extends JpaRepository<M4RtrMerrEsp,Long> {
    List<M4RtrMerrEsp> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}