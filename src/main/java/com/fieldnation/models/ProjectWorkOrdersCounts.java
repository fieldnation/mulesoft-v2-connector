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
 * ProjectWorkOrdersCounts
 */

public class ProjectWorkOrdersCounts {
  @SerializedName("today")
  private Integer today = null;

  @SerializedName("draft")
  private Integer draft = null;

  @SerializedName("published_routed")
  private Integer publishedRouted = null;

  @SerializedName("assigned")
  private Integer assigned = null;

  @SerializedName("work_done")
  private Integer workDone = null;

  @SerializedName("approved_paid")
  private Integer approvedPaid = null;

  public ProjectWorkOrdersCounts today(Integer today) {
    this.today = today;
    return this;
  }

   /**
   * Get today
   * @return today
  **/

  public Integer getToday() {
    return today;
  }

  public void setToday(Integer today) {
    this.today = today;
  }

  public ProjectWorkOrdersCounts draft(Integer draft) {
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/

  public Integer getDraft() {
    return draft;
  }

  public void setDraft(Integer draft) {
    this.draft = draft;
  }

  public ProjectWorkOrdersCounts publishedRouted(Integer publishedRouted) {
    this.publishedRouted = publishedRouted;
    return this;
  }

   /**
   * Get publishedRouted
   * @return publishedRouted
  **/

  public Integer getPublishedRouted() {
    return publishedRouted;
  }

  public void setPublishedRouted(Integer publishedRouted) {
    this.publishedRouted = publishedRouted;
  }

  public ProjectWorkOrdersCounts assigned(Integer assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/

  public Integer getAssigned() {
    return assigned;
  }

  public void setAssigned(Integer assigned) {
    this.assigned = assigned;
  }

  public ProjectWorkOrdersCounts workDone(Integer workDone) {
    this.workDone = workDone;
    return this;
  }

   /**
   * Get workDone
   * @return workDone
  **/

  public Integer getWorkDone() {
    return workDone;
  }

  public void setWorkDone(Integer workDone) {
    this.workDone = workDone;
  }

  public ProjectWorkOrdersCounts approvedPaid(Integer approvedPaid) {
    this.approvedPaid = approvedPaid;
    return this;
  }

   /**
   * Get approvedPaid
   * @return approvedPaid
  **/

  public Integer getApprovedPaid() {
    return approvedPaid;
  }

  public void setApprovedPaid(Integer approvedPaid) {
    this.approvedPaid = approvedPaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectWorkOrdersCounts projectWorkOrdersCounts = (ProjectWorkOrdersCounts) o;
    return Objects.equals(this.today, projectWorkOrdersCounts.today) &&
        Objects.equals(this.draft, projectWorkOrdersCounts.draft) &&
        Objects.equals(this.publishedRouted, projectWorkOrdersCounts.publishedRouted) &&
        Objects.equals(this.assigned, projectWorkOrdersCounts.assigned) &&
        Objects.equals(this.workDone, projectWorkOrdersCounts.workDone) &&
        Objects.equals(this.approvedPaid, projectWorkOrdersCounts.approvedPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(today, draft, publishedRouted, assigned, workDone, approvedPaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectWorkOrdersCounts {\n");
    
    sb.append("    today: ").append(toIndentedString(today)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    publishedRouted: ").append(toIndentedString(publishedRouted)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    workDone: ").append(toIndentedString(workDone)).append("\n");
    sb.append("    approvedPaid: ").append(toIndentedString(approvedPaid)).append("\n");
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

