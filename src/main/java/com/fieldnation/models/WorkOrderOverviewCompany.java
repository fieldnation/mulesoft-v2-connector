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
 * WorkOrderOverviewCompany
 */

public class WorkOrderOverviewCompany {
  @SerializedName("average_duration")
  private Integer averageDuration = null;

  @SerializedName("jobs")
  private Integer jobs = null;

  @SerializedName("paid")
  private BigDecimal paid = null;

  @SerializedName("percent_counters")
  private BigDecimal percentCounters = null;

  @SerializedName("percent_expenses")
  private BigDecimal percentExpenses = null;

  @SerializedName("active_jobs")
  private Integer activeJobs = null;

  @SerializedName("cancelled_jobs")
  private Integer cancelledJobs = null;

  public WorkOrderOverviewCompany averageDuration(Integer averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

   /**
   * Get averageDuration
   * @return averageDuration
  **/

  public Integer getAverageDuration() {
    return averageDuration;
  }

  public void setAverageDuration(Integer averageDuration) {
    this.averageDuration = averageDuration;
  }

  public WorkOrderOverviewCompany jobs(Integer jobs) {
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

  public WorkOrderOverviewCompany paid(BigDecimal paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/

  public BigDecimal getPaid() {
    return paid;
  }

  public void setPaid(BigDecimal paid) {
    this.paid = paid;
  }

  public WorkOrderOverviewCompany percentCounters(BigDecimal percentCounters) {
    this.percentCounters = percentCounters;
    return this;
  }

   /**
   * Get percentCounters
   * @return percentCounters
  **/

  public BigDecimal getPercentCounters() {
    return percentCounters;
  }

  public void setPercentCounters(BigDecimal percentCounters) {
    this.percentCounters = percentCounters;
  }

  public WorkOrderOverviewCompany percentExpenses(BigDecimal percentExpenses) {
    this.percentExpenses = percentExpenses;
    return this;
  }

   /**
   * Get percentExpenses
   * @return percentExpenses
  **/

  public BigDecimal getPercentExpenses() {
    return percentExpenses;
  }

  public void setPercentExpenses(BigDecimal percentExpenses) {
    this.percentExpenses = percentExpenses;
  }

  public WorkOrderOverviewCompany activeJobs(Integer activeJobs) {
    this.activeJobs = activeJobs;
    return this;
  }

   /**
   * Get activeJobs
   * @return activeJobs
  **/

  public Integer getActiveJobs() {
    return activeJobs;
  }

  public void setActiveJobs(Integer activeJobs) {
    this.activeJobs = activeJobs;
  }

  public WorkOrderOverviewCompany cancelledJobs(Integer cancelledJobs) {
    this.cancelledJobs = cancelledJobs;
    return this;
  }

   /**
   * Get cancelledJobs
   * @return cancelledJobs
  **/

  public Integer getCancelledJobs() {
    return cancelledJobs;
  }

  public void setCancelledJobs(Integer cancelledJobs) {
    this.cancelledJobs = cancelledJobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderOverviewCompany workOrderOverviewCompany = (WorkOrderOverviewCompany) o;
    return Objects.equals(this.averageDuration, workOrderOverviewCompany.averageDuration) &&
        Objects.equals(this.jobs, workOrderOverviewCompany.jobs) &&
        Objects.equals(this.paid, workOrderOverviewCompany.paid) &&
        Objects.equals(this.percentCounters, workOrderOverviewCompany.percentCounters) &&
        Objects.equals(this.percentExpenses, workOrderOverviewCompany.percentExpenses) &&
        Objects.equals(this.activeJobs, workOrderOverviewCompany.activeJobs) &&
        Objects.equals(this.cancelledJobs, workOrderOverviewCompany.cancelledJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageDuration, jobs, paid, percentCounters, percentExpenses, activeJobs, cancelledJobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewCompany {\n");
    
    sb.append("    averageDuration: ").append(toIndentedString(averageDuration)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    percentCounters: ").append(toIndentedString(percentCounters)).append("\n");
    sb.append("    percentExpenses: ").append(toIndentedString(percentExpenses)).append("\n");
    sb.append("    activeJobs: ").append(toIndentedString(activeJobs)).append("\n");
    sb.append("    cancelledJobs: ").append(toIndentedString(cancelledJobs)).append("\n");
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

