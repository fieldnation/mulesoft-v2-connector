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
 * PayBase
 */

public class PayBase {
  @SerializedName("units")
  private BigDecimal units = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  public PayBase units(BigDecimal units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/

  public BigDecimal getUnits() {
    return units;
  }

  public void setUnits(BigDecimal units) {
    this.units = units;
  }

  public PayBase amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayBase payBase = (PayBase) o;
    return Objects.equals(this.units, payBase.units) &&
        Objects.equals(this.amount, payBase.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayBase {\n");
    
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

