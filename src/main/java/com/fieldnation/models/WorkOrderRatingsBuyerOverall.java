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


import com.fieldnation.models.WorkOrderRatingsBuyerOverallPercentApproval;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderRatingsBuyerOverall
 */

public class WorkOrderRatingsBuyerOverall {
  @SerializedName("ratings")
  private Integer ratings = null;

  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("jobs")
  private Integer jobs = null;

  @SerializedName("percent_clear_expectations")
  private Integer percentClearExpectations = null;

  @SerializedName("percent_respectful")
  private Integer percentRespectful = null;

  @SerializedName("approval_days")
  private Integer approvalDays = null;

  @SerializedName("approval_period")
  private Integer approvalPeriod = null;

  @SerializedName("percent_approval")
  private List<WorkOrderRatingsBuyerOverallPercentApproval> percentApproval = null;

  public WorkOrderRatingsBuyerOverall ratings(Integer ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/

  public Integer getRatings() {
    return ratings;
  }

  public void setRatings(Integer ratings) {
    this.ratings = ratings;
  }

  public WorkOrderRatingsBuyerOverall stars(BigDecimal stars) {
    this.stars = stars;
    return this;
  }

   /**
   * Get stars
   * @return stars
  **/

  public BigDecimal getStars() {
    return stars;
  }

  public void setStars(BigDecimal stars) {
    this.stars = stars;
  }

  public WorkOrderRatingsBuyerOverall jobs(Integer jobs) {
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

  public WorkOrderRatingsBuyerOverall percentClearExpectations(Integer percentClearExpectations) {
    this.percentClearExpectations = percentClearExpectations;
    return this;
  }

   /**
   * Get percentClearExpectations
   * @return percentClearExpectations
  **/

  public Integer getPercentClearExpectations() {
    return percentClearExpectations;
  }

  public void setPercentClearExpectations(Integer percentClearExpectations) {
    this.percentClearExpectations = percentClearExpectations;
  }

  public WorkOrderRatingsBuyerOverall percentRespectful(Integer percentRespectful) {
    this.percentRespectful = percentRespectful;
    return this;
  }

   /**
   * Get percentRespectful
   * @return percentRespectful
  **/

  public Integer getPercentRespectful() {
    return percentRespectful;
  }

  public void setPercentRespectful(Integer percentRespectful) {
    this.percentRespectful = percentRespectful;
  }

  public WorkOrderRatingsBuyerOverall approvalDays(Integer approvalDays) {
    this.approvalDays = approvalDays;
    return this;
  }

   /**
   * Get approvalDays
   * @return approvalDays
  **/

  public Integer getApprovalDays() {
    return approvalDays;
  }

  public void setApprovalDays(Integer approvalDays) {
    this.approvalDays = approvalDays;
  }

  public WorkOrderRatingsBuyerOverall approvalPeriod(Integer approvalPeriod) {
    this.approvalPeriod = approvalPeriod;
    return this;
  }

   /**
   * Get approvalPeriod
   * @return approvalPeriod
  **/

  public Integer getApprovalPeriod() {
    return approvalPeriod;
  }

  public void setApprovalPeriod(Integer approvalPeriod) {
    this.approvalPeriod = approvalPeriod;
  }

  public WorkOrderRatingsBuyerOverall percentApproval(List<WorkOrderRatingsBuyerOverallPercentApproval> percentApproval) {
    this.percentApproval = percentApproval;
    return this;
  }

  public WorkOrderRatingsBuyerOverall addPercentApprovalItem(WorkOrderRatingsBuyerOverallPercentApproval percentApprovalItem) {
    if (this.percentApproval == null) {
      this.percentApproval = new ArrayList<WorkOrderRatingsBuyerOverallPercentApproval>();
    }
    this.percentApproval.add(percentApprovalItem);
    return this;
  }

   /**
   * Get percentApproval
   * @return percentApproval
  **/

  public List<WorkOrderRatingsBuyerOverallPercentApproval> getPercentApproval() {
    return percentApproval;
  }

  public void setPercentApproval(List<WorkOrderRatingsBuyerOverallPercentApproval> percentApproval) {
    this.percentApproval = percentApproval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsBuyerOverall workOrderRatingsBuyerOverall = (WorkOrderRatingsBuyerOverall) o;
    return Objects.equals(this.ratings, workOrderRatingsBuyerOverall.ratings) &&
        Objects.equals(this.stars, workOrderRatingsBuyerOverall.stars) &&
        Objects.equals(this.jobs, workOrderRatingsBuyerOverall.jobs) &&
        Objects.equals(this.percentClearExpectations, workOrderRatingsBuyerOverall.percentClearExpectations) &&
        Objects.equals(this.percentRespectful, workOrderRatingsBuyerOverall.percentRespectful) &&
        Objects.equals(this.approvalDays, workOrderRatingsBuyerOverall.approvalDays) &&
        Objects.equals(this.approvalPeriod, workOrderRatingsBuyerOverall.approvalPeriod) &&
        Objects.equals(this.percentApproval, workOrderRatingsBuyerOverall.percentApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, stars, jobs, percentClearExpectations, percentRespectful, approvalDays, approvalPeriod, percentApproval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsBuyerOverall {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    percentClearExpectations: ").append(toIndentedString(percentClearExpectations)).append("\n");
    sb.append("    percentRespectful: ").append(toIndentedString(percentRespectful)).append("\n");
    sb.append("    approvalDays: ").append(toIndentedString(approvalDays)).append("\n");
    sb.append("    approvalPeriod: ").append(toIndentedString(approvalPeriod)).append("\n");
    sb.append("    percentApproval: ").append(toIndentedString(percentApproval)).append("\n");
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

