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


import com.fieldnation.models.AttachmentFolder;
import com.fieldnation.models.CustomField;
import com.fieldnation.models.ETA;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.Shipment;
import com.fieldnation.models.Signature;
import com.fieldnation.models.TaskAlert;
import com.fieldnation.models.TaskDescriptions;
import com.fieldnation.models.TaskGroup;
import com.fieldnation.models.TaskType;
import com.fieldnation.models.TimeLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Task
 */

public class Task {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("alerts")
  private List<TaskAlert> alerts = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptions")
  private TaskDescriptions descriptions = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("group")
  private TaskGroup group = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    COMPLETE("complete"),
    
    INCOMPLETE("incomplete");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    INCOMPLETE("incomplete"),
    
    ALERTS("alerts"),
    
    COMPLETE("complete"),
    
    EDIT("edit"),
    
    DELETE("delete"),
    
    REORDER("reorder");

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

  @SerializedName("type")
  private TaskType type = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("completed")
  private java.util.Date completed = null;

  @SerializedName("check_in")
  private TimeLog checkIn = null;

  @SerializedName("check_out")
  private TimeLog checkOut = null;

  @SerializedName("closing_notes")
  private String closingNotes = null;

  @SerializedName("attachments")
  private AttachmentFolder attachments = null;

  @SerializedName("custom_field")
  private CustomField customField = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("signature")
  private Signature signature = null;

  @SerializedName("shipment")
  private Shipment shipment = null;

  @SerializedName("eta")
  private ETA eta = null;

  public Task id(Integer id) {
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

  public Task alerts(List<TaskAlert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Task addAlertsItem(TaskAlert alertsItem) {
    if (this.alerts == null) {
      this.alerts = new ArrayList<TaskAlert>();
    }
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/

  public List<TaskAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<TaskAlert> alerts) {
    this.alerts = alerts;
  }

  public Task description(String description) {
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

  public Task descriptions(TaskDescriptions descriptions) {
    this.descriptions = descriptions;
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/

  public TaskDescriptions getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(TaskDescriptions descriptions) {
    this.descriptions = descriptions;
  }

  public Task label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Task group(TaskGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/

  public TaskGroup getGroup() {
    return group;
  }

  public void setGroup(TaskGroup group) {
    this.group = group;
  }

  public Task status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Task actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Task addActionsItem(ActionsEnum actionsItem) {
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

  public Task type(TaskType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public TaskType getType() {
    return type;
  }

  public void setType(TaskType type) {
    this.type = type;
  }

  public Task created(java.util.Date created) {
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

  public Task author(MinimalUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/

  public MinimalUser getAuthor() {
    return author;
  }

  public void setAuthor(MinimalUser author) {
    this.author = author;
  }

  public Task completed(java.util.Date completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/

  public java.util.Date getCompleted() {
    return completed;
  }

  public void setCompleted(java.util.Date completed) {
    this.completed = completed;
  }

  public Task checkIn(TimeLog checkIn) {
    this.checkIn = checkIn;
    return this;
  }

   /**
   * Get checkIn
   * @return checkIn
  **/

  public TimeLog getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(TimeLog checkIn) {
    this.checkIn = checkIn;
  }

  public Task checkOut(TimeLog checkOut) {
    this.checkOut = checkOut;
    return this;
  }

   /**
   * Get checkOut
   * @return checkOut
  **/

  public TimeLog getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(TimeLog checkOut) {
    this.checkOut = checkOut;
  }

  public Task closingNotes(String closingNotes) {
    this.closingNotes = closingNotes;
    return this;
  }

   /**
   * Get closingNotes
   * @return closingNotes
  **/

  public String getClosingNotes() {
    return closingNotes;
  }

  public void setClosingNotes(String closingNotes) {
    this.closingNotes = closingNotes;
  }

  public Task attachments(AttachmentFolder attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/

  public AttachmentFolder getAttachments() {
    return attachments;
  }

  public void setAttachments(AttachmentFolder attachments) {
    this.attachments = attachments;
  }

  public Task customField(CustomField customField) {
    this.customField = customField;
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/

  public CustomField getCustomField() {
    return customField;
  }

  public void setCustomField(CustomField customField) {
    this.customField = customField;
  }

  public Task phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Task email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Task signature(Signature signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/

  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  public Task shipment(Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

   /**
   * Get shipment
   * @return shipment
  **/

  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public Task eta(ETA eta) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.alerts, task.alerts) &&
        Objects.equals(this.description, task.description) &&
        Objects.equals(this.descriptions, task.descriptions) &&
        Objects.equals(this.label, task.label) &&
        Objects.equals(this.group, task.group) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.actions, task.actions) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.created, task.created) &&
        Objects.equals(this.author, task.author) &&
        Objects.equals(this.completed, task.completed) &&
        Objects.equals(this.checkIn, task.checkIn) &&
        Objects.equals(this.checkOut, task.checkOut) &&
        Objects.equals(this.closingNotes, task.closingNotes) &&
        Objects.equals(this.attachments, task.attachments) &&
        Objects.equals(this.customField, task.customField) &&
        Objects.equals(this.phone, task.phone) &&
        Objects.equals(this.email, task.email) &&
        Objects.equals(this.signature, task.signature) &&
        Objects.equals(this.shipment, task.shipment) &&
        Objects.equals(this.eta, task.eta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alerts, description, descriptions, label, group, status, actions, type, created, author, completed, checkIn, checkOut, closingNotes, attachments, customField, phone, email, signature, shipment, eta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    closingNotes: ").append(toIndentedString(closingNotes)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
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

