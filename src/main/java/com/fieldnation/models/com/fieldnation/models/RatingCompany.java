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
import com.fieldnation.models.RatingCompanyMarketplace;

/**
 * RatingCompany
 */

public class RatingCompany {
  @SerializedName("marketplace")
  private RatingCompanyMarketplace marketplace = null;

  @SerializedName("mine")
  private RatingCompanyMarketplace mine = null;

  @SerializedName("blocked")
  private Boolean blocked = null;

  @SerializedName("work_completed")
  private Integer workCompleted = null;

  public RatingCompany marketplace(RatingCompanyMarketplace marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public RatingCompanyMarketplace getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(RatingCompanyMarketplace marketplace) {
    this.marketplace = marketplace;
  }

  public RatingCompany mine(RatingCompanyMarketplace mine) {
    this.mine = mine;
    return this;
  }

   /**
   * Get mine
   * @return mine
  **/

  public RatingCompanyMarketplace getMine() {
    return mine;
  }

  public void setMine(RatingCompanyMarketplace mine) {
    this.mine = mine;
  }

  public RatingCompany blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/

  public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public RatingCompany workCompleted(Integer workCompleted) {
    this.workCompleted = workCompleted;
    return this;
  }

   /**
   * Get workCompleted
   * @return workCompleted
  **/

  public Integer getWorkCompleted() {
    return workCompleted;
  }

  public void setWorkCompleted(Integer workCompleted) {
    this.workCompleted = workCompleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingCompany ratingCompany = (RatingCompany) o;
    return Objects.equals(this.marketplace, ratingCompany.marketplace) &&
        Objects.equals(this.mine, ratingCompany.mine) &&
        Objects.equals(this.blocked, ratingCompany.blocked) &&
        Objects.equals(this.workCompleted, ratingCompany.workCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, mine, blocked, workCompleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingCompany {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    mine: ").append(toIndentedString(mine)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    workCompleted: ").append(toIndentedString(workCompleted)).append("\n");
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

