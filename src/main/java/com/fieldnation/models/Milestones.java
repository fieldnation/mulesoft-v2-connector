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
 * Milestones
 */

public class Milestones {
  @SerializedName("time_to_dispatch")
  private BigDecimal timeToDispatch = null;

  @SerializedName("time_to_work_done")
  private BigDecimal timeToWorkDone = null;

  @SerializedName("time_alive")
  private BigDecimal timeAlive = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("published")
  private java.util.Date published = null;

  @SerializedName("routed")
  private java.util.Date routed = null;

  @SerializedName("assigned")
  private java.util.Date assigned = null;

  @SerializedName("workdone")
  private java.util.Date workdone = null;

  @SerializedName("approved")
  private java.util.Date approved = null;

  @SerializedName("paid")
  private java.util.Date paid = null;

  @SerializedName("canceled")
  private java.util.Date canceled = null;

  public Milestones timeToDispatch(BigDecimal timeToDispatch) {
    this.timeToDispatch = timeToDispatch;
    return this;
  }

   /**
   * Get timeToDispatch
   * @return timeToDispatch
  **/

  public BigDecimal getTimeToDispatch() {
    return timeToDispatch;
  }

  public void setTimeToDispatch(BigDecimal timeToDispatch) {
    this.timeToDispatch = timeToDispatch;
  }

  public Milestones timeToWorkDone(BigDecimal timeToWorkDone) {
    this.timeToWorkDone = timeToWorkDone;
    return this;
  }

   /**
   * Get timeToWorkDone
   * @return timeToWorkDone
  **/

  public BigDecimal getTimeToWorkDone() {
    return timeToWorkDone;
  }

  public void setTimeToWorkDone(BigDecimal timeToWorkDone) {
    this.timeToWorkDone = timeToWorkDone;
  }

  public Milestones timeAlive(BigDecimal timeAlive) {
    this.timeAlive = timeAlive;
    return this;
  }

   /**
   * Get timeAlive
   * @return timeAlive
  **/

  public BigDecimal getTimeAlive() {
    return timeAlive;
  }

  public void setTimeAlive(BigDecimal timeAlive) {
    this.timeAlive = timeAlive;
  }

  public Milestones created(java.util.Date created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public java.util.Date getCreated() {
    return created;
  }

  public void setCreated(java.util.Date created) {
    this.created = created;
  }

  public Milestones published(java.util.Date published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/

  public java.util.Date getPublished() {
    return published;
  }

  public void setPublished(java.util.Date published) {
    this.published = published;
  }

  public Milestones routed(java.util.Date routed) {
    this.routed = routed;
    return this;
  }

   /**
   * Get routed
   * @return routed
  **/

  public java.util.Date getRouted() {
    return routed;
  }

  public void setRouted(java.util.Date routed) {
    this.routed = routed;
  }

  public Milestones assigned(java.util.Date assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/

  public java.util.Date getAssigned() {
    return assigned;
  }

  public void setAssigned(java.util.Date assigned) {
    this.assigned = assigned;
  }

  public Milestones workdone(java.util.Date workdone) {
    this.workdone = workdone;
    return this;
  }

   /**
   * Get workdone
   * @return workdone
  **/

  public java.util.Date getWorkdone() {
    return workdone;
  }

  public void setWorkdone(java.util.Date workdone) {
    this.workdone = workdone;
  }

  public Milestones approved(java.util.Date approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/

  public java.util.Date getApproved() {
    return approved;
  }

  public void setApproved(java.util.Date approved) {
    this.approved = approved;
  }

  public Milestones paid(java.util.Date paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/

  public java.util.Date getPaid() {
    return paid;
  }

  public void setPaid(java.util.Date paid) {
    this.paid = paid;
  }

  public Milestones canceled(java.util.Date canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/

  public java.util.Date getCanceled() {
    return canceled;
  }

  public void setCanceled(java.util.Date canceled) {
    this.canceled = canceled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Milestones milestones = (Milestones) o;
    return Objects.equals(this.timeToDispatch, milestones.timeToDispatch) &&
        Objects.equals(this.timeToWorkDone, milestones.timeToWorkDone) &&
        Objects.equals(this.timeAlive, milestones.timeAlive) &&
        Objects.equals(this.created, milestones.created) &&
        Objects.equals(this.published, milestones.published) &&
        Objects.equals(this.routed, milestones.routed) &&
        Objects.equals(this.assigned, milestones.assigned) &&
        Objects.equals(this.workdone, milestones.workdone) &&
        Objects.equals(this.approved, milestones.approved) &&
        Objects.equals(this.paid, milestones.paid) &&
        Objects.equals(this.canceled, milestones.canceled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeToDispatch, timeToWorkDone, timeAlive, created, published, routed, assigned, workdone, approved, paid, canceled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Milestones {\n");
    
    sb.append("    timeToDispatch: ").append(toIndentedString(timeToDispatch)).append("\n");
    sb.append("    timeToWorkDone: ").append(toIndentedString(timeToWorkDone)).append("\n");
    sb.append("    timeAlive: ").append(toIndentedString(timeAlive)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    routed: ").append(toIndentedString(routed)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    workdone: ").append(toIndentedString(workdone)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
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

