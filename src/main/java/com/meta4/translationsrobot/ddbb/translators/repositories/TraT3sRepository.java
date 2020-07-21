package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.t3s.M4RtrMm4Object;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraT3sRepository extends JpaRepository<M4RtrMm4Object,Long> {
   List<M4RtrMm4Object> findByIdT3(String t3);
    @Override
    List<M4RtrMm4Object> findAll();
}
