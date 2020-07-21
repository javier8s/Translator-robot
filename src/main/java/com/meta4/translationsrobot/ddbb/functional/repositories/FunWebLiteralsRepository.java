package com.meta4.translationsrobot.ddbb.functional.repositories;

import com.meta4.translationsrobot.ddbb.functional.entities.webLiteral.M4RwsLiterals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface FunWebLiteralsRepository extends JpaRepository<M4RwsLiterals,Long> {
    List<M4RwsLiterals> findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(
            BigInteger idType, String pathInfo, String baseName, String idLiteral, String idOrganization
    );
}
