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
import java.math.BigDecimal;

/**
 * RatingDays90
 */

public class RatingDays90 {
  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("total_ratings")
  private Integer totalRatings = null;

  @SerializedName("on_time_percent")
  private BigDecimal onTimePercent = null;

  @SerializedName("follow_instructions_percent")
  private BigDecimal followInstructionsPercent = null;

  @SerializedName("assignment_fulfilled_percent")
  private BigDecimal assignmentFulfilledPercent = null;

  @SerializedName("right_deliverables_percent")
  private BigDecimal rightDeliverablesPercent = null;

  public RatingDays90 stars(BigDecimal stars) {
    this.stars = stars;
    return this;
  }

   /**
   * Get stars
   * @return stars
  **/

  public BigDecimal getStars() {
    return stars;
  }

  public void setStars(BigDecimal stars) {
    this.stars = stars;
  }

  public RatingDays90 totalRatings(Integer totalRatings) {
    this.totalRatings = totalRatings;
    return this;
  }

   /**
   * Get totalRatings
   * @return totalRatings
  **/

  public Integer getTotalRatings() {
    return totalRatings;
  }

  public void setTotalRatings(Integer totalRatings) {
    this.totalRatings = totalRatings;
  }

  public RatingDays90 onTimePercent(BigDecimal onTimePercent) {
    this.onTimePercent = onTimePercent;
    return this;
  }

   /**
   * Get onTimePercent
   * @return onTimePercent
  **/

  public BigDecimal getOnTimePercent() {
    return onTimePercent;
  }

  public void setOnTimePercent(BigDecimal onTimePercent) {
    this.onTimePercent = onTimePercent;
  }

  public RatingDays90 followInstructionsPercent(BigDecimal followInstructionsPercent) {
    this.followInstructionsPercent = followInstructionsPercent;
    return this;
  }

   /**
   * Get followInstructionsPercent
   * @return followInstructionsPercent
  **/

  public BigDecimal getFollowInstructionsPercent() {
    return followInstructionsPercent;
  }

  public void setFollowInstructionsPercent(BigDecimal followInstructionsPercent) {
    this.followInstructionsPercent = followInstructionsPercent;
  }

  public RatingDays90 assignmentFulfilledPercent(BigDecimal assignmentFulfilledPercent) {
    this.assignmentFulfilledPercent = assignmentFulfilledPercent;
    return this;
  }

   /**
   * Get assignmentFulfilledPercent
   * @return assignmentFulfilledPercent
  **/

  public BigDecimal getAssignmentFulfilledPercent() {
    return assignmentFulfilledPercent;
  }

  public void setAssignmentFulfilledPercent(BigDecimal assignmentFulfilledPercent) {
    this.assignmentFulfilledPercent = assignmentFulfilledPercent;
  }

  public RatingDays90 rightDeliverablesPercent(BigDecimal rightDeliverablesPercent) {
    this.rightDeliverablesPercent = rightDeliverablesPercent;
    return this;
  }

   /**
   * Get rightDeliverablesPercent
   * @return rightDeliverablesPercent
  **/

  public BigDecimal getRightDeliverablesPercent() {
    return rightDeliverablesPercent;
  }

  public void setRightDeliverablesPercent(BigDecimal rightDeliverablesPercent) {
    this.rightDeliverablesPercent = rightDeliverablesPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingDays90 ratingDays90 = (RatingDays90) o;
    return Objects.equals(this.stars, ratingDays90.stars) &&
        Objects.equals(this.totalRatings, ratingDays90.totalRatings) &&
        Objects.equals(this.onTimePercent, ratingDays90.onTimePercent) &&
        Objects.equals(this.followInstructionsPercent, ratingDays90.followInstructionsPercent) &&
        Objects.equals(this.assignmentFulfilledPercent, ratingDays90.assignmentFulfilledPercent) &&
        Objects.equals(this.rightDeliverablesPercent, ratingDays90.rightDeliverablesPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stars, totalRatings, onTimePercent, followInstructionsPercent, assignmentFulfilledPercent, rightDeliverablesPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingDays90 {\n");
    
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    totalRatings: ").append(toIndentedString(totalRatings)).append("\n");
    sb.append("    onTimePercent: ").append(toIndentedString(onTimePercent)).append("\n");
    sb.append("    followInstructionsPercent: ").append(toIndentedString(followInstructionsPercent)).append("\n");
    sb.append("    assignmentFulfilledPercent: ").append(toIndentedString(assignmentFulfilledPercent)).append("\n");
    sb.append("    rightDeliverablesPercent: ").append(toIndentedString(rightDeliverablesPercent)).append("\n");
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

