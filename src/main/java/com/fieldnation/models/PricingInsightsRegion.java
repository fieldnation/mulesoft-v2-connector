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


import com.fieldnation.models.PricingInsightsRegionAverageRate;
import com.fieldnation.models.PricingInsightsRegionProviders;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PricingInsightsRegion
 */

public class PricingInsightsRegion {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("providers")
  private PricingInsightsRegionProviders providers = null;

  @SerializedName("average_rate")
  private PricingInsightsRegionAverageRate averageRate = null;

  public PricingInsightsRegion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PricingInsightsRegion id(Integer id) {
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

  public PricingInsightsRegion distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/

  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public PricingInsightsRegion providers(PricingInsightsRegionProviders providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/

  public PricingInsightsRegionProviders getProviders() {
    return providers;
  }

  public void setProviders(PricingInsightsRegionProviders providers) {
    this.providers = providers;
  }

  public PricingInsightsRegion averageRate(PricingInsightsRegionAverageRate averageRate) {
    this.averageRate = averageRate;
    return this;
  }

   /**
   * Get averageRate
   * @return averageRate
  **/

  public PricingInsightsRegionAverageRate getAverageRate() {
    return averageRate;
  }

  public void setAverageRate(PricingInsightsRegionAverageRate averageRate) {
    this.averageRate = averageRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingInsightsRegion pricingInsightsRegion = (PricingInsightsRegion) o;
    return Objects.equals(this.name, pricingInsightsRegion.name) &&
        Objects.equals(this.id, pricingInsightsRegion.id) &&
        Objects.equals(this.distance, pricingInsightsRegion.distance) &&
        Objects.equals(this.providers, pricingInsightsRegion.providers) &&
        Objects.equals(this.averageRate, pricingInsightsRegion.averageRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, distance, providers, averageRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingInsightsRegion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    averageRate: ").append(toIndentedString(averageRate)).append("\n");
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

