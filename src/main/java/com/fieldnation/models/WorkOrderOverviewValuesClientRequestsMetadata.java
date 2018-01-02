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
 * WorkOrderOverviewValuesClientRequestsMetadata
 */

public class WorkOrderOverviewValuesClientRequestsMetadata {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("message")
  private String message = null;

  public WorkOrderOverviewValuesClientRequestsMetadata total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public WorkOrderOverviewValuesClientRequestsMetadata message(String message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderOverviewValuesClientRequestsMetadata workOrderOverviewValuesClientRequestsMetadata = (WorkOrderOverviewValuesClientRequestsMetadata) o;
    return Objects.equals(this.total, workOrderOverviewValuesClientRequestsMetadata.total) &&
        Objects.equals(this.message, workOrderOverviewValuesClientRequestsMetadata.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewValuesClientRequestsMetadata {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

