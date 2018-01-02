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


import com.fieldnation.models.AutoDispatch;
import com.fieldnation.models.Client;
import com.fieldnation.models.Finance;
import com.fieldnation.models.ListEnvelopeTimings;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.Network;
import com.fieldnation.models.ProjectNotifications;
import com.fieldnation.models.ProjectSpendChart;
import com.fieldnation.models.ProjectWorkOrdersCounts;
import com.fieldnation.models.SelectionRule;
import com.fieldnation.models.ServiceContract;
import com.fieldnation.models.Templates;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Project
 */

public class Project {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    CANCEL("cancel"),
    
    COMPLETE("complete"),
    
    REOPEN("reopen"),
    
    CREATE_TEMPLATE("create_template"),
    
    CREATE_WORK_ORDER("create_work_order"),
    
    LATE_NOTIFICATION("late_notification"),
    
    CANCELLATION_FEE("cancellation_fee"),
    
    EDIT("edit"),
    
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

  @SerializedName("client")
  private Client client = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled");

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

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("start")
  private java.util.Date start = null;

  @SerializedName("end")
  private java.util.Date end = null;

  @SerializedName("policy_and_procedures")
  private String policyAndProcedures = null;

  @SerializedName("standard_instructions")
  private String standardInstructions = null;

  @SerializedName("network")
  private Network network = null;

  @SerializedName("manager")
  private MinimalUser manager = null;

  @SerializedName("templates")
  private Templates templates = null;

  @SerializedName("finance")
  private Finance finance = null;

  @SerializedName("cancellation_fee")
  private BigDecimal cancellationFee = null;

  @SerializedName("service_contract")
  private ServiceContract serviceContract = null;

  @SerializedName("selection_rule")
  private SelectionRule selectionRule = null;

  @SerializedName("auto_dispatch")
  private AutoDispatch autoDispatch = null;

  @SerializedName("late_notification")
  private Boolean lateNotification = null;

  @SerializedName("notifications")
  private ProjectNotifications notifications = null;

  @SerializedName("work_orders_counts")
  private ProjectWorkOrdersCounts workOrdersCounts = null;

  @SerializedName("spend_chart")
  private ProjectSpendChart spendChart = null;

  @SerializedName("timings")
  private List<ListEnvelopeTimings> timings = null;

  public Project id(Integer id) {
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

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project correlationId(String correlationId) {
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

  public Project actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Project addActionsItem(ActionsEnum actionsItem) {
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

  public Project client(Client client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Project status(StatusEnum status) {
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

  public Project created(java.util.Date created) {
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

  public Project start(java.util.Date start) {
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

  public Project end(java.util.Date end) {
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

  public Project policyAndProcedures(String policyAndProcedures) {
    this.policyAndProcedures = policyAndProcedures;
    return this;
  }

   /**
   * Get policyAndProcedures
   * @return policyAndProcedures
  **/

  public String getPolicyAndProcedures() {
    return policyAndProcedures;
  }

  public void setPolicyAndProcedures(String policyAndProcedures) {
    this.policyAndProcedures = policyAndProcedures;
  }

  public Project standardInstructions(String standardInstructions) {
    this.standardInstructions = standardInstructions;
    return this;
  }

   /**
   * Get standardInstructions
   * @return standardInstructions
  **/

  public String getStandardInstructions() {
    return standardInstructions;
  }

  public void setStandardInstructions(String standardInstructions) {
    this.standardInstructions = standardInstructions;
  }

  public Project network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/

  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public Project manager(MinimalUser manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/

  public MinimalUser getManager() {
    return manager;
  }

  public void setManager(MinimalUser manager) {
    this.manager = manager;
  }

  public Project templates(Templates templates) {
    this.templates = templates;
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/

  public Templates getTemplates() {
    return templates;
  }

  public void setTemplates(Templates templates) {
    this.templates = templates;
  }

  public Project finance(Finance finance) {
    this.finance = finance;
    return this;
  }

   /**
   * Get finance
   * @return finance
  **/

  public Finance getFinance() {
    return finance;
  }

  public void setFinance(Finance finance) {
    this.finance = finance;
  }

  public Project cancellationFee(BigDecimal cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

   /**
   * Get cancellationFee
   * @return cancellationFee
  **/

  public BigDecimal getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(BigDecimal cancellationFee) {
    this.cancellationFee = cancellationFee;
  }

  public Project serviceContract(ServiceContract serviceContract) {
    this.serviceContract = serviceContract;
    return this;
  }

   /**
   * Get serviceContract
   * @return serviceContract
  **/

  public ServiceContract getServiceContract() {
    return serviceContract;
  }

  public void setServiceContract(ServiceContract serviceContract) {
    this.serviceContract = serviceContract;
  }

  public Project selectionRule(SelectionRule selectionRule) {
    this.selectionRule = selectionRule;
    return this;
  }

   /**
   * Get selectionRule
   * @return selectionRule
  **/

  public SelectionRule getSelectionRule() {
    return selectionRule;
  }

  public void setSelectionRule(SelectionRule selectionRule) {
    this.selectionRule = selectionRule;
  }

  public Project autoDispatch(AutoDispatch autoDispatch) {
    this.autoDispatch = autoDispatch;
    return this;
  }

   /**
   * Get autoDispatch
   * @return autoDispatch
  **/

  public AutoDispatch getAutoDispatch() {
    return autoDispatch;
  }

  public void setAutoDispatch(AutoDispatch autoDispatch) {
    this.autoDispatch = autoDispatch;
  }

  public Project lateNotification(Boolean lateNotification) {
    this.lateNotification = lateNotification;
    return this;
  }

   /**
   * Get lateNotification
   * @return lateNotification
  **/

  public Boolean isLateNotification() {
    return lateNotification;
  }

  public void setLateNotification(Boolean lateNotification) {
    this.lateNotification = lateNotification;
  }

  public Project notifications(ProjectNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/

  public ProjectNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(ProjectNotifications notifications) {
    this.notifications = notifications;
  }

  public Project workOrdersCounts(ProjectWorkOrdersCounts workOrdersCounts) {
    this.workOrdersCounts = workOrdersCounts;
    return this;
  }

   /**
   * Get workOrdersCounts
   * @return workOrdersCounts
  **/

  public ProjectWorkOrdersCounts getWorkOrdersCounts() {
    return workOrdersCounts;
  }

  public void setWorkOrdersCounts(ProjectWorkOrdersCounts workOrdersCounts) {
    this.workOrdersCounts = workOrdersCounts;
  }

  public Project spendChart(ProjectSpendChart spendChart) {
    this.spendChart = spendChart;
    return this;
  }

   /**
   * Get spendChart
   * @return spendChart
  **/

  public ProjectSpendChart getSpendChart() {
    return spendChart;
  }

  public void setSpendChart(ProjectSpendChart spendChart) {
    this.spendChart = spendChart;
  }

  public Project timings(List<ListEnvelopeTimings> timings) {
    this.timings = timings;
    return this;
  }

  public Project addTimingsItem(ListEnvelopeTimings timingsItem) {
    if (this.timings == null) {
      this.timings = new ArrayList<ListEnvelopeTimings>();
    }
    this.timings.add(timingsItem);
    return this;
  }

   /**
   * Get timings
   * @return timings
  **/

  public List<ListEnvelopeTimings> getTimings() {
    return timings;
  }

  public void setTimings(List<ListEnvelopeTimings> timings) {
    this.timings = timings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.correlationId, project.correlationId) &&
        Objects.equals(this.actions, project.actions) &&
        Objects.equals(this.client, project.client) &&
        Objects.equals(this.status, project.status) &&
        Objects.equals(this.created, project.created) &&
        Objects.equals(this.start, project.start) &&
        Objects.equals(this.end, project.end) &&
        Objects.equals(this.policyAndProcedures, project.policyAndProcedures) &&
        Objects.equals(this.standardInstructions, project.standardInstructions) &&
        Objects.equals(this.network, project.network) &&
        Objects.equals(this.manager, project.manager) &&
        Objects.equals(this.templates, project.templates) &&
        Objects.equals(this.finance, project.finance) &&
        Objects.equals(this.cancellationFee, project.cancellationFee) &&
        Objects.equals(this.serviceContract, project.serviceContract) &&
        Objects.equals(this.selectionRule, project.selectionRule) &&
        Objects.equals(this.autoDispatch, project.autoDispatch) &&
        Objects.equals(this.lateNotification, project.lateNotification) &&
        Objects.equals(this.notifications, project.notifications) &&
        Objects.equals(this.workOrdersCounts, project.workOrdersCounts) &&
        Objects.equals(this.spendChart, project.spendChart) &&
        Objects.equals(this.timings, project.timings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, correlationId, actions, client, status, created, start, end, policyAndProcedures, standardInstructions, network, manager, templates, finance, cancellationFee, serviceContract, selectionRule, autoDispatch, lateNotification, notifications, workOrdersCounts, spendChart, timings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    policyAndProcedures: ").append(toIndentedString(policyAndProcedures)).append("\n");
    sb.append("    standardInstructions: ").append(toIndentedString(standardInstructions)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    finance: ").append(toIndentedString(finance)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    serviceContract: ").append(toIndentedString(serviceContract)).append("\n");
    sb.append("    selectionRule: ").append(toIndentedString(selectionRule)).append("\n");
    sb.append("    autoDispatch: ").append(toIndentedString(autoDispatch)).append("\n");
    sb.append("    lateNotification: ").append(toIndentedString(lateNotification)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    workOrdersCounts: ").append(toIndentedString(workOrdersCounts)).append("\n");
    sb.append("    spendChart: ").append(toIndentedString(spendChart)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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

