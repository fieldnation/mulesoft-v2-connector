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


import com.fieldnation.models.Satisfaction;
import java.io.IOException;

/**
 * CompanyRatingRating
 */

public class CompanyRatingRating {
  @SerializedName("marketplace")
  private Satisfaction marketplace = null;

  @SerializedName("mine")
  private Satisfaction mine = null;

  @SerializedName("toggle_visible")
  private Boolean toggleVisible = null;

  public CompanyRatingRating marketplace(Satisfaction marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public Satisfaction getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Satisfaction marketplace) {
    this.marketplace = marketplace;
  }

  public CompanyRatingRating mine(Satisfaction mine) {
    this.mine = mine;
    return this;
  }

   /**
   * Get mine
   * @return mine
  **/

  public Satisfaction getMine() {
    return mine;
  }

  public void setMine(Satisfaction mine) {
    this.mine = mine;
  }

  public CompanyRatingRating toggleVisible(Boolean toggleVisible) {
    this.toggleVisible = toggleVisible;
    return this;
  }

   /**
   * Get toggleVisible
   * @return toggleVisible
  **/

  public Boolean isToggleVisible() {
    return toggleVisible;
  }

  public void setToggleVisible(Boolean toggleVisible) {
    this.toggleVisible = toggleVisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyRatingRating companyRatingRating = (CompanyRatingRating) o;
    return Objects.equals(this.marketplace, companyRatingRating.marketplace) &&
        Objects.equals(this.mine, companyRatingRating.mine) &&
        Objects.equals(this.toggleVisible, companyRatingRating.toggleVisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, mine, toggleVisible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyRatingRating {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    mine: ").append(toIndentedString(mine)).append("\n");
    sb.append("    toggleVisible: ").append(toIndentedString(toggleVisible)).append("\n");
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

