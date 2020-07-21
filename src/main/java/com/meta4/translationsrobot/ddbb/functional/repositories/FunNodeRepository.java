package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.node.M4RchNodes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunNodeRepository extends JpaRepository<M4RchNodes,Long> {
    List<M4RchNodes> findByIdT3AndIdNode(String t3, String node);
    List<M4RchNodes> findByIdT3(String t3);
}
