package com.meta4.translationsrobot.ddbb.functional.entities.node;

import com.meta4.translationsrobot.ddbb.functional.entities.tis.M4RchTis;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RCH_NODES", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RchNodesPK.class)
public class M4RchNodes {
    private String idT3;
    private String idTi;
    private String idNode;
    private Integer idCapacityType;
    private Integer posNodo;
    private BigInteger isRoot;
    private BigInteger autoload;
    private BigInteger uniqueRow;
    private Integer numRows;
    private BigInteger isPlug;
    private String startDtItem;
    private String endDtItem;
    private String idDmd;
    private String nNodebra;
    private String nNodeeng;
    private String nNodeesp;
    private String nNodefra;
    private String nNodegen;
    private String nNodeger;
    private String nNodeita;
    private BigInteger isVisible;
    private String idTransNodeeng;
    private String idTransNodeesp;
    private String idTransNodefra;
    private String idTransNodegen;
    private String idTransNodeger;
    private String idTransNodeita;
    private String startCorrDtItem;
    private String endCorrDtItem;
    private String virtualFlagItem;
    private Integer nodesType;
    private BigInteger dynFilter;
    private BigInteger isExternal;
    private Integer numKeepRows;
    private Integer idAutoFilter;
    private Integer idSyncType;
    private BigInteger isOrdered;
    private String idGroupObjects;
    private BigInteger affectsDb;
    private Integer maxNumBlocks;
    private BigInteger isFree;
    private Integer maxNumRecords;
    private BigInteger dbReload;
    private String idRsm;
    private Integer oleDispId;
    private String oleNodeInterId;
    private String idDmdField;
    private Integer numRowsDb;
    private String idTransNodebra;
    private BigInteger idCstype;
    private BigInteger isDefault;
    private String idDmdGroup;
    private String idApprole;
    private String idSecuser;
    private Timestamp dtLastUpdate;

    @Id
    @Column(name = "ID_T3", nullable = false, length = 30)
    public String getIdT3() {
        return idT3;
    }

    public void setIdT3(String idT3) {
        this.idT3 = idT3;
    }

    @Basic
    @Column(name = "ID_TI", nullable = true, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Id
    @Column(name = "ID_NODE", nullable = false, length = 30)
    public String getIdNode() {
        return idNode;
    }

    public void setIdNode(String idNode) {
        this.idNode = idNode;
    }

    @Basic
    @Column(name = "ID_CAPACITY_TYPE", nullable = true, precision = 0)
    public Integer getIdCapacityType() {
        return idCapacityType;
    }

    public void setIdCapacityType(Integer idCapacityType) {
        this.idCapacityType = idCapacityType;
    }

    @Basic
    @Column(name = "POS_NODO", nullable = true, precision = 0)
    public Integer getPosNodo() {
        return posNodo;
    }

    public void setPosNodo(Integer posNodo) {
        this.posNodo = posNodo;
    }

    @Basic
    @Column(name = "IS_ROOT", nullable = true, precision = 0)
    public BigInteger getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(BigInteger isRoot) {
        this.isRoot = isRoot;
    }

    @Basic
    @Column(name = "AUTOLOAD", nullable = true, precision = 0)
    public BigInteger getAutoload() {
        return autoload;
    }

    public void setAutoload(BigInteger autoload) {
        this.autoload = autoload;
    }

    @Basic
    @Column(name = "UNIQUE_ROW", nullable = true, precision = 0)
    public BigInteger getUniqueRow() {
        return uniqueRow;
    }

    public void setUniqueRow(BigInteger uniqueRow) {
        this.uniqueRow = uniqueRow;
    }

    @Basic
    @Column(name = "NUM_ROWS", nullable = true, precision = 0)
    public Integer getNumRows() {
        return numRows;
    }

    public void setNumRows(Integer numRows) {
        this.numRows = numRows;
    }

    @Basic
    @Column(name = "IS_PLUG", nullable = true, precision = 0)
    public BigInteger getIsPlug() {
        return isPlug;
    }

    public void setIsPlug(BigInteger isPlug) {
        this.isPlug = isPlug;
    }

    @Basic
    @Column(name = "START_DT_ITEM", nullable = true, length = 30)
    public String getStartDtItem() {
        return startDtItem;
    }

    public void setStartDtItem(String startDtItem) {
        this.startDtItem = startDtItem;
    }

    @Basic
    @Column(name = "END_DT_ITEM", nullable = true, length = 30)
    public String getEndDtItem() {
        return endDtItem;
    }

    public void setEndDtItem(String endDtItem) {
        this.endDtItem = endDtItem;
    }

    @Basic
    @Column(name = "ID_DMD", nullable = true, length = 30)
    public String getIdDmd() {
        return idDmd;
    }

    public void setIdDmd(String idDmd) {
        this.idDmd = idDmd;
    }

    @Basic
    @Column(name = "N_NODEBRA", nullable = true, length = 50)
    public String getnNodebra() {
        return nNodebra;
    }

    public void setnNodebra(String nNodebra) {
        this.nNodebra = nNodebra;
    }

    @Basic
    @Column(name = "N_NODEENG", nullable = true, length = 50)
    public String getnNodeeng() {
        return nNodeeng;
    }

    public void setnNodeeng(String nNodeeng) {
        this.nNodeeng = nNodeeng;
    }

    @Basic
    @Column(name = "N_NODEESP", nullable = true, length = 50)
    public String getnNodeesp() {
        return nNodeesp;
    }

    public void setnNodeesp(String nNodeesp) {
        this.nNodeesp = nNodeesp;
    }

    @Basic
    @Column(name = "N_NODEFRA", nullable = true, length = 50)
    public String getnNodefra() {
        return nNodefra;
    }

    public void setnNodefra(String nNodefra) {
        this.nNodefra = nNodefra;
    }

    @Basic
    @Column(name = "N_NODEGEN", nullable = true, length = 50)
    public String getnNodegen() {
        return nNodegen;
    }

    public void setnNodegen(String nNodegen) {
        this.nNodegen = nNodegen;
    }

    @Basic
    @Column(name = "N_NODEGER", nullable = true, length = 50)
    public String getnNodeger() {
        return nNodeger;
    }

    public void setnNodeger(String nNodeger) {
        this.nNodeger = nNodeger;
    }

    @Basic
    @Column(name = "N_NODEITA", nullable = true, length = 50)
    public String getnNodeita() {
        return nNodeita;
    }

    public void setnNodeita(String nNodeita) {
        this.nNodeita = nNodeita;
    }

    @Basic
    @Column(name = "IS_VISIBLE", nullable = true, precision = 0)
    public BigInteger getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(BigInteger isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEENG", nullable = true, length = 30)
    public String getIdTransNodeeng() {
        return idTransNodeeng;
    }

    public void setIdTransNodeeng(String idTransNodeeng) {
        this.idTransNodeeng = idTransNodeeng;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEESP", nullable = true, length = 30)
    public String getIdTransNodeesp() {
        return idTransNodeesp;
    }

    public void setIdTransNodeesp(String idTransNodeesp) {
        this.idTransNodeesp = idTransNodeesp;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEFRA", nullable = true, length = 30)
    public String getIdTransNodefra() {
        return idTransNodefra;
    }

    public void setIdTransNodefra(String idTransNodefra) {
        this.idTransNodefra = idTransNodefra;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEGEN", nullable = true, length = 30)
    public String getIdTransNodegen() {
        return idTransNodegen;
    }

    public void setIdTransNodegen(String idTransNodegen) {
        this.idTransNodegen = idTransNodegen;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEGER", nullable = true, length = 30)
    public String getIdTransNodeger() {
        return idTransNodeger;
    }

    public void setIdTransNodeger(String idTransNodeger) {
        this.idTransNodeger = idTransNodeger;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEITA", nullable = true, length = 30)
    public String getIdTransNodeita() {
        return idTransNodeita;
    }

    public void setIdTransNodeita(String idTransNodeita) {
        this.idTransNodeita = idTransNodeita;
    }

    @Basic
    @Column(name = "START_CORR_DT_ITEM", nullable = true, length = 30)
    public String getStartCorrDtItem() {
        return startCorrDtItem;
    }

    public void setStartCorrDtItem(String startCorrDtItem) {
        this.startCorrDtItem = startCorrDtItem;
    }

    @Basic
    @Column(name = "END_CORR_DT_ITEM", nullable = true, length = 30)
    public String getEndCorrDtItem() {
        return endCorrDtItem;
    }

    public void setEndCorrDtItem(String endCorrDtItem) {
        this.endCorrDtItem = endCorrDtItem;
    }

    @Basic
    @Column(name = "VIRTUAL_FLAG_ITEM", nullable = true, length = 30)
    public String getVirtualFlagItem() {
        return virtualFlagItem;
    }

    public void setVirtualFlagItem(String virtualFlagItem) {
        this.virtualFlagItem = virtualFlagItem;
    }

    @Basic
    @Column(name = "NODES_TYPE", nullable = true, precision = 0)
    public Integer getNodesType() {
        return nodesType;
    }

    public void setNodesType(Integer nodesType) {
        this.nodesType = nodesType;
    }

    @Basic
    @Column(name = "DYN_FILTER", nullable = true, precision = 0)
    public BigInteger getDynFilter() {
        return dynFilter;
    }

    public void setDynFilter(BigInteger dynFilter) {
        this.dynFilter = dynFilter;
    }

    @Basic
    @Column(name = "IS_EXTERNAL", nullable = true, precision = 0)
    public BigInteger getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(BigInteger isExternal) {
        this.isExternal = isExternal;
    }

    @Basic
    @Column(name = "NUM_KEEP_ROWS", nullable = true, precision = 0)
    public Integer getNumKeepRows() {
        return numKeepRows;
    }

    public void setNumKeepRows(Integer numKeepRows) {
        this.numKeepRows = numKeepRows;
    }

    @Basic
    @Column(name = "ID_AUTO_FILTER", nullable = true, precision = 0)
    public Integer getIdAutoFilter() {
        return idAutoFilter;
    }

    public void setIdAutoFilter(Integer idAutoFilter) {
        this.idAutoFilter = idAutoFilter;
    }

    @Basic
    @Column(name = "ID_SYNC_TYPE", nullable = true, precision = 0)
    public Integer getIdSyncType() {
        return idSyncType;
    }

    public void setIdSyncType(Integer idSyncType) {
        this.idSyncType = idSyncType;
    }

    @Basic
    @Column(name = "IS_ORDERED", nullable = true, precision = 0)
    public BigInteger getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(BigInteger isOrdered) {
        this.isOrdered = isOrdered;
    }

    @Basic
    @Column(name = "ID_GROUP_OBJECTS", nullable = true, length = 30)
    public String getIdGroupObjects() {
        return idGroupObjects;
    }

    public void setIdGroupObjects(String idGroupObjects) {
        this.idGroupObjects = idGroupObjects;
    }

    @Basic
    @Column(name = "AFFECTS_DB", nullable = true, precision = 0)
    public BigInteger getAffectsDb() {
        return affectsDb;
    }

    public void setAffectsDb(BigInteger affectsDb) {
        this.affectsDb = affectsDb;
    }

    @Basic
    @Column(name = "MAX_NUM_BLOCKS", nullable = true, precision = 0)
    public Integer getMaxNumBlocks() {
        return maxNumBlocks;
    }

    public void setMaxNumBlocks(Integer maxNumBlocks) {
        this.maxNumBlocks = maxNumBlocks;
    }

    @Basic
    @Column(name = "IS_FREE", nullable = true, precision = 0)
    public BigInteger getIsFree() {
        return isFree;
    }

    public void setIsFree(BigInteger isFree) {
        this.isFree = isFree;
    }

    @Basic
    @Column(name = "MAX_NUM_RECORDS", nullable = true, precision = 0)
    public Integer getMaxNumRecords() {
        return maxNumRecords;
    }

    public void setMaxNumRecords(Integer maxNumRecords) {
        this.maxNumRecords = maxNumRecords;
    }

    @Basic
    @Column(name = "DB_RELOAD", nullable = true, precision = 0)
    public BigInteger getDbReload() {
        return dbReload;
    }

    public void setDbReload(BigInteger dbReload) {
        this.dbReload = dbReload;
    }

    @Basic
    @Column(name = "ID_RSM", nullable = true, length = 30)
    public String getIdRsm() {
        return idRsm;
    }

    public void setIdRsm(String idRsm) {
        this.idRsm = idRsm;
    }

    @Basic
    @Column(name = "OLE_DISP_ID", nullable = true, precision = 0)
    public Integer getOleDispId() {
        return oleDispId;
    }

    public void setOleDispId(Integer oleDispId) {
        this.oleDispId = oleDispId;
    }

    @Basic
    @Column(name = "OLE_NODE_INTER_ID", nullable = true, length = 40)
    public String getOleNodeInterId() {
        return oleNodeInterId;
    }

    public void setOleNodeInterId(String oleNodeInterId) {
        this.oleNodeInterId = oleNodeInterId;
    }

    @Basic
    @Column(name = "ID_DMD_FIELD", nullable = true, length = 30)
    public String getIdDmdField() {
        return idDmdField;
    }

    public void setIdDmdField(String idDmdField) {
        this.idDmdField = idDmdField;
    }

    @Basic
    @Column(name = "NUM_ROWS_DB", nullable = true, precision = 0)
    public Integer getNumRowsDb() {
        return numRowsDb;
    }

    public void setNumRowsDb(Integer numRowsDb) {
        this.numRowsDb = numRowsDb;
    }

    @Basic
    @Column(name = "ID_TRANS_NODEBRA", nullable = true, length = 30)
    public String getIdTransNodebra() {
        return idTransNodebra;
    }

    public void setIdTransNodebra(String idTransNodebra) {
        this.idTransNodebra = idTransNodebra;
    }

    @Basic
    @Column(name = "ID_CSTYPE", nullable = true, precision = 0)
    public BigInteger getIdCstype() {
        return idCstype;
    }

    public void setIdCstype(BigInteger idCstype) {
        this.idCstype = idCstype;
    }

    @Basic
    @Column(name = "IS_DEFAULT", nullable = true, precision = 0)
    public BigInteger getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(BigInteger isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "ID_DMD_GROUP", nullable = true, length = 30)
    public String getIdDmdGroup() {
        return idDmdGroup;
    }

    public void setIdDmdGroup(String idDmdGroup) {
        this.idDmdGroup = idDmdGroup;
    }

    @Basic
    @Column(name = "ID_APPROLE", nullable = true, length = 30)
    public String getIdApprole() {
        return idApprole;
    }

    public void setIdApprole(String idApprole) {
        this.idApprole = idApprole;
    }

    @Basic
    @Column(name = "ID_SECUSER", nullable = true, length = 30)
    public String getIdSecuser() {
        return idSecuser;
    }

    public void setIdSecuser(String idSecuser) {
        this.idSecuser = idSecuser;
    }

    @Basic
    @Column(name = "DT_LAST_UPDATE", nullable = true)
    public Timestamp getDtLastUpdate() {
        return dtLastUpdate;
    }

    public void setDtLastUpdate(Timestamp dtLastUpdate) {
        this.dtLastUpdate = dtLastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RchNodes that = (M4RchNodes) o;
        return Objects.equals(idT3, that.idT3) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(idNode, that.idNode) &&
                Objects.equals(idCapacityType, that.idCapacityType) &&
                Objects.equals(posNodo, that.posNodo) &&
                Objects.equals(isRoot, that.isRoot) &&
                Objects.equals(autoload, that.autoload) &&
                Objects.equals(uniqueRow, that.uniqueRow) &&
                Objects.equals(numRows, that.numRows) &&
                Objects.equals(isPlug, that.isPlug) &&
                Objects.equals(startDtItem, that.startDtItem) &&
                Objects.equals(endDtItem, that.endDtItem) &&
                Objects.equals(idDmd, that.idDmd) &&
                Objects.equals(nNodebra, that.nNodebra) &&
                Objects.equals(nNodeeng, that.nNodeeng) &&
                Objects.equals(nNodeesp, that.nNodeesp) &&
                Objects.equals(nNodefra, that.nNodefra) &&
                Objects.equals(nNodegen, that.nNodegen) &&
                Objects.equals(nNodeger, that.nNodeger) &&
                Objects.equals(nNodeita, that.nNodeita) &&
                Objects.equals(isVisible, that.isVisible) &&
                Objects.equals(idTransNodeeng, that.idTransNodeeng) &&
                Objects.equals(idTransNodeesp, that.idTransNodeesp) &&
                Objects.equals(idTransNodefra, that.idTransNodefra) &&
                Objects.equals(idTransNodegen, that.idTransNodegen) &&
                Objects.equals(idTransNodeger, that.idTransNodeger) &&
                Objects.equals(idTransNodeita, that.idTransNodeita) &&
                Objects.equals(startCorrDtItem, that.startCorrDtItem) &&
                Objects.equals(endCorrDtItem, that.endCorrDtItem) &&
                Objects.equals(virtualFlagItem, that.virtualFlagItem) &&
                Objects.equals(nodesType, that.nodesType) &&
                Objects.equals(dynFilter, that.dynFilter) &&
                Objects.equals(isExternal, that.isExternal) &&
                Objects.equals(numKeepRows, that.numKeepRows) &&
                Objects.equals(idAutoFilter, that.idAutoFilter) &&
                Objects.equals(idSyncType, that.idSyncType) &&
                Objects.equals(isOrdered, that.isOrdered) &&
                Objects.equals(idGroupObjects, that.idGroupObjects) &&
                Objects.equals(affectsDb, that.affectsDb) &&
                Objects.equals(maxNumBlocks, that.maxNumBlocks) &&
                Objects.equals(isFree, that.isFree) &&
                Objects.equals(maxNumRecords, that.maxNumRecords) &&
                Objects.equals(dbReload, that.dbReload) &&
                Objects.equals(idRsm, that.idRsm) &&
                Objects.equals(oleDispId, that.oleDispId) &&
                Objects.equals(oleNodeInterId, that.oleNodeInterId) &&
                Objects.equals(idDmdField, that.idDmdField) &&
                Objects.equals(numRowsDb, that.numRowsDb) &&
                Objects.equals(idTransNodebra, that.idTransNodebra) &&
                Objects.equals(idCstype, that.idCstype) &&
                Objects.equals(isDefault, that.isDefault) &&
                Objects.equals(idDmdGroup, that.idDmdGroup) &&
                Objects.equals(idApprole, that.idApprole) &&
                Objects.equals(idSecuser, that.idSecuser) &&
                Objects.equals(dtLastUpdate, that.dtLastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idT3, idTi, idNode, idCapacityType, posNodo, isRoot, autoload, uniqueRow, numRows, isPlug, startDtItem, endDtItem, idDmd, nNodebra, nNodeeng, nNodeesp, nNodefra, nNodegen, nNodeger, nNodeita, isVisible, idTransNodeeng, idTransNodeesp, idTransNodefra, idTransNodegen, idTransNodeger, idTransNodeita, startCorrDtItem, endCorrDtItem, virtualFlagItem, nodesType, dynFilter, isExternal, numKeepRows, idAutoFilter, idSyncType, isOrdered, idGroupObjects, affectsDb, maxNumBlocks, isFree, maxNumRecords, dbReload, idRsm, oleDispId, oleNodeInterId, idDmdField, numRowsDb, idTransNodebra, idCstype, isDefault, idDmdGroup, idApprole, idSecuser, dtLastUpdate);
    }
}
