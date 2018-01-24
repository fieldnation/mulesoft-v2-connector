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
 * ExpenseCompanyExpense
 */

public class ExpenseCompanyExpense {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("expense_amount")
  private BigDecimal expenseAmount = null;

  @SerializedName("hidden_tags")
  private String hiddenTags = null;

  @SerializedName("api_code")
  private String apiCode = null;

  @SerializedName("description")
  private String description = null;

  public ExpenseCompanyExpense id(Integer id) {
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

  public ExpenseCompanyExpense expenseAmount(BigDecimal expenseAmount) {
    this.expenseAmount = expenseAmount;
    return this;
  }

   /**
   * Get expenseAmount
   * @return expenseAmount
  **/

  public BigDecimal getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(BigDecimal expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public ExpenseCompanyExpense hiddenTags(String hiddenTags) {
    this.hiddenTags = hiddenTags;
    return this;
  }

   /**
   * Get hiddenTags
   * @return hiddenTags
  **/

  public String getHiddenTags() {
    return hiddenTags;
  }

  public void setHiddenTags(String hiddenTags) {
    this.hiddenTags = hiddenTags;
  }

  public ExpenseCompanyExpense apiCode(String apiCode) {
    this.apiCode = apiCode;
    return this;
  }

   /**
   * Get apiCode
   * @return apiCode
  **/

  public String getApiCode() {
    return apiCode;
  }

  public void setApiCode(String apiCode) {
    this.apiCode = apiCode;
  }

  public ExpenseCompanyExpense description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseCompanyExpense expenseCompanyExpense = (ExpenseCompanyExpense) o;
    return Objects.equals(this.id, expenseCompanyExpense.id) &&
        Objects.equals(this.expenseAmount, expenseCompanyExpense.expenseAmount) &&
        Objects.equals(this.hiddenTags, expenseCompanyExpense.hiddenTags) &&
        Objects.equals(this.apiCode, expenseCompanyExpense.apiCode) &&
        Objects.equals(this.description, expenseCompanyExpense.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expenseAmount, hiddenTags, apiCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseCompanyExpense {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expenseAmount: ").append(toIndentedString(expenseAmount)).append("\n");
    sb.append("    hiddenTags: ").append(toIndentedString(hiddenTags)).append("\n");
    sb.append("    apiCode: ").append(toIndentedString(apiCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

