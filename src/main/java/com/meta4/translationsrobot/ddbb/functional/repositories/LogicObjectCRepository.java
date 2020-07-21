package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.logicObject.M4RdcLogicObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogicObjectCRepository extends JpaRepository<M4RdcLogicObject,Long> {
    List<M4RdcLogicObject> findByIdObject(String idObject);
}
