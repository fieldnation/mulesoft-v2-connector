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
 * ProviderRatingsCategories
 */

public class ProviderRatingsCategories {
  @SerializedName("type")
  private String type = null;

  @SerializedName("percent")
  private Integer percent = null;

  public ProviderRatingsCategories type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProviderRatingsCategories percent(Integer percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/

  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderRatingsCategories providerRatingsCategories = (ProviderRatingsCategories) o;
    return Objects.equals(this.type, providerRatingsCategories.type) &&
        Objects.equals(this.percent, providerRatingsCategories.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderRatingsCategories {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

