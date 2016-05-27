package com.kidoo.daily.domain.test;

public class IInstitution {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.front_institution_id
     *
     * @mbggenerated
     */
    private String frontInstitutionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.core_institution_id
     *
     * @mbggenerated
     */
    private String coreInstitutionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.reserve001
     *
     * @mbggenerated
     */
    private String reserve001;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.reserve002
     *
     * @mbggenerated
     */
    private String reserve002;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.reserve003
     *
     * @mbggenerated
     */
    private String reserve003;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_institution.reserve004
     *
     * @mbggenerated
     */
    private String reserve004;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_institution
     *
     * @mbggenerated
     */
    public IInstitution(Integer id, String frontInstitutionId, String coreInstitutionId, String reserve001, String reserve002, String reserve003, String reserve004) {
        this.id = id;
        this.frontInstitutionId = frontInstitutionId;
        this.coreInstitutionId = coreInstitutionId;
        this.reserve001 = reserve001;
        this.reserve002 = reserve002;
        this.reserve003 = reserve003;
        this.reserve004 = reserve004;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_institution
     *
     * @mbggenerated
     */
    public IInstitution() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.id
     *
     * @return the value of i_institution.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.id
     *
     * @param id the value for i_institution.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.front_institution_id
     *
     * @return the value of i_institution.front_institution_id
     *
     * @mbggenerated
     */
    public String getFrontInstitutionId() {
        return frontInstitutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.front_institution_id
     *
     * @param frontInstitutionId the value for i_institution.front_institution_id
     *
     * @mbggenerated
     */
    public void setFrontInstitutionId(String frontInstitutionId) {
        this.frontInstitutionId = frontInstitutionId == null ? null : frontInstitutionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.core_institution_id
     *
     * @return the value of i_institution.core_institution_id
     *
     * @mbggenerated
     */
    public String getCoreInstitutionId() {
        return coreInstitutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.core_institution_id
     *
     * @param coreInstitutionId the value for i_institution.core_institution_id
     *
     * @mbggenerated
     */
    public void setCoreInstitutionId(String coreInstitutionId) {
        this.coreInstitutionId = coreInstitutionId == null ? null : coreInstitutionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.reserve001
     *
     * @return the value of i_institution.reserve001
     *
     * @mbggenerated
     */
    public String getReserve001() {
        return reserve001;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.reserve001
     *
     * @param reserve001 the value for i_institution.reserve001
     *
     * @mbggenerated
     */
    public void setReserve001(String reserve001) {
        this.reserve001 = reserve001 == null ? null : reserve001.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.reserve002
     *
     * @return the value of i_institution.reserve002
     *
     * @mbggenerated
     */
    public String getReserve002() {
        return reserve002;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.reserve002
     *
     * @param reserve002 the value for i_institution.reserve002
     *
     * @mbggenerated
     */
    public void setReserve002(String reserve002) {
        this.reserve002 = reserve002 == null ? null : reserve002.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.reserve003
     *
     * @return the value of i_institution.reserve003
     *
     * @mbggenerated
     */
    public String getReserve003() {
        return reserve003;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.reserve003
     *
     * @param reserve003 the value for i_institution.reserve003
     *
     * @mbggenerated
     */
    public void setReserve003(String reserve003) {
        this.reserve003 = reserve003 == null ? null : reserve003.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_institution.reserve004
     *
     * @return the value of i_institution.reserve004
     *
     * @mbggenerated
     */
    public String getReserve004() {
        return reserve004;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_institution.reserve004
     *
     * @param reserve004 the value for i_institution.reserve004
     *
     * @mbggenerated
     */
    public void setReserve004(String reserve004) {
        this.reserve004 = reserve004 == null ? null : reserve004.trim();
    }
}