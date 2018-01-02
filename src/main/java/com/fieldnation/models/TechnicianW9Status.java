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
 * TechnicianW9Status
 */

public class TechnicianW9Status {
  @SerializedName("status_name")
  private String statusName = null;

  @SerializedName("technician_w9_status_id")
  private Integer technicianW9StatusId = null;

  public TechnicianW9Status statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * Get statusName
   * @return statusName
  **/

  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public TechnicianW9Status technicianW9StatusId(Integer technicianW9StatusId) {
    this.technicianW9StatusId = technicianW9StatusId;
    return this;
  }

   /**
   * Get technicianW9StatusId
   * @return technicianW9StatusId
  **/

  public Integer getTechnicianW9StatusId() {
    return technicianW9StatusId;
  }

  public void setTechnicianW9StatusId(Integer technicianW9StatusId) {
    this.technicianW9StatusId = technicianW9StatusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicianW9Status technicianW9Status = (TechnicianW9Status) o;
    return Objects.equals(this.statusName, technicianW9Status.statusName) &&
        Objects.equals(this.technicianW9StatusId, technicianW9Status.technicianW9StatusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusName, technicianW9StatusId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicianW9Status {\n");
    
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    technicianW9StatusId: ").append(toIndentedString(technicianW9StatusId)).append("\n");
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

