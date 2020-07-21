package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.tis.M4RtrMtis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraTisRepository extends JpaRepository<M4RtrMtis,Long> {
    List<M4RtrMtis> findByIdTi(String idTi);
}
