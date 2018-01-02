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
 * WorkOrderOverviewTypeOfWorkCompany
 */

public class WorkOrderOverviewTypeOfWorkCompany {
  @SerializedName("jobs")
  private Integer jobs = null;

  @SerializedName("average_hourly_rate")
  private BigDecimal averageHourlyRate = null;

  @SerializedName("average_duration")
  private BigDecimal averageDuration = null;

  public WorkOrderOverviewTypeOfWorkCompany jobs(Integer jobs) {
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/

  public Integer getJobs() {
    return jobs;
  }

  public void setJobs(Integer jobs) {
    this.jobs = jobs;
  }

  public WorkOrderOverviewTypeOfWorkCompany averageHourlyRate(BigDecimal averageHourlyRate) {
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

  public WorkOrderOverviewTypeOfWorkCompany averageDuration(BigDecimal averageDuration) {
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
    WorkOrderOverviewTypeOfWorkCompany workOrderOverviewTypeOfWorkCompany = (WorkOrderOverviewTypeOfWorkCompany) o;
    return Objects.equals(this.jobs, workOrderOverviewTypeOfWorkCompany.jobs) &&
        Objects.equals(this.averageHourlyRate, workOrderOverviewTypeOfWorkCompany.averageHourlyRate) &&
        Objects.equals(this.averageDuration, workOrderOverviewTypeOfWorkCompany.averageDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, averageHourlyRate, averageDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewTypeOfWorkCompany {\n");
    
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

