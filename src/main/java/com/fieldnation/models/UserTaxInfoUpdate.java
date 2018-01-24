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

/**
 * Json User tax info object for updating
 */


public class UserTaxInfoUpdate {
  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("phone")
  private String phone = null;

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

  @SerializedName("has_separate_tax")
  private Integer hasSeparateTax = null;

  @SerializedName("technician_w9_status_id")
  private Integer technicianW9StatusId = null;

  @SerializedName("company_id")
  private Integer companyId = null;

  @SerializedName("from_vendor_buyer_invite")
  private Integer fromVendorBuyerInvite = null;

  @SerializedName("buyer_company_id")
  private Integer buyerCompanyId = null;

  @SerializedName("vendor_company_id")
  private Integer vendorCompanyId = null;

  public UserTaxInfoUpdate firstName(String firstName) {
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

  public UserTaxInfoUpdate lastName(String lastName) {
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

  public UserTaxInfoUpdate phone(String phone) {
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

  public UserTaxInfoUpdate name(String name) {
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

  public UserTaxInfoUpdate businessName(String businessName) {
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

  public UserTaxInfoUpdate entityType(String entityType) {
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

  public UserTaxInfoUpdate other(String other) {
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

  public UserTaxInfoUpdate address1(String address1) {
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

  public UserTaxInfoUpdate address2(String address2) {
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

  public UserTaxInfoUpdate city(String city) {
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

  public UserTaxInfoUpdate state(String state) {
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

  public UserTaxInfoUpdate zip(Integer zip) {
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

  public UserTaxInfoUpdate hasEin(Integer hasEin) {
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

  public UserTaxInfoUpdate tin(String tin) {
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

  public UserTaxInfoUpdate electronicConsent(Integer electronicConsent) {
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

  public UserTaxInfoUpdate hasSeparateTax(Integer hasSeparateTax) {
    this.hasSeparateTax = hasSeparateTax;
    return this;
  }

   /**
   * Get hasSeparateTax
   * @return hasSeparateTax
  **/

  public Integer getHasSeparateTax() {
    return hasSeparateTax;
  }

  public void setHasSeparateTax(Integer hasSeparateTax) {
    this.hasSeparateTax = hasSeparateTax;
  }

  public UserTaxInfoUpdate technicianW9StatusId(Integer technicianW9StatusId) {
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

  public UserTaxInfoUpdate companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/

  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public UserTaxInfoUpdate fromVendorBuyerInvite(Integer fromVendorBuyerInvite) {
    this.fromVendorBuyerInvite = fromVendorBuyerInvite;
    return this;
  }

   /**
   * Get fromVendorBuyerInvite
   * @return fromVendorBuyerInvite
  **/

  public Integer getFromVendorBuyerInvite() {
    return fromVendorBuyerInvite;
  }

  public void setFromVendorBuyerInvite(Integer fromVendorBuyerInvite) {
    this.fromVendorBuyerInvite = fromVendorBuyerInvite;
  }

  public UserTaxInfoUpdate buyerCompanyId(Integer buyerCompanyId) {
    this.buyerCompanyId = buyerCompanyId;
    return this;
  }

   /**
   * Get buyerCompanyId
   * @return buyerCompanyId
  **/

  public Integer getBuyerCompanyId() {
    return buyerCompanyId;
  }

  public void setBuyerCompanyId(Integer buyerCompanyId) {
    this.buyerCompanyId = buyerCompanyId;
  }

  public UserTaxInfoUpdate vendorCompanyId(Integer vendorCompanyId) {
    this.vendorCompanyId = vendorCompanyId;
    return this;
  }

   /**
   * Get vendorCompanyId
   * @return vendorCompanyId
  **/

  public Integer getVendorCompanyId() {
    return vendorCompanyId;
  }

  public void setVendorCompanyId(Integer vendorCompanyId) {
    this.vendorCompanyId = vendorCompanyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaxInfoUpdate userTaxInfoUpdate = (UserTaxInfoUpdate) o;
    return Objects.equals(this.firstName, userTaxInfoUpdate.firstName) &&
        Objects.equals(this.lastName, userTaxInfoUpdate.lastName) &&
        Objects.equals(this.phone, userTaxInfoUpdate.phone) &&
        Objects.equals(this.name, userTaxInfoUpdate.name) &&
        Objects.equals(this.businessName, userTaxInfoUpdate.businessName) &&
        Objects.equals(this.entityType, userTaxInfoUpdate.entityType) &&
        Objects.equals(this.other, userTaxInfoUpdate.other) &&
        Objects.equals(this.address1, userTaxInfoUpdate.address1) &&
        Objects.equals(this.address2, userTaxInfoUpdate.address2) &&
        Objects.equals(this.city, userTaxInfoUpdate.city) &&
        Objects.equals(this.state, userTaxInfoUpdate.state) &&
        Objects.equals(this.zip, userTaxInfoUpdate.zip) &&
        Objects.equals(this.hasEin, userTaxInfoUpdate.hasEin) &&
        Objects.equals(this.tin, userTaxInfoUpdate.tin) &&
        Objects.equals(this.electronicConsent, userTaxInfoUpdate.electronicConsent) &&
        Objects.equals(this.hasSeparateTax, userTaxInfoUpdate.hasSeparateTax) &&
        Objects.equals(this.technicianW9StatusId, userTaxInfoUpdate.technicianW9StatusId) &&
        Objects.equals(this.companyId, userTaxInfoUpdate.companyId) &&
        Objects.equals(this.fromVendorBuyerInvite, userTaxInfoUpdate.fromVendorBuyerInvite) &&
        Objects.equals(this.buyerCompanyId, userTaxInfoUpdate.buyerCompanyId) &&
        Objects.equals(this.vendorCompanyId, userTaxInfoUpdate.vendorCompanyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, name, businessName, entityType, other, address1, address2, city, state, zip, hasEin, tin, electronicConsent, hasSeparateTax, technicianW9StatusId, companyId, fromVendorBuyerInvite, buyerCompanyId, vendorCompanyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaxInfoUpdate {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    sb.append("    hasSeparateTax: ").append(toIndentedString(hasSeparateTax)).append("\n");
    sb.append("    technicianW9StatusId: ").append(toIndentedString(technicianW9StatusId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    fromVendorBuyerInvite: ").append(toIndentedString(fromVendorBuyerInvite)).append("\n");
    sb.append("    buyerCompanyId: ").append(toIndentedString(buyerCompanyId)).append("\n");
    sb.append("    vendorCompanyId: ").append(toIndentedString(vendorCompanyId)).append("\n");
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

