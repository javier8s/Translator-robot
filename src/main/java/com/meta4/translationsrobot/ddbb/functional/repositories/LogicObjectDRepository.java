package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.logicObject.M4RddLogicObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogicObjectDRepository extends JpaRepository<M4RddLogicObject,Long> {
    List<M4RddLogicObject> findByIdObject(String idObject);
}
