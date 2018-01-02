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


import com.fieldnation.models.EventUpdateScheduleByWorkOrder;
import java.io.IOException;

/**
 * UpdateModelParams
 */

public class UpdateModelParams {
  @SerializedName("model")
  private Object model = null;

  @SerializedName("updateScheduleByWorkOrder")
  private EventUpdateScheduleByWorkOrder updateScheduleByWorkOrder = null;

  public UpdateModelParams model(Object model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/

  public Object getModel() {
    return model;
  }

  public void setModel(Object model) {
    this.model = model;
  }

  public UpdateModelParams updateScheduleByWorkOrder(EventUpdateScheduleByWorkOrder updateScheduleByWorkOrder) {
    this.updateScheduleByWorkOrder = updateScheduleByWorkOrder;
    return this;
  }

   /**
   * Get updateScheduleByWorkOrder
   * @return updateScheduleByWorkOrder
  **/

  public EventUpdateScheduleByWorkOrder getUpdateScheduleByWorkOrder() {
    return updateScheduleByWorkOrder;
  }

  public void setUpdateScheduleByWorkOrder(EventUpdateScheduleByWorkOrder updateScheduleByWorkOrder) {
    this.updateScheduleByWorkOrder = updateScheduleByWorkOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateModelParams updateModelParams = (UpdateModelParams) o;
    return Objects.equals(this.model, updateModelParams.model) &&
        Objects.equals(this.updateScheduleByWorkOrder, updateModelParams.updateScheduleByWorkOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, updateScheduleByWorkOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateModelParams {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    updateScheduleByWorkOrder: ").append(toIndentedString(updateScheduleByWorkOrder)).append("\n");
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

