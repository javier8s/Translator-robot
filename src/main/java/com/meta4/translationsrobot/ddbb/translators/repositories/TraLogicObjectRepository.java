package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.logicalObject.M4RtrMobjsRdc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraLogicObjectRepository extends JpaRepository<M4RtrMobjsRdc,Long> {
    List<M4RtrMobjsRdc> findByIdObject(String idObject);
}
