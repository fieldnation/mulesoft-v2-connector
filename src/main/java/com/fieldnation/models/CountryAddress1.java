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
 * CountryAddress1
 */

public class CountryAddress1 {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("label")
  private String label = null;

  public CountryAddress1 required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/

  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CountryAddress1 label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryAddress1 countryAddress1 = (CountryAddress1) o;
    return Objects.equals(this.required, countryAddress1.required) &&
        Objects.equals(this.label, countryAddress1.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryAddress1 {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

