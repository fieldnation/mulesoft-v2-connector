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
 * PayFinance
 */

public class PayFinance {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("terms")
  private String terms = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("limit")
  private BigDecimal limit = null;

  public PayFinance id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PayFinance terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/

  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public PayFinance description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PayFinance limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/

  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayFinance payFinance = (PayFinance) o;
    return Objects.equals(this.id, payFinance.id) &&
        Objects.equals(this.terms, payFinance.terms) &&
        Objects.equals(this.description, payFinance.description) &&
        Objects.equals(this.limit, payFinance.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terms, description, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayFinance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

