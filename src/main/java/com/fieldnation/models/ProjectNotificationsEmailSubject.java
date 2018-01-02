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
 * ProjectNotificationsEmailSubject
 */

public class ProjectNotificationsEmailSubject {
  @SerializedName("manager")
  private String manager = null;

  @SerializedName("provider")
  private String provider = null;

  public ProjectNotificationsEmailSubject manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public ProjectNotificationsEmailSubject provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectNotificationsEmailSubject projectNotificationsEmailSubject = (ProjectNotificationsEmailSubject) o;
    return Objects.equals(this.manager, projectNotificationsEmailSubject.manager) &&
        Objects.equals(this.provider, projectNotificationsEmailSubject.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manager, provider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectNotificationsEmailSubject {\n");
    
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

