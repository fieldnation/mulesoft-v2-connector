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
 * GrafanaDashboardDataInner
 */

public class GrafanaDashboardDataInner {
  @SerializedName("work_order_mass_uploads_success")
  private BigDecimal workOrderMassUploadsSuccess = null;

  @SerializedName("work_order_mass_uploads_failures")
  private BigDecimal workOrderMassUploadsFailures = null;

  @SerializedName("todays_wo")
  private BigDecimal todaysWo = null;

  @SerializedName("published_today")
  private BigDecimal publishedToday = null;

  @SerializedName("available_today")
  private BigDecimal availableToday = null;

  @SerializedName("created_today")
  private BigDecimal createdToday = null;

  @SerializedName("counter_offers")
  private BigDecimal counterOffers = null;

  @SerializedName("requests_today")
  private BigDecimal requestsToday = null;

  @SerializedName("assigned_today")
  private BigDecimal assignedToday = null;

  @SerializedName("buyer_signups")
  private BigDecimal buyerSignups = null;

  @SerializedName("provider_signups")
  private BigDecimal providerSignups = null;

  public GrafanaDashboardDataInner workOrderMassUploadsSuccess(BigDecimal workOrderMassUploadsSuccess) {
    this.workOrderMassUploadsSuccess = workOrderMassUploadsSuccess;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Mass Upload Success
   * @return workOrderMassUploadsSuccess
  **/
  public BigDecimal getWorkOrderMassUploadsSuccess() {
    return workOrderMassUploadsSuccess;
  }

  public void setWorkOrderMassUploadsSuccess(BigDecimal workOrderMassUploadsSuccess) {
    this.workOrderMassUploadsSuccess = workOrderMassUploadsSuccess;
  }

  public GrafanaDashboardDataInner workOrderMassUploadsFailures(BigDecimal workOrderMassUploadsFailures) {
    this.workOrderMassUploadsFailures = workOrderMassUploadsFailures;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Mass Upload Failure
   * @return workOrderMassUploadsFailures
  **/
  public BigDecimal getWorkOrderMassUploadsFailures() {
    return workOrderMassUploadsFailures;
  }

  public void setWorkOrderMassUploadsFailures(BigDecimal workOrderMassUploadsFailures) {
    this.workOrderMassUploadsFailures = workOrderMassUploadsFailures;
  }

  public GrafanaDashboardDataInner todaysWo(BigDecimal todaysWo) {
    this.todaysWo = todaysWo;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Scheduled
   * @return todaysWo
  **/
  public BigDecimal getTodaysWo() {
    return todaysWo;
  }

  public void setTodaysWo(BigDecimal todaysWo) {
    this.todaysWo = todaysWo;
  }

  public GrafanaDashboardDataInner publishedToday(BigDecimal publishedToday) {
    this.publishedToday = publishedToday;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Published
   * @return publishedToday
  **/
  public BigDecimal getPublishedToday() {
    return publishedToday;
  }

  public void setPublishedToday(BigDecimal publishedToday) {
    this.publishedToday = publishedToday;
  }

  public GrafanaDashboardDataInner availableToday(BigDecimal availableToday) {
    this.availableToday = availableToday;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Available
   * @return availableToday
  **/
  public BigDecimal getAvailableToday() {
    return availableToday;
  }

  public void setAvailableToday(BigDecimal availableToday) {
    this.availableToday = availableToday;
  }

  public GrafanaDashboardDataInner createdToday(BigDecimal createdToday) {
    this.createdToday = createdToday;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Created
   * @return createdToday
  **/
  public BigDecimal getCreatedToday() {
    return createdToday;
  }

  public void setCreatedToday(BigDecimal createdToday) {
    this.createdToday = createdToday;
  }

  public GrafanaDashboardDataInner counterOffers(BigDecimal counterOffers) {
    this.counterOffers = counterOffers;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Counter Offered
   * @return counterOffers
  **/
  public BigDecimal getCounterOffers() {
    return counterOffers;
  }

  public void setCounterOffers(BigDecimal counterOffers) {
    this.counterOffers = counterOffers;
  }

  public GrafanaDashboardDataInner requestsToday(BigDecimal requestsToday) {
    this.requestsToday = requestsToday;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Requested
   * @return requestsToday
  **/
  public BigDecimal getRequestsToday() {
    return requestsToday;
  }

  public void setRequestsToday(BigDecimal requestsToday) {
    this.requestsToday = requestsToday;
  }

  public GrafanaDashboardDataInner assignedToday(BigDecimal assignedToday) {
    this.assignedToday = assignedToday;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Assigned
   * @return assignedToday
  **/
  public BigDecimal getAssignedToday() {
    return assignedToday;
  }

  public void setAssignedToday(BigDecimal assignedToday) {
    this.assignedToday = assignedToday;
  }

  public GrafanaDashboardDataInner buyerSignups(BigDecimal buyerSignups) {
    this.buyerSignups = buyerSignups;
    return this;
  }

   /**
   * Today&#39;s Buyer&#39;s Signup
   * @return buyerSignups
  **/
  public BigDecimal getBuyerSignups() {
    return buyerSignups;
  }

  public void setBuyerSignups(BigDecimal buyerSignups) {
    this.buyerSignups = buyerSignups;
  }

  public GrafanaDashboardDataInner providerSignups(BigDecimal providerSignups) {
    this.providerSignups = providerSignups;
    return this;
  }

   /**
   * Today&#39;s Provider&#39;s Signup
   * @return providerSignups
  **/
  public BigDecimal getProviderSignups() {
    return providerSignups;
  }

  public void setProviderSignups(BigDecimal providerSignups) {
    this.providerSignups = providerSignups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrafanaDashboardDataInner grafanaDashboardDataInner = (GrafanaDashboardDataInner) o;
    return Objects.equals(this.workOrderMassUploadsSuccess, grafanaDashboardDataInner.workOrderMassUploadsSuccess) &&
        Objects.equals(this.workOrderMassUploadsFailures, grafanaDashboardDataInner.workOrderMassUploadsFailures) &&
        Objects.equals(this.todaysWo, grafanaDashboardDataInner.todaysWo) &&
        Objects.equals(this.publishedToday, grafanaDashboardDataInner.publishedToday) &&
        Objects.equals(this.availableToday, grafanaDashboardDataInner.availableToday) &&
        Objects.equals(this.createdToday, grafanaDashboardDataInner.createdToday) &&
        Objects.equals(this.counterOffers, grafanaDashboardDataInner.counterOffers) &&
        Objects.equals(this.requestsToday, grafanaDashboardDataInner.requestsToday) &&
        Objects.equals(this.assignedToday, grafanaDashboardDataInner.assignedToday) &&
        Objects.equals(this.buyerSignups, grafanaDashboardDataInner.buyerSignups) &&
        Objects.equals(this.providerSignups, grafanaDashboardDataInner.providerSignups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderMassUploadsSuccess, workOrderMassUploadsFailures, todaysWo, publishedToday, availableToday, createdToday, counterOffers, requestsToday, assignedToday, buyerSignups, providerSignups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrafanaDashboardDataInner {\n");
    
    sb.append("    workOrderMassUploadsSuccess: ").append(toIndentedString(workOrderMassUploadsSuccess)).append("\n");
    sb.append("    workOrderMassUploadsFailures: ").append(toIndentedString(workOrderMassUploadsFailures)).append("\n");
    sb.append("    todaysWo: ").append(toIndentedString(todaysWo)).append("\n");
    sb.append("    publishedToday: ").append(toIndentedString(publishedToday)).append("\n");
    sb.append("    availableToday: ").append(toIndentedString(availableToday)).append("\n");
    sb.append("    createdToday: ").append(toIndentedString(createdToday)).append("\n");
    sb.append("    counterOffers: ").append(toIndentedString(counterOffers)).append("\n");
    sb.append("    requestsToday: ").append(toIndentedString(requestsToday)).append("\n");
    sb.append("    assignedToday: ").append(toIndentedString(assignedToday)).append("\n");
    sb.append("    buyerSignups: ").append(toIndentedString(buyerSignups)).append("\n");
    sb.append("    providerSignups: ").append(toIndentedString(providerSignups)).append("\n");
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

