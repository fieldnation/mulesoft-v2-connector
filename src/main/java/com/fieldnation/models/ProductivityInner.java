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
 * ProductivityInner
 */

public class ProductivityInner {
  @SerializedName("manager")
  private String manager = null;

  @SerializedName("today_published")
  private BigDecimal todayPublished = null;

  @SerializedName("today_pending")
  private BigDecimal todayPending = null;

  @SerializedName("today_in_progress")
  private BigDecimal todayInProgress = null;

  @SerializedName("today_completed")
  private BigDecimal todayCompleted = null;

  @SerializedName("today_on_hold")
  private BigDecimal todayOnHold = null;

  @SerializedName("week_published")
  private BigDecimal weekPublished = null;

  @SerializedName("week_pending")
  private BigDecimal weekPending = null;

  @SerializedName("week_in_progress")
  private BigDecimal weekInProgress = null;

  @SerializedName("week_completed")
  private BigDecimal weekCompleted = null;

  @SerializedName("week_on_hold")
  private BigDecimal weekOnHold = null;

  @SerializedName("tomorrow")
  private BigDecimal tomorrow = null;

  @SerializedName("this_week")
  private BigDecimal thisWeek = null;

  @SerializedName("next_week")
  private BigDecimal nextWeek = null;

  @SerializedName("next_four_weeks")
  private BigDecimal nextFourWeeks = null;

  @SerializedName("jeopardy")
  private BigDecimal jeopardy = null;

  @SerializedName("completed")
  private BigDecimal completed = null;

  public ProductivityInner manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Site Manager name
   * @return manager
  **/
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public ProductivityInner todayPublished(BigDecimal todayPublished) {
    this.todayPublished = todayPublished;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Published
   * @return todayPublished
  **/
  public BigDecimal getTodayPublished() {
    return todayPublished;
  }

  public void setTodayPublished(BigDecimal todayPublished) {
    this.todayPublished = todayPublished;
  }

  public ProductivityInner todayPending(BigDecimal todayPending) {
    this.todayPending = todayPending;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Pending
   * @return todayPending
  **/
  public BigDecimal getTodayPending() {
    return todayPending;
  }

  public void setTodayPending(BigDecimal todayPending) {
    this.todayPending = todayPending;
  }

  public ProductivityInner todayInProgress(BigDecimal todayInProgress) {
    this.todayInProgress = todayInProgress;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s In Progress
   * @return todayInProgress
  **/
  public BigDecimal getTodayInProgress() {
    return todayInProgress;
  }

  public void setTodayInProgress(BigDecimal todayInProgress) {
    this.todayInProgress = todayInProgress;
  }

  public ProductivityInner todayCompleted(BigDecimal todayCompleted) {
    this.todayCompleted = todayCompleted;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s Completed
   * @return todayCompleted
  **/
  public BigDecimal getTodayCompleted() {
    return todayCompleted;
  }

  public void setTodayCompleted(BigDecimal todayCompleted) {
    this.todayCompleted = todayCompleted;
  }

  public ProductivityInner todayOnHold(BigDecimal todayOnHold) {
    this.todayOnHold = todayOnHold;
    return this;
  }

   /**
   * Today&#39;s WO&#39;s ON Hold
   * @return todayOnHold
  **/
  public BigDecimal getTodayOnHold() {
    return todayOnHold;
  }

  public void setTodayOnHold(BigDecimal todayOnHold) {
    this.todayOnHold = todayOnHold;
  }

  public ProductivityInner weekPublished(BigDecimal weekPublished) {
    this.weekPublished = weekPublished;
    return this;
  }

   /**
   * Week&#39;s WO&#39;s Published
   * @return weekPublished
  **/
  public BigDecimal getWeekPublished() {
    return weekPublished;
  }

  public void setWeekPublished(BigDecimal weekPublished) {
    this.weekPublished = weekPublished;
  }

  public ProductivityInner weekPending(BigDecimal weekPending) {
    this.weekPending = weekPending;
    return this;
  }

   /**
   * Week&#39;s WO&#39;s Pending
   * @return weekPending
  **/
  public BigDecimal getWeekPending() {
    return weekPending;
  }

  public void setWeekPending(BigDecimal weekPending) {
    this.weekPending = weekPending;
  }

  public ProductivityInner weekInProgress(BigDecimal weekInProgress) {
    this.weekInProgress = weekInProgress;
    return this;
  }

   /**
   * Week&#39;s WO&#39;s In Progress
   * @return weekInProgress
  **/
  public BigDecimal getWeekInProgress() {
    return weekInProgress;
  }

  public void setWeekInProgress(BigDecimal weekInProgress) {
    this.weekInProgress = weekInProgress;
  }

  public ProductivityInner weekCompleted(BigDecimal weekCompleted) {
    this.weekCompleted = weekCompleted;
    return this;
  }

   /**
   * Week&#39;s WO&#39;s Completed
   * @return weekCompleted
  **/
  public BigDecimal getWeekCompleted() {
    return weekCompleted;
  }

  public void setWeekCompleted(BigDecimal weekCompleted) {
    this.weekCompleted = weekCompleted;
  }

  public ProductivityInner weekOnHold(BigDecimal weekOnHold) {
    this.weekOnHold = weekOnHold;
    return this;
  }

   /**
   * Week&#39;s WO&#39;s ON Hold
   * @return weekOnHold
  **/
  public BigDecimal getWeekOnHold() {
    return weekOnHold;
  }

  public void setWeekOnHold(BigDecimal weekOnHold) {
    this.weekOnHold = weekOnHold;
  }

  public ProductivityInner tomorrow(BigDecimal tomorrow) {
    this.tomorrow = tomorrow;
    return this;
  }

   /**
   * WO&#39;s Tomorrow
   * @return tomorrow
  **/
  public BigDecimal getTomorrow() {
    return tomorrow;
  }

  public void setTomorrow(BigDecimal tomorrow) {
    this.tomorrow = tomorrow;
  }

  public ProductivityInner thisWeek(BigDecimal thisWeek) {
    this.thisWeek = thisWeek;
    return this;
  }

   /**
   * WO&#39;s This Week
   * @return thisWeek
  **/
  public BigDecimal getThisWeek() {
    return thisWeek;
  }

  public void setThisWeek(BigDecimal thisWeek) {
    this.thisWeek = thisWeek;
  }

  public ProductivityInner nextWeek(BigDecimal nextWeek) {
    this.nextWeek = nextWeek;
    return this;
  }

   /**
   * WO&#39;s Next Week
   * @return nextWeek
  **/
  public BigDecimal getNextWeek() {
    return nextWeek;
  }

  public void setNextWeek(BigDecimal nextWeek) {
    this.nextWeek = nextWeek;
  }

  public ProductivityInner nextFourWeeks(BigDecimal nextFourWeeks) {
    this.nextFourWeeks = nextFourWeeks;
    return this;
  }

   /**
   * WO&#39;s Next 4 Weeks
   * @return nextFourWeeks
  **/
  public BigDecimal getNextFourWeeks() {
    return nextFourWeeks;
  }

  public void setNextFourWeeks(BigDecimal nextFourWeeks) {
    this.nextFourWeeks = nextFourWeeks;
  }

  public ProductivityInner jeopardy(BigDecimal jeopardy) {
    this.jeopardy = jeopardy;
    return this;
  }

   /**
   * 72HR Jeopardy
   * @return jeopardy
  **/
  public BigDecimal getJeopardy() {
    return jeopardy;
  }

  public void setJeopardy(BigDecimal jeopardy) {
    this.jeopardy = jeopardy;
  }

  public ProductivityInner completed(BigDecimal completed) {
    this.completed = completed;
    return this;
  }

   /**
   * WO&#39;s Completed to Date
   * @return completed
  **/
  public BigDecimal getCompleted() {
    return completed;
  }

  public void setCompleted(BigDecimal completed) {
    this.completed = completed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductivityInner productivityInner = (ProductivityInner) o;
    return Objects.equals(this.manager, productivityInner.manager) &&
        Objects.equals(this.todayPublished, productivityInner.todayPublished) &&
        Objects.equals(this.todayPending, productivityInner.todayPending) &&
        Objects.equals(this.todayInProgress, productivityInner.todayInProgress) &&
        Objects.equals(this.todayCompleted, productivityInner.todayCompleted) &&
        Objects.equals(this.todayOnHold, productivityInner.todayOnHold) &&
        Objects.equals(this.weekPublished, productivityInner.weekPublished) &&
        Objects.equals(this.weekPending, productivityInner.weekPending) &&
        Objects.equals(this.weekInProgress, productivityInner.weekInProgress) &&
        Objects.equals(this.weekCompleted, productivityInner.weekCompleted) &&
        Objects.equals(this.weekOnHold, productivityInner.weekOnHold) &&
        Objects.equals(this.tomorrow, productivityInner.tomorrow) &&
        Objects.equals(this.thisWeek, productivityInner.thisWeek) &&
        Objects.equals(this.nextWeek, productivityInner.nextWeek) &&
        Objects.equals(this.nextFourWeeks, productivityInner.nextFourWeeks) &&
        Objects.equals(this.jeopardy, productivityInner.jeopardy) &&
        Objects.equals(this.completed, productivityInner.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manager, todayPublished, todayPending, todayInProgress, todayCompleted, todayOnHold, weekPublished, weekPending, weekInProgress, weekCompleted, weekOnHold, tomorrow, thisWeek, nextWeek, nextFourWeeks, jeopardy, completed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductivityInner {\n");
    
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    todayPublished: ").append(toIndentedString(todayPublished)).append("\n");
    sb.append("    todayPending: ").append(toIndentedString(todayPending)).append("\n");
    sb.append("    todayInProgress: ").append(toIndentedString(todayInProgress)).append("\n");
    sb.append("    todayCompleted: ").append(toIndentedString(todayCompleted)).append("\n");
    sb.append("    todayOnHold: ").append(toIndentedString(todayOnHold)).append("\n");
    sb.append("    weekPublished: ").append(toIndentedString(weekPublished)).append("\n");
    sb.append("    weekPending: ").append(toIndentedString(weekPending)).append("\n");
    sb.append("    weekInProgress: ").append(toIndentedString(weekInProgress)).append("\n");
    sb.append("    weekCompleted: ").append(toIndentedString(weekCompleted)).append("\n");
    sb.append("    weekOnHold: ").append(toIndentedString(weekOnHold)).append("\n");
    sb.append("    tomorrow: ").append(toIndentedString(tomorrow)).append("\n");
    sb.append("    thisWeek: ").append(toIndentedString(thisWeek)).append("\n");
    sb.append("    nextWeek: ").append(toIndentedString(nextWeek)).append("\n");
    sb.append("    nextFourWeeks: ").append(toIndentedString(nextFourWeeks)).append("\n");
    sb.append("    jeopardy: ").append(toIndentedString(jeopardy)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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

