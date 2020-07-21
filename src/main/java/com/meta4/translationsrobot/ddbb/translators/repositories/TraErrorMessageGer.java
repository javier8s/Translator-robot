package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrBra;
import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrGer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraErrorMessageGer extends JpaRepository<M4RtrMerrGer,Long> {
    List<M4RtrMerrGer> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}