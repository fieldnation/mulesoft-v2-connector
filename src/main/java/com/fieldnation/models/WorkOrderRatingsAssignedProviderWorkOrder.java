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
import com.fieldnation.models.WorkOrderRatingsAssignedProviderWorkOrderCategories;
import com.fieldnation.models.WorkOrderRatingsAssignedProviderWorkOrderComment;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderRatingsAssignedProviderWorkOrder
 */

public class WorkOrderRatingsAssignedProviderWorkOrder {
  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("stars")
  private Integer stars = null;

  @SerializedName("categories")
  private List<WorkOrderRatingsAssignedProviderWorkOrderCategories> categories = null;

  @SerializedName("comment")
  private WorkOrderRatingsAssignedProviderWorkOrderComment comment = null;

  public WorkOrderRatingsAssignedProviderWorkOrder created(java.util.Date created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public java.util.Date getCreated() {
    return created;
  }

  public void setCreated(java.util.Date created) {
    this.created = created;
  }

  public WorkOrderRatingsAssignedProviderWorkOrder stars(Integer stars) {
    this.stars = stars;
    return this;
  }

   /**
   * Get stars
   * @return stars
  **/

  public Integer getStars() {
    return stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }

  public WorkOrderRatingsAssignedProviderWorkOrder categories(List<WorkOrderRatingsAssignedProviderWorkOrderCategories> categories) {
    this.categories = categories;
    return this;
  }

  public WorkOrderRatingsAssignedProviderWorkOrder addCategoriesItem(WorkOrderRatingsAssignedProviderWorkOrderCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<WorkOrderRatingsAssignedProviderWorkOrderCategories>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/

  public List<WorkOrderRatingsAssignedProviderWorkOrderCategories> getCategories() {
    return categories;
  }

  public void setCategories(List<WorkOrderRatingsAssignedProviderWorkOrderCategories> categories) {
    this.categories = categories;
  }

  public WorkOrderRatingsAssignedProviderWorkOrder comment(WorkOrderRatingsAssignedProviderWorkOrderComment comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/

  public WorkOrderRatingsAssignedProviderWorkOrderComment getComment() {
    return comment;
  }

  public void setComment(WorkOrderRatingsAssignedProviderWorkOrderComment comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsAssignedProviderWorkOrder workOrderRatingsAssignedProviderWorkOrder = (WorkOrderRatingsAssignedProviderWorkOrder) o;
    return Objects.equals(this.created, workOrderRatingsAssignedProviderWorkOrder.created) &&
        Objects.equals(this.stars, workOrderRatingsAssignedProviderWorkOrder.stars) &&
        Objects.equals(this.categories, workOrderRatingsAssignedProviderWorkOrder.categories) &&
        Objects.equals(this.comment, workOrderRatingsAssignedProviderWorkOrder.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, stars, categories, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsAssignedProviderWorkOrder {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

