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
 * WorkOrderRatingsBuyerOverallPercentApproval
 */

public class WorkOrderRatingsBuyerOverallPercentApproval {
  @SerializedName("days")
  private Integer days = null;

  @SerializedName("percent")
  private Integer percent = null;

  public WorkOrderRatingsBuyerOverallPercentApproval days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/

  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public WorkOrderRatingsBuyerOverallPercentApproval percent(Integer percent) {
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
    WorkOrderRatingsBuyerOverallPercentApproval workOrderRatingsBuyerOverallPercentApproval = (WorkOrderRatingsBuyerOverallPercentApproval) o;
    return Objects.equals(this.days, workOrderRatingsBuyerOverallPercentApproval.days) &&
        Objects.equals(this.percent, workOrderRatingsBuyerOverallPercentApproval.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsBuyerOverallPercentApproval {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

