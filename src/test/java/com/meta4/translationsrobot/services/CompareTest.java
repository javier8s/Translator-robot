package com.meta4.translationsrobot.services;

import com.meta4.translationsrobot.dto.NumericalResults;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CompareTest {
    Compare compare;
    HashMap<String, NumericalResults> languages;
    HashMap<String, NumericalResults> languagesError;
    @Before
    public void test(){
        compare=new Compare();
        languages=new HashMap<>();
        languages.put("USA",NumericalResults.WITHOUT_EXTRACTION);
        languages.put("FRA",NumericalResults.IS_WRONG);
        languages.put("BRA",NumericalResults.IS_OK);
        languages.put("GER",NumericalResults.NOT_VALIDATED_YET);
        languagesError=new HashMap<>();
        languagesError.put("UA",NumericalResults.WITHOUT_EXTRACTION);
        languagesError.put("FA",NumericalResults.WITHOUT_EXTRACTION);
        languagesError.put("BA",NumericalResults.WITHOUT_EXTRACTION);
        languagesError.put("EG",NumericalResults.WITHOUT_EXTRACTION);

    }


    @Test
    public void orderArrayExampleAllCases() {
        assertEquals(
                "No se ha hecho aún la extracción. (Tejado de Devops)",
                compare.orderArray(languages,false).get(0));
        assertEquals(
               "Falta un parche en el entorno de turno. (Error en la inyección y traspaso de parche de traducciones)",
               compare.orderArray(languages,false).get(1));
        assertEquals(
                "No está correctamente traducido aún. (Tejado de los traductores)",
                compare.orderArray(languages,false).get(2));
        assertEquals(
                "",
                compare.orderArray(languages,false).get(3));
    }

    @Test
    public void orderArrayWithSpanishError() {
        compare.orderArray(languages,false);
        assertEquals("",
                compare.orderArray(languages,true).get(1));
        assertEquals("No existe registro en la BBDD funcional.",
                compare.orderArray(languages,true).get(4));
    }

    @Test
    public void orderArrayWithWrongFields() {
        assertEquals(
                "",
                compare.orderArray(languagesError,false).get(3));
    }


}