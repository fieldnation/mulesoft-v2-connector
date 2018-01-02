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


import com.fieldnation.models.WorkOrderRatingsBuyerWorkOrderCategories;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderRatingsBuyerWorkOrder
 */

public class WorkOrderRatingsBuyerWorkOrder {
  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("stars")
  private Integer stars = null;

  @SerializedName("recommend")
  private Boolean recommend = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("flagged")
  private Boolean flagged = null;

  @SerializedName("remaining_approval_period")
  private Boolean remainingApprovalPeriod = null;

  /**
   * Gets or Sets form
   */
  @JsonAdapter(FormEnum.Adapter.class)
  public enum FormEnum {
    OLD("old"),
    
    NEW("new");

    private String value;

    FormEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormEnum fromValue(String text) {
      for (FormEnum b : FormEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("form")
  private FormEnum form = null;

  @SerializedName("categories")
  private List<WorkOrderRatingsBuyerWorkOrderCategories> categories = null;

  public WorkOrderRatingsBuyerWorkOrder created(java.util.Date created) {
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

  public WorkOrderRatingsBuyerWorkOrder stars(Integer stars) {
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

  public WorkOrderRatingsBuyerWorkOrder recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

   /**
   * Get recommend
   * @return recommend
  **/

  public Boolean isRecommend() {
    return recommend;
  }

  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

  public WorkOrderRatingsBuyerWorkOrder comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public WorkOrderRatingsBuyerWorkOrder hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/

  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public WorkOrderRatingsBuyerWorkOrder flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

   /**
   * Get flagged
   * @return flagged
  **/

  public Boolean isFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public WorkOrderRatingsBuyerWorkOrder remainingApprovalPeriod(Boolean remainingApprovalPeriod) {
    this.remainingApprovalPeriod = remainingApprovalPeriod;
    return this;
  }

   /**
   * Get remainingApprovalPeriod
   * @return remainingApprovalPeriod
  **/

  public Boolean isRemainingApprovalPeriod() {
    return remainingApprovalPeriod;
  }

  public void setRemainingApprovalPeriod(Boolean remainingApprovalPeriod) {
    this.remainingApprovalPeriod = remainingApprovalPeriod;
  }

  public WorkOrderRatingsBuyerWorkOrder form(FormEnum form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/

  public FormEnum getForm() {
    return form;
  }

  public void setForm(FormEnum form) {
    this.form = form;
  }

  public WorkOrderRatingsBuyerWorkOrder categories(List<WorkOrderRatingsBuyerWorkOrderCategories> categories) {
    this.categories = categories;
    return this;
  }

  public WorkOrderRatingsBuyerWorkOrder addCategoriesItem(WorkOrderRatingsBuyerWorkOrderCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<WorkOrderRatingsBuyerWorkOrderCategories>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/

  public List<WorkOrderRatingsBuyerWorkOrderCategories> getCategories() {
    return categories;
  }

  public void setCategories(List<WorkOrderRatingsBuyerWorkOrderCategories> categories) {
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
    WorkOrderRatingsBuyerWorkOrder workOrderRatingsBuyerWorkOrder = (WorkOrderRatingsBuyerWorkOrder) o;
    return Objects.equals(this.created, workOrderRatingsBuyerWorkOrder.created) &&
        Objects.equals(this.stars, workOrderRatingsBuyerWorkOrder.stars) &&
        Objects.equals(this.recommend, workOrderRatingsBuyerWorkOrder.recommend) &&
        Objects.equals(this.comment, workOrderRatingsBuyerWorkOrder.comment) &&
        Objects.equals(this.hidden, workOrderRatingsBuyerWorkOrder.hidden) &&
        Objects.equals(this.flagged, workOrderRatingsBuyerWorkOrder.flagged) &&
        Objects.equals(this.remainingApprovalPeriod, workOrderRatingsBuyerWorkOrder.remainingApprovalPeriod) &&
        Objects.equals(this.form, workOrderRatingsBuyerWorkOrder.form) &&
        Objects.equals(this.categories, workOrderRatingsBuyerWorkOrder.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, stars, recommend, comment, hidden, flagged, remainingApprovalPeriod, form, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsBuyerWorkOrder {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    remainingApprovalPeriod: ").append(toIndentedString(remainingApprovalPeriod)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

