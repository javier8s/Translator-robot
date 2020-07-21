package com.meta4.translationsrobot.ddbb.translators.entities.tis;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MTIS", schema = "dbo", catalog = "TRANSHRMS60")
public class M4RtrMtis {
    private String idTi;
    private String ownerFlag;
    private String idReadObject;
    private String idWriteObject;
    private String module;
    private Timestamp insDate;
    private String nTiEsp;
    private Integer validateEsp;
    private String translatorEsp;
    private String prevTransEsp;
    private String commentEsp;
    private Timestamp modDateEsp;
    private String nTiUsa;
    private Integer validateUsa;
    private String translatorUsa;
    private String prevTransUsa;
    private String commentUsa;
    private Timestamp modDateUsa;
    private String nTiFra;
    private Integer validateFra;
    private String translatorFra;
    private String prevTransFra;
    private String commentFra;
    private Timestamp modDateFra;
    private String nTiGer;
    private Integer validateGer;
    private String translatorGer;
    private String prevTransGer;
    private String commentGer;
    private Timestamp modDateGer;
    private String nTiIta;
    private Integer validateIta;
    private String translatorIta;
    private String prevTransIta;
    private String commentIta;
    private Timestamp modDateIta;
    private String nTiBra;
    private Integer validateBra;
    private String translatorBra;
    private String prevTransBra;
    private String commentBra;
    private Timestamp modDateBra;
    private String nTiGen;
    private Integer validateGen;
    private String translatorGen;
    private String prevTransGen;
    private String commentGen;
    private Timestamp modDateGen;
    private BigInteger englishOnly;

    @Id
    @Column(name = "ID_TI", nullable = false, length = 100)
    public String getIdTi() {
        return idTi;
    }

    public void setIdTi(String idTi) {
        this.idTi = idTi;
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
    @Column(name = "ID_READ_OBJECT", nullable = true, length = 30)
    public String getIdReadObject() {
        return idReadObject;
    }

    public void setIdReadObject(String idReadObject) {
        this.idReadObject = idReadObject;
    }

    @Basic
    @Column(name = "ID_WRITE_OBJECT", nullable = true, length = 30)
    public String getIdWriteObject() {
        return idWriteObject;
    }

    public void setIdWriteObject(String idWriteObject) {
        this.idWriteObject = idWriteObject;
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
    @Column(name = "N_TI_ESP", nullable = true, length = 50)
    public String getnTiEsp() {
        return nTiEsp;
    }

    public void setnTiEsp(String nTiEsp) {
        this.nTiEsp = nTiEsp;
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
    @Column(name = "N_TI_USA", nullable = true, length = 50)
    public String getnTiUsa() {
        return nTiUsa;
    }

    public void setnTiUsa(String nTiUsa) {
        this.nTiUsa = nTiUsa;
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
    @Column(name = "N_TI_FRA", nullable = true, length = 50)
    public String getnTiFra() {
        return nTiFra;
    }

    public void setnTiFra(String nTiFra) {
        this.nTiFra = nTiFra;
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
    @Column(name = "N_TI_GER", nullable = true, length = 50)
    public String getnTiGer() {
        return nTiGer;
    }

    public void setnTiGer(String nTiGer) {
        this.nTiGer = nTiGer;
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
    @Column(name = "N_TI_ITA", nullable = true, length = 50)
    public String getnTiIta() {
        return nTiIta;
    }

    public void setnTiIta(String nTiIta) {
        this.nTiIta = nTiIta;
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
    @Column(name = "N_TI_BRA", nullable = true, length = 50)
    public String getnTiBra() {
        return nTiBra;
    }

    public void setnTiBra(String nTiBra) {
        this.nTiBra = nTiBra;
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
    @Column(name = "N_TI_GEN", nullable = true, length = 50)
    public String getnTiGen() {
        return nTiGen;
    }

    public void setnTiGen(String nTiGen) {
        this.nTiGen = nTiGen;
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
        M4RtrMtis m4RtrMtis = (M4RtrMtis) o;
        return Objects.equals(idTi, m4RtrMtis.idTi) &&
                Objects.equals(ownerFlag, m4RtrMtis.ownerFlag) &&
                Objects.equals(idReadObject, m4RtrMtis.idReadObject) &&
                Objects.equals(idWriteObject, m4RtrMtis.idWriteObject) &&
                Objects.equals(module, m4RtrMtis.module) &&
                Objects.equals(insDate, m4RtrMtis.insDate) &&
                Objects.equals(nTiEsp, m4RtrMtis.nTiEsp) &&
                Objects.equals(validateEsp, m4RtrMtis.validateEsp) &&
                Objects.equals(translatorEsp, m4RtrMtis.translatorEsp) &&
                Objects.equals(prevTransEsp, m4RtrMtis.prevTransEsp) &&
                Objects.equals(commentEsp, m4RtrMtis.commentEsp) &&
                Objects.equals(modDateEsp, m4RtrMtis.modDateEsp) &&
                Objects.equals(nTiUsa, m4RtrMtis.nTiUsa) &&
                Objects.equals(validateUsa, m4RtrMtis.validateUsa) &&
                Objects.equals(translatorUsa, m4RtrMtis.translatorUsa) &&
                Objects.equals(prevTransUsa, m4RtrMtis.prevTransUsa) &&
                Objects.equals(commentUsa, m4RtrMtis.commentUsa) &&
                Objects.equals(modDateUsa, m4RtrMtis.modDateUsa) &&
                Objects.equals(nTiFra, m4RtrMtis.nTiFra) &&
                Objects.equals(validateFra, m4RtrMtis.validateFra) &&
                Objects.equals(translatorFra, m4RtrMtis.translatorFra) &&
                Objects.equals(prevTransFra, m4RtrMtis.prevTransFra) &&
                Objects.equals(commentFra, m4RtrMtis.commentFra) &&
                Objects.equals(modDateFra, m4RtrMtis.modDateFra) &&
                Objects.equals(nTiGer, m4RtrMtis.nTiGer) &&
                Objects.equals(validateGer, m4RtrMtis.validateGer) &&
                Objects.equals(translatorGer, m4RtrMtis.translatorGer) &&
                Objects.equals(prevTransGer, m4RtrMtis.prevTransGer) &&
                Objects.equals(commentGer, m4RtrMtis.commentGer) &&
                Objects.equals(modDateGer, m4RtrMtis.modDateGer) &&
                Objects.equals(nTiIta, m4RtrMtis.nTiIta) &&
                Objects.equals(validateIta, m4RtrMtis.validateIta) &&
                Objects.equals(translatorIta, m4RtrMtis.translatorIta) &&
                Objects.equals(prevTransIta, m4RtrMtis.prevTransIta) &&
                Objects.equals(commentIta, m4RtrMtis.commentIta) &&
                Objects.equals(modDateIta, m4RtrMtis.modDateIta) &&
                Objects.equals(nTiBra, m4RtrMtis.nTiBra) &&
                Objects.equals(validateBra, m4RtrMtis.validateBra) &&
                Objects.equals(translatorBra, m4RtrMtis.translatorBra) &&
                Objects.equals(prevTransBra, m4RtrMtis.prevTransBra) &&
                Objects.equals(commentBra, m4RtrMtis.commentBra) &&
                Objects.equals(modDateBra, m4RtrMtis.modDateBra) &&
                Objects.equals(nTiGen, m4RtrMtis.nTiGen) &&
                Objects.equals(validateGen, m4RtrMtis.validateGen) &&
                Objects.equals(translatorGen, m4RtrMtis.translatorGen) &&
                Objects.equals(prevTransGen, m4RtrMtis.prevTransGen) &&
                Objects.equals(commentGen, m4RtrMtis.commentGen) &&
                Objects.equals(modDateGen, m4RtrMtis.modDateGen) &&
                Objects.equals(englishOnly, m4RtrMtis.englishOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTi, ownerFlag, idReadObject, idWriteObject, module, insDate, nTiEsp, validateEsp, translatorEsp, prevTransEsp, commentEsp, modDateEsp, nTiUsa, validateUsa, translatorUsa, prevTransUsa, commentUsa, modDateUsa, nTiFra, validateFra, translatorFra, prevTransFra, commentFra, modDateFra, nTiGer, validateGer, translatorGer, prevTransGer, commentGer, modDateGer, nTiIta, validateIta, translatorIta, prevTransIta, commentIta, modDateIta, nTiBra, validateBra, translatorBra, prevTransBra, commentBra, modDateBra, nTiGen, validateGen, translatorGen, prevTransGen, commentGen, modDateGen, englishOnly);
    }
}
