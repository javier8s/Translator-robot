package com.meta4.translationsrobot.ddbb.translators.entities.fields;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MFIELDS_RDC", schema = "dbo", catalog = "TRANSHRMS60")
@IdClass(M4RtrMfieldsRdcPK.class)
public class M4RtrMfieldsRdc {
    private String idObject;
    private String idField;
    private String ownerFlag;
    private String module;
    private Timestamp insDate;
    private String nFieldsEsp;
    private String translatorEsp;
    private Integer validateEsp;
    private Timestamp modDateEsp;
    private String prevTransEsp;
    private String commentEsp;
    private String nFieldsUsa;
    private String translatorUsa;
    private Integer validateUsa;
    private Timestamp modDateUsa;
    private String prevTransUsa;
    private String commentUsa;
    private String nFieldsFra;
    private String translatorFra;
    private Integer validateFra;
    private Timestamp modDateFra;
    private String prevTransFra;
    private String commentFra;
    private String nFieldsGer;
    private String translatorGer;
    private Integer validateGer;
    private Timestamp modDateGer;
    private String prevTransGer;
    private String commentGer;
    private String nFieldsIta;
    private String translatorIta;
    private Integer validateIta;
    private Timestamp modDateIta;
    private String prevTransIta;
    private String commentIta;
    private String nFieldsBra;
    private String translatorBra;
    private Integer validateBra;
    private Timestamp modDateBra;
    private String prevTransBra;
    private String commentBra;
    private String nFieldsGen;
    private String translatorGen;
    private Integer validateGen;
    private Timestamp modDateGen;
    private String prevTransGen;
    private String commentGen;
    private BigInteger englishOnly;

    @Id
    @Column(name = "ID_OBJECT", nullable = false, length = 30)
    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    @Id
    @Column(name = "ID_FIELD", nullable = false, length = 30)
    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
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
    @Column(name = "MODULE", nullable = true, length = 30)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
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
    @Column(name = "N_FIELDS_ESP", nullable = true, length = 30)
    public String getnFieldsEsp() {
        return nFieldsEsp;
    }

    public void setnFieldsEsp(String nFieldsEsp) {
        this.nFieldsEsp = nFieldsEsp;
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
    @Column(name = "VALIDATE_ESP", nullable = true, precision = 0)
    public Integer getValidateEsp() {
        return validateEsp;
    }

    public void setValidateEsp(Integer validateEsp) {
        this.validateEsp = validateEsp;
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
    @Column(name = "PREV_TRANS_ESP", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_USA", nullable = true, length = 30)
    public String getnFieldsUsa() {
        return nFieldsUsa;
    }

    public void setnFieldsUsa(String nFieldsUsa) {
        this.nFieldsUsa = nFieldsUsa;
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
    @Column(name = "VALIDATE_USA", nullable = true, precision = 0)
    public Integer getValidateUsa() {
        return validateUsa;
    }

    public void setValidateUsa(Integer validateUsa) {
        this.validateUsa = validateUsa;
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
    @Column(name = "PREV_TRANS_USA", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_FRA", nullable = true, length = 30)
    public String getnFieldsFra() {
        return nFieldsFra;
    }

    public void setnFieldsFra(String nFieldsFra) {
        this.nFieldsFra = nFieldsFra;
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
    @Column(name = "VALIDATE_FRA", nullable = true, precision = 0)
    public Integer getValidateFra() {
        return validateFra;
    }

    public void setValidateFra(Integer validateFra) {
        this.validateFra = validateFra;
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
    @Column(name = "PREV_TRANS_FRA", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_GER", nullable = true, length = 30)
    public String getnFieldsGer() {
        return nFieldsGer;
    }

    public void setnFieldsGer(String nFieldsGer) {
        this.nFieldsGer = nFieldsGer;
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
    @Column(name = "VALIDATE_GER", nullable = true, precision = 0)
    public Integer getValidateGer() {
        return validateGer;
    }

    public void setValidateGer(Integer validateGer) {
        this.validateGer = validateGer;
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
    @Column(name = "PREV_TRANS_GER", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_ITA", nullable = true, length = 30)
    public String getnFieldsIta() {
        return nFieldsIta;
    }

    public void setnFieldsIta(String nFieldsIta) {
        this.nFieldsIta = nFieldsIta;
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
    @Column(name = "VALIDATE_ITA", nullable = true, precision = 0)
    public Integer getValidateIta() {
        return validateIta;
    }

    public void setValidateIta(Integer validateIta) {
        this.validateIta = validateIta;
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
    @Column(name = "PREV_TRANS_ITA", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_BRA", nullable = true, length = 30)
    public String getnFieldsBra() {
        return nFieldsBra;
    }

    public void setnFieldsBra(String nFieldsBra) {
        this.nFieldsBra = nFieldsBra;
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
    @Column(name = "VALIDATE_BRA", nullable = true, precision = 0)
    public Integer getValidateBra() {
        return validateBra;
    }

    public void setValidateBra(Integer validateBra) {
        this.validateBra = validateBra;
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
    @Column(name = "PREV_TRANS_BRA", nullable = true, length = 75)
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
    @Column(name = "N_FIELDS_GEN", nullable = true, length = 30)
    public String getnFieldsGen() {
        return nFieldsGen;
    }

    public void setnFieldsGen(String nFieldsGen) {
        this.nFieldsGen = nFieldsGen;
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
    @Column(name = "VALIDATE_GEN", nullable = true, precision = 0)
    public Integer getValidateGen() {
        return validateGen;
    }

    public void setValidateGen(Integer validateGen) {
        this.validateGen = validateGen;
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
    @Column(name = "PREV_TRANS_GEN", nullable = true, length = 75)
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
        M4RtrMfieldsRdc that = (M4RtrMfieldsRdc) o;
        return Objects.equals(idObject, that.idObject) &&
                Objects.equals(idField, that.idField) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(module, that.module) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(nFieldsEsp, that.nFieldsEsp) &&
                Objects.equals(translatorEsp, that.translatorEsp) &&
                Objects.equals(validateEsp, that.validateEsp) &&
                Objects.equals(modDateEsp, that.modDateEsp) &&
                Objects.equals(prevTransEsp, that.prevTransEsp) &&
                Objects.equals(commentEsp, that.commentEsp) &&
                Objects.equals(nFieldsUsa, that.nFieldsUsa) &&
                Objects.equals(translatorUsa, that.translatorUsa) &&
                Objects.equals(validateUsa, that.validateUsa) &&
                Objects.equals(modDateUsa, that.modDateUsa) &&
                Objects.equals(prevTransUsa, that.prevTransUsa) &&
                Objects.equals(commentUsa, that.commentUsa) &&
                Objects.equals(nFieldsFra, that.nFieldsFra) &&
                Objects.equals(translatorFra, that.translatorFra) &&
                Objects.equals(validateFra, that.validateFra) &&
                Objects.equals(modDateFra, that.modDateFra) &&
                Objects.equals(prevTransFra, that.prevTransFra) &&
                Objects.equals(commentFra, that.commentFra) &&
                Objects.equals(nFieldsGer, that.nFieldsGer) &&
                Objects.equals(translatorGer, that.translatorGer) &&
                Objects.equals(validateGer, that.validateGer) &&
                Objects.equals(modDateGer, that.modDateGer) &&
                Objects.equals(prevTransGer, that.prevTransGer) &&
                Objects.equals(commentGer, that.commentGer) &&
                Objects.equals(nFieldsIta, that.nFieldsIta) &&
                Objects.equals(translatorIta, that.translatorIta) &&
                Objects.equals(validateIta, that.validateIta) &&
                Objects.equals(modDateIta, that.modDateIta) &&
                Objects.equals(prevTransIta, that.prevTransIta) &&
                Objects.equals(commentIta, that.commentIta) &&
                Objects.equals(nFieldsBra, that.nFieldsBra) &&
                Objects.equals(translatorBra, that.translatorBra) &&
                Objects.equals(validateBra, that.validateBra) &&
                Objects.equals(modDateBra, that.modDateBra) &&
                Objects.equals(prevTransBra, that.prevTransBra) &&
                Objects.equals(commentBra, that.commentBra) &&
                Objects.equals(nFieldsGen, that.nFieldsGen) &&
                Objects.equals(translatorGen, that.translatorGen) &&
                Objects.equals(validateGen, that.validateGen) &&
                Objects.equals(modDateGen, that.modDateGen) &&
                Objects.equals(prevTransGen, that.prevTransGen) &&
                Objects.equals(commentGen, that.commentGen) &&
                Objects.equals(englishOnly, that.englishOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObject, idField, ownerFlag, module, insDate, nFieldsEsp, translatorEsp, validateEsp, modDateEsp, prevTransEsp, commentEsp, nFieldsUsa, translatorUsa, validateUsa, modDateUsa, prevTransUsa, commentUsa, nFieldsFra, translatorFra, validateFra, modDateFra, prevTransFra, commentFra, nFieldsGer, translatorGer, validateGer, modDateGer, prevTransGer, commentGer, nFieldsIta, translatorIta, validateIta, modDateIta, prevTransIta, commentIta, nFieldsBra, translatorBra, validateBra, modDateBra, prevTransBra, commentBra, nFieldsGen, translatorGen, validateGen, modDateGen, prevTransGen, commentGen, englishOnly);
    }
}
