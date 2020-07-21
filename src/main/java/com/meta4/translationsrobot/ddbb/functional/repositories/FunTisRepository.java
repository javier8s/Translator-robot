package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.tis.M4RchTis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunTisRepository extends JpaRepository<M4RchTis,Long> {
    List<M4RchTis> findByIdTi(String idTi);
}
