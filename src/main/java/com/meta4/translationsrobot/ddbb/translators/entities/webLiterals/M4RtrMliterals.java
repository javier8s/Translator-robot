package com.meta4.translationsrobot.ddbb.translators.entities.webLiterals;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "M4RTR_MLITERALS", schema = "dbo", catalog = "GLOBALHRPRO140619")
@IdClass(M4RtrMliteralsPK.class)
public class M4RtrMliterals {
    private BigInteger idType;
    private String pathInfo;
    private String baseName;
    private String idLiteral;
    private String idOrganization;
    private String zvalueger;
    private Integer validateGer;
    private String translatorGer;
    private String commentGer;
    private String prevTransGer;
    private Timestamp modDateGer;
    private String zvaluefra;
    private Integer validateFra;
    private String translatorFra;
    private String commentFra;
    private String prevTransFra;
    private Timestamp modDateFra;
    private String zvalueesp;
    private Integer validateEsp;
    private String translatorEsp;
    private String commentEsp;
    private String prevTransEsp;
    private Timestamp modDateEsp;
    private String zvalueusa;
    private Integer validateUsa;
    private String translatorUsa;
    private String commentUsa;
    private String prevTransUsa;
    private Timestamp modDateUsa;
    private String zvalueita;
    private Integer validateIta;
    private String translatorIta;
    private String commentIta;
    private String prevTransIta;
    private Timestamp modDateIta;
    private String zvaluebra;
    private Integer validateBra;
    private String translatorBra;
    private String commentBra;
    private String prevTransBra;
    private Timestamp modDateBra;
    private String zvaluegen;
    private Integer validateGen;
    private String translatorGen;
    private String commentGen;
    private String prevTransGen;
    private Timestamp modDateGen;
    private Timestamp insDate;
    private String ownerFlag;
    private BigInteger englishOnly;

    @Id
    @Column(name = "ID_TYPE", nullable = false, precision = 0)
    public BigInteger getIdType() {
        return idType;
    }

    public void setIdType(BigInteger idType) {
        this.idType = idType;
    }

    @Id
    @Column(name = "PATH_INFO", nullable = false, length = 255)
    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    @Id
    @Column(name = "BASE_NAME", nullable = false, length = 255)
    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Id
    @Column(name = "ID_LITERAL", nullable = false, length = 255)
    public String getIdLiteral() {
        return idLiteral;
    }

    public void setIdLiteral(String idLiteral) {
        this.idLiteral = idLiteral;
    }

    @Id
    @Column(name = "ID_ORGANIZATION", nullable = false, length = 4)
    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Basic
    @Column(name = "ZVALUEGER", nullable = true, length = 2000)
    public String getZvalueger() {
        return zvalueger;
    }

    public void setZvalueger(String zvalueger) {
        this.zvalueger = zvalueger;
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
    @Column(name = "PREV_TRANS_GER", nullable = true, length = 50)
    public String getPrevTransGer() {
        return prevTransGer;
    }

    public void setPrevTransGer(String prevTransGer) {
        this.prevTransGer = prevTransGer;
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
    @Column(name = "ZVALUEFRA", nullable = true, length = 2000)
    public String getZvaluefra() {
        return zvaluefra;
    }

    public void setZvaluefra(String zvaluefra) {
        this.zvaluefra = zvaluefra;
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
    @Column(name = "PREV_TRANS_FRA", nullable = true, length = 50)
    public String getPrevTransFra() {
        return prevTransFra;
    }

    public void setPrevTransFra(String prevTransFra) {
        this.prevTransFra = prevTransFra;
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
    @Column(name = "ZVALUEESP", nullable = true, length = 2000)
    public String getZvalueesp() {
        return zvalueesp;
    }

    public void setZvalueesp(String zvalueesp) {
        this.zvalueesp = zvalueesp;
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
    @Column(name = "PREV_TRANS_ESP", nullable = true, length = 50)
    public String getPrevTransEsp() {
        return prevTransEsp;
    }

    public void setPrevTransEsp(String prevTransEsp) {
        this.prevTransEsp = prevTransEsp;
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
    @Column(name = "ZVALUEUSA", nullable = true, length = 2000)
    public String getZvalueusa() {
        return zvalueusa;
    }

    public void setZvalueusa(String zvalueusa) {
        this.zvalueusa = zvalueusa;
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
    @Column(name = "PREV_TRANS_USA", nullable = true, length = 50)
    public String getPrevTransUsa() {
        return prevTransUsa;
    }

    public void setPrevTransUsa(String prevTransUsa) {
        this.prevTransUsa = prevTransUsa;
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
    @Column(name = "ZVALUEITA", nullable = true, length = 2000)
    public String getZvalueita() {
        return zvalueita;
    }

    public void setZvalueita(String zvalueita) {
        this.zvalueita = zvalueita;
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
    @Column(name = "PREV_TRANS_ITA", nullable = true, length = 50)
    public String getPrevTransIta() {
        return prevTransIta;
    }

    public void setPrevTransIta(String prevTransIta) {
        this.prevTransIta = prevTransIta;
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
    @Column(name = "ZVALUEBRA", nullable = true, length = 2000)
    public String getZvaluebra() {
        return zvaluebra;
    }

    public void setZvaluebra(String zvaluebra) {
        this.zvaluebra = zvaluebra;
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
    @Column(name = "PREV_TRANS_BRA", nullable = true, length = 50)
    public String getPrevTransBra() {
        return prevTransBra;
    }

    public void setPrevTransBra(String prevTransBra) {
        this.prevTransBra = prevTransBra;
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
    @Column(name = "ZVALUEGEN", nullable = true, length = 2000)
    public String getZvaluegen() {
        return zvaluegen;
    }

    public void setZvaluegen(String zvaluegen) {
        this.zvaluegen = zvaluegen;
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
    @Column(name = "PREV_TRANS_GEN", nullable = true, length = 50)
    public String getPrevTransGen() {
        return prevTransGen;
    }

    public void setPrevTransGen(String prevTransGen) {
        this.prevTransGen = prevTransGen;
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
    @Column(name = "INS_DATE", nullable = true)
    public Timestamp getInsDate() {
        return insDate;
    }

    public void setInsDate(Timestamp insDate) {
        this.insDate = insDate;
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
        M4RtrMliterals that = (M4RtrMliterals) o;
        return Objects.equals(idType, that.idType) &&
                Objects.equals(pathInfo, that.pathInfo) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(idLiteral, that.idLiteral) &&
                Objects.equals(idOrganization, that.idOrganization) &&
                Objects.equals(zvalueger, that.zvalueger) &&
                Objects.equals(validateGer, that.validateGer) &&
                Objects.equals(translatorGer, that.translatorGer) &&
                Objects.equals(commentGer, that.commentGer) &&
                Objects.equals(prevTransGer, that.prevTransGer) &&
                Objects.equals(modDateGer, that.modDateGer) &&
                Objects.equals(zvaluefra, that.zvaluefra) &&
                Objects.equals(validateFra, that.validateFra) &&
                Objects.equals(translatorFra, that.translatorFra) &&
                Objects.equals(commentFra, that.commentFra) &&
                Objects.equals(prevTransFra, that.prevTransFra) &&
                Objects.equals(modDateFra, that.modDateFra) &&
                Objects.equals(zvalueesp, that.zvalueesp) &&
                Objects.equals(validateEsp, that.validateEsp) &&
                Objects.equals(translatorEsp, that.translatorEsp) &&
                Objects.equals(commentEsp, that.commentEsp) &&
                Objects.equals(prevTransEsp, that.prevTransEsp) &&
                Objects.equals(modDateEsp, that.modDateEsp) &&
                Objects.equals(zvalueusa, that.zvalueusa) &&
                Objects.equals(validateUsa, that.validateUsa) &&
                Objects.equals(translatorUsa, that.translatorUsa) &&
                Objects.equals(commentUsa, that.commentUsa) &&
                Objects.equals(prevTransUsa, that.prevTransUsa) &&
                Objects.equals(modDateUsa, that.modDateUsa) &&
                Objects.equals(zvalueita, that.zvalueita) &&
                Objects.equals(validateIta, that.validateIta) &&
                Objects.equals(translatorIta, that.translatorIta) &&
                Objects.equals(commentIta, that.commentIta) &&
                Objects.equals(prevTransIta, that.prevTransIta) &&
                Objects.equals(modDateIta, that.modDateIta) &&
                Objects.equals(zvaluebra, that.zvaluebra) &&
                Objects.equals(validateBra, that.validateBra) &&
                Objects.equals(translatorBra, that.translatorBra) &&
                Objects.equals(commentBra, that.commentBra) &&
                Objects.equals(prevTransBra, that.prevTransBra) &&
                Objects.equals(modDateBra, that.modDateBra) &&
                Objects.equals(zvaluegen, that.zvaluegen) &&
                Objects.equals(validateGen, that.validateGen) &&
                Objects.equals(translatorGen, that.translatorGen) &&
                Objects.equals(commentGen, that.commentGen) &&
                Objects.equals(prevTransGen, that.prevTransGen) &&
                Objects.equals(modDateGen, that.modDateGen) &&
                Objects.equals(insDate, that.insDate) &&
                Objects.equals(ownerFlag, that.ownerFlag) &&
                Objects.equals(englishOnly, that.englishOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, pathInfo, baseName, idLiteral, idOrganization, zvalueger, validateGer, translatorGer, commentGer, prevTransGer, modDateGer, zvaluefra, validateFra, translatorFra, commentFra, prevTransFra, modDateFra, zvalueesp, validateEsp, translatorEsp, commentEsp, prevTransEsp, modDateEsp, zvalueusa, validateUsa, translatorUsa, commentUsa, prevTransUsa, modDateUsa, zvalueita, validateIta, translatorIta, commentIta, prevTransIta, modDateIta, zvaluebra, validateBra, translatorBra, commentBra, prevTransBra, modDateBra, zvaluegen, validateGen, translatorGen, commentGen, prevTransGen, modDateGen, insDate, ownerFlag, englishOnly);
    }
}
