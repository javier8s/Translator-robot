package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.t3s.M4RchT3S;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunT3sRepository extends JpaRepository<M4RchT3S,Long> {
    List<M4RchT3S> findByIdT3(String T3s);
}
