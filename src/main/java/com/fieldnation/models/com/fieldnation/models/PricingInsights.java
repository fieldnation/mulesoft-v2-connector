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
import com.fieldnation.models.PricingInsightsRegion;

/**
 * PricingInsights
 */

public class PricingInsights {
  @SerializedName("region")
  private PricingInsightsRegion region = null;

  public PricingInsights region(PricingInsightsRegion region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/

  public PricingInsightsRegion getRegion() {
    return region;
  }

  public void setRegion(PricingInsightsRegion region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingInsights pricingInsights = (PricingInsights) o;
    return Objects.equals(this.region, pricingInsights.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingInsights {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

