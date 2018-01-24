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
import com.fieldnation.models.WorkHistory;

/**
 * ProfileAndWorkHistoryRating
 */

public class ProfileAndWorkHistoryRating {
  @SerializedName("profile")
  private MinimalUser profile = null;

  @SerializedName("work_history")
  private WorkHistory workHistory = null;

  @SerializedName("more_results")
  private Boolean moreResults = null;

  public ProfileAndWorkHistoryRating profile(MinimalUser profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/

  public MinimalUser getProfile() {
    return profile;
  }

  public void setProfile(MinimalUser profile) {
    this.profile = profile;
  }

  public ProfileAndWorkHistoryRating workHistory(WorkHistory workHistory) {
    this.workHistory = workHistory;
    return this;
  }

   /**
   * Get workHistory
   * @return workHistory
  **/

  public WorkHistory getWorkHistory() {
    return workHistory;
  }

  public void setWorkHistory(WorkHistory workHistory) {
    this.workHistory = workHistory;
  }

  public ProfileAndWorkHistoryRating moreResults(Boolean moreResults) {
    this.moreResults = moreResults;
    return this;
  }

   /**
   * Get moreResults
   * @return moreResults
  **/

  public Boolean isMoreResults() {
    return moreResults;
  }

  public void setMoreResults(Boolean moreResults) {
    this.moreResults = moreResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAndWorkHistoryRating profileAndWorkHistoryRating = (ProfileAndWorkHistoryRating) o;
    return Objects.equals(this.profile, profileAndWorkHistoryRating.profile) &&
        Objects.equals(this.workHistory, profileAndWorkHistoryRating.workHistory) &&
        Objects.equals(this.moreResults, profileAndWorkHistoryRating.moreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, workHistory, moreResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAndWorkHistoryRating {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    workHistory: ").append(toIndentedString(workHistory)).append("\n");
    sb.append("    moreResults: ").append(toIndentedString(moreResults)).append("\n");
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

