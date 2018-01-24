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


import com.fieldnation.models.CheckInOut;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.OnMyWay;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeLog
 */

public class TimeLog {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("in")
  private CheckInOut in = null;

  @SerializedName("out")
  private CheckInOut out = null;

  @SerializedName("devices")
  private BigDecimal devices = null;

  @SerializedName("hours")
  private BigDecimal hours = null;

  @SerializedName("verified")
  private Boolean verified = null;

  @SerializedName("should_verify")
  private Boolean shouldVerify = null;

  @SerializedName("was_late")
  private Boolean wasLate = null;

  @SerializedName("logged_by")
  private MinimalUser loggedBy = null;

  @SerializedName("on_my_way")
  private OnMyWay onMyWay = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN("checked_in"),
    
    OUT("checked_out");

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

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    VERIFY("verify"),
    
    DELETE("delete");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  public TimeLog id(Integer id) {
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

  public TimeLog timeZone(TimeZone timeZone) {
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

  public TimeLog in(CheckInOut in) {
    this.in = in;
    return this;
  }

   /**
   * Get in
   * @return in
  **/

  public CheckInOut getIn() {
    return in;
  }

  public void setIn(CheckInOut in) {
    this.in = in;
  }

  public TimeLog out(CheckInOut out) {
    this.out = out;
    return this;
  }

   /**
   * Get out
   * @return out
  **/

  public CheckInOut getOut() {
    return out;
  }

  public void setOut(CheckInOut out) {
    this.out = out;
  }

  public TimeLog devices(BigDecimal devices) {
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/

  public BigDecimal getDevices() {
    return devices;
  }

  public void setDevices(BigDecimal devices) {
    this.devices = devices;
  }

  public TimeLog hours(BigDecimal hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/

  public BigDecimal getHours() {
    return hours;
  }

  public void setHours(BigDecimal hours) {
    this.hours = hours;
  }

  public TimeLog verified(Boolean verified) {
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

  public TimeLog shouldVerify(Boolean shouldVerify) {
    this.shouldVerify = shouldVerify;
    return this;
  }

   /**
   * Get shouldVerify
   * @return shouldVerify
  **/

  public Boolean isShouldVerify() {
    return shouldVerify;
  }

  public void setShouldVerify(Boolean shouldVerify) {
    this.shouldVerify = shouldVerify;
  }

  public TimeLog wasLate(Boolean wasLate) {
    this.wasLate = wasLate;
    return this;
  }

   /**
   * Get wasLate
   * @return wasLate
  **/

  public Boolean isWasLate() {
    return wasLate;
  }

  public void setWasLate(Boolean wasLate) {
    this.wasLate = wasLate;
  }

  public TimeLog loggedBy(MinimalUser loggedBy) {
    this.loggedBy = loggedBy;
    return this;
  }

   /**
   * Get loggedBy
   * @return loggedBy
  **/

  public MinimalUser getLoggedBy() {
    return loggedBy;
  }

  public void setLoggedBy(MinimalUser loggedBy) {
    this.loggedBy = loggedBy;
  }

  public TimeLog onMyWay(OnMyWay onMyWay) {
    this.onMyWay = onMyWay;
    return this;
  }

   /**
   * Get onMyWay
   * @return onMyWay
  **/

  public OnMyWay getOnMyWay() {
    return onMyWay;
  }

  public void setOnMyWay(OnMyWay onMyWay) {
    this.onMyWay = onMyWay;
  }

  public TimeLog status(StatusEnum status) {
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

  public TimeLog actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public TimeLog addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
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
    TimeLog timeLog = (TimeLog) o;
    return Objects.equals(this.id, timeLog.id) &&
        Objects.equals(this.timeZone, timeLog.timeZone) &&
        Objects.equals(this.in, timeLog.in) &&
        Objects.equals(this.out, timeLog.out) &&
        Objects.equals(this.devices, timeLog.devices) &&
        Objects.equals(this.hours, timeLog.hours) &&
        Objects.equals(this.verified, timeLog.verified) &&
        Objects.equals(this.shouldVerify, timeLog.shouldVerify) &&
        Objects.equals(this.wasLate, timeLog.wasLate) &&
        Objects.equals(this.loggedBy, timeLog.loggedBy) &&
        Objects.equals(this.onMyWay, timeLog.onMyWay) &&
        Objects.equals(this.status, timeLog.status) &&
        Objects.equals(this.actions, timeLog.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeZone, in, out, devices, hours, verified, shouldVerify, wasLate, loggedBy, onMyWay, status, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    shouldVerify: ").append(toIndentedString(shouldVerify)).append("\n");
    sb.append("    wasLate: ").append(toIndentedString(wasLate)).append("\n");
    sb.append("    loggedBy: ").append(toIndentedString(loggedBy)).append("\n");
    sb.append("    onMyWay: ").append(toIndentedString(onMyWay)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

