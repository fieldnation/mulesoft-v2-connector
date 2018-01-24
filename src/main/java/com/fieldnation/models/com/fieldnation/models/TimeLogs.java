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


import com.fieldnation.models.ListEnvelope;
import com.fieldnation.models.OnMyWay;
import com.fieldnation.models.TimeLog;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeLogs
 */

public class TimeLogs {
  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("hours")
  private BigDecimal hours = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("confirmed")
  private java.util.Date confirmed = null;

  @SerializedName("onmyway")
  private OnMyWay onmyway = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    CAN_VERIFY("can_verify"),
    
    ADD("add"),
    
    CHECKIN("checkin");

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

  @SerializedName("open_time_log")
  private TimeLog openTimeLog = null;

  @SerializedName("results")
  private List<TimeLog> results = null;

  public TimeLogs metadata(ListEnvelope metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public ListEnvelope getMetadata() {
    return metadata;
  }

  public void setMetadata(ListEnvelope metadata) {
    this.metadata = metadata;
  }

  public TimeLogs timeZone(TimeZone timeZone) {
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

  public TimeLogs hours(BigDecimal hours) {
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

  public TimeLogs status(String status) {
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

  public TimeLogs confirmed(java.util.Date confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/

  public java.util.Date getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(java.util.Date confirmed) {
    this.confirmed = confirmed;
  }

  public TimeLogs onmyway(OnMyWay onmyway) {
    this.onmyway = onmyway;
    return this;
  }

   /**
   * Get onmyway
   * @return onmyway
  **/

  public OnMyWay getOnmyway() {
    return onmyway;
  }

  public void setOnmyway(OnMyWay onmyway) {
    this.onmyway = onmyway;
  }

  public TimeLogs actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public TimeLogs addActionsItem(ActionsEnum actionsItem) {
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

  public TimeLogs openTimeLog(TimeLog openTimeLog) {
    this.openTimeLog = openTimeLog;
    return this;
  }

   /**
   * Get openTimeLog
   * @return openTimeLog
  **/

  public TimeLog getOpenTimeLog() {
    return openTimeLog;
  }

  public void setOpenTimeLog(TimeLog openTimeLog) {
    this.openTimeLog = openTimeLog;
  }

  public TimeLogs results(List<TimeLog> results) {
    this.results = results;
    return this;
  }

  public TimeLogs addResultsItem(TimeLog resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<TimeLog>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<TimeLog> getResults() {
    return results;
  }

  public void setResults(List<TimeLog> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeLogs timeLogs = (TimeLogs) o;
    return Objects.equals(this.metadata, timeLogs.metadata) &&
        Objects.equals(this.timeZone, timeLogs.timeZone) &&
        Objects.equals(this.hours, timeLogs.hours) &&
        Objects.equals(this.status, timeLogs.status) &&
        Objects.equals(this.confirmed, timeLogs.confirmed) &&
        Objects.equals(this.onmyway, timeLogs.onmyway) &&
        Objects.equals(this.actions, timeLogs.actions) &&
        Objects.equals(this.openTimeLog, timeLogs.openTimeLog) &&
        Objects.equals(this.results, timeLogs.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, timeZone, hours, status, confirmed, onmyway, actions, openTimeLog, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeLogs {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    onmyway: ").append(toIndentedString(onmyway)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    openTimeLog: ").append(toIndentedString(openTimeLog)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

