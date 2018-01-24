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
 * PricingInsightsRegionAverageRate
 */

public class PricingInsightsRegionAverageRate {
  @SerializedName("first_quartile")
  private BigDecimal firstQuartile = null;

  @SerializedName("median")
  private BigDecimal median = null;

  @SerializedName("third_quartile")
  private BigDecimal thirdQuartile = null;

  public PricingInsightsRegionAverageRate firstQuartile(BigDecimal firstQuartile) {
    this.firstQuartile = firstQuartile;
    return this;
  }

   /**
   * Get firstQuartile
   * @return firstQuartile
  **/

  public BigDecimal getFirstQuartile() {
    return firstQuartile;
  }

  public void setFirstQuartile(BigDecimal firstQuartile) {
    this.firstQuartile = firstQuartile;
  }

  public PricingInsightsRegionAverageRate median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * Get median
   * @return median
  **/

  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public PricingInsightsRegionAverageRate thirdQuartile(BigDecimal thirdQuartile) {
    this.thirdQuartile = thirdQuartile;
    return this;
  }

   /**
   * Get thirdQuartile
   * @return thirdQuartile
  **/

  public BigDecimal getThirdQuartile() {
    return thirdQuartile;
  }

  public void setThirdQuartile(BigDecimal thirdQuartile) {
    this.thirdQuartile = thirdQuartile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingInsightsRegionAverageRate pricingInsightsRegionAverageRate = (PricingInsightsRegionAverageRate) o;
    return Objects.equals(this.firstQuartile, pricingInsightsRegionAverageRate.firstQuartile) &&
        Objects.equals(this.median, pricingInsightsRegionAverageRate.median) &&
        Objects.equals(this.thirdQuartile, pricingInsightsRegionAverageRate.thirdQuartile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstQuartile, median, thirdQuartile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingInsightsRegionAverageRate {\n");
    
    sb.append("    firstQuartile: ").append(toIndentedString(firstQuartile)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    thirdQuartile: ").append(toIndentedString(thirdQuartile)).append("\n");
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

