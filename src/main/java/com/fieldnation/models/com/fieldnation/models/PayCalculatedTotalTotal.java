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
import java.math.BigDecimal;

/**
 * PayCalculatedTotalTotal
 */

public class PayCalculatedTotalTotal {
  @SerializedName("min")
  private BigDecimal min = null;

  @SerializedName("max")
  private BigDecimal max = null;

  public PayCalculatedTotalTotal min(BigDecimal min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/

  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public PayCalculatedTotalTotal max(BigDecimal max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/

  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayCalculatedTotalTotal payCalculatedTotalTotal = (PayCalculatedTotalTotal) o;
    return Objects.equals(this.min, payCalculatedTotalTotal.min) &&
        Objects.equals(this.max, payCalculatedTotalTotal.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayCalculatedTotalTotal {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

