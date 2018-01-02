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
 * LocationAttribute
 */

public class LocationAttribute {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("private")
  private Boolean _private = null;

  public LocationAttribute key(String key) {
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

  public LocationAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LocationAttribute _private(Boolean _private) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAttribute locationAttribute = (LocationAttribute) o;
    return Objects.equals(this.key, locationAttribute.key) &&
        Objects.equals(this.value, locationAttribute.value) &&
        Objects.equals(this._private, locationAttribute._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, _private);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAttribute {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

