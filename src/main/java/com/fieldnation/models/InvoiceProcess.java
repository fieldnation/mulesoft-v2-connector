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


import com.fieldnation.models.InvoiceProcessScheduledDate;
import com.fieldnation.models.InvoiceProcessStatus;
import java.io.IOException;

/**
 * InvoiceProcess
 */

public class InvoiceProcess {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("scheduled_date")
  private InvoiceProcessScheduledDate scheduledDate = null;

  @SerializedName("status")
  private InvoiceProcessStatus status = null;

  @SerializedName("information")
  private String information = null;

  @SerializedName("tracking_progress_id")
  private Integer trackingProgressId = null;

  public InvoiceProcess id(Integer id) {
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

  public InvoiceProcess scheduledDate(InvoiceProcessScheduledDate scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * Get scheduledDate
   * @return scheduledDate
  **/

  public InvoiceProcessScheduledDate getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(InvoiceProcessScheduledDate scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public InvoiceProcess status(InvoiceProcessStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public InvoiceProcessStatus getStatus() {
    return status;
  }

  public void setStatus(InvoiceProcessStatus status) {
    this.status = status;
  }

  public InvoiceProcess information(String information) {
    this.information = information;
    return this;
  }

   /**
   * Get information
   * @return information
  **/

  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }

  public InvoiceProcess trackingProgressId(Integer trackingProgressId) {
    this.trackingProgressId = trackingProgressId;
    return this;
  }

   /**
   * Get trackingProgressId
   * @return trackingProgressId
  **/

  public Integer getTrackingProgressId() {
    return trackingProgressId;
  }

  public void setTrackingProgressId(Integer trackingProgressId) {
    this.trackingProgressId = trackingProgressId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceProcess invoiceProcess = (InvoiceProcess) o;
    return Objects.equals(this.id, invoiceProcess.id) &&
        Objects.equals(this.scheduledDate, invoiceProcess.scheduledDate) &&
        Objects.equals(this.status, invoiceProcess.status) &&
        Objects.equals(this.information, invoiceProcess.information) &&
        Objects.equals(this.trackingProgressId, invoiceProcess.trackingProgressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduledDate, status, information, trackingProgressId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    trackingProgressId: ").append(toIndentedString(trackingProgressId)).append("\n");
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

