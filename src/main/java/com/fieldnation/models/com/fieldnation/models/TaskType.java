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
 * TaskType
 */

public class TaskType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  public TaskType id(Integer id) {
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

  public TaskType key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TaskType name(String name) {
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
    TaskType taskType = (TaskType) o;
    return Objects.equals(this.id, taskType.id) &&
        Objects.equals(this.key, taskType.key) &&
        Objects.equals(this.name, taskType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

