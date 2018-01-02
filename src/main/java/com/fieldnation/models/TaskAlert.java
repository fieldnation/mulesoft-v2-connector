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
 * TaskAlert
 */

public class TaskAlert {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("sent")
  private String sent = null;

  public TaskAlert id(Integer id) {
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

  public TaskAlert email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TaskAlert sent(String sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/

  public String getSent() {
    return sent;
  }

  public void setSent(String sent) {
    this.sent = sent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAlert taskAlert = (TaskAlert) o;
    return Objects.equals(this.id, taskAlert.id) &&
        Objects.equals(this.email, taskAlert.email) &&
        Objects.equals(this.sent, taskAlert.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, sent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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

