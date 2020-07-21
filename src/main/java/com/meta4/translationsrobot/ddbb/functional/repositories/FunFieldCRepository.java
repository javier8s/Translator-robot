package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.fields.M4RdcFields;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunFieldCRepository extends JpaRepository<M4RdcFields,Long> {
    List<M4RdcFields> findByIdObjectAndIdField(String idObject, String idField);
}
