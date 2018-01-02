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


import com.fieldnation.models.Local;
import com.fieldnation.models.TimeZone;
import java.io.IOException;

/**
 * InvoiceProcessScheduledDate
 */

public class InvoiceProcessScheduledDate {
  @SerializedName("local")
  private Local local = null;

  @SerializedName("utc")
  private String utc = null;

  @SerializedName("full_date_time")
  private String fullDateTime = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("actions")
  private String actions = null;

  public InvoiceProcessScheduledDate local(Local local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/

  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public InvoiceProcessScheduledDate utc(String utc) {
    this.utc = utc;
    return this;
  }

   /**
   * Get utc
   * @return utc
  **/

  public String getUtc() {
    return utc;
  }

  public void setUtc(String utc) {
    this.utc = utc;
  }

  public InvoiceProcessScheduledDate fullDateTime(String fullDateTime) {
    this.fullDateTime = fullDateTime;
    return this;
  }

   /**
   * Get fullDateTime
   * @return fullDateTime
  **/

  public String getFullDateTime() {
    return fullDateTime;
  }

  public void setFullDateTime(String fullDateTime) {
    this.fullDateTime = fullDateTime;
  }

  public InvoiceProcessScheduledDate timeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/

  public TimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public InvoiceProcessScheduledDate actions(String actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public String getActions() {
    return actions;
  }

  public void setActions(String actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceProcessScheduledDate invoiceProcessScheduledDate = (InvoiceProcessScheduledDate) o;
    return Objects.equals(this.local, invoiceProcessScheduledDate.local) &&
        Objects.equals(this.utc, invoiceProcessScheduledDate.utc) &&
        Objects.equals(this.fullDateTime, invoiceProcessScheduledDate.fullDateTime) &&
        Objects.equals(this.timeZone, invoiceProcessScheduledDate.timeZone) &&
        Objects.equals(this.actions, invoiceProcessScheduledDate.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local, utc, fullDateTime, timeZone, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceProcessScheduledDate {\n");
    
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    utc: ").append(toIndentedString(utc)).append("\n");
    sb.append("    fullDateTime: ").append(toIndentedString(fullDateTime)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

