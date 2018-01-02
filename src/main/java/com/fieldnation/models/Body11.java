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


import com.fieldnation.models.WorkordersworkOrderIdexpensesExpenses;
import java.io.IOException;

/**
 * JSON Model
 */


public class Body11 {
  @SerializedName("expenses")
  private WorkordersworkOrderIdexpensesExpenses expenses = null;

  public Body11 expenses(WorkordersworkOrderIdexpensesExpenses expenses) {
    this.expenses = expenses;
    return this;
  }

   /**
   * Get expenses
   * @return expenses
  **/

  public WorkordersworkOrderIdexpensesExpenses getExpenses() {
    return expenses;
  }

  public void setExpenses(WorkordersworkOrderIdexpensesExpenses expenses) {
    this.expenses = expenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body11 body11 = (Body11) o;
    return Objects.equals(this.expenses, body11.expenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body11 {\n");
    
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
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

