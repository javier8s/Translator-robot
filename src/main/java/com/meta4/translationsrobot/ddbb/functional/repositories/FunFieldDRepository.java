package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.fields.M4RdcFields;
import com.meta4.translationsrobot.ddbb.functional.entities.fields.M4RddFields;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunFieldDRepository extends JpaRepository<M4RddFields,Long> {
    List<M4RddFields> findByIdObjectAndIdField(String idObject,String idField);
}
