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


import com.fieldnation.models.Condition;
import com.fieldnation.models.ETAStatus;
import com.fieldnation.models.MinimalTask;
import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ETA
 */

public class ETA {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  @SerializedName("user")
  private MinimalUser user = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    HOURS("hours"),
    
    BETWEEN("between"),
    
    EXACT("exact");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("start")
  private java.util.Date start = null;

  @SerializedName("end")
  private java.util.Date end = null;

  @SerializedName("hour_estimate")
  private BigDecimal hourEstimate = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("status")
  private ETAStatus status = null;

  @SerializedName("condition")
  private Condition condition = null;

  @SerializedName("task")
  private MinimalTask task = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    ADD("add"),
    
    EDIT("edit"),
    
    SET_ETA("set_eta"),
    
    CONFIRM("confirm"),
    
    RUNNING_LATE("running_late"),
    
    CANCEL("cancel"),
    
    ON_MY_WAY("on_my_way"),
    
    MARK_READY_TO_GO("mark_ready_to_go");

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

  public ETA workOrderId(Integer workOrderId) {
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

  public ETA user(MinimalUser user) {
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

  public ETA mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/

  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public ETA start(java.util.Date start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/

  public java.util.Date getStart() {
    return start;
  }

  public void setStart(java.util.Date start) {
    this.start = start;
  }

  public ETA end(java.util.Date end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/

  public java.util.Date getEnd() {
    return end;
  }

  public void setEnd(java.util.Date end) {
    this.end = end;
  }

  public ETA hourEstimate(BigDecimal hourEstimate) {
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

  public ETA notes(String notes) {
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

  public ETA status(ETAStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public ETAStatus getStatus() {
    return status;
  }

  public void setStatus(ETAStatus status) {
    this.status = status;
  }

  public ETA condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/

  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public ETA task(MinimalTask task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/

  public MinimalTask getTask() {
    return task;
  }

  public void setTask(MinimalTask task) {
    this.task = task;
  }

  public ETA actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public ETA addActionsItem(ActionsEnum actionsItem) {
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
    ETA ETA = (ETA) o;
    return Objects.equals(this.workOrderId, ETA.workOrderId) &&
        Objects.equals(this.user, ETA.user) &&
        Objects.equals(this.mode, ETA.mode) &&
        Objects.equals(this.start, ETA.start) &&
        Objects.equals(this.end, ETA.end) &&
        Objects.equals(this.hourEstimate, ETA.hourEstimate) &&
        Objects.equals(this.notes, ETA.notes) &&
        Objects.equals(this.status, ETA.status) &&
        Objects.equals(this.condition, ETA.condition) &&
        Objects.equals(this.task, ETA.task) &&
        Objects.equals(this.actions, ETA.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, user, mode, start, end, hourEstimate, notes, status, condition, task, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETA {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    hourEstimate: ").append(toIndentedString(hourEstimate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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

