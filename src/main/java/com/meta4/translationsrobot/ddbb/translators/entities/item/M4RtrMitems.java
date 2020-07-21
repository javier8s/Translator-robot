package com.meta4.translationsrobot.ddbb.translators.entities.item;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MITEMS", schema = "dbo", catalog = "TRANSHRMS60")
@IdClass(M4RtrMitemsPK.class)
public class M4RtrMitems {
    private String idTi;
    private String idItem;
    private String idItemTi;
    private String idObject;
    private Timestamp insDate;
    private Integer ownerFlag;
    private String module;
    private String idField;
    private String itemEsp;
    private Integer validateEsp;
    private String translatorEsp;
    private String commentEsp;
    private Timestamp modDateEsp;
    private String prevTransEsp;
    private String itemUsa;
    private Integer validateUsa;
    private String translatorUsa;
    private String commentUsa;
    private Timestamp modDateUsa;
    private String prevTransUsa;
    private String itemFra;
    private Integer validateFra;
    private String translatorFra;
    private String commentFra;
    private Timestamp modDateFra;
    private String prevTransFra;
    private String itemGer;
    private Integer validateGer;
    private String translatorGer;
    private String commentGer;
    private Timestamp modDateGer;
    private String prevTransGer;
    private String itemIta;
    private Integer validateIta;
    private String translatorIta;
    private String commentIta;
    private Timestamp modDateIta;
    private String prevTransIta;
    private String itemBra;
    private Integer validateBra;
    private String translatorBra;
    private String commentBra;
    private Timestamp modDateBra;
    private String prevTransBra;
    private String itemGen;
    private Integer validateGen;
    private String translatorGen;
    private String commentGen;
    private Timestamp modDateGen;
    private String prevTransGen;
    private BigInteger englishOnly;

    @Id
    @Column(name = "ID_TI", nullable = false, length = 30)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
    }

    @Id
    @Column(name = "ID_ITEM", nullable = false, length = 30)
    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    @Id
    @Column(name = "ID_ITEM_TI", nullable = false, length = 30)
    public String getIdItemTi() {
        return idItemTi;
    }

    public void setIdItemTi(String idItemTi) {
        this.idItemTi = idItemTi;
    }

    @Basic
    @Column(name = "ID_OBJECT", nullable = true, length = 30)
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
    @Column(name = "OWNER_FLAG", nullable = true, precision = 0)
    public Integer getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(Integer ownerFlag) {
        this.ownerFlag = ownerFlag;
    }

    @Basic
    @Column(name = "MODULE", nullable = true, length = 30)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "ID_FIELD", nullable = true, length = 30)
    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    @Basic
    @Column(name = "ITEM_ESP", nullable = true, length = 50)
    public String getItemEsp() {
        return itemEsp;
    }

    public void setItemEsp(String itemEsp) {
        this.itemEsp = itemEsp;
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
    @Column(name = "PREV_TRANS_ESP", nullable = true, length = 50)
    public String getPrevTransEsp() {
        return prevTransEsp;
    }

    public void setPrevTransEsp(String prevTransEsp) {
        this.prevTransEsp = prevTransEsp;
    }

    @Basic
    @Column(name = "ITEM_USA", nullable = true, length = 50)
    public String getItemUsa() {
        return itemUsa;
    }

    public void setItemUsa(String itemUsa) {
        this.itemUsa = itemUsa;
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
    @Column(name = "PREV_TRANS_USA", nullable = true, length = 50)
    public String getPrevTransUsa() {
        return prevTransUsa;
    }

    public void setPrevTransUsa(String prevTransUsa) {
        this.prevTransUsa = prevTransUsa;
    }

    @Basic
    @Column(name = "ITEM_FRA", nullable = true, length = 50)
    public String getItemFra() {
        return itemFra;
    }

    public void setItemFra(String itemFra) {
        this.itemFra = itemFra;
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
    @Column(name = "PREV_TRANS_FRA", nullable = true, length = 50)
    public String getPrevTransFra() {
        return prevTransFra;
    }

    public void setPrevTransFra(String prevTransFra) {
        this.prevTransFra = prevTransFra;
    }

    @Basic
    @Column(name = "ITEM_GER", nullable = true, length = 50)
    public String getItemGer() {
        return itemGer;
    }

    public void setItemGer(String itemGer) {
        this.itemGer = itemGer;
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
    @Column(name = "PREV_TRANS_GER", nullable = true, length = 50)
    public String getPrevTransGer() {
        return prevTransGer;
    }

    public void setPrevTransGer(String prevTransGer) {
        this.prevTransGer = prevTransGer;
    }

    @Basic
    @Column(name = "ITEM_ITA", nullable = true, length = 50)
    public String getItemIta() {
        return itemIta;
    }

    public void setItemIta(String itemIta) {
        this.itemIta = itemIta;
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
    @Column(name = "PREV_TRANS_ITA", nullable = true, length = 50)
    public String getPrevTransIta() {
        return prevTransIta;
    }

    public void setPrevTransIta(String prevTransIta) {
        this.prevTransIta = prevTransIta;
    }

    @Basic
    @Column(name = "ITEM_BRA", nullable = true, length = 50)
    public String getItemBra() {
        return itemBra;
    }

    public void setItemBra(String itemBra) {
        this.itemBra = itemBra;
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
    @Column(name = "PREV_TRANS_BRA", nullable = true, length = 50)
    public String getPrevTransBra() {
        return prevTransBra;
    }

    public void setPrevTransBra(String prevTransBra) {
        this.prevTransBra = prevTransBra;
    }

    @Basic
    @Column(name = "ITEM_GEN", nullable = true, length = 50)
    public String getItemGen() {
        return itemGen;
    }

    public void setItemGen(String itemGen) {
        this.itemGen = itemGen;
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
    @Column(name = "PREV_TRANS_GEN", nullable = true, length = 50)
    public String getPrevTransGen() {
        return prevTransGen;
    }

    public void setPrevTransGen(String prevTransGen) {
        this.prevTransGen = prevTransGen;
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
        M4RtrMitems that = (M4RtrMitems) o;
        return Objects.equals(idTi, that.idTi) &&
                Objects.equals(idItem, that.idItem) &&
                Objects.equals(idItemTi, that.idItemTi) &&
                Objects.equals(idObject, that.idObject) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(module, that.module) &&
                Objects.equals(idField, that.idField) &&
                Objects.equals(itemEsp, that.itemEsp) &&
                Objects.equals(validateEsp, that.validateEsp) &&
                Objects.equals(translatorEsp, that.translatorEsp) &&
                Objects.equals(commentEsp, that.commentEsp) &&
                Objects.equals(modDateEsp, that.modDateEsp) &&
                Objects.equals(prevTransEsp, that.prevTransEsp) &&
                Objects.equals(itemUsa, that.itemUsa) &&
                Objects.equals(validateUsa, that.validateUsa) &&
                Objects.equals(translatorUsa, that.translatorUsa) &&
                Objects.equals(commentUsa, that.commentUsa) &&
                Objects.equals(modDateUsa, that.modDateUsa) &&
                Objects.equals(prevTransUsa, that.prevTransUsa) &&
                Objects.equals(itemFra, that.itemFra) &&
                Objects.equals(validateFra, that.validateFra) &&
                Objects.equals(translatorFra, that.translatorFra) &&
                Objects.equals(commentFra, that.commentFra) &&
                Objects.equals(modDateFra, that.modDateFra) &&
                Objects.equals(prevTransFra, that.prevTransFra) &&
                Objects.equals(itemGer, that.itemGer) &&
                Objects.equals(validateGer, that.validateGer) &&
                Objects.equals(translatorGer, that.translatorGer) &&
                Objects.equals(commentGer, that.commentGer) &&
                Objects.equals(modDateGer, that.modDateGer) &&
                Objects.equals(prevTransGer, that.prevTransGer) &&
                Objects.equals(itemIta, that.itemIta) &&
                Objects.equals(validateIta, that.validateIta) &&
                Objects.equals(translatorIta, that.translatorIta) &&
                Objects.equals(commentIta, that.commentIta) &&
                Objects.equals(modDateIta, that.modDateIta) &&
                Objects.equals(prevTransIta, that.prevTransIta) &&
                Objects.equals(itemBra, that.itemBra) &&
                Objects.equals(validateBra, that.validateBra) &&
                Objects.equals(translatorBra, that.translatorBra) &&
                Objects.equals(commentBra, that.commentBra) &&
                Objects.equals(modDateBra, that.modDateBra) &&
                Objects.equals(prevTransBra, that.prevTransBra) &&
                Objects.equals(itemGen, that.itemGen) &&
                Objects.equals(validateGen, that.validateGen) &&
                Objects.equals(translatorGen, that.translatorGen) &&
                Objects.equals(commentGen, that.commentGen) &&
                Objects.equals(modDateGen, that.modDateGen) &&
                Objects.equals(prevTransGen, that.prevTransGen) &&
                Objects.equals(englishOnly, that.englishOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTi, idItem, idItemTi, idObject, insDate, ownerFlag, module, idField, itemEsp, validateEsp, translatorEsp, commentEsp, modDateEsp, prevTransEsp, itemUsa, validateUsa, translatorUsa, commentUsa, modDateUsa, prevTransUsa, itemFra, validateFra, translatorFra, commentFra, modDateFra, prevTransFra, itemGer, validateGer, translatorGer, commentGer, modDateGer, prevTransGer, itemIta, validateIta, translatorIta, commentIta, modDateIta, prevTransIta, itemBra, validateBra, translatorBra, commentBra, modDateBra, prevTransBra, itemGen, validateGen, translatorGen, commentGen, modDateGen, prevTransGen, englishOnly);
    }
}
