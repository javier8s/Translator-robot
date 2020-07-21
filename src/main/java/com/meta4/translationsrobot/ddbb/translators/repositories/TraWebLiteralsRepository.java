package com.meta4.translationsrobot.ddbb.translators.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.webLiteral.M4RwsLiterals;
import com.meta4.translationsrobot.ddbb.translators.entities.webLiterals.M4RtrMliterals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface TraWebLiteralsRepository extends JpaRepository<M4RtrMliterals,Long> {
    List<M4RtrMliterals> findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(
            BigInteger idType, String pathInfo, String baseName, String idLiteral, String idOrganization
    );
}
