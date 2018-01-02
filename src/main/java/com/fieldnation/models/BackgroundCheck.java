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
import java.util.ArrayList;
import java.util.List;

/**
 * BackgroundCheck
 */

public class BackgroundCheck {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("expires")
  private String expires = null;

  @SerializedName("highlights")
  private List<String> highlights = null;

  public BackgroundCheck id(Integer id) {
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

  public BackgroundCheck name(String name) {
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

  public BackgroundCheck updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/

  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public BackgroundCheck expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/

  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public BackgroundCheck highlights(List<String> highlights) {
    this.highlights = highlights;
    return this;
  }

  public BackgroundCheck addHighlightsItem(String highlightsItem) {
    if (this.highlights == null) {
      this.highlights = new ArrayList<String>();
    }
    this.highlights.add(highlightsItem);
    return this;
  }

   /**
   * Get highlights
   * @return highlights
  **/

  public List<String> getHighlights() {
    return highlights;
  }

  public void setHighlights(List<String> highlights) {
    this.highlights = highlights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackgroundCheck backgroundCheck = (BackgroundCheck) o;
    return Objects.equals(this.id, backgroundCheck.id) &&
        Objects.equals(this.name, backgroundCheck.name) &&
        Objects.equals(this.updated, backgroundCheck.updated) &&
        Objects.equals(this.expires, backgroundCheck.expires) &&
        Objects.equals(this.highlights, backgroundCheck.highlights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, updated, expires, highlights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundCheck {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
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

