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
import com.fieldnation.models.Hold;
import com.fieldnation.models.HoldCategory;
import com.fieldnation.models.ListEnvelope;
import java.util.ArrayList;
import java.util.List;

/**
 * Holds
 */

public class Holds {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("metadata")
  private ListEnvelope metadata = null;

  @SerializedName("categories")
  private List<HoldCategory> categories = null;

  @SerializedName("results")
  private List<Hold> results = null;

  public Holds actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Holds addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public Holds metadata(ListEnvelope metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public ListEnvelope getMetadata() {
    return metadata;
  }

  public void setMetadata(ListEnvelope metadata) {
    this.metadata = metadata;
  }

  public Holds categories(List<HoldCategory> categories) {
    this.categories = categories;
    return this;
  }

  public Holds addCategoriesItem(HoldCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<HoldCategory>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/

  public List<HoldCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<HoldCategory> categories) {
    this.categories = categories;
  }

  public Holds results(List<Hold> results) {
    this.results = results;
    return this;
  }

  public Holds addResultsItem(Hold resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Hold>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/

  public List<Hold> getResults() {
    return results;
  }

  public void setResults(List<Hold> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holds holds = (Holds) o;
    return Objects.equals(this.actions, holds.actions) &&
        Objects.equals(this.metadata, holds.metadata) &&
        Objects.equals(this.categories, holds.categories) &&
        Objects.equals(this.results, holds.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, metadata, categories, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holds {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

