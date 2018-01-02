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
import java.math.BigDecimal;

/**
 * MinimalPayIncreasesSum
 */

public class MinimalPayIncreasesSum {
  @SerializedName("all")
  private BigDecimal all = null;

  public MinimalPayIncreasesSum all(BigDecimal all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/

  public BigDecimal getAll() {
    return all;
  }

  public void setAll(BigDecimal all) {
    this.all = all;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimalPayIncreasesSum minimalPayIncreasesSum = (MinimalPayIncreasesSum) o;
    return Objects.equals(this.all, minimalPayIncreasesSum.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalPayIncreasesSum {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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

