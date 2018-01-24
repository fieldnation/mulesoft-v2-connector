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
import com.fieldnation.models.ProviderRatingsCategories;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ProviderRatings
 */

public class ProviderRatings {
  @SerializedName("ratings")
  private Integer ratings = null;

  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("categories")
  private List<ProviderRatingsCategories> categories = null;

  public ProviderRatings ratings(Integer ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/

  public Integer getRatings() {
    return ratings;
  }

  public void setRatings(Integer ratings) {
    this.ratings = ratings;
  }

  public ProviderRatings stars(BigDecimal stars) {
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

  public ProviderRatings categories(List<ProviderRatingsCategories> categories) {
    this.categories = categories;
    return this;
  }

  public ProviderRatings addCategoriesItem(ProviderRatingsCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<ProviderRatingsCategories>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/

  public List<ProviderRatingsCategories> getCategories() {
    return categories;
  }

  public void setCategories(List<ProviderRatingsCategories> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderRatings providerRatings = (ProviderRatings) o;
    return Objects.equals(this.ratings, providerRatings.ratings) &&
        Objects.equals(this.stars, providerRatings.stars) &&
        Objects.equals(this.categories, providerRatings.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, stars, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderRatings {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

