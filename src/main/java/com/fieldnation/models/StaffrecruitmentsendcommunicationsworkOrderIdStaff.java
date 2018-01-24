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
 * StaffrecruitmentsendcommunicationsworkOrderIdStaff
 */

public class StaffrecruitmentsendcommunicationsworkOrderIdStaff {
  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("name")
  private String name = null;

  public StaffrecruitmentsendcommunicationsworkOrderIdStaff userId(Integer userId) {
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

  public StaffrecruitmentsendcommunicationsworkOrderIdStaff name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffrecruitmentsendcommunicationsworkOrderIdStaff staffrecruitmentsendcommunicationsworkOrderIdStaff = (StaffrecruitmentsendcommunicationsworkOrderIdStaff) o;
    return Objects.equals(this.userId, staffrecruitmentsendcommunicationsworkOrderIdStaff.userId) &&
        Objects.equals(this.name, staffrecruitmentsendcommunicationsworkOrderIdStaff.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffrecruitmentsendcommunicationsworkOrderIdStaff {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

