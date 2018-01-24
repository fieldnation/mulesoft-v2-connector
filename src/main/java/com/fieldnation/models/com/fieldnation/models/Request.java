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


import com.fieldnation.models.ETA;
import com.fieldnation.models.Expense;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.MinimalWorkOrder;
import com.fieldnation.models.Pay;
import com.fieldnation.models.Schedule;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Request
 */

public class Request {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("counter")
  private Boolean counter = null;

  @SerializedName("counter_notes")
  private String counterNotes = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("expires")
  private java.util.Date expires = null;

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("eta")
  private ETA eta = null;

  @SerializedName("hour_estimate")
  private BigDecimal hourEstimate = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("user")
  private MinimalUser user = null;

  @SerializedName("work_order")
  private MinimalWorkOrder workOrder = null;

  @SerializedName("pay")
  private Pay pay = null;

  @SerializedName("expenses")
  private List<Expense> expenses = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    DELETE("delete");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  public Request id(Integer id) {
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

  public Request counter(Boolean counter) {
    this.counter = counter;
    return this;
  }

   /**
   * Get counter
   * @return counter
  **/

  public Boolean isCounter() {
    return counter;
  }

  public void setCounter(Boolean counter) {
    this.counter = counter;
  }

  public Request counterNotes(String counterNotes) {
    this.counterNotes = counterNotes;
    return this;
  }

   /**
   * Get counterNotes
   * @return counterNotes
  **/

  public String getCounterNotes() {
    return counterNotes;
  }

  public void setCounterNotes(String counterNotes) {
    this.counterNotes = counterNotes;
  }

  public Request active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Request created(java.util.Date created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/

  public java.util.Date getCreated() {
    return created;
  }

  public void setCreated(java.util.Date created) {
    this.created = created;
  }

  public Request expires(java.util.Date expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/

  public java.util.Date getExpires() {
    return expires;
  }

  public void setExpires(java.util.Date expires) {
    this.expires = expires;
  }

  public Request expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/

  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public Request schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/

  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public Request eta(ETA eta) {
    this.eta = eta;
    return this;
  }

   /**
   * Get eta
   * @return eta
  **/

  public ETA getEta() {
    return eta;
  }

  public void setEta(ETA eta) {
    this.eta = eta;
  }

  public Request hourEstimate(BigDecimal hourEstimate) {
    this.hourEstimate = hourEstimate;
    return this;
  }

   /**
   * Get hourEstimate
   * @return hourEstimate
  **/

  public BigDecimal getHourEstimate() {
    return hourEstimate;
  }

  public void setHourEstimate(BigDecimal hourEstimate) {
    this.hourEstimate = hourEstimate;
  }

  public Request notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Request user(MinimalUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/

  public MinimalUser getUser() {
    return user;
  }

  public void setUser(MinimalUser user) {
    this.user = user;
  }

  public Request workOrder(MinimalWorkOrder workOrder) {
    this.workOrder = workOrder;
    return this;
  }

   /**
   * Get workOrder
   * @return workOrder
  **/

  public MinimalWorkOrder getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(MinimalWorkOrder workOrder) {
    this.workOrder = workOrder;
  }

  public Request pay(Pay pay) {
    this.pay = pay;
    return this;
  }

   /**
   * Get pay
   * @return pay
  **/

  public Pay getPay() {
    return pay;
  }

  public void setPay(Pay pay) {
    this.pay = pay;
  }

  public Request expenses(List<Expense> expenses) {
    this.expenses = expenses;
    return this;
  }

  public Request addExpensesItem(Expense expensesItem) {
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

  public Request actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Request addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.id, request.id) &&
        Objects.equals(this.counter, request.counter) &&
        Objects.equals(this.counterNotes, request.counterNotes) &&
        Objects.equals(this.active, request.active) &&
        Objects.equals(this.created, request.created) &&
        Objects.equals(this.expires, request.expires) &&
        Objects.equals(this.expired, request.expired) &&
        Objects.equals(this.schedule, request.schedule) &&
        Objects.equals(this.eta, request.eta) &&
        Objects.equals(this.hourEstimate, request.hourEstimate) &&
        Objects.equals(this.notes, request.notes) &&
        Objects.equals(this.user, request.user) &&
        Objects.equals(this.workOrder, request.workOrder) &&
        Objects.equals(this.pay, request.pay) &&
        Objects.equals(this.expenses, request.expenses) &&
        Objects.equals(this.actions, request.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, counter, counterNotes, active, created, expires, expired, schedule, eta, hourEstimate, notes, user, workOrder, pay, expenses, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    counterNotes: ").append(toIndentedString(counterNotes)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    hourEstimate: ").append(toIndentedString(hourEstimate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
    sb.append("    pay: ").append(toIndentedString(pay)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

