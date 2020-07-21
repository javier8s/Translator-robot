package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.memoriaTBL.M4RtrAlstTbl;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraTblRepository;
import com.meta4.translationsrobot.ddbb.translators.services.TraTblService;
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
public class TraTblServiceTest {
    @Mock
    private TraTblRepository repository;
    @InjectMocks
    private TraTblService traTblService;
    List<M4RtrAlstTbl> m4RtrAlstTbls;
    @Before
    public void test(){
        M4RtrAlstTbl row=new M4RtrAlstTbl();
        row.setNombre("M4RTR_MITEMS");
        row.setPais("BRA");
        row.setPais("FRA");
                row.setPais("GER");
                        row.setPais("ENG");
        m4RtrAlstTbls =new ArrayList<M4RtrAlstTbl>(){{add(row);}};
    }
    @Test
    public void getTableTraWithItemAsInput()  throws Exception {
        Mockito.when(repository.findAllByNTablaReal("M4RCH_ITEMS_OWR")).thenReturn(m4RtrAlstTbls);
        assertEquals(true,traTblService.getTableTra("M4RCH_ITEMS_OWR").containsKey("M4RTR_MITEMS"));
    }
    @Test
    public void getTableTraNullRow()  throws Exception {
        m4RtrAlstTbls =new ArrayList<M4RtrAlstTbl>(){{add(null);}};
        Mockito.when(repository.findAllByNTablaReal("M4RCH_ITEMS_OWR")).thenReturn(m4RtrAlstTbls);
        assertEquals(null,traTblService.getTableTra("M4RCH_ITEMS_OWR"));
    }

    @Test
    public void getTableTraNullList() throws Exception{
        m4RtrAlstTbls =new ArrayList<M4RtrAlstTbl>(){{add(null);}};
        Mockito.when(repository.findAllByNTablaReal("M4RCH_ITEMS_OWR")).thenReturn(m4RtrAlstTbls);
        try {
            traTblService.getTableTra("M4RCH_ITEMS_OWR");
            assertEquals(true,false);
        } catch (NullPointerException e)
        {
            assertEquals(true,true);
        }
    }

}