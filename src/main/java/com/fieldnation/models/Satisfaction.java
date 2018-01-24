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
 * Satisfaction
 */

public class Satisfaction {
  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("clear_expectation")
  private Integer clearExpectation = null;

  @SerializedName("respect_rating")
  private Integer respectRating = null;

  @SerializedName("average_days_to_approval")
  private Integer averageDaysToApproval = null;

  @SerializedName("total_ratings")
  private Integer totalRatings = null;

  public Satisfaction stars(BigDecimal stars) {
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

  public Satisfaction clearExpectation(Integer clearExpectation) {
    this.clearExpectation = clearExpectation;
    return this;
  }

   /**
   * Get clearExpectation
   * @return clearExpectation
  **/

  public Integer getClearExpectation() {
    return clearExpectation;
  }

  public void setClearExpectation(Integer clearExpectation) {
    this.clearExpectation = clearExpectation;
  }

  public Satisfaction respectRating(Integer respectRating) {
    this.respectRating = respectRating;
    return this;
  }

   /**
   * Get respectRating
   * @return respectRating
  **/

  public Integer getRespectRating() {
    return respectRating;
  }

  public void setRespectRating(Integer respectRating) {
    this.respectRating = respectRating;
  }

  public Satisfaction averageDaysToApproval(Integer averageDaysToApproval) {
    this.averageDaysToApproval = averageDaysToApproval;
    return this;
  }

   /**
   * Get averageDaysToApproval
   * @return averageDaysToApproval
  **/

  public Integer getAverageDaysToApproval() {
    return averageDaysToApproval;
  }

  public void setAverageDaysToApproval(Integer averageDaysToApproval) {
    this.averageDaysToApproval = averageDaysToApproval;
  }

  public Satisfaction totalRatings(Integer totalRatings) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Satisfaction satisfaction = (Satisfaction) o;
    return Objects.equals(this.stars, satisfaction.stars) &&
        Objects.equals(this.clearExpectation, satisfaction.clearExpectation) &&
        Objects.equals(this.respectRating, satisfaction.respectRating) &&
        Objects.equals(this.averageDaysToApproval, satisfaction.averageDaysToApproval) &&
        Objects.equals(this.totalRatings, satisfaction.totalRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stars, clearExpectation, respectRating, averageDaysToApproval, totalRatings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Satisfaction {\n");
    
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    clearExpectation: ").append(toIndentedString(clearExpectation)).append("\n");
    sb.append("    respectRating: ").append(toIndentedString(respectRating)).append("\n");
    sb.append("    averageDaysToApproval: ").append(toIndentedString(averageDaysToApproval)).append("\n");
    sb.append("    totalRatings: ").append(toIndentedString(totalRatings)).append("\n");
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

