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


import com.fieldnation.models.OnMyWay;
import com.fieldnation.models.ScheduleServiceWindow;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Schedule
 */

public class Schedule {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  /**
   * Gets or Sets todayTomorrow
   */
  @JsonAdapter(TodayTomorrowEnum.Adapter.class)
  public enum TodayTomorrowEnum {
    TODAY("Today"),
    
    TOMORROW("Tomorrow"),
    
    EMPTY("");

    private String value;

    TodayTomorrowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TodayTomorrowEnum fromValue(String text) {
      for (TodayTomorrowEnum b : TodayTomorrowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TodayTomorrowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TodayTomorrowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TodayTomorrowEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TodayTomorrowEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("today_tomorrow")
  private TodayTomorrowEnum todayTomorrow = null;

  @SerializedName("service_window")
  private ScheduleServiceWindow serviceWindow = null;

  @SerializedName("on_my_way")
  private OnMyWay onMyWay = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("status_id")
  private Integer statusId = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit");

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

  @SerializedName("no_refresh")
  private Boolean noRefresh = null;

  public Schedule workOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
    return this;
  }

   /**
   * Get workOrderId
   * @return workOrderId
  **/

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }

  public Schedule correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public Schedule todayTomorrow(TodayTomorrowEnum todayTomorrow) {
    this.todayTomorrow = todayTomorrow;
    return this;
  }

   /**
   * Get todayTomorrow
   * @return todayTomorrow
  **/

  public TodayTomorrowEnum getTodayTomorrow() {
    return todayTomorrow;
  }

  public void setTodayTomorrow(TodayTomorrowEnum todayTomorrow) {
    this.todayTomorrow = todayTomorrow;
  }

  public Schedule serviceWindow(ScheduleServiceWindow serviceWindow) {
    this.serviceWindow = serviceWindow;
    return this;
  }

   /**
   * Get serviceWindow
   * @return serviceWindow
  **/

  public ScheduleServiceWindow getServiceWindow() {
    return serviceWindow;
  }

  public void setServiceWindow(ScheduleServiceWindow serviceWindow) {
    this.serviceWindow = serviceWindow;
  }

  public Schedule onMyWay(OnMyWay onMyWay) {
    this.onMyWay = onMyWay;
    return this;
  }

   /**
   * Get onMyWay
   * @return onMyWay
  **/

  public OnMyWay getOnMyWay() {
    return onMyWay;
  }

  public void setOnMyWay(OnMyWay onMyWay) {
    this.onMyWay = onMyWay;
  }

  public Schedule timeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/

  public TimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public Schedule role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Schedule statusId(Integer statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * Get statusId
   * @return statusId
  **/

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public Schedule actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Schedule addActionsItem(ActionsEnum actionsItem) {
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

  public Schedule noRefresh(Boolean noRefresh) {
    this.noRefresh = noRefresh;
    return this;
  }

   /**
   * Get noRefresh
   * @return noRefresh
  **/

  public Boolean isNoRefresh() {
    return noRefresh;
  }

  public void setNoRefresh(Boolean noRefresh) {
    this.noRefresh = noRefresh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.workOrderId, schedule.workOrderId) &&
        Objects.equals(this.correlationId, schedule.correlationId) &&
        Objects.equals(this.todayTomorrow, schedule.todayTomorrow) &&
        Objects.equals(this.serviceWindow, schedule.serviceWindow) &&
        Objects.equals(this.onMyWay, schedule.onMyWay) &&
        Objects.equals(this.timeZone, schedule.timeZone) &&
        Objects.equals(this.role, schedule.role) &&
        Objects.equals(this.statusId, schedule.statusId) &&
        Objects.equals(this.actions, schedule.actions) &&
        Objects.equals(this.noRefresh, schedule.noRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, correlationId, todayTomorrow, serviceWindow, onMyWay, timeZone, role, statusId, actions, noRefresh);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    todayTomorrow: ").append(toIndentedString(todayTomorrow)).append("\n");
    sb.append("    serviceWindow: ").append(toIndentedString(serviceWindow)).append("\n");
    sb.append("    onMyWay: ").append(toIndentedString(onMyWay)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    noRefresh: ").append(toIndentedString(noRefresh)).append("\n");
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

