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
import com.fieldnation.models.Bundle;
import com.fieldnation.models.Location;
import com.fieldnation.models.Schedule;

/**
 * EtaMassAcceptWithLocation
 */

public class EtaMassAcceptWithLocation {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("bundle")
  private Bundle bundle = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("location")
  private Location location = null;

  public EtaMassAcceptWithLocation workOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

   /**
   * Get workOrderId
   * @return workOrderId
  **/

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }

  public EtaMassAcceptWithLocation title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EtaMassAcceptWithLocation bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/

  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public EtaMassAcceptWithLocation schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/

  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public EtaMassAcceptWithLocation location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtaMassAcceptWithLocation etaMassAcceptWithLocation = (EtaMassAcceptWithLocation) o;
    return Objects.equals(this.workOrderId, etaMassAcceptWithLocation.workOrderId) &&
        Objects.equals(this.title, etaMassAcceptWithLocation.title) &&
        Objects.equals(this.bundle, etaMassAcceptWithLocation.bundle) &&
        Objects.equals(this.schedule, etaMassAcceptWithLocation.schedule) &&
        Objects.equals(this.location, etaMassAcceptWithLocation.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, title, bundle, schedule, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtaMassAcceptWithLocation {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

