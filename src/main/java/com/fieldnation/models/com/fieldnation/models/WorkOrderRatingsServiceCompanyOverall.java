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
 * WorkOrderRatingsServiceCompanyOverall
 */

public class WorkOrderRatingsServiceCompanyOverall {
  @SerializedName("ratings")
  private Integer ratings = null;

  @SerializedName("stars")
  private BigDecimal stars = null;

  @SerializedName("penalized")
  private Boolean penalized = null;

  @SerializedName("categories")
  private List<ProviderRatingsCategories> categories = null;

  public WorkOrderRatingsServiceCompanyOverall ratings(Integer ratings) {
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

  public WorkOrderRatingsServiceCompanyOverall stars(BigDecimal stars) {
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

  public WorkOrderRatingsServiceCompanyOverall penalized(Boolean penalized) {
    this.penalized = penalized;
    return this;
  }

   /**
   * Get penalized
   * @return penalized
  **/

  public Boolean isPenalized() {
    return penalized;
  }

  public void setPenalized(Boolean penalized) {
    this.penalized = penalized;
  }

  public WorkOrderRatingsServiceCompanyOverall categories(List<ProviderRatingsCategories> categories) {
    this.categories = categories;
    return this;
  }

  public WorkOrderRatingsServiceCompanyOverall addCategoriesItem(ProviderRatingsCategories categoriesItem) {
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
    WorkOrderRatingsServiceCompanyOverall workOrderRatingsServiceCompanyOverall = (WorkOrderRatingsServiceCompanyOverall) o;
    return Objects.equals(this.ratings, workOrderRatingsServiceCompanyOverall.ratings) &&
        Objects.equals(this.stars, workOrderRatingsServiceCompanyOverall.stars) &&
        Objects.equals(this.penalized, workOrderRatingsServiceCompanyOverall.penalized) &&
        Objects.equals(this.categories, workOrderRatingsServiceCompanyOverall.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, stars, penalized, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsServiceCompanyOverall {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    penalized: ").append(toIndentedString(penalized)).append("\n");
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

