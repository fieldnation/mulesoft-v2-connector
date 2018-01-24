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

/**
 * EventUpdateScheduleByWorkOrderOld
 */

public class EventUpdateScheduleByWorkOrderOld {
  @SerializedName("mode")
  private String mode = null;

  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  public EventUpdateScheduleByWorkOrderOld mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public EventUpdateScheduleByWorkOrderOld start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/

  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public EventUpdateScheduleByWorkOrderOld end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/

  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public EventUpdateScheduleByWorkOrderOld timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventUpdateScheduleByWorkOrderOld eventUpdateScheduleByWorkOrderOld = (EventUpdateScheduleByWorkOrderOld) o;
    return Objects.equals(this.mode, eventUpdateScheduleByWorkOrderOld.mode) &&
        Objects.equals(this.start, eventUpdateScheduleByWorkOrderOld.start) &&
        Objects.equals(this.end, eventUpdateScheduleByWorkOrderOld.end) &&
        Objects.equals(this.timeZone, eventUpdateScheduleByWorkOrderOld.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, start, end, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventUpdateScheduleByWorkOrderOld {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

