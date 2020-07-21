package com.meta4.translationsrobot.ddbb.functional.repositories;


import com.meta4.translationsrobot.ddbb.functional.entities.item.M4RchItemsOwr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FunItemRepository extends JpaRepository<M4RchItemsOwr,Long> {
     List<M4RchItemsOwr> findByIdTiAndIdItem(String ti, String item);
     List<M4RchItemsOwr> findByIdTi(String ti);
}
