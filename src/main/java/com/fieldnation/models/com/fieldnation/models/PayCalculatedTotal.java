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
import com.fieldnation.models.PayCalculatedTotalTotal;

/**
 * PayCalculatedTotal
 */

public class PayCalculatedTotal {
  @SerializedName("total")
  private PayCalculatedTotalTotal total = null;

  @SerializedName("total_with_pending_expenses")
  private PayCalculatedTotalTotal totalWithPendingExpenses = null;

  public PayCalculatedTotal total(PayCalculatedTotalTotal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public PayCalculatedTotalTotal getTotal() {
    return total;
  }

  public void setTotal(PayCalculatedTotalTotal total) {
    this.total = total;
  }

  public PayCalculatedTotal totalWithPendingExpenses(PayCalculatedTotalTotal totalWithPendingExpenses) {
    this.totalWithPendingExpenses = totalWithPendingExpenses;
    return this;
  }

   /**
   * Get totalWithPendingExpenses
   * @return totalWithPendingExpenses
  **/

  public PayCalculatedTotalTotal getTotalWithPendingExpenses() {
    return totalWithPendingExpenses;
  }

  public void setTotalWithPendingExpenses(PayCalculatedTotalTotal totalWithPendingExpenses) {
    this.totalWithPendingExpenses = totalWithPendingExpenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayCalculatedTotal payCalculatedTotal = (PayCalculatedTotal) o;
    return Objects.equals(this.total, payCalculatedTotal.total) &&
        Objects.equals(this.totalWithPendingExpenses, payCalculatedTotal.totalWithPendingExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, totalWithPendingExpenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayCalculatedTotal {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalWithPendingExpenses: ").append(toIndentedString(totalWithPendingExpenses)).append("\n");
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

