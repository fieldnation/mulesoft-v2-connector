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
import com.fieldnation.models.RatingCompany;
import com.fieldnation.models.RatingDays90;
import java.math.BigDecimal;

/**
 * Rating
 */

public class Rating {
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

  @SerializedName("days90")
  private RatingDays90 days90 = null;

  @SerializedName("days180")
  private RatingDays90 days180 = null;

  @SerializedName("company")
  private RatingCompany company = null;

  public Rating stars(BigDecimal stars) {
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

  public Rating totalRatings(Integer totalRatings) {
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

  public Rating onTimePercent(BigDecimal onTimePercent) {
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

  public Rating followInstructionsPercent(BigDecimal followInstructionsPercent) {
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

  public Rating assignmentFulfilledPercent(BigDecimal assignmentFulfilledPercent) {
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

  public Rating rightDeliverablesPercent(BigDecimal rightDeliverablesPercent) {
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

  public Rating days90(RatingDays90 days90) {
    this.days90 = days90;
    return this;
  }

   /**
   * Get days90
   * @return days90
  **/

  public RatingDays90 getDays90() {
    return days90;
  }

  public void setDays90(RatingDays90 days90) {
    this.days90 = days90;
  }

  public Rating days180(RatingDays90 days180) {
    this.days180 = days180;
    return this;
  }

   /**
   * Get days180
   * @return days180
  **/

  public RatingDays90 getDays180() {
    return days180;
  }

  public void setDays180(RatingDays90 days180) {
    this.days180 = days180;
  }

  public Rating company(RatingCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public RatingCompany getCompany() {
    return company;
  }

  public void setCompany(RatingCompany company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.stars, rating.stars) &&
        Objects.equals(this.totalRatings, rating.totalRatings) &&
        Objects.equals(this.onTimePercent, rating.onTimePercent) &&
        Objects.equals(this.followInstructionsPercent, rating.followInstructionsPercent) &&
        Objects.equals(this.assignmentFulfilledPercent, rating.assignmentFulfilledPercent) &&
        Objects.equals(this.rightDeliverablesPercent, rating.rightDeliverablesPercent) &&
        Objects.equals(this.days90, rating.days90) &&
        Objects.equals(this.days180, rating.days180) &&
        Objects.equals(this.company, rating.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stars, totalRatings, onTimePercent, followInstructionsPercent, assignmentFulfilledPercent, rightDeliverablesPercent, days90, days180, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    totalRatings: ").append(toIndentedString(totalRatings)).append("\n");
    sb.append("    onTimePercent: ").append(toIndentedString(onTimePercent)).append("\n");
    sb.append("    followInstructionsPercent: ").append(toIndentedString(followInstructionsPercent)).append("\n");
    sb.append("    assignmentFulfilledPercent: ").append(toIndentedString(assignmentFulfilledPercent)).append("\n");
    sb.append("    rightDeliverablesPercent: ").append(toIndentedString(rightDeliverablesPercent)).append("\n");
    sb.append("    days90: ").append(toIndentedString(days90)).append("\n");
    sb.append("    days180: ").append(toIndentedString(days180)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

