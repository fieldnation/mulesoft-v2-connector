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
 * PPN
 */

public class PPN {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("members")
  private Integer members = null;

  public PPN id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PPN name(String name) {
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

  public PPN members(Integer members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/

  public Integer getMembers() {
    return members;
  }

  public void setMembers(Integer members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PPN PPN = (PPN) o;
    return Objects.equals(this.id, PPN.id) &&
        Objects.equals(this.name, PPN.name) &&
        Objects.equals(this.members, PPN.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PPN {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

