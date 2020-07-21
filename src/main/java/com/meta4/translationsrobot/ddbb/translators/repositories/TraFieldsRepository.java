package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.fields.M4RtrMfieldsRdc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraFieldsRepository extends JpaRepository<M4RtrMfieldsRdc,Long> {

    List<M4RtrMfieldsRdc> findByIdObjectAndIdField(String idObject,String idField);
}
