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
 * UserUpcomingSchedule
 */

public class UserUpcomingSchedule {
  @SerializedName("date")
  private String date = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  public UserUpcomingSchedule date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public UserUpcomingSchedule from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public UserUpcomingSchedule to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpcomingSchedule userUpcomingSchedule = (UserUpcomingSchedule) o;
    return Objects.equals(this.date, userUpcomingSchedule.date) &&
        Objects.equals(this.from, userUpcomingSchedule.from) &&
        Objects.equals(this.to, userUpcomingSchedule.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpcomingSchedule {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

