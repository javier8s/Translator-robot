package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.translators.entities.memoriaTBL.M4RtrAlstTbl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraTblRepository extends JpaRepository<M4RtrAlstTbl,Long> {
    List<M4RtrAlstTbl> findAllByTipo(String id_class);
    List<M4RtrAlstTbl> findAllByNTablaReal(String functionalTabla);
}
