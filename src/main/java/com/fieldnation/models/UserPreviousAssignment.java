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
import com.fieldnation.models.MinimalUser;

/**
 * UserPreviousAssignment
 */

public class UserPreviousAssignment {
  @SerializedName("removal")
  private java.util.Date removal = null;

  @SerializedName("by")
  private MinimalUser by = null;

  @SerializedName("reason")
  private String reason = null;

  public UserPreviousAssignment removal(java.util.Date removal) {
    this.removal = removal;
    return this;
  }

   /**
   * Get removal
   * @return removal
  **/

  public java.util.Date getRemoval() {
    return removal;
  }

  public void setRemoval(java.util.Date removal) {
    this.removal = removal;
  }

  public UserPreviousAssignment by(MinimalUser by) {
    this.by = by;
    return this;
  }

   /**
   * Get by
   * @return by
  **/

  public MinimalUser getBy() {
    return by;
  }

  public void setBy(MinimalUser by) {
    this.by = by;
  }

  public UserPreviousAssignment reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreviousAssignment userPreviousAssignment = (UserPreviousAssignment) o;
    return Objects.equals(this.removal, userPreviousAssignment.removal) &&
        Objects.equals(this.by, userPreviousAssignment.by) &&
        Objects.equals(this.reason, userPreviousAssignment.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removal, by, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreviousAssignment {\n");
    
    sb.append("    removal: ").append(toIndentedString(removal)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

