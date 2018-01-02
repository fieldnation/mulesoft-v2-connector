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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Insurance
 */

public class Insurance {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("insurance_company")
  private String insuranceCompany = null;

  @SerializedName("effective")
  private java.util.Date effective = null;

  @SerializedName("expires")
  private java.util.Date expires = null;

  @SerializedName("coverage_amount")
  private Integer coverageAmount = null;

  @SerializedName("policy_number")
  private String policyNumber = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("type_name")
  private String typeName = null;

  @SerializedName("policy_url")
  private String policyUrl = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    DELETE("delete");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  public Insurance id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Insurance status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Insurance insuranceCompany(String insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
    return this;
  }

   /**
   * Get insuranceCompany
   * @return insuranceCompany
  **/

  public String getInsuranceCompany() {
    return insuranceCompany;
  }

  public void setInsuranceCompany(String insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
  }

  public Insurance effective(java.util.Date effective) {
    this.effective = effective;
    return this;
  }

   /**
   * Get effective
   * @return effective
  **/

  public java.util.Date getEffective() {
    return effective;
  }

  public void setEffective(java.util.Date effective) {
    this.effective = effective;
  }

  public Insurance expires(java.util.Date expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/

  public java.util.Date getExpires() {
    return expires;
  }

  public void setExpires(java.util.Date expires) {
    this.expires = expires;
  }

  public Insurance coverageAmount(Integer coverageAmount) {
    this.coverageAmount = coverageAmount;
    return this;
  }

   /**
   * Get coverageAmount
   * @return coverageAmount
  **/

  public Integer getCoverageAmount() {
    return coverageAmount;
  }

  public void setCoverageAmount(Integer coverageAmount) {
    this.coverageAmount = coverageAmount;
  }

  public Insurance policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

   /**
   * Get policyNumber
   * @return policyNumber
  **/

  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public Insurance typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Insurance typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Insurance policyUrl(String policyUrl) {
    this.policyUrl = policyUrl;
    return this;
  }

   /**
   * Get policyUrl
   * @return policyUrl
  **/

  public String getPolicyUrl() {
    return policyUrl;
  }

  public void setPolicyUrl(String policyUrl) {
    this.policyUrl = policyUrl;
  }

  public Insurance actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Insurance addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insurance insurance = (Insurance) o;
    return Objects.equals(this.id, insurance.id) &&
        Objects.equals(this.status, insurance.status) &&
        Objects.equals(this.insuranceCompany, insurance.insuranceCompany) &&
        Objects.equals(this.effective, insurance.effective) &&
        Objects.equals(this.expires, insurance.expires) &&
        Objects.equals(this.coverageAmount, insurance.coverageAmount) &&
        Objects.equals(this.policyNumber, insurance.policyNumber) &&
        Objects.equals(this.typeId, insurance.typeId) &&
        Objects.equals(this.typeName, insurance.typeName) &&
        Objects.equals(this.policyUrl, insurance.policyUrl) &&
        Objects.equals(this.actions, insurance.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, insuranceCompany, effective, expires, coverageAmount, policyNumber, typeId, typeName, policyUrl, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    insuranceCompany: ").append(toIndentedString(insuranceCompany)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    coverageAmount: ").append(toIndentedString(coverageAmount)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    policyUrl: ").append(toIndentedString(policyUrl)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

