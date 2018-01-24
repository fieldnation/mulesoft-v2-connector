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

/**
 * SelectionRuleSum
 */

public class SelectionRuleSum {
  @SerializedName("match")
  private Integer match = null;

  @SerializedName("no_match_optional")
  private Integer noMatchOptional = null;

  @SerializedName("no_match_required")
  private Integer noMatchRequired = null;

  @SerializedName("total")
  private Integer total = null;

  public SelectionRuleSum match(Integer match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/

  public Integer getMatch() {
    return match;
  }

  public void setMatch(Integer match) {
    this.match = match;
  }

  public SelectionRuleSum noMatchOptional(Integer noMatchOptional) {
    this.noMatchOptional = noMatchOptional;
    return this;
  }

   /**
   * Get noMatchOptional
   * @return noMatchOptional
  **/

  public Integer getNoMatchOptional() {
    return noMatchOptional;
  }

  public void setNoMatchOptional(Integer noMatchOptional) {
    this.noMatchOptional = noMatchOptional;
  }

  public SelectionRuleSum noMatchRequired(Integer noMatchRequired) {
    this.noMatchRequired = noMatchRequired;
    return this;
  }

   /**
   * Get noMatchRequired
   * @return noMatchRequired
  **/

  public Integer getNoMatchRequired() {
    return noMatchRequired;
  }

  public void setNoMatchRequired(Integer noMatchRequired) {
    this.noMatchRequired = noMatchRequired;
  }

  public SelectionRuleSum total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionRuleSum selectionRuleSum = (SelectionRuleSum) o;
    return Objects.equals(this.match, selectionRuleSum.match) &&
        Objects.equals(this.noMatchOptional, selectionRuleSum.noMatchOptional) &&
        Objects.equals(this.noMatchRequired, selectionRuleSum.noMatchRequired) &&
        Objects.equals(this.total, selectionRuleSum.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, noMatchOptional, noMatchRequired, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionRuleSum {\n");
    
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    noMatchOptional: ").append(toIndentedString(noMatchOptional)).append("\n");
    sb.append("    noMatchRequired: ").append(toIndentedString(noMatchRequired)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

