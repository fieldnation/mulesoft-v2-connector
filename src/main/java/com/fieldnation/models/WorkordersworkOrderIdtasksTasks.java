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
import com.fieldnation.models.Task;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkordersworkOrderIdtasksTasks
 */

public class WorkordersworkOrderIdtasksTasks {
  @SerializedName("tasks")
  private List<Task> tasks = null;

  public WorkordersworkOrderIdtasksTasks tasks(List<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  public WorkordersworkOrderIdtasksTasks addTasksItem(Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<Task>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/

  public List<Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Task> tasks) {
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
    WorkordersworkOrderIdtasksTasks workordersworkOrderIdtasksTasks = (WorkordersworkOrderIdtasksTasks) o;
    return Objects.equals(this.tasks, workordersworkOrderIdtasksTasks.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkordersworkOrderIdtasksTasks {\n");
    
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

