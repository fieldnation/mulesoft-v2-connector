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


import com.fieldnation.models.Expense;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkordersworkOrderIdexpensesExpenses
 */

public class WorkordersworkOrderIdexpensesExpenses {
  @SerializedName("expenses")
  private List<Expense> expenses = null;

  public WorkordersworkOrderIdexpensesExpenses expenses(List<Expense> expenses) {
    this.expenses = expenses;
    return this;
  }

  public WorkordersworkOrderIdexpensesExpenses addExpensesItem(Expense expensesItem) {
    if (this.expenses == null) {
      this.expenses = new ArrayList<Expense>();
    }
    this.expenses.add(expensesItem);
    return this;
  }

   /**
   * Get expenses
   * @return expenses
  **/

  public List<Expense> getExpenses() {
    return expenses;
  }

  public void setExpenses(List<Expense> expenses) {
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
    WorkordersworkOrderIdexpensesExpenses workordersworkOrderIdexpensesExpenses = (WorkordersworkOrderIdexpensesExpenses) o;
    return Objects.equals(this.expenses, workordersworkOrderIdexpensesExpenses.expenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkordersworkOrderIdexpensesExpenses {\n");
    
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

