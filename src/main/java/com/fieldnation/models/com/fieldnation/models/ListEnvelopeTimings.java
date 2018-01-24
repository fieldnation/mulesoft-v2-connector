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
 * ListEnvelopeTimings
 */

public class ListEnvelopeTimings {
  @SerializedName("name")
  private String name = null;

  @SerializedName("time")
  private Integer time = null;

  public ListEnvelopeTimings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListEnvelopeTimings time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/

  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEnvelopeTimings listEnvelopeTimings = (ListEnvelopeTimings) o;
    return Objects.equals(this.name, listEnvelopeTimings.name) &&
        Objects.equals(this.time, listEnvelopeTimings.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnvelopeTimings {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

