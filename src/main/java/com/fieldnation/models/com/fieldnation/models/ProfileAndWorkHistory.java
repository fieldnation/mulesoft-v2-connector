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
import com.fieldnation.models.ProfileAndWorkHistoryRating;

/**
 * ProfileAndWorkHistory
 */

public class ProfileAndWorkHistory {
  @SerializedName("rating")
  private ProfileAndWorkHistoryRating rating = null;

  public ProfileAndWorkHistory rating(ProfileAndWorkHistoryRating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/

  public ProfileAndWorkHistoryRating getRating() {
    return rating;
  }

  public void setRating(ProfileAndWorkHistoryRating rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAndWorkHistory profileAndWorkHistory = (ProfileAndWorkHistory) o;
    return Objects.equals(this.rating, profileAndWorkHistory.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAndWorkHistory {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

