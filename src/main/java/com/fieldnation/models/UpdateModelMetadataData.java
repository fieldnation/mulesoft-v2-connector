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
 * UpdateModelMetadataData
 */

public class UpdateModelMetadataData {
  @SerializedName("route")
  private String route = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("company_id")
  private Integer companyId = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  public UpdateModelMetadataData route(String route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/

  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public UpdateModelMetadataData role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UpdateModelMetadataData userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UpdateModelMetadataData companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/

  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public UpdateModelMetadataData groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/

  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public UpdateModelMetadataData workOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

   /**
   * Get workOrderId
   * @return workOrderId
  **/

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateModelMetadataData updateModelMetadataData = (UpdateModelMetadataData) o;
    return Objects.equals(this.route, updateModelMetadataData.route) &&
        Objects.equals(this.role, updateModelMetadataData.role) &&
        Objects.equals(this.userId, updateModelMetadataData.userId) &&
        Objects.equals(this.companyId, updateModelMetadataData.companyId) &&
        Objects.equals(this.groupId, updateModelMetadataData.groupId) &&
        Objects.equals(this.workOrderId, updateModelMetadataData.workOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, role, userId, companyId, groupId, workOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateModelMetadataData {\n");
    
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
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

