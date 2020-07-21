package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraItemRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TraItemServiceTest {
    @Mock
    private TraItemRepository repository;
    @InjectMocks
    private TraItemService traItemService;
    List<M4RtrMitems> m4RtrMitems;
    LinkedListObject linkedListObject;
    @Before
    public void test(){
        M4RtrMitems row=new M4RtrMitems();
        row.setIdTi("M4T_EMERGENCE_CONTACTS");
        row.setItemEsp("Formatea información");
        row.setItemBra(null);
        row.setItemUsa("Format Information");
        row.setItemFra("Formatage de l'information");
        row.setItemGer("Formata informação");
        row.setValidateBra(0);
        row.setValidateFra(2);
        row.setValidateUsa(2);
        row.setValidateGer(1);


        m4RtrMitems=new ArrayList<M4RtrMitems>(){{add(row);}};
        linkedListObject =new LinkedListObject("ITEM");
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        ArrayList<String> countries=new ArrayList<String>(){{add("FRA");add("ENG");add("BRA");add("GER");}};
        linkedListObject.getRoot().setLanguagesArray(countries);
        linkedListObject.getRoot().setShowed(true);
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        linkedListObject.getRoot().setFunctionalRowByKey("FRA","Formatage de l'information");
        linkedListObject.getRoot().setFunctionalRowByKey("ENG","Format Information");
        linkedListObject.getRoot().setFunctionalRowByKey("GER","Formata informação");
        linkedListObject.getRoot().setValueByKey("BRA",NumericalResults.WITHOUT_EXTRACTION);
    }
    @Test
    public void findingIsOK() {
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.IS_OK,linkedListObject.getRoot().getValueByKey("FRA"));
      }
    @Test
    public void findingWithoutExtraction(){
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("BRA"));
    }
    @Test
    public void findingNotValidatedYet(){
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.NOT_VALIDATED_YET,linkedListObject.getRoot().getValueByKey("GER"));
    }
    @Test
    public void testingListWithNullInRows(){
        m4RtrMitems=new ArrayList<M4RtrMitems>(){{add(null);}};
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("ENG"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("FRA"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("GER"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("BRA"));
        assertEquals(true,linkedListObject.getRoot().isShowed());
        assertEquals(false,linkedListObject.getRoot().isSpanishError());
    }
    @Test
    public void testingListWithoutRows(){
        m4RtrMitems=new ArrayList<M4RtrMitems>();
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("ENG"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("FRA"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("GER"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("BRA"));
        assertEquals(true,linkedListObject.getRoot().isShowed());
        assertEquals(false,linkedListObject.getRoot().isSpanishError());
    }
    @Test
    public void getRowFoundWrongLiteral(){
        m4RtrMitems.get(0).setItemGer("Formata ");
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(m4RtrMitems);
        traItemService.getRow(linkedListObject);
        assertEquals(NumericalResults.IS_WRONG,linkedListObject.getRoot().getValueByKey("GER"));
    }
}