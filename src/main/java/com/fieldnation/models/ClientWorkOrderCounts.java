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
 * ClientWorkOrderCounts
 */

public class ClientWorkOrderCounts {
  @SerializedName("all")
  private Integer all = null;

  @SerializedName("today")
  private Integer today = null;

  @SerializedName("published_routed")
  private Integer publishedRouted = null;

  @SerializedName("assigned")
  private Integer assigned = null;

  @SerializedName("approved_paid")
  private Integer approvedPaid = null;

  @SerializedName("draft")
  private Integer draft = null;

  @SerializedName("work_done")
  private Integer workDone = null;

  public ClientWorkOrderCounts all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/

  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public ClientWorkOrderCounts today(Integer today) {
    this.today = today;
    return this;
  }

   /**
   * Get today
   * @return today
  **/

  public Integer getToday() {
    return today;
  }

  public void setToday(Integer today) {
    this.today = today;
  }

  public ClientWorkOrderCounts publishedRouted(Integer publishedRouted) {
    this.publishedRouted = publishedRouted;
    return this;
  }

   /**
   * Get publishedRouted
   * @return publishedRouted
  **/

  public Integer getPublishedRouted() {
    return publishedRouted;
  }

  public void setPublishedRouted(Integer publishedRouted) {
    this.publishedRouted = publishedRouted;
  }

  public ClientWorkOrderCounts assigned(Integer assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/

  public Integer getAssigned() {
    return assigned;
  }

  public void setAssigned(Integer assigned) {
    this.assigned = assigned;
  }

  public ClientWorkOrderCounts approvedPaid(Integer approvedPaid) {
    this.approvedPaid = approvedPaid;
    return this;
  }

   /**
   * Get approvedPaid
   * @return approvedPaid
  **/

  public Integer getApprovedPaid() {
    return approvedPaid;
  }

  public void setApprovedPaid(Integer approvedPaid) {
    this.approvedPaid = approvedPaid;
  }

  public ClientWorkOrderCounts draft(Integer draft) {
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/

  public Integer getDraft() {
    return draft;
  }

  public void setDraft(Integer draft) {
    this.draft = draft;
  }

  public ClientWorkOrderCounts workDone(Integer workDone) {
    this.workDone = workDone;
    return this;
  }

   /**
   * Get workDone
   * @return workDone
  **/

  public Integer getWorkDone() {
    return workDone;
  }

  public void setWorkDone(Integer workDone) {
    this.workDone = workDone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientWorkOrderCounts clientWorkOrderCounts = (ClientWorkOrderCounts) o;
    return Objects.equals(this.all, clientWorkOrderCounts.all) &&
        Objects.equals(this.today, clientWorkOrderCounts.today) &&
        Objects.equals(this.publishedRouted, clientWorkOrderCounts.publishedRouted) &&
        Objects.equals(this.assigned, clientWorkOrderCounts.assigned) &&
        Objects.equals(this.approvedPaid, clientWorkOrderCounts.approvedPaid) &&
        Objects.equals(this.draft, clientWorkOrderCounts.draft) &&
        Objects.equals(this.workDone, clientWorkOrderCounts.workDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, today, publishedRouted, assigned, approvedPaid, draft, workDone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientWorkOrderCounts {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    today: ").append(toIndentedString(today)).append("\n");
    sb.append("    publishedRouted: ").append(toIndentedString(publishedRouted)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    approvedPaid: ").append(toIndentedString(approvedPaid)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    workDone: ").append(toIndentedString(workDone)).append("\n");
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

