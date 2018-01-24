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
 * LocationNotesInner
 */

public class LocationNotesInner {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public LocationNotesInner id(Integer id) {
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

  public LocationNotesInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public LocationNotesInner created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public LocationNotesInner getPrivate(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/

  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public LocationNotesInner userId(Integer userId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationNotesInner locationNotesInner = (LocationNotesInner) o;
    return Objects.equals(this.id, locationNotesInner.id) &&
        Objects.equals(this.text, locationNotesInner.text) &&
        Objects.equals(this.created, locationNotesInner.created) &&
        Objects.equals(this._private, locationNotesInner._private) &&
        Objects.equals(this.userId, locationNotesInner.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, created, _private, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationNotesInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

