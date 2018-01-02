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
 * WorkOrderOverviewTypeOfWorkMarketplace
 */

public class WorkOrderOverviewTypeOfWorkMarketplace {
  @SerializedName("average_hourly_rate")
  private BigDecimal averageHourlyRate = null;

  @SerializedName("average_duration")
  private BigDecimal averageDuration = null;

  public WorkOrderOverviewTypeOfWorkMarketplace averageHourlyRate(BigDecimal averageHourlyRate) {
    this.averageHourlyRate = averageHourlyRate;
    return this;
  }

   /**
   * Get averageHourlyRate
   * @return averageHourlyRate
  **/

  public BigDecimal getAverageHourlyRate() {
    return averageHourlyRate;
  }

  public void setAverageHourlyRate(BigDecimal averageHourlyRate) {
    this.averageHourlyRate = averageHourlyRate;
  }

  public WorkOrderOverviewTypeOfWorkMarketplace averageDuration(BigDecimal averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

   /**
   * Get averageDuration
   * @return averageDuration
  **/

  public BigDecimal getAverageDuration() {
    return averageDuration;
  }

  public void setAverageDuration(BigDecimal averageDuration) {
    this.averageDuration = averageDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderOverviewTypeOfWorkMarketplace workOrderOverviewTypeOfWorkMarketplace = (WorkOrderOverviewTypeOfWorkMarketplace) o;
    return Objects.equals(this.averageHourlyRate, workOrderOverviewTypeOfWorkMarketplace.averageHourlyRate) &&
        Objects.equals(this.averageDuration, workOrderOverviewTypeOfWorkMarketplace.averageDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageHourlyRate, averageDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewTypeOfWorkMarketplace {\n");
    
    sb.append("    averageHourlyRate: ").append(toIndentedString(averageHourlyRate)).append("\n");
    sb.append("    averageDuration: ").append(toIndentedString(averageDuration)).append("\n");
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

