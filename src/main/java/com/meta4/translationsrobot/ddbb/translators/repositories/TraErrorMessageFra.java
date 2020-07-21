package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrBra;
import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrFra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraErrorMessageFra extends JpaRepository<M4RtrMerrFra,Long> {
    List<M4RtrMerrFra> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}
