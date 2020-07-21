package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.node.M4RtrMnodos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraNodeRepository extends JpaRepository<M4RtrMnodos,Long> {
    List<M4RtrMnodos> findByIdT3AndIdNode(String idT3,String idNode);
    List<M4RtrMnodos> findByIdT3(String idt3);
}
