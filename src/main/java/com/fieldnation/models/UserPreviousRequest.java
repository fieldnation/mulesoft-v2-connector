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
 * UserPreviousRequest
 */

public class UserPreviousRequest {
  @SerializedName("at")
  private java.util.Date at = null;

  public UserPreviousRequest at(java.util.Date at) {
    this.at = at;
    return this;
  }

   /**
   * Get at
   * @return at
  **/

  public java.util.Date getAt() {
    return at;
  }

  public void setAt(java.util.Date at) {
    this.at = at;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreviousRequest userPreviousRequest = (UserPreviousRequest) o;
    return Objects.equals(this.at, userPreviousRequest.at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(at);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreviousRequest {\n");
    
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
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

