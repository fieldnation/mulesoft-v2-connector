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
 * WorkHistoryInnerResults
 */

public class WorkHistoryInnerResults {
  @SerializedName("type_of_work_id")
  private Integer typeOfWorkId = null;

  @SerializedName("type_of_work")
  private String typeOfWork = null;

  @SerializedName("jobs")
  private Integer jobs = null;

  @SerializedName("average_hourly_rate")
  private BigDecimal averageHourlyRate = null;

  public WorkHistoryInnerResults typeOfWorkId(Integer typeOfWorkId) {
    this.typeOfWorkId = typeOfWorkId;
    return this;
  }

   /**
   * Get typeOfWorkId
   * @return typeOfWorkId
  **/
  public Integer getTypeOfWorkId() {
    return typeOfWorkId;
  }

  public void setTypeOfWorkId(Integer typeOfWorkId) {
    this.typeOfWorkId = typeOfWorkId;
  }

  public WorkHistoryInnerResults typeOfWork(String typeOfWork) {
    this.typeOfWork = typeOfWork;
    return this;
  }

   /**
   * Get typeOfWork
   * @return typeOfWork
  **/
  public String getTypeOfWork() {
    return typeOfWork;
  }

  public void setTypeOfWork(String typeOfWork) {
    this.typeOfWork = typeOfWork;
  }

  public WorkHistoryInnerResults jobs(Integer jobs) {
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

  public WorkHistoryInnerResults averageHourlyRate(BigDecimal averageHourlyRate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkHistoryInnerResults workHistoryInnerResults = (WorkHistoryInnerResults) o;
    return Objects.equals(this.typeOfWorkId, workHistoryInnerResults.typeOfWorkId) &&
        Objects.equals(this.typeOfWork, workHistoryInnerResults.typeOfWork) &&
        Objects.equals(this.jobs, workHistoryInnerResults.jobs) &&
        Objects.equals(this.averageHourlyRate, workHistoryInnerResults.averageHourlyRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfWorkId, typeOfWork, jobs, averageHourlyRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkHistoryInnerResults {\n");
    
    sb.append("    typeOfWorkId: ").append(toIndentedString(typeOfWorkId)).append("\n");
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    averageHourlyRate: ").append(toIndentedString(averageHourlyRate)).append("\n");
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

