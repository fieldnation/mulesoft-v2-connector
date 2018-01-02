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
import java.math.BigDecimal;

/**
 * RatingCompanyMarketplace
 */

public class RatingCompanyMarketplace {
  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("clear_expectations")
  private Integer clearExpectations = null;

  @SerializedName("respect_rating")
  private Integer respectRating = null;

  @SerializedName("average_days_to_approval")
  private Integer averageDaysToApproval = null;

  @SerializedName("total_ratings")
  private Integer totalRatings = null;

  public RatingCompanyMarketplace stars(BigDecimal stars) {
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

  public RatingCompanyMarketplace clearExpectations(Integer clearExpectations) {
    this.clearExpectations = clearExpectations;
    return this;
  }

   /**
   * Get clearExpectations
   * @return clearExpectations
  **/

  public Integer getClearExpectations() {
    return clearExpectations;
  }

  public void setClearExpectations(Integer clearExpectations) {
    this.clearExpectations = clearExpectations;
  }

  public RatingCompanyMarketplace respectRating(Integer respectRating) {
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

  public RatingCompanyMarketplace averageDaysToApproval(Integer averageDaysToApproval) {
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

  public RatingCompanyMarketplace totalRatings(Integer totalRatings) {
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
    RatingCompanyMarketplace ratingCompanyMarketplace = (RatingCompanyMarketplace) o;
    return Objects.equals(this.stars, ratingCompanyMarketplace.stars) &&
        Objects.equals(this.clearExpectations, ratingCompanyMarketplace.clearExpectations) &&
        Objects.equals(this.respectRating, ratingCompanyMarketplace.respectRating) &&
        Objects.equals(this.averageDaysToApproval, ratingCompanyMarketplace.averageDaysToApproval) &&
        Objects.equals(this.totalRatings, ratingCompanyMarketplace.totalRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stars, clearExpectations, respectRating, averageDaysToApproval, totalRatings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingCompanyMarketplace {\n");
    
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    clearExpectations: ").append(toIndentedString(clearExpectations)).append("\n");
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

