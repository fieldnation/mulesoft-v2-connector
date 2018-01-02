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


import com.fieldnation.models.WorkordersworkOrderIdtasksTasks;
import java.io.IOException;

/**
 * JSON Model
 */


public class Body12 {
  @SerializedName("tasks")
  private WorkordersworkOrderIdtasksTasks tasks = null;

  public Body12 tasks(WorkordersworkOrderIdtasksTasks tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/

  public WorkordersworkOrderIdtasksTasks getTasks() {
    return tasks;
  }

  public void setTasks(WorkordersworkOrderIdtasksTasks tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body12 body12 = (Body12) o;
    return Objects.equals(this.tasks, body12.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body12 {\n");
    
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

