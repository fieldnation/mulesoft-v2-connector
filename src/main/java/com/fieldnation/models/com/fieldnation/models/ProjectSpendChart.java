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
import com.fieldnation.models.ProjectSpendChartYGridLines;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ProjectSpendChart
 */

public class ProjectSpendChart {
  @SerializedName("dates")
  private List<String> dates = null;

  @SerializedName("spend")
  private Object spend = null;

  @SerializedName("budget")
  private List<BigDecimal> budget = null;

  @SerializedName("tickValues")
  private List<String> tickValues = null;

  @SerializedName("yGridLines")
  private List<ProjectSpendChartYGridLines> yGridLines = null;

  @SerializedName("yTickValues")
  private List<Integer> yTickValues = null;

  public ProjectSpendChart dates(List<String> dates) {
    this.dates = dates;
    return this;
  }

  public ProjectSpendChart addDatesItem(String datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<String>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/

  public List<String> getDates() {
    return dates;
  }

  public void setDates(List<String> dates) {
    this.dates = dates;
  }

  public ProjectSpendChart spend(Object spend) {
    this.spend = spend;
    return this;
  }

   /**
   * Get spend
   * @return spend
  **/

  public Object getSpend() {
    return spend;
  }

  public void setSpend(Object spend) {
    this.spend = spend;
  }

  public ProjectSpendChart budget(List<BigDecimal> budget) {
    this.budget = budget;
    return this;
  }

  public ProjectSpendChart addBudgetItem(BigDecimal budgetItem) {
    if (this.budget == null) {
      this.budget = new ArrayList<BigDecimal>();
    }
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/

  public List<BigDecimal> getBudget() {
    return budget;
  }

  public void setBudget(List<BigDecimal> budget) {
    this.budget = budget;
  }

  public ProjectSpendChart tickValues(List<String> tickValues) {
    this.tickValues = tickValues;
    return this;
  }

  public ProjectSpendChart addTickValuesItem(String tickValuesItem) {
    if (this.tickValues == null) {
      this.tickValues = new ArrayList<String>();
    }
    this.tickValues.add(tickValuesItem);
    return this;
  }

   /**
   * Get tickValues
   * @return tickValues
  **/

  public List<String> getTickValues() {
    return tickValues;
  }

  public void setTickValues(List<String> tickValues) {
    this.tickValues = tickValues;
  }

  public ProjectSpendChart yGridLines(List<ProjectSpendChartYGridLines> yGridLines) {
    this.yGridLines = yGridLines;
    return this;
  }

  public ProjectSpendChart addYGridLinesItem(ProjectSpendChartYGridLines yGridLinesItem) {
    if (this.yGridLines == null) {
      this.yGridLines = new ArrayList<ProjectSpendChartYGridLines>();
    }
    this.yGridLines.add(yGridLinesItem);
    return this;
  }

   /**
   * Get yGridLines
   * @return yGridLines
  **/

  public List<ProjectSpendChartYGridLines> getYGridLines() {
    return yGridLines;
  }

  public void setYGridLines(List<ProjectSpendChartYGridLines> yGridLines) {
    this.yGridLines = yGridLines;
  }

  public ProjectSpendChart yTickValues(List<Integer> yTickValues) {
    this.yTickValues = yTickValues;
    return this;
  }

  public ProjectSpendChart addYTickValuesItem(Integer yTickValuesItem) {
    if (this.yTickValues == null) {
      this.yTickValues = new ArrayList<Integer>();
    }
    this.yTickValues.add(yTickValuesItem);
    return this;
  }

   /**
   * Get yTickValues
   * @return yTickValues
  **/

  public List<Integer> getYTickValues() {
    return yTickValues;
  }

  public void setYTickValues(List<Integer> yTickValues) {
    this.yTickValues = yTickValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSpendChart projectSpendChart = (ProjectSpendChart) o;
    return Objects.equals(this.dates, projectSpendChart.dates) &&
        Objects.equals(this.spend, projectSpendChart.spend) &&
        Objects.equals(this.budget, projectSpendChart.budget) &&
        Objects.equals(this.tickValues, projectSpendChart.tickValues) &&
        Objects.equals(this.yGridLines, projectSpendChart.yGridLines) &&
        Objects.equals(this.yTickValues, projectSpendChart.yTickValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, spend, budget, tickValues, yGridLines, yTickValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSpendChart {\n");
    
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    spend: ").append(toIndentedString(spend)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    tickValues: ").append(toIndentedString(tickValues)).append("\n");
    sb.append("    yGridLines: ").append(toIndentedString(yGridLines)).append("\n");
    sb.append("    yTickValues: ").append(toIndentedString(yTickValues)).append("\n");
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

