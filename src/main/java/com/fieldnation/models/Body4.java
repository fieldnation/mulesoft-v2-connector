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
 * JSON Model
 */


public class Body4 {
  @SerializedName("preference_value")
  private Integer preferenceValue = null;

  public Body4 preferenceValue(Integer preferenceValue) {
    this.preferenceValue = preferenceValue;
    return this;
  }

   /**
   * Get preferenceValue
   * @return preferenceValue
  **/

  public Integer getPreferenceValue() {
    return preferenceValue;
  }

  public void setPreferenceValue(Integer preferenceValue) {
    this.preferenceValue = preferenceValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body4 body4 = (Body4) o;
    return Objects.equals(this.preferenceValue, body4.preferenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferenceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    preferenceValue: ").append(toIndentedString(preferenceValue)).append("\n");
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

