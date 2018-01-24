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
 * InlineResponse200
 */

public class InlineResponse200 {
  @SerializedName("percent")
  private BigDecimal percent = null;

  @SerializedName("waived")
  private BigDecimal waived = null;

  public InlineResponse200 percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

   /**
   * fee in percent
   * @return percent
  **/
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public InlineResponse200 waived(BigDecimal waived) {
    this.waived = waived;
    return this;
  }

   /**
   * waive in percent
   * @return waived
  **/
  public BigDecimal getWaived() {
    return waived;
  }

  public void setWaived(BigDecimal waived) {
    this.waived = waived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.percent, inlineResponse200.percent) &&
        Objects.equals(this.waived, inlineResponse200.waived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, waived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    waived: ").append(toIndentedString(waived)).append("\n");
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

