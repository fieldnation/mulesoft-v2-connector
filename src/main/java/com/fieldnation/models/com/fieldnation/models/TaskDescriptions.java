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
 * TaskDescriptions
 */

public class TaskDescriptions {
  @SerializedName("task")
  private String task = null;

  @SerializedName("first")
  private String first = null;

  @SerializedName("second")
  private String second = null;

  @SerializedName("third")
  private String third = null;

  @SerializedName("fourth")
  private String fourth = null;

  public TaskDescriptions task(String task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public TaskDescriptions first(String first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public TaskDescriptions second(String second) {
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/

  public String getSecond() {
    return second;
  }

  public void setSecond(String second) {
    this.second = second;
  }

  public TaskDescriptions third(String third) {
    this.third = third;
    return this;
  }

   /**
   * Get third
   * @return third
  **/

  public String getThird() {
    return third;
  }

  public void setThird(String third) {
    this.third = third;
  }

  public TaskDescriptions fourth(String fourth) {
    this.fourth = fourth;
    return this;
  }

   /**
   * Get fourth
   * @return fourth
  **/

  public String getFourth() {
    return fourth;
  }

  public void setFourth(String fourth) {
    this.fourth = fourth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDescriptions taskDescriptions = (TaskDescriptions) o;
    return Objects.equals(this.task, taskDescriptions.task) &&
        Objects.equals(this.first, taskDescriptions.first) &&
        Objects.equals(this.second, taskDescriptions.second) &&
        Objects.equals(this.third, taskDescriptions.third) &&
        Objects.equals(this.fourth, taskDescriptions.fourth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task, first, second, third, fourth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDescriptions {\n");
    
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    third: ").append(toIndentedString(third)).append("\n");
    sb.append("    fourth: ").append(toIndentedString(fourth)).append("\n");
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

