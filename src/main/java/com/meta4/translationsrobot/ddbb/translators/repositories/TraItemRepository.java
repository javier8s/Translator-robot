package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraItemRepository extends JpaRepository<M4RtrMitems,Long>{
    List<M4RtrMitems> findByIdTiAndIdItem(String ti, String item);
    List<M4RtrMitems> findByIdTi(String ti);
}
