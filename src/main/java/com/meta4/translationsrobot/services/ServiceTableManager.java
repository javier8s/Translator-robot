package com.meta4.translationsrobot.services;

import com.meta4.translationsrobot.ddbb.functional.services.*;
import com.meta4.translationsrobot.ddbb.translators.services.*;
import com.meta4.translationsrobot.dto.LinkedListObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Service
public class ServiceTableManager {
    @Autowired
    private FunNodeService funNodeService;
    @Autowired
    private FunItemService funItemService;
    @Autowired
    private TraItemService traItemService;
    @Autowired
    private TraNodeService traNodeService;
    @Autowired
    private TraTblService traTblService;
    @Autowired
    private FunTisService funTisService;
    @Autowired
    private TraTisService traTisService;
    @Autowired
    private FunT3sService funT3sService;
    @Autowired
    private TraT3sService traT3sService;
    @Autowired
    private FunFieldCService funFieldCService;
    @Autowired
    private FunFieldDService funFieldDService;
    @Autowired
    private TraFieldsService traFieldsService;
    @Autowired
    private FunLogicObjectCService funLogicObjectCService;
    @Autowired
    private FunLogicObjectDService funLogicObjectDService;
    @Autowired
    private TraLogicObjectService traLogicObjectService;
    @Autowired
    private FunErrorMessageService funErrorMessageService;
    @Autowired
    private TraErrorMessageService traErrorMessageService;
    public ArrayList<String> getTableFun(String idClass) {
        if (idClass .equals( "ITEM")) {return new ArrayList<>(Arrays.asList("M4RCH_ITEMS_OWR"));}
        if (idClass .equals( "NODE STRUCTURE")) {return new ArrayList<>(Arrays.asList("M4RCH_TIS", "M4RCH_ITEMS_OWR"));}
        if (idClass .equals( "NODE")) {return new ArrayList<>(Arrays.asList("M4RCH_NODES"));}
        if (idClass .equals( "META4OBJECT")) {return new ArrayList<>(Arrays.asList("M4RCH_T3S", "M4RCH_NODES"));}
        if (idClass .equals( "WEB_LITERAL_SOC")) {return new ArrayList<>(Arrays.asList("M4RWS_LITERALS"));}
        if (idClass .equals( "FIELD")) {return new ArrayList<>(Arrays.asList("M4RDC_FIELDS", "M4RDD_FIELDS"));}
        if (idClass .equals( "LOGICAL TABLE")) {return new ArrayList<>(Arrays.asList("M4RDC_LOGIC_OBJECT", "M4RDD_LOGIC_OBJECT", "M4RDC_FIELDS", "M4RDD_FIELDS"));}
        if (idClass .equals( "ERROR MESSAGE")) {return new ArrayList<>(Arrays.asList("M4RSY_ERROR_MSGSX"));}
        if (idClass .equals( "MENU_OPTION")) {return new ArrayList<>(Arrays.asList("M4RMN_OPTIONS"));}
        if (idClass .equals( "SCENARIO")) {return new ArrayList<>(Arrays.asList("M4RDC_GROUP_OBJS", "M4RDC_GROUP_OBJS1", "M4RDC_GRP_OBJ_PATH"));}
        if (idClass .equals( "APP_BASIC_ROLE")) {return new ArrayList<>(Arrays.asList("M4RSC_APPROLE"));}
        if (idClass .equals( "APPLICATION_PARAMS")) {return new ArrayList<>(Arrays.asList("M4RAV_APPLICATION", "M4RAV_KEY", "M4RAV_KEY1", "M4RAV_SECTION"));}
        if (idClass .equals( "FUNCTIONAL_SECURITY GROUP") ){return new ArrayList<>(Arrays.asList("M4RSC_PAGE_GROUP"));}
        if (idClass .equals( "INTERFACE")) {return new ArrayList<>(Arrays.asList("M4RCH_GROUP_INTERFACE", "M4RCH_INTERFACES"));}
        if (idClass .equals( "INTERFACE_GROUP SOC")) {return new ArrayList<>(Arrays.asList("M4RCH_GROUP_INTERFACE"));}
        if (idClass .equals( "KEY_PARAMS")) {return new ArrayList<>(Arrays.asList("M4RAV_KEY M4RAV_KEY1"));}
        if (idClass .equals( "QUERY")) {return new ArrayList<>(Arrays.asList("M4RCH_T3S"));}
        if (idClass .equals( "RSM")) {return new ArrayList<>(Arrays.asList("M4RSC_RSM", "M4RSC_RSM1"));}
        if (idClass .equals( "TRANS_PROCESS_M4O_GROUP")) { new ArrayList<>(Arrays.asList("M4RSC_RSM M4RSC_RSM1"));}
        if (idClass .equals( "WEB FILE")) {return new ArrayList<>(Arrays.asList("M4RCH_GROUPS"));}
        if (idClass .equals( "WORKFLOW_PROCESS") ){return new ArrayList<>(Arrays.asList("M4RWS_LITERALS"));}
        if (idClass .equals( "WORKFLOW_PROCESS MOD")) {return new ArrayList<>(Arrays.asList("M4RWF_BPC_MOD", "M4RWF_DATADEF_MOD"));}
        if (idClass .equals( "REPORT")) {return new ArrayList<>(Arrays.asList("M4RRP_GR_HELP_DET", "M4RRP_GRAPH_HELP", "M4RRP_GRAPH_PROPS", "M4RRP_LONG_EXPRE2", "M4RRP_LONG_EXPRE3", "M4RRP_LONG_EXPRE1", "M4RRP_LONG_EXPRE4", "M4RRP_LONG_EXPRE5", "M4RRP_REPORT_SECTS", "M4RRP_REPORTS", "M4RRP_REPORTS1", "M4RRP_RPT_CT_PROPS", "M4RRP_RPT_SEC_PROP", "M4RRP_SEC_CON_PRO", "M4RRP_SECT_CON_F3", "M4RRP_SECT_CON_F4", "M4RRP_SECT_CON_FLD"));}
        return null;
    }
    public HashMap<String,ArrayList<String>> getTableTra(String tableFun) throws Exception{
        if(tableFun.equals("ERROR_MESSAGE"))
            return new HashMap<String ,ArrayList<String>>(){{put("ERROR_MESSAGEX"
                    ,new ArrayList<String>(){{add("ENG");add("FRA");add("GER");add("BRA");}});}};
            else
        return  traTblService.getTableTra(tableFun);
    }

    public void createService(String funtionalTable,LinkedListObject linkedListObject) {
       if(linkedListObject.getIdClass().equals("ITEM")){
            funItemService.getRow(linkedListObject);
            if(linkedListObject.getRoot().isShowed())
                traItemService.getRow(linkedListObject);
        }
       //------------------------------------------------
        else if(linkedListObject.getIdClass().equals("NODE")){
            funNodeService.getRow(linkedListObject);
            if(linkedListObject.getRoot().isShowed())
                traNodeService.getRow(linkedListObject);
        }
        //---------------------------------------------------
       else if(linkedListObject.getIdClass().equals("NODE STRUCTURE")){
            if(funtionalTable.equals("M4RCH_TIS")) {
                funTisService.getRow(linkedListObject);
                if(linkedListObject.getRoot().isShowed())
                    traTisService.getRow(linkedListObject);
            }
            if(funtionalTable.equals("M4RCH_ITEMS_OWR")) {
                linkedListObject.setIdClass("ITEM");
                funItemService.getAllRows(linkedListObject);
                if(linkedListObject.getRoot().isShowed())
                    traItemService.getAllRows(linkedListObject);
            }
        }
       //----------------------------------------------------
       else if(linkedListObject.getIdClass().equals("META4OBJECT")){
           if(funtionalTable.equals("M4RCH_T3S")) {
               funT3sService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traT3sService.getRow(linkedListObject);
           }
           if(funtionalTable.equals("M4RCH_NODES")) {
               linkedListObject.setIdClass("NODE");
               funNodeService.getAllRows(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traNodeService.getAllRows(linkedListObject);
           }
       }
        //--------------------------------------------------
       else if(linkedListObject.getIdClass().equals("FIELD")){
           if(funtionalTable.equals("M4RDC_FIELDS")) {
               funFieldCService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traFieldsService.getRow(linkedListObject);
           }
           if(funtionalTable.equals("M4RDD_FIELDS")) {
               funFieldDService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traFieldsService.getRow(linkedListObject);
           }
       }
       //-----------------------------------------------
       else if(linkedListObject.getIdClass().equals("LOGICAL TABLE")){
           if(funtionalTable.equals("M4RDC_LOGIC_OBJECT")) {
               funLogicObjectCService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traLogicObjectService.getRow(linkedListObject);
           }
           if(funtionalTable.equals("M4RDD_LOGIC_OBJECT")) {
               funLogicObjectDService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traLogicObjectService.getRow(linkedListObject);
           }
           //----------------------------------------
           if(funtionalTable.equals("M4RDC_FIELDS")) {
               linkedListObject.setIdClass("FIELD");
               funFieldCService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traFieldsService.getRow(linkedListObject);
           }
           //---------------------------------------
           if(funtionalTable.equals("M4RDD_FIELDS")) {
               linkedListObject.setIdClass("FIELD");
               funFieldDService.getRow(linkedListObject);
               if(linkedListObject.getRoot().isShowed())
                   traFieldsService.getRow(linkedListObject);
           }
       }
       //---------------------------------------------
        if(linkedListObject.getIdClass().equals("ERROR MESSAGE")) {
            funErrorMessageService.getRow(linkedListObject);
                if (linkedListObject.getRoot().isShowed())
                    traErrorMessageService.getRow(linkedListObject);
        }
    }
}
