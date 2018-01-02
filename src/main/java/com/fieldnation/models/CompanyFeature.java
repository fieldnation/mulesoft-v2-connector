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

/**
 * CompanyFeature
 */

public class CompanyFeature {
  @SerializedName("company_features_id")
  private Integer companyFeaturesId = null;

  @SerializedName("company_id")
  private Integer companyId = null;

  @SerializedName("feature_id")
  private Integer featureId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    REQUESTED("requested"),
    
    DENIED("denied");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public CompanyFeature companyFeaturesId(Integer companyFeaturesId) {
    this.companyFeaturesId = companyFeaturesId;
    return this;
  }

   /**
   * Get companyFeaturesId
   * @return companyFeaturesId
  **/

  public Integer getCompanyFeaturesId() {
    return companyFeaturesId;
  }

  public void setCompanyFeaturesId(Integer companyFeaturesId) {
    this.companyFeaturesId = companyFeaturesId;
  }

  public CompanyFeature companyId(Integer companyId) {
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

  public CompanyFeature featureId(Integer featureId) {
    this.featureId = featureId;
    return this;
  }

   /**
   * Get featureId
   * @return featureId
  **/

  public Integer getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Integer featureId) {
    this.featureId = featureId;
  }

  public CompanyFeature status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyFeature companyFeature = (CompanyFeature) o;
    return Objects.equals(this.companyFeaturesId, companyFeature.companyFeaturesId) &&
        Objects.equals(this.companyId, companyFeature.companyId) &&
        Objects.equals(this.featureId, companyFeature.featureId) &&
        Objects.equals(this.status, companyFeature.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyFeaturesId, companyId, featureId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFeature {\n");
    
    sb.append("    companyFeaturesId: ").append(toIndentedString(companyFeaturesId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

