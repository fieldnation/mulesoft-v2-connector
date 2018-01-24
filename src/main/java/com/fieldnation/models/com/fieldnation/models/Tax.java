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
 * Tax
 */

public class Tax {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("tax_id")
  private String taxId = null;

  @SerializedName("year")
  private String year = null;

  @SerializedName("total_paid")
  private BigDecimal totalPaid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("action")
  private String action = null;

  public Tax id(Integer id) {
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

  public Tax taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/

  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public Tax year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Tax totalPaid(BigDecimal totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

   /**
   * Get totalPaid
   * @return totalPaid
  **/

  public BigDecimal getTotalPaid() {
    return totalPaid;
  }

  public void setTotalPaid(BigDecimal totalPaid) {
    this.totalPaid = totalPaid;
  }

  public Tax type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Tax action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.id, tax.id) &&
        Objects.equals(this.taxId, tax.taxId) &&
        Objects.equals(this.year, tax.year) &&
        Objects.equals(this.totalPaid, tax.totalPaid) &&
        Objects.equals(this.type, tax.type) &&
        Objects.equals(this.action, tax.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taxId, year, totalPaid, type, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

