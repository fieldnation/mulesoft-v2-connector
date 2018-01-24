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
import com.fieldnation.models.Bundle;
import com.fieldnation.models.ClientRequest;
import com.fieldnation.models.Company;
import com.fieldnation.models.Contacts;
import com.fieldnation.models.CustomFields;
import com.fieldnation.models.Declines;
import com.fieldnation.models.ETA;
import com.fieldnation.models.Holds;
import com.fieldnation.models.Integration;
import com.fieldnation.models.Location;
import com.fieldnation.models.Manager;
import com.fieldnation.models.Messages;
import com.fieldnation.models.Milestones;
import com.fieldnation.models.Network;
import com.fieldnation.models.Pay;
import com.fieldnation.models.Project;
import com.fieldnation.models.PublishStats;
import com.fieldnation.models.Qualifications;
import com.fieldnation.models.Requests;
import com.fieldnation.models.RichText;
import com.fieldnation.models.Routes;
import com.fieldnation.models.Schedule;
import com.fieldnation.models.SelectionRule;
import com.fieldnation.models.ServiceContract;
import com.fieldnation.models.ServiceType;
import com.fieldnation.models.Shipments;
import com.fieldnation.models.Signatures;
import com.fieldnation.models.Status;
import com.fieldnation.models.Tasks;
import com.fieldnation.models.Team;
import com.fieldnation.models.Template;
import com.fieldnation.models.TimeLogs;
import com.fieldnation.models.TypeOfWork;
import com.fieldnation.models.WorkOrderInvoice;
import com.fieldnation.models.WorkOrderRatings;
import com.fieldnation.models.WorkOrderRole;
import com.fieldnation.models.WorkflowCompletion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrder
 */

public class WorkOrder {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("networks")
  private List<Network> networks = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("printable")
  private Boolean printable = null;

  @SerializedName("allow_counter_offers")
  private Boolean allowCounterOffers = null;

  @SerializedName("closing_notes")
  private String closingNotes = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("assignee")
  private Assignee assignee = null;

  @SerializedName("type_of_work")
  private TypeOfWork typeOfWork = null;

  @SerializedName("manager")
  private Manager manager = null;

  @SerializedName("template")
  private Template template = null;

  @SerializedName("bundle")
  private Bundle bundle = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("role")
  private WorkOrderRole role = null;

  @SerializedName("client")
  private Company client = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("custom_fields")
  private CustomFields customFields = null;

  @SerializedName("time_logs")
  private TimeLogs timeLogs = null;

  @SerializedName("w2")
  private Boolean w2 = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("eta")
  private ETA eta = null;

  @SerializedName("qualifications")
  private Qualifications qualifications = null;

  @SerializedName("signatures")
  private Signatures signatures = null;

  @SerializedName("pay")
  private Pay pay = null;

  @SerializedName("contacts")
  private Contacts contacts = null;

  @SerializedName("shipments")
  private Shipments shipments = null;

  @SerializedName("attachments")
  private AttachmentFolders attachments = null;

  @SerializedName("tasks")
  private Tasks tasks = null;

  @SerializedName("messages")
  private Messages messages = null;

  @SerializedName("requests")
  private Requests requests = null;

  @SerializedName("routes")
  private Routes routes = null;

  @SerializedName("declines")
  private Declines declines = null;

  @SerializedName("status")
  private Status status = null;

  @SerializedName("holds")
  private Holds holds = null;

  @SerializedName("milestones")
  private Milestones milestones = null;

  @SerializedName("description")
  private RichText description = null;

  @SerializedName("confidential")
  private RichText confidential = null;

  @SerializedName("policy_and_procedures")
  private RichText policyAndProcedures = null;

  @SerializedName("standard_instructions")
  private RichText standardInstructions = null;

  @SerializedName("selection_rule")
  private SelectionRule selectionRule = null;

  @SerializedName("ratings")
  private WorkOrderRatings ratings = null;

  @SerializedName("workflow_completion")
  private WorkflowCompletion workflowCompletion = null;

  @SerializedName("publish_stats")
  private PublishStats publishStats = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    SET_NETWORK("set_network"),
    
    WITHDRAW_REQUEST("withdraw_request"),
    
    CONFIRM("confirm"),
    
    MESSAGING("messaging"),
    
    MANAGED("managed"),
    
    SET_MANAGED("set_managed"),
    
    REPORT_A_PROBLEM("report_a_problem"),
    
    VIEW_PROBLEM("view_problem"),
    
    MAP("map"),
    
    CLOSING_NOTES("closing_notes"),
    
    SEARCH_PROVIDER("search-provider"),
    
    HISTORY("history"),
    
    COPY("copy"),
    
    PRINT("print"),
    
    OVERVIEW("overview"),
    
    TASKS("tasks"),
    
    COUNTER_OFFER("counter_offer"),
    
    APPLY_TAGS("apply_tags"),
    
    PUBLISH("publish"),
    
    ROUTE("route"),
    
    DELETE("delete"),
    
    HOLD("hold"),
    
    CANCEL("cancel"),
    
    UNPUBLISH("unpublish"),
    
    REVERT("revert"),
    
    APPROVE("approve"),
    
    COMPLETE("complete"),
    
    INCOMPLETE("incomplete"),
    
    REQUEST("request"),
    
    EDIT("edit"),
    
    UNAPPROVE("unapprove"),
    
    CREATE_TEMPLATE("create_template"),
    
    PAID("paid"),
    
    UNPAID("unpaid"),
    
    SERVICE_TYPES("service_types");

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

  @SerializedName("service_contract")
  private ServiceContract serviceContract = null;

  @SerializedName("team")
  private Team team = null;

  @SerializedName("client_request")
  private ClientRequest clientRequest = null;

  @SerializedName("integration")
  private Integration integration = null;

  @SerializedName("invoice")
  private WorkOrderInvoice invoice = null;

  @SerializedName("service_types")
  private List<ServiceType> serviceTypes = null;

  public WorkOrder id(Integer id) {
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

  public WorkOrder networks(List<Network> networks) {
    this.networks = networks;
    return this;
  }

  public WorkOrder addNetworksItem(Network networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<Network>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/

  public List<Network> getNetworks() {
    return networks;
  }

  public void setNetworks(List<Network> networks) {
    this.networks = networks;
  }

  public WorkOrder correlationId(String correlationId) {
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

  public WorkOrder printable(Boolean printable) {
    this.printable = printable;
    return this;
  }

   /**
   * Get printable
   * @return printable
  **/

  public Boolean isPrintable() {
    return printable;
  }

  public void setPrintable(Boolean printable) {
    this.printable = printable;
  }

  public WorkOrder allowCounterOffers(Boolean allowCounterOffers) {
    this.allowCounterOffers = allowCounterOffers;
    return this;
  }

   /**
   * Get allowCounterOffers
   * @return allowCounterOffers
  **/

  public Boolean isAllowCounterOffers() {
    return allowCounterOffers;
  }

  public void setAllowCounterOffers(Boolean allowCounterOffers) {
    this.allowCounterOffers = allowCounterOffers;
  }

  public WorkOrder closingNotes(String closingNotes) {
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

  public WorkOrder title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public WorkOrder assignee(Assignee assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public WorkOrder typeOfWork(TypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
    return this;
  }

   /**
   * Get typeOfWork
   * @return typeOfWork
  **/

  public TypeOfWork getTypeOfWork() {
    return typeOfWork;
  }

  public void setTypeOfWork(TypeOfWork typeOfWork) {
    this.typeOfWork = typeOfWork;
  }

  public WorkOrder manager(Manager manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/

  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }

  public WorkOrder template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/

  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

  public WorkOrder bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/

  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public WorkOrder project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public WorkOrder role(WorkOrderRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public WorkOrderRole getRole() {
    return role;
  }

  public void setRole(WorkOrderRole role) {
    this.role = role;
  }

  public WorkOrder client(Company client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/

  public Company getClient() {
    return client;
  }

  public void setClient(Company client) {
    this.client = client;
  }

  public WorkOrder company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public WorkOrder customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/

  public CustomFields getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  public WorkOrder timeLogs(TimeLogs timeLogs) {
    this.timeLogs = timeLogs;
    return this;
  }

   /**
   * Get timeLogs
   * @return timeLogs
  **/

  public TimeLogs getTimeLogs() {
    return timeLogs;
  }

  public void setTimeLogs(TimeLogs timeLogs) {
    this.timeLogs = timeLogs;
  }

  public WorkOrder w2(Boolean w2) {
    this.w2 = w2;
    return this;
  }

   /**
   * Get w2
   * @return w2
  **/

  public Boolean isW2() {
    return w2;
  }

  public void setW2(Boolean w2) {
    this.w2 = w2;
  }

  public WorkOrder location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public WorkOrder schedule(Schedule schedule) {
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

  public WorkOrder eta(ETA eta) {
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

  public WorkOrder qualifications(Qualifications qualifications) {
    this.qualifications = qualifications;
    return this;
  }

   /**
   * Get qualifications
   * @return qualifications
  **/

  public Qualifications getQualifications() {
    return qualifications;
  }

  public void setQualifications(Qualifications qualifications) {
    this.qualifications = qualifications;
  }

  public WorkOrder signatures(Signatures signatures) {
    this.signatures = signatures;
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/

  public Signatures getSignatures() {
    return signatures;
  }

  public void setSignatures(Signatures signatures) {
    this.signatures = signatures;
  }

  public WorkOrder pay(Pay pay) {
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

  public WorkOrder contacts(Contacts contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/

  public Contacts getContacts() {
    return contacts;
  }

  public void setContacts(Contacts contacts) {
    this.contacts = contacts;
  }

  public WorkOrder shipments(Shipments shipments) {
    this.shipments = shipments;
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/

  public Shipments getShipments() {
    return shipments;
  }

  public void setShipments(Shipments shipments) {
    this.shipments = shipments;
  }

  public WorkOrder attachments(AttachmentFolders attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/

  public AttachmentFolders getAttachments() {
    return attachments;
  }

  public void setAttachments(AttachmentFolders attachments) {
    this.attachments = attachments;
  }

  public WorkOrder tasks(Tasks tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/

  public Tasks getTasks() {
    return tasks;
  }

  public void setTasks(Tasks tasks) {
    this.tasks = tasks;
  }

  public WorkOrder messages(Messages messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/

  public Messages getMessages() {
    return messages;
  }

  public void setMessages(Messages messages) {
    this.messages = messages;
  }

  public WorkOrder requests(Requests requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/

  public Requests getRequests() {
    return requests;
  }

  public void setRequests(Requests requests) {
    this.requests = requests;
  }

  public WorkOrder routes(Routes routes) {
    this.routes = routes;
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/

  public Routes getRoutes() {
    return routes;
  }

  public void setRoutes(Routes routes) {
    this.routes = routes;
  }

  public WorkOrder declines(Declines declines) {
    this.declines = declines;
    return this;
  }

   /**
   * Get declines
   * @return declines
  **/

  public Declines getDeclines() {
    return declines;
  }

  public void setDeclines(Declines declines) {
    this.declines = declines;
  }

  public WorkOrder status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public WorkOrder holds(Holds holds) {
    this.holds = holds;
    return this;
  }

   /**
   * Get holds
   * @return holds
  **/

  public Holds getHolds() {
    return holds;
  }

  public void setHolds(Holds holds) {
    this.holds = holds;
  }

  public WorkOrder milestones(Milestones milestones) {
    this.milestones = milestones;
    return this;
  }

   /**
   * Get milestones
   * @return milestones
  **/

  public Milestones getMilestones() {
    return milestones;
  }

  public void setMilestones(Milestones milestones) {
    this.milestones = milestones;
  }

  public WorkOrder description(RichText description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public RichText getDescription() {
    return description;
  }

  public void setDescription(RichText description) {
    this.description = description;
  }

  public WorkOrder confidential(RichText confidential) {
    this.confidential = confidential;
    return this;
  }

   /**
   * Get confidential
   * @return confidential
  **/

  public RichText getConfidential() {
    return confidential;
  }

  public void setConfidential(RichText confidential) {
    this.confidential = confidential;
  }

  public WorkOrder policyAndProcedures(RichText policyAndProcedures) {
    this.policyAndProcedures = policyAndProcedures;
    return this;
  }

   /**
   * Get policyAndProcedures
   * @return policyAndProcedures
  **/

  public RichText getPolicyAndProcedures() {
    return policyAndProcedures;
  }

  public void setPolicyAndProcedures(RichText policyAndProcedures) {
    this.policyAndProcedures = policyAndProcedures;
  }

  public WorkOrder standardInstructions(RichText standardInstructions) {
    this.standardInstructions = standardInstructions;
    return this;
  }

   /**
   * Get standardInstructions
   * @return standardInstructions
  **/

  public RichText getStandardInstructions() {
    return standardInstructions;
  }

  public void setStandardInstructions(RichText standardInstructions) {
    this.standardInstructions = standardInstructions;
  }

  public WorkOrder selectionRule(SelectionRule selectionRule) {
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

  public WorkOrder ratings(WorkOrderRatings ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/

  public WorkOrderRatings getRatings() {
    return ratings;
  }

  public void setRatings(WorkOrderRatings ratings) {
    this.ratings = ratings;
  }

  public WorkOrder workflowCompletion(WorkflowCompletion workflowCompletion) {
    this.workflowCompletion = workflowCompletion;
    return this;
  }

   /**
   * Get workflowCompletion
   * @return workflowCompletion
  **/

  public WorkflowCompletion getWorkflowCompletion() {
    return workflowCompletion;
  }

  public void setWorkflowCompletion(WorkflowCompletion workflowCompletion) {
    this.workflowCompletion = workflowCompletion;
  }

  public WorkOrder publishStats(PublishStats publishStats) {
    this.publishStats = publishStats;
    return this;
  }

   /**
   * Get publishStats
   * @return publishStats
  **/

  public PublishStats getPublishStats() {
    return publishStats;
  }

  public void setPublishStats(PublishStats publishStats) {
    this.publishStats = publishStats;
  }

  public WorkOrder actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WorkOrder addActionsItem(ActionsEnum actionsItem) {
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

  public WorkOrder serviceContract(ServiceContract serviceContract) {
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

  public WorkOrder team(Team team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public WorkOrder clientRequest(ClientRequest clientRequest) {
    this.clientRequest = clientRequest;
    return this;
  }

   /**
   * Get clientRequest
   * @return clientRequest
  **/

  public ClientRequest getClientRequest() {
    return clientRequest;
  }

  public void setClientRequest(ClientRequest clientRequest) {
    this.clientRequest = clientRequest;
  }

  public WorkOrder integration(Integration integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/

  public Integration getIntegration() {
    return integration;
  }

  public void setIntegration(Integration integration) {
    this.integration = integration;
  }

  public WorkOrder invoice(WorkOrderInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/

  public WorkOrderInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(WorkOrderInvoice invoice) {
    this.invoice = invoice;
  }

  public WorkOrder serviceTypes(List<ServiceType> serviceTypes) {
    this.serviceTypes = serviceTypes;
    return this;
  }

  public WorkOrder addServiceTypesItem(ServiceType serviceTypesItem) {
    if (this.serviceTypes == null) {
      this.serviceTypes = new ArrayList<ServiceType>();
    }
    this.serviceTypes.add(serviceTypesItem);
    return this;
  }

   /**
   * Get serviceTypes
   * @return serviceTypes
  **/

  public List<ServiceType> getServiceTypes() {
    return serviceTypes;
  }

  public void setServiceTypes(List<ServiceType> serviceTypes) {
    this.serviceTypes = serviceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrder workOrder = (WorkOrder) o;
    return Objects.equals(this.id, workOrder.id) &&
        Objects.equals(this.networks, workOrder.networks) &&
        Objects.equals(this.correlationId, workOrder.correlationId) &&
        Objects.equals(this.printable, workOrder.printable) &&
        Objects.equals(this.allowCounterOffers, workOrder.allowCounterOffers) &&
        Objects.equals(this.closingNotes, workOrder.closingNotes) &&
        Objects.equals(this.title, workOrder.title) &&
        Objects.equals(this.assignee, workOrder.assignee) &&
        Objects.equals(this.typeOfWork, workOrder.typeOfWork) &&
        Objects.equals(this.manager, workOrder.manager) &&
        Objects.equals(this.template, workOrder.template) &&
        Objects.equals(this.bundle, workOrder.bundle) &&
        Objects.equals(this.project, workOrder.project) &&
        Objects.equals(this.role, workOrder.role) &&
        Objects.equals(this.client, workOrder.client) &&
        Objects.equals(this.company, workOrder.company) &&
        Objects.equals(this.customFields, workOrder.customFields) &&
        Objects.equals(this.timeLogs, workOrder.timeLogs) &&
        Objects.equals(this.w2, workOrder.w2) &&
        Objects.equals(this.location, workOrder.location) &&
        Objects.equals(this.schedule, workOrder.schedule) &&
        Objects.equals(this.eta, workOrder.eta) &&
        Objects.equals(this.qualifications, workOrder.qualifications) &&
        Objects.equals(this.signatures, workOrder.signatures) &&
        Objects.equals(this.pay, workOrder.pay) &&
        Objects.equals(this.contacts, workOrder.contacts) &&
        Objects.equals(this.shipments, workOrder.shipments) &&
        Objects.equals(this.attachments, workOrder.attachments) &&
        Objects.equals(this.tasks, workOrder.tasks) &&
        Objects.equals(this.messages, workOrder.messages) &&
        Objects.equals(this.requests, workOrder.requests) &&
        Objects.equals(this.routes, workOrder.routes) &&
        Objects.equals(this.declines, workOrder.declines) &&
        Objects.equals(this.status, workOrder.status) &&
        Objects.equals(this.holds, workOrder.holds) &&
        Objects.equals(this.milestones, workOrder.milestones) &&
        Objects.equals(this.description, workOrder.description) &&
        Objects.equals(this.confidential, workOrder.confidential) &&
        Objects.equals(this.policyAndProcedures, workOrder.policyAndProcedures) &&
        Objects.equals(this.standardInstructions, workOrder.standardInstructions) &&
        Objects.equals(this.selectionRule, workOrder.selectionRule) &&
        Objects.equals(this.ratings, workOrder.ratings) &&
        Objects.equals(this.workflowCompletion, workOrder.workflowCompletion) &&
        Objects.equals(this.publishStats, workOrder.publishStats) &&
        Objects.equals(this.actions, workOrder.actions) &&
        Objects.equals(this.serviceContract, workOrder.serviceContract) &&
        Objects.equals(this.team, workOrder.team) &&
        Objects.equals(this.clientRequest, workOrder.clientRequest) &&
        Objects.equals(this.integration, workOrder.integration) &&
        Objects.equals(this.invoice, workOrder.invoice) &&
        Objects.equals(this.serviceTypes, workOrder.serviceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, networks, correlationId, printable, allowCounterOffers, closingNotes, title, assignee, typeOfWork, manager, template, bundle, project, role, client, company, customFields, timeLogs, w2, location, schedule, eta, qualifications, signatures, pay, contacts, shipments, attachments, tasks, messages, requests, routes, declines, status, holds, milestones, description, confidential, policyAndProcedures, standardInstructions, selectionRule, ratings, workflowCompletion, publishStats, actions, serviceContract, team, clientRequest, integration, invoice, serviceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    printable: ").append(toIndentedString(printable)).append("\n");
    sb.append("    allowCounterOffers: ").append(toIndentedString(allowCounterOffers)).append("\n");
    sb.append("    closingNotes: ").append(toIndentedString(closingNotes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    timeLogs: ").append(toIndentedString(timeLogs)).append("\n");
    sb.append("    w2: ").append(toIndentedString(w2)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    pay: ").append(toIndentedString(pay)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    declines: ").append(toIndentedString(declines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    holds: ").append(toIndentedString(holds)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
    sb.append("    policyAndProcedures: ").append(toIndentedString(policyAndProcedures)).append("\n");
    sb.append("    standardInstructions: ").append(toIndentedString(standardInstructions)).append("\n");
    sb.append("    selectionRule: ").append(toIndentedString(selectionRule)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    workflowCompletion: ").append(toIndentedString(workflowCompletion)).append("\n");
    sb.append("    publishStats: ").append(toIndentedString(publishStats)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    serviceContract: ").append(toIndentedString(serviceContract)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    clientRequest: ").append(toIndentedString(clientRequest)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
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

