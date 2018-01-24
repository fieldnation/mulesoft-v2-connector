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
import com.fieldnation.models.Coords;
import java.math.BigDecimal;

/**
 * OnMyWay
 */

public class OnMyWay {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("drive_time")
  private Integer driveTime = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("substatus")
  private String substatus = null;

  @SerializedName("estimated_delay")
  private Integer estimatedDelay = null;

  @SerializedName("coords")
  private Coords coords = null;

  public OnMyWay active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public OnMyWay created(java.util.Date created) {
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

  public OnMyWay driveTime(Integer driveTime) {
    this.driveTime = driveTime;
    return this;
  }

   /**
   * Get driveTime
   * @return driveTime
  **/

  public Integer getDriveTime() {
    return driveTime;
  }

  public void setDriveTime(Integer driveTime) {
    this.driveTime = driveTime;
  }

  public OnMyWay distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/

  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public OnMyWay status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OnMyWay substatus(String substatus) {
    this.substatus = substatus;
    return this;
  }

   /**
   * Get substatus
   * @return substatus
  **/

  public String getSubstatus() {
    return substatus;
  }

  public void setSubstatus(String substatus) {
    this.substatus = substatus;
  }

  public OnMyWay estimatedDelay(Integer estimatedDelay) {
    this.estimatedDelay = estimatedDelay;
    return this;
  }

   /**
   * Get estimatedDelay
   * @return estimatedDelay
  **/

  public Integer getEstimatedDelay() {
    return estimatedDelay;
  }

  public void setEstimatedDelay(Integer estimatedDelay) {
    this.estimatedDelay = estimatedDelay;
  }

  public OnMyWay coords(Coords coords) {
    this.coords = coords;
    return this;
  }

   /**
   * Get coords
   * @return coords
  **/

  public Coords getCoords() {
    return coords;
  }

  public void setCoords(Coords coords) {
    this.coords = coords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnMyWay onMyWay = (OnMyWay) o;
    return Objects.equals(this.active, onMyWay.active) &&
        Objects.equals(this.created, onMyWay.created) &&
        Objects.equals(this.driveTime, onMyWay.driveTime) &&
        Objects.equals(this.distance, onMyWay.distance) &&
        Objects.equals(this.status, onMyWay.status) &&
        Objects.equals(this.substatus, onMyWay.substatus) &&
        Objects.equals(this.estimatedDelay, onMyWay.estimatedDelay) &&
        Objects.equals(this.coords, onMyWay.coords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, created, driveTime, distance, status, substatus, estimatedDelay, coords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnMyWay {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    driveTime: ").append(toIndentedString(driveTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    estimatedDelay: ").append(toIndentedString(estimatedDelay)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
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

