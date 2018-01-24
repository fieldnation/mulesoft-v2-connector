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


import com.fieldnation.models.Coords;
import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Condition
 */

public class Condition {
  @SerializedName("user")
  private MinimalUser user = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("drive_time")
  private Integer driveTime = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    EMPTY(""),
    
    ON_SCHEDULE("on_schedule"),
    
    DELAYED("delayed"),
    
    CANCELLED("cancelled"),
    
    AT_RISK("at_risk"),
    
    RESCHEDULE_REQUESTED("reschedule_requested");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("estimated_delay")
  private Integer estimatedDelay = null;

  @SerializedName("coords")
  private Coords coords = null;

  @SerializedName("route")
  private Coords route = null;

  public Condition user(MinimalUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/

  public MinimalUser getUser() {
    return user;
  }

  public void setUser(MinimalUser user) {
    this.user = user;
  }

  public Condition created(java.util.Date created) {
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

  public Condition driveTime(Integer driveTime) {
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

  public Condition distance(BigDecimal distance) {
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

  public Condition status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Condition estimatedDelay(Integer estimatedDelay) {
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

  public Condition coords(Coords coords) {
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

  public Condition route(Coords route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/

  public Coords getRoute() {
    return route;
  }

  public void setRoute(Coords route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Condition condition = (Condition) o;
    return Objects.equals(this.user, condition.user) &&
        Objects.equals(this.created, condition.created) &&
        Objects.equals(this.driveTime, condition.driveTime) &&
        Objects.equals(this.distance, condition.distance) &&
        Objects.equals(this.status, condition.status) &&
        Objects.equals(this.estimatedDelay, condition.estimatedDelay) &&
        Objects.equals(this.coords, condition.coords) &&
        Objects.equals(this.route, condition.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, created, driveTime, distance, status, estimatedDelay, coords, route);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    driveTime: ").append(toIndentedString(driveTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    estimatedDelay: ").append(toIndentedString(estimatedDelay)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

