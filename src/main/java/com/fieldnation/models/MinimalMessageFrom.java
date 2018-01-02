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
 * MinimalMessageFrom
 */

public class MinimalMessageFrom {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

  @SerializedName("hideWoManager")
  private Boolean hideWoManager = null;

  @SerializedName("msgLink")
  private String msgLink = null;

  @SerializedName("role")
  private String role = null;

  public MinimalMessageFrom id(Integer id) {
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

  public MinimalMessageFrom name(String name) {
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

  public MinimalMessageFrom thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public MinimalMessageFrom hideWoManager(Boolean hideWoManager) {
    this.hideWoManager = hideWoManager;
    return this;
  }

   /**
   * Get hideWoManager
   * @return hideWoManager
  **/

  public Boolean isHideWoManager() {
    return hideWoManager;
  }

  public void setHideWoManager(Boolean hideWoManager) {
    this.hideWoManager = hideWoManager;
  }

  public MinimalMessageFrom msgLink(String msgLink) {
    this.msgLink = msgLink;
    return this;
  }

   /**
   * Get msgLink
   * @return msgLink
  **/

  public String getMsgLink() {
    return msgLink;
  }

  public void setMsgLink(String msgLink) {
    this.msgLink = msgLink;
  }

  public MinimalMessageFrom role(String role) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimalMessageFrom minimalMessageFrom = (MinimalMessageFrom) o;
    return Objects.equals(this.id, minimalMessageFrom.id) &&
        Objects.equals(this.name, minimalMessageFrom.name) &&
        Objects.equals(this.thumbnail, minimalMessageFrom.thumbnail) &&
        Objects.equals(this.hideWoManager, minimalMessageFrom.hideWoManager) &&
        Objects.equals(this.msgLink, minimalMessageFrom.msgLink) &&
        Objects.equals(this.role, minimalMessageFrom.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, thumbnail, hideWoManager, msgLink, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalMessageFrom {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    hideWoManager: ").append(toIndentedString(hideWoManager)).append("\n");
    sb.append("    msgLink: ").append(toIndentedString(msgLink)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

