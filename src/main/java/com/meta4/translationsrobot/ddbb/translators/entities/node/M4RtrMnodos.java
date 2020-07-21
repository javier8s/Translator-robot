package com.meta4.translationsrobot.ddbb.translators.entities.node;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MNODOS", schema = "dbo", catalog = "TRANSHRMS60")
@IdClass(M4RtrMnodosPK.class)
public class M4RtrMnodos {
    private String idT3;
    private String idNode;
    private String idTi;
    private String idObject;
    private Timestamp insDate;
    private String module;
    private String ownerFlag;
    private String nodeEsp;
    private Integer validateEsp;
    private String translatorEsp;
    private String prevTransEsp;
    private String commentEsp;
    private Timestamp modDateEsp;
    private String nodeUsa;
    private Integer validateUsa;
    private String translatorUsa;
    private String prevTransUsa;
    private String commentUsa;
    private Timestamp modDateUsa;
    private String nodeFra;
    private Integer validateFra;
    private String translatorFra;
    private String prevTransFra;
    private String commentFra;
    private Timestamp modDateFra;
    private String nodeGer;
    private Integer validateGer;
    private String translatorGer;
    private String prevTransGer;
    private String commentGer;
    private Timestamp modDateGer;
    private String nodeIta;
    private Integer validateIta;
    private String translatorIta;
    private String prevTransIta;
    private String commentIta;
    private Timestamp modDateIta;
    private String nodeBra;
    private Integer validateBra;
    private String translatorBra;
    private String prevTransBra;
    private String commentBra;
    private Timestamp modDateBra;
    private String nodeGen;
    private Integer validateGen;
    private String translatorGen;
    private String prevTransGen;
    private String commentGen;
    private Timestamp modDateGen;
    private BigInteger englishOnly;

    @Id
    @Column(name = "ID_T3", nullable = false, length = 30)
    public String getIdT3() {
        return idT3;
    }

    public void setIdT3(String idT3) {
        this.idT3 = idT3;
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
    @Column(name = "ID_TI", nullable = true, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Basic
    @Column(name = "ID_OBJECT", nullable = true, length = 50)
    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    @Basic
    @Column(name = "INS_DATE", nullable = true)
    public Timestamp getInsDate() {
        return insDate;
    }

    public void setInsDate(Timestamp insDate) {
        this.insDate = insDate;
    }

    @Basic
    @Column(name = "MODULE", nullable = true, length = 50)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "OWNER_FLAG", nullable = true, length = 40)
    public String getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(String ownerFlag) {
        this.ownerFlag = ownerFlag;
    }

    @Basic
    @Column(name = "NODE_ESP", nullable = true, length = 50)
    public String getNodeEsp() {
        return nodeEsp;
    }

    public void setNodeEsp(String nodeEsp) {
        this.nodeEsp = nodeEsp;
    }

    @Basic
    @Column(name = "VALIDATE_ESP", nullable = true, precision = 0)
    public Integer getValidateEsp() {
        return validateEsp;
    }

    public void setValidateEsp(Integer validateEsp) {
        this.validateEsp = validateEsp;
    }

    @Basic
    @Column(name = "TRANSLATOR_ESP", nullable = true, length = 50)
    public String getTranslatorEsp() {
        return translatorEsp;
    }

    public void setTranslatorEsp(String translatorEsp) {
        this.translatorEsp = translatorEsp;
    }

    @Basic
    @Column(name = "PREV_TRANS_ESP", nullable = true, length = 50)
    public String getPrevTransEsp() {
        return prevTransEsp;
    }

    public void setPrevTransEsp(String prevTransEsp) {
        this.prevTransEsp = prevTransEsp;
    }

    @Basic
    @Column(name = "COMMENT_ESP", nullable = true, length = 50)
    public String getCommentEsp() {
        return commentEsp;
    }

    public void setCommentEsp(String commentEsp) {
        this.commentEsp = commentEsp;
    }

    @Basic
    @Column(name = "MOD_DATE_ESP", nullable = true)
    public Timestamp getModDateEsp() {
        return modDateEsp;
    }

    public void setModDateEsp(Timestamp modDateEsp) {
        this.modDateEsp = modDateEsp;
    }

    @Basic
    @Column(name = "NODE_USA", nullable = true, length = 50)
    public String getNodeUsa() {
        return nodeUsa;
    }

    public void setNodeUsa(String nodeUsa) {
        this.nodeUsa = nodeUsa;
    }

    @Basic
    @Column(name = "VALIDATE_USA", nullable = true, precision = 0)
    public Integer getValidateUsa() {
        return validateUsa;
    }

    public void setValidateUsa(Integer validateUsa) {
        this.validateUsa = validateUsa;
    }

    @Basic
    @Column(name = "TRANSLATOR_USA", nullable = true, length = 50)
    public String getTranslatorUsa() {
        return translatorUsa;
    }

    public void setTranslatorUsa(String translatorUsa) {
        this.translatorUsa = translatorUsa;
    }

    @Basic
    @Column(name = "PREV_TRANS_USA", nullable = true, length = 50)
    public String getPrevTransUsa() {
        return prevTransUsa;
    }

    public void setPrevTransUsa(String prevTransUsa) {
        this.prevTransUsa = prevTransUsa;
    }

    @Basic
    @Column(name = "COMMENT_USA", nullable = true, length = 50)
    public String getCommentUsa() {
        return commentUsa;
    }

    public void setCommentUsa(String commentUsa) {
        this.commentUsa = commentUsa;
    }

    @Basic
    @Column(name = "MOD_DATE_USA", nullable = true)
    public Timestamp getModDateUsa() {
        return modDateUsa;
    }

    public void setModDateUsa(Timestamp modDateUsa) {
        this.modDateUsa = modDateUsa;
    }

    @Basic
    @Column(name = "NODE_FRA", nullable = true, length = 50)
    public String getNodeFra() {
        return nodeFra;
    }

    public void setNodeFra(String nodeFra) {
        this.nodeFra = nodeFra;
    }

    @Basic
    @Column(name = "VALIDATE_FRA", nullable = true, precision = 0)
    public Integer getValidateFra() {
        return validateFra;
    }

    public void setValidateFra(Integer validateFra) {
        this.validateFra = validateFra;
    }

    @Basic
    @Column(name = "TRANSLATOR_FRA", nullable = true, length = 50)
    public String getTranslatorFra() {
        return translatorFra;
    }

    public void setTranslatorFra(String translatorFra) {
        this.translatorFra = translatorFra;
    }

    @Basic
    @Column(name = "PREV_TRANS_FRA", nullable = true, length = 50)
    public String getPrevTransFra() {
        return prevTransFra;
    }

    public void setPrevTransFra(String prevTransFra) {
        this.prevTransFra = prevTransFra;
    }

    @Basic
    @Column(name = "COMMENT_FRA", nullable = true, length = 50)
    public String getCommentFra() {
        return commentFra;
    }

    public void setCommentFra(String commentFra) {
        this.commentFra = commentFra;
    }

    @Basic
    @Column(name = "MOD_DATE_FRA", nullable = true)
    public Timestamp getModDateFra() {
        return modDateFra;
    }

    public void setModDateFra(Timestamp modDateFra) {
        this.modDateFra = modDateFra;
    }

    @Basic
    @Column(name = "NODE_GER", nullable = true, length = 50)
    public String getNodeGer() {
        return nodeGer;
    }

    public void setNodeGer(String nodeGer) {
        this.nodeGer = nodeGer;
    }

    @Basic
    @Column(name = "VALIDATE_GER", nullable = true, precision = 0)
    public Integer getValidateGer() {
        return validateGer;
    }

    public void setValidateGer(Integer validateGer) {
        this.validateGer = validateGer;
    }

    @Basic
    @Column(name = "TRANSLATOR_GER", nullable = true, length = 50)
    public String getTranslatorGer() {
        return translatorGer;
    }

    public void setTranslatorGer(String translatorGer) {
        this.translatorGer = translatorGer;
    }

    @Basic
    @Column(name = "PREV_TRANS_GER", nullable = true, length = 50)
    public String getPrevTransGer() {
        return prevTransGer;
    }

    public void setPrevTransGer(String prevTransGer) {
        this.prevTransGer = prevTransGer;
    }

    @Basic
    @Column(name = "COMMENT_GER", nullable = true, length = 50)
    public String getCommentGer() {
        return commentGer;
    }

    public void setCommentGer(String commentGer) {
        this.commentGer = commentGer;
    }

    @Basic
    @Column(name = "MOD_DATE_GER", nullable = true)
    public Timestamp getModDateGer() {
        return modDateGer;
    }

    public void setModDateGer(Timestamp modDateGer) {
        this.modDateGer = modDateGer;
    }

    @Basic
    @Column(name = "NODE_ITA", nullable = true, length = 50)
    public String getNodeIta() {
        return nodeIta;
    }

    public void setNodeIta(String nodeIta) {
        this.nodeIta = nodeIta;
    }

    @Basic
    @Column(name = "VALIDATE_ITA", nullable = true, precision = 0)
    public Integer getValidateIta() {
        return validateIta;
    }

    public void setValidateIta(Integer validateIta) {
        this.validateIta = validateIta;
    }

    @Basic
    @Column(name = "TRANSLATOR_ITA", nullable = true, length = 50)
    public String getTranslatorIta() {
        return translatorIta;
    }

    public void setTranslatorIta(String translatorIta) {
        this.translatorIta = translatorIta;
    }

    @Basic
    @Column(name = "PREV_TRANS_ITA", nullable = true, length = 50)
    public String getPrevTransIta() {
        return prevTransIta;
    }

    public void setPrevTransIta(String prevTransIta) {
        this.prevTransIta = prevTransIta;
    }

    @Basic
    @Column(name = "COMMENT_ITA", nullable = true, length = 50)
    public String getCommentIta() {
        return commentIta;
    }

    public void setCommentIta(String commentIta) {
        this.commentIta = commentIta;
    }

    @Basic
    @Column(name = "MOD_DATE_ITA", nullable = true)
    public Timestamp getModDateIta() {
        return modDateIta;
    }

    public void setModDateIta(Timestamp modDateIta) {
        this.modDateIta = modDateIta;
    }

    @Basic
    @Column(name = "NODE_BRA", nullable = true, length = 50)
    public String getNodeBra() {
        return nodeBra;
    }

    public void setNodeBra(String nodeBra) {
        this.nodeBra = nodeBra;
    }

    @Basic
    @Column(name = "VALIDATE_BRA", nullable = true, precision = 0)
    public Integer getValidateBra() {
        return validateBra;
    }

    public void setValidateBra(Integer validateBra) {
        this.validateBra = validateBra;
    }

    @Basic
    @Column(name = "TRANSLATOR_BRA", nullable = true, length = 50)
    public String getTranslatorBra() {
        return translatorBra;
    }

    public void setTranslatorBra(String translatorBra) {
        this.translatorBra = translatorBra;
    }

    @Basic
    @Column(name = "PREV_TRANS_BRA", nullable = true, length = 50)
    public String getPrevTransBra() {
        return prevTransBra;
    }

    public void setPrevTransBra(String prevTransBra) {
        this.prevTransBra = prevTransBra;
    }

    @Basic
    @Column(name = "COMMENT_BRA", nullable = true, length = 50)
    public String getCommentBra() {
        return commentBra;
    }

    public void setCommentBra(String commentBra) {
        this.commentBra = commentBra;
    }

    @Basic
    @Column(name = "MOD_DATE_BRA", nullable = true)
    public Timestamp getModDateBra() {
        return modDateBra;
    }

    public void setModDateBra(Timestamp modDateBra) {
        this.modDateBra = modDateBra;
    }

    @Basic
    @Column(name = "NODE_GEN", nullable = true, length = 50)
    public String getNodeGen() {
        return nodeGen;
    }

    public void setNodeGen(String nodeGen) {
        this.nodeGen = nodeGen;
    }

    @Basic
    @Column(name = "VALIDATE_GEN", nullable = true, precision = 0)
    public Integer getValidateGen() {
        return validateGen;
    }

    public void setValidateGen(Integer validateGen) {
        this.validateGen = validateGen;
    }

    @Basic
    @Column(name = "TRANSLATOR_GEN", nullable = true, length = 50)
    public String getTranslatorGen() {
        return translatorGen;
    }

    public void setTranslatorGen(String translatorGen) {
        this.translatorGen = translatorGen;
    }

    @Basic
    @Column(name = "PREV_TRANS_GEN", nullable = true, length = 50)
    public String getPrevTransGen() {
        return prevTransGen;
    }

    public void setPrevTransGen(String prevTransGen) {
        this.prevTransGen = prevTransGen;
    }

    @Basic
    @Column(name = "COMMENT_GEN", nullable = true, length = 50)
    public String getCommentGen() {
        return commentGen;
    }

    public void setCommentGen(String commentGen) {
        this.commentGen = commentGen;
    }

    @Basic
    @Column(name = "MOD_DATE_GEN", nullable = true)
    public Timestamp getModDateGen() {
        return modDateGen;
    }

    public void setModDateGen(Timestamp modDateGen) {
        this.modDateGen = modDateGen;
    }

    @Basic
    @Column(name = "ENGLISH_ONLY", nullable = true, precision = 0)
    public BigInteger getEnglishOnly() {
        return englishOnly;
    }

    public void setEnglishOnly(BigInteger englishOnly) {
        this.englishOnly = englishOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        M4RtrMnodos that = (M4RtrMnodos) o;
        return Objects.equals(idT3, that.idT3) &&
                Objects.equals(idNode, that.idNode) &&
                Objects.equals(idTi, that.idTi) &&
                Objects.equals(idObject, that.idObject) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(module, that.module) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(nodeEsp, that.nodeEsp) &&
                Objects.equals(validateEsp, that.validateEsp) &&
                Objects.equals(translatorEsp, that.translatorEsp) &&
                Objects.equals(prevTransEsp, that.prevTransEsp) &&
                Objects.equals(commentEsp, that.commentEsp) &&
                Objects.equals(modDateEsp, that.modDateEsp) &&
                Objects.equals(nodeUsa, that.nodeUsa) &&
                Objects.equals(validateUsa, that.validateUsa) &&
                Objects.equals(translatorUsa, that.translatorUsa) &&
                Objects.equals(prevTransUsa, that.prevTransUsa) &&
                Objects.equals(commentUsa, that.commentUsa) &&
                Objects.equals(modDateUsa, that.modDateUsa) &&
                Objects.equals(nodeFra, that.nodeFra) &&
                Objects.equals(validateFra, that.validateFra) &&
                Objects.equals(translatorFra, that.translatorFra) &&
                Objects.equals(prevTransFra, that.prevTransFra) &&
                Objects.equals(commentFra, that.commentFra) &&
                Objects.equals(modDateFra, that.modDateFra) &&
                Objects.equals(nodeGer, that.nodeGer) &&
                Objects.equals(validateGer, that.validateGer) &&
                Objects.equals(translatorGer, that.translatorGer) &&
                Objects.equals(prevTransGer, that.prevTransGer) &&
                Objects.equals(commentGer, that.commentGer) &&
                Objects.equals(modDateGer, that.modDateGer) &&
                Objects.equals(nodeIta, that.nodeIta) &&
                Objects.equals(validateIta, that.validateIta) &&
                Objects.equals(translatorIta, that.translatorIta) &&
                Objects.equals(prevTransIta, that.prevTransIta) &&
                Objects.equals(commentIta, that.commentIta) &&
                Objects.equals(modDateIta, that.modDateIta) &&
                Objects.equals(nodeBra, that.nodeBra) &&
                Objects.equals(validateBra, that.validateBra) &&
                Objects.equals(translatorBra, that.translatorBra) &&
                Objects.equals(prevTransBra, that.prevTransBra) &&
                Objects.equals(commentBra, that.commentBra) &&
                Objects.equals(modDateBra, that.modDateBra) &&
                Objects.equals(nodeGen, that.nodeGen) &&
                Objects.equals(validateGen, that.validateGen) &&
                Objects.equals(translatorGen, that.translatorGen) &&
                Objects.equals(prevTransGen, that.prevTransGen) &&
                Objects.equals(commentGen, that.commentGen) &&
                Objects.equals(modDateGen, that.modDateGen) &&
                Objects.equals(englishOnly, that.englishOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idT3, idNode, idTi, idObject, insDate, module, ownerFlag, nodeEsp, validateEsp, translatorEsp, prevTransEsp, commentEsp, modDateEsp, nodeUsa, validateUsa, translatorUsa, prevTransUsa, commentUsa, modDateUsa, nodeFra, validateFra, translatorFra, prevTransFra, commentFra, modDateFra, nodeGer, validateGer, translatorGer, prevTransGer, commentGer, modDateGer, nodeIta, validateIta, translatorIta, prevTransIta, commentIta, modDateIta, nodeBra, validateBra, translatorBra, prevTransBra, commentBra, modDateBra, nodeGen, validateGen, translatorGen, prevTransGen, commentGen, modDateGen, englishOnly);
    }
}
