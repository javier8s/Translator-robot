package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.errorMessage.M4RtrMerrBra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraErrorMessageBra extends JpaRepository<M4RtrMerrBra,Long> {
    List<M4RtrMerrBra> findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(int idFunMod, int idFunSmod, int idError);
}
