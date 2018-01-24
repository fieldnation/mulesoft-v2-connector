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
import com.fieldnation.models.CheckInOutTimeLog;
import com.fieldnation.models.Coords;
import com.fieldnation.models.MinimalUser;
import java.math.BigDecimal;

/**
 * CheckInOut
 */

public class CheckInOut {
  @SerializedName("time_log")
  private CheckInOutTimeLog timeLog = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("actor")
  private MinimalUser actor = null;

  @SerializedName("coords")
  private Coords coords = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("distance_from_check_in")
  private BigDecimal distanceFromCheckIn = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public CheckInOut timeLog(CheckInOutTimeLog timeLog) {
    this.timeLog = timeLog;
    return this;
  }

   /**
   * Get timeLog
   * @return timeLog
  **/

  public CheckInOutTimeLog getTimeLog() {
    return timeLog;
  }

  public void setTimeLog(CheckInOutTimeLog timeLog) {
    this.timeLog = timeLog;
  }

  public CheckInOut created(java.util.Date created) {
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

  public CheckInOut actor(MinimalUser actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/

  public MinimalUser getActor() {
    return actor;
  }

  public void setActor(MinimalUser actor) {
    this.actor = actor;
  }

  public CheckInOut coords(Coords coords) {
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

  public CheckInOut distance(BigDecimal distance) {
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

  public CheckInOut distanceFromCheckIn(BigDecimal distanceFromCheckIn) {
    this.distanceFromCheckIn = distanceFromCheckIn;
    return this;
  }

   /**
   * Get distanceFromCheckIn
   * @return distanceFromCheckIn
  **/

  public BigDecimal getDistanceFromCheckIn() {
    return distanceFromCheckIn;
  }

  public void setDistanceFromCheckIn(BigDecimal distanceFromCheckIn) {
    this.distanceFromCheckIn = distanceFromCheckIn;
  }

  public CheckInOut verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/

  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckInOut checkInOut = (CheckInOut) o;
    return Objects.equals(this.timeLog, checkInOut.timeLog) &&
        Objects.equals(this.created, checkInOut.created) &&
        Objects.equals(this.actor, checkInOut.actor) &&
        Objects.equals(this.coords, checkInOut.coords) &&
        Objects.equals(this.distance, checkInOut.distance) &&
        Objects.equals(this.distanceFromCheckIn, checkInOut.distanceFromCheckIn) &&
        Objects.equals(this.verified, checkInOut.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeLog, created, actor, coords, distance, distanceFromCheckIn, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInOut {\n");
    
    sb.append("    timeLog: ").append(toIndentedString(timeLog)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceFromCheckIn: ").append(toIndentedString(distanceFromCheckIn)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

