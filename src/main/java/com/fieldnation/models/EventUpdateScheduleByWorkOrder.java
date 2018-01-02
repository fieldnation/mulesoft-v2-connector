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


import com.fieldnation.models.EventUpdateScheduleByWorkOrderOld;
import java.io.IOException;

/**
 * EventUpdateScheduleByWorkOrder
 */

public class EventUpdateScheduleByWorkOrder {
  @SerializedName("old")
  private EventUpdateScheduleByWorkOrderOld old = null;

  @SerializedName("new")
  private EventUpdateScheduleByWorkOrderOld _new = null;

  public EventUpdateScheduleByWorkOrder old(EventUpdateScheduleByWorkOrderOld old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/

  public EventUpdateScheduleByWorkOrderOld getOld() {
    return old;
  }

  public void setOld(EventUpdateScheduleByWorkOrderOld old) {
    this.old = old;
  }

  public EventUpdateScheduleByWorkOrder getNew(EventUpdateScheduleByWorkOrderOld _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/

  public EventUpdateScheduleByWorkOrderOld getNew() {
    return _new;
  }

  public void setNew(EventUpdateScheduleByWorkOrderOld _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventUpdateScheduleByWorkOrder eventUpdateScheduleByWorkOrder = (EventUpdateScheduleByWorkOrder) o;
    return Objects.equals(this.old, eventUpdateScheduleByWorkOrder.old) &&
        Objects.equals(this._new, eventUpdateScheduleByWorkOrder._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(old, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventUpdateScheduleByWorkOrder {\n");
    
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

