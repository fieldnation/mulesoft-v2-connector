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
 * WorkOrderRatingsAssignedProviderWorkOrderComment
 */

public class WorkOrderRatingsAssignedProviderWorkOrderComment {
  @SerializedName("message")
  private String message = null;

  @SerializedName("private")
  private Boolean _private = null;

  public WorkOrderRatingsAssignedProviderWorkOrderComment message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public WorkOrderRatingsAssignedProviderWorkOrderComment getPrivate(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/

  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsAssignedProviderWorkOrderComment workOrderRatingsAssignedProviderWorkOrderComment = (WorkOrderRatingsAssignedProviderWorkOrderComment) o;
    return Objects.equals(this.message, workOrderRatingsAssignedProviderWorkOrderComment.message) &&
        Objects.equals(this._private, workOrderRatingsAssignedProviderWorkOrderComment._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, _private);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsAssignedProviderWorkOrderComment {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

