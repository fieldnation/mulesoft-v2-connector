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
 * Notification
 */

public class Notification {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("read")
  private Boolean read = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("loading_time")
  private String loadingTime = null;

  public Notification id(Integer id) {
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

  public Notification read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/

  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Notification created(java.util.Date created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public java.util.Date getCreated() {
    return created;
  }

  public void setCreated(java.util.Date created) {
    this.created = created;
  }

  public Notification link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Notification message(String message) {
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

  public Notification correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public Notification loadingTime(String loadingTime) {
    this.loadingTime = loadingTime;
    return this;
  }

   /**
   * Get loadingTime
   * @return loadingTime
  **/

  public String getLoadingTime() {
    return loadingTime;
  }

  public void setLoadingTime(String loadingTime) {
    this.loadingTime = loadingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.id, notification.id) &&
        Objects.equals(this.read, notification.read) &&
        Objects.equals(this.created, notification.created) &&
        Objects.equals(this.link, notification.link) &&
        Objects.equals(this.message, notification.message) &&
        Objects.equals(this.correlationId, notification.correlationId) &&
        Objects.equals(this.loadingTime, notification.loadingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, read, created, link, message, correlationId, loadingTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    loadingTime: ").append(toIndentedString(loadingTime)).append("\n");
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

