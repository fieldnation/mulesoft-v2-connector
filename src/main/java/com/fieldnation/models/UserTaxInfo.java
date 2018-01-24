/*
 * Field Nation V2 API
 *
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 *
 *
 * Do not edit the class manually.
 */


package com.fieldnation.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.fieldnation.models.TechnicianW9Status;
import java.util.ArrayList;
import java.util.List;

/**
 * UserTaxInfo
 */

public class UserTaxInfo {
  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("tech_w9_id")
  private Integer techW9Id = null;

  @SerializedName("tech_user_id")
  private Integer techUserId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("business_name")
  private String businessName = null;

  @SerializedName("entity_type")
  private String entityType = null;

  @SerializedName("other")
  private String other = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private Integer zip = null;

  @SerializedName("has_ein")
  private Integer hasEin = null;

  @SerializedName("tin")
  private String tin = null;

  @SerializedName("electronic_consent")
  private Integer electronicConsent = null;

  @SerializedName("files_separate_business_taxes")
  private Integer filesSeparateBusinessTaxes = null;

  @SerializedName("technician_w9_status_id")
  private Integer technicianW9StatusId = null;

  @SerializedName("technician_w9_status")
  private List<TechnicianW9Status> technicianW9Status = null;

  public UserTaxInfo userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UserTaxInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserTaxInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserTaxInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserTaxInfo techW9Id(Integer techW9Id) {
    this.techW9Id = techW9Id;
    return this;
  }

   /**
   * Get techW9Id
   * @return techW9Id
  **/

  public Integer getTechW9Id() {
    return techW9Id;
  }

  public void setTechW9Id(Integer techW9Id) {
    this.techW9Id = techW9Id;
  }

  public UserTaxInfo techUserId(Integer techUserId) {
    this.techUserId = techUserId;
    return this;
  }

   /**
   * Get techUserId
   * @return techUserId
  **/

  public Integer getTechUserId() {
    return techUserId;
  }

  public void setTechUserId(Integer techUserId) {
    this.techUserId = techUserId;
  }

  public UserTaxInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTaxInfo businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public UserTaxInfo entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public UserTaxInfo other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/

  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public UserTaxInfo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public UserTaxInfo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public UserTaxInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserTaxInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UserTaxInfo zip(Integer zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/

  public Integer getZip() {
    return zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }

  public UserTaxInfo hasEin(Integer hasEin) {
    this.hasEin = hasEin;
    return this;
  }

   /**
   * Get hasEin
   * @return hasEin
  **/

  public Integer getHasEin() {
    return hasEin;
  }

  public void setHasEin(Integer hasEin) {
    this.hasEin = hasEin;
  }

  public UserTaxInfo tin(String tin) {
    this.tin = tin;
    return this;
  }

   /**
   * Get tin
   * @return tin
  **/

  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }

  public UserTaxInfo electronicConsent(Integer electronicConsent) {
    this.electronicConsent = electronicConsent;
    return this;
  }

   /**
   * Get electronicConsent
   * @return electronicConsent
  **/

  public Integer getElectronicConsent() {
    return electronicConsent;
  }

  public void setElectronicConsent(Integer electronicConsent) {
    this.electronicConsent = electronicConsent;
  }

  public UserTaxInfo filesSeparateBusinessTaxes(Integer filesSeparateBusinessTaxes) {
    this.filesSeparateBusinessTaxes = filesSeparateBusinessTaxes;
    return this;
  }

   /**
   * Get filesSeparateBusinessTaxes
   * @return filesSeparateBusinessTaxes
  **/

  public Integer getFilesSeparateBusinessTaxes() {
    return filesSeparateBusinessTaxes;
  }

  public void setFilesSeparateBusinessTaxes(Integer filesSeparateBusinessTaxes) {
    this.filesSeparateBusinessTaxes = filesSeparateBusinessTaxes;
  }

  public UserTaxInfo technicianW9StatusId(Integer technicianW9StatusId) {
    this.technicianW9StatusId = technicianW9StatusId;
    return this;
  }

   /**
   * Get technicianW9StatusId
   * @return technicianW9StatusId
  **/

  public Integer getTechnicianW9StatusId() {
    return technicianW9StatusId;
  }

  public void setTechnicianW9StatusId(Integer technicianW9StatusId) {
    this.technicianW9StatusId = technicianW9StatusId;
  }

  public UserTaxInfo technicianW9Status(List<TechnicianW9Status> technicianW9Status) {
    this.technicianW9Status = technicianW9Status;
    return this;
  }

  public UserTaxInfo addTechnicianW9StatusItem(TechnicianW9Status technicianW9StatusItem) {
    if (this.technicianW9Status == null) {
      this.technicianW9Status = new ArrayList<TechnicianW9Status>();
    }
    this.technicianW9Status.add(technicianW9StatusItem);
    return this;
  }

   /**
   * Get technicianW9Status
   * @return technicianW9Status
  **/

  public List<TechnicianW9Status> getTechnicianW9Status() {
    return technicianW9Status;
  }

  public void setTechnicianW9Status(List<TechnicianW9Status> technicianW9Status) {
    this.technicianW9Status = technicianW9Status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaxInfo userTaxInfo = (UserTaxInfo) o;
    return Objects.equals(this.userId, userTaxInfo.userId) &&
        Objects.equals(this.firstName, userTaxInfo.firstName) &&
        Objects.equals(this.lastName, userTaxInfo.lastName) &&
        Objects.equals(this.phone, userTaxInfo.phone) &&
        Objects.equals(this.techW9Id, userTaxInfo.techW9Id) &&
        Objects.equals(this.techUserId, userTaxInfo.techUserId) &&
        Objects.equals(this.name, userTaxInfo.name) &&
        Objects.equals(this.businessName, userTaxInfo.businessName) &&
        Objects.equals(this.entityType, userTaxInfo.entityType) &&
        Objects.equals(this.other, userTaxInfo.other) &&
        Objects.equals(this.address1, userTaxInfo.address1) &&
        Objects.equals(this.address2, userTaxInfo.address2) &&
        Objects.equals(this.city, userTaxInfo.city) &&
        Objects.equals(this.state, userTaxInfo.state) &&
        Objects.equals(this.zip, userTaxInfo.zip) &&
        Objects.equals(this.hasEin, userTaxInfo.hasEin) &&
        Objects.equals(this.tin, userTaxInfo.tin) &&
        Objects.equals(this.electronicConsent, userTaxInfo.electronicConsent) &&
        Objects.equals(this.filesSeparateBusinessTaxes, userTaxInfo.filesSeparateBusinessTaxes) &&
        Objects.equals(this.technicianW9StatusId, userTaxInfo.technicianW9StatusId) &&
        Objects.equals(this.technicianW9Status, userTaxInfo.technicianW9Status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, phone, techW9Id, techUserId, name, businessName, entityType, other, address1, address2, city, state, zip, hasEin, tin, electronicConsent, filesSeparateBusinessTaxes, technicianW9StatusId, technicianW9Status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaxInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    techW9Id: ").append(toIndentedString(techW9Id)).append("\n");
    sb.append("    techUserId: ").append(toIndentedString(techUserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    hasEin: ").append(toIndentedString(hasEin)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    electronicConsent: ").append(toIndentedString(electronicConsent)).append("\n");
    sb.append("    filesSeparateBusinessTaxes: ").append(toIndentedString(filesSeparateBusinessTaxes)).append("\n");
    sb.append("    technicianW9StatusId: ").append(toIndentedString(technicianW9StatusId)).append("\n");
    sb.append("    technicianW9Status: ").append(toIndentedString(technicianW9Status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

