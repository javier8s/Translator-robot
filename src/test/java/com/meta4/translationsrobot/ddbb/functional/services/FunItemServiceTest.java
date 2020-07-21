package com.meta4.translationsrobot.ddbb.functional.services;


import com.meta4.translationsrobot.ddbb.functional.entities.item.M4RchItemsOwr;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunItemRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
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
public class FunItemServiceTest {
    @Mock
    private FunItemRepository repository;
    @InjectMocks
    private FunItemService funItemService;
    List<M4RchItemsOwr> inPutList;
    LinkedListObject linkedListObject;
    M4RchItemsOwr rowWithNullInLanguage,rowWithEspEqualToItem,rowWithEspNull;
    @Before
    public void test(){
        rowWithNullInLanguage=new M4RchItemsOwr();
        rowWithNullInLanguage.setIdTi("M4T_EMERGENCE_CONTACTS");
        rowWithNullInLanguage.setIdItem("Testing NullInLanguage");
        rowWithNullInLanguage.setIdTransItemesp("Formatea información");
        rowWithNullInLanguage.setIdTransItembra(null);
        rowWithNullInLanguage.setIdTransItemeng("Format Information");
        rowWithNullInLanguage.setIdTransItemfra("Formatage de l'information");
        rowWithNullInLanguage.setIdTransItemger("Formata informação");

        rowWithEspEqualToItem=new M4RchItemsOwr();
        rowWithEspEqualToItem.setIdTi("M4T_EMERGENCE_CONTACTS");
        rowWithEspEqualToItem.setIdItem("Testing rowWithEspEqualToItem");
        rowWithEspEqualToItem.setIdTransItemesp("Testing rowWithEspEqualToItem");


        rowWithEspNull=new M4RchItemsOwr();
        rowWithEspNull.setIdTi("M4T_EMERGENCE_CONTACTS");
        rowWithEspNull.setIdItem("Testing EspNull");
        rowWithEspNull.setIdTransItemesp(null);


        linkedListObject =new LinkedListObject("ITEM");
        ArrayList<String> countries=new ArrayList<String>(){{add("FRA");add("ENG");add("BRA");add("GER");}};
        linkedListObject.getRoot().setLanguagesArray(countries);
    }
    @Test
    public void getRowWithNullInLanguage(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        inPutList =new ArrayList<M4RchItemsOwr>(){{add(rowWithNullInLanguage);}};
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(inPutList);
        funItemService.getRow(linkedListObject);
        assertEquals("Formatage de l'information",linkedListObject.getRoot().getFunctionalRows().get("FRA"));
        assertEquals(null,linkedListObject.getRoot().getFunctionalRows().get("BRA"));
        assertEquals(NumericalResults.WITHOUT_EXTRACTION,linkedListObject.getRoot().getValueByKey("BRA"));
    }
    @Test
    public void getRowWithEspNull(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        inPutList =new ArrayList<M4RchItemsOwr>(){{add(rowWithEspNull);}};
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(inPutList);
        funItemService.getRow(linkedListObject);
        assertEquals(true,linkedListObject.getRoot().isSpanishError());
        assertEquals(null,linkedListObject.getRoot().getFunctionalRows().get("BRA"));
        assertEquals(null,linkedListObject.getRoot().getValueByKey("BRA"));
    }
    @Test
    public void getAllRowsWithMultipleCases(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS");
        inPutList =new ArrayList<M4RchItemsOwr>(){{
            add(rowWithEspNull);
            add(rowWithEspEqualToItem);
            add(rowWithNullInLanguage);}};
        Mockito.when(repository.findByIdTi("M4T_EMERGENCE_CONTACTS")).thenReturn(inPutList);

        funItemService.getAllRows(linkedListObject);

        ObjectDTO aux=linkedListObject.getRoot();
        int i=0;
        do{
            if(aux.isShowed()) i++;
            if("M4T_EMERGENCE_CONTACTS.Testing EspNull".equals(aux.getIdObject())){
                assertEquals(true,aux.isShowed());
                assertEquals(true,aux.isSpanishError());
                assertEquals(null,aux.getFunctionalRows().get("BRA"));
                assertEquals(null,aux.getValueByKey("BRA"));
            }
            else if("M4T_EMERGENCE_CONTACTS.Testing rowWithEspEqualToItem".equals(aux.getIdObject())){
                assertEquals(false,aux.isShowed());
            }
            else if("M4T_EMERGENCE_CONTACTS.Testing NullInLanguage".equals(aux.getIdObject())){
                assertEquals(true,aux.isShowed());
                assertEquals(NumericalResults.WITHOUT_EXTRACTION,aux.getValueByKey("BRA"));
                assertEquals(null,aux.getFunctionalRowByKey("BRA"));
            }
            aux=aux.getNext();
        }while(aux!=null);
        assertEquals(2,i);
    }

    @Test
    public void getSpanishErrorByNullInRows(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        inPutList =new ArrayList<M4RchItemsOwr>(){{add(null);}};
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(inPutList);
        funItemService.getRow(linkedListObject);
        assertEquals(true,linkedListObject.getRoot().isSpanishError());
    }
    @Test
    public void getSpanishErrorByNullInList(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        inPutList =new ArrayList<M4RchItemsOwr>();
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(inPutList);
        funItemService.getRow(linkedListObject);
        assertEquals(true,linkedListObject.getRoot().isSpanishError());
    }
    @Test
    public void getSpanishErrorByNullInReturn(){
        linkedListObject.getRoot().setIdObject("M4T_EMERGENCE_CONTACTS.PSCO_FORMAT_INFORMATION");
        inPutList =null;
        Mockito.when(repository.findByIdTiAndIdItem("M4T_EMERGENCE_CONTACTS","PSCO_FORMAT_INFORMATION")).thenReturn(inPutList);
        funItemService.getRow(linkedListObject);
        assertEquals(true,linkedListObject.getRoot().isSpanishError());
    }

}