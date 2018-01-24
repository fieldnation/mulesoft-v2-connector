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


import com.fieldnation.models.WorkOrderOverviewValuesClientRequests;
import com.fieldnation.models.WorkOrderOverviewValuesClients;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkOrderOverviewValues
 */

public class WorkOrderOverviewValues {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    SERVICE_CONTRACTS("service_contracts"),
    
    NETWORKS("networks"),
    
    TEAMS("teams");

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

  @SerializedName("team_id")
  private Integer teamId = null;

  @SerializedName("client_id")
  private Integer clientId = null;

  @SerializedName("project_id")
  private Integer projectId = null;

  @SerializedName("service_contract_id")
  private Integer serviceContractId = null;

  @SerializedName("type_of_work_id")
  private Integer typeOfWorkId = null;

  @SerializedName("client_request_id")
  private Integer clientRequestId = null;

  @SerializedName("network_id")
  private List<Integer> networkId = null;

  @SerializedName("service_type_id")
  private List<Integer> serviceTypeId = null;

  @SerializedName("clients")
  private List<WorkOrderOverviewValuesClients> clients = null;

  @SerializedName("projects")
  private List<WorkOrderOverviewValuesClients> projects = null;

  @SerializedName("networks")
  private List<WorkOrderOverviewValuesClients> networks = null;

  @SerializedName("service_contracts")
  private List<WorkOrderOverviewValuesClients> serviceContracts = null;

  @SerializedName("types_of_work")
  private List<WorkOrderOverviewValuesClients> typesOfWork = null;

  @SerializedName("teams")
  private List<WorkOrderOverviewValuesClients> teams = null;

  @SerializedName("client_requests")
  private WorkOrderOverviewValuesClientRequests clientRequests = null;

  @SerializedName("service_types")
  private List<WorkOrderOverviewValuesClients> serviceTypes = null;

  public WorkOrderOverviewValues actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WorkOrderOverviewValues addActionsItem(ActionsEnum actionsItem) {
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

  public WorkOrderOverviewValues teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/

  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public WorkOrderOverviewValues clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/

  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public WorkOrderOverviewValues projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/

  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public WorkOrderOverviewValues serviceContractId(Integer serviceContractId) {
    this.serviceContractId = serviceContractId;
    return this;
  }

   /**
   * Get serviceContractId
   * @return serviceContractId
  **/

  public Integer getServiceContractId() {
    return serviceContractId;
  }

  public void setServiceContractId(Integer serviceContractId) {
    this.serviceContractId = serviceContractId;
  }

  public WorkOrderOverviewValues typeOfWorkId(Integer typeOfWorkId) {
    this.typeOfWorkId = typeOfWorkId;
    return this;
  }

   /**
   * Get typeOfWorkId
   * @return typeOfWorkId
  **/

  public Integer getTypeOfWorkId() {
    return typeOfWorkId;
  }

  public void setTypeOfWorkId(Integer typeOfWorkId) {
    this.typeOfWorkId = typeOfWorkId;
  }

  public WorkOrderOverviewValues clientRequestId(Integer clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

   /**
   * Get clientRequestId
   * @return clientRequestId
  **/

  public Integer getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(Integer clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public WorkOrderOverviewValues networkId(List<Integer> networkId) {
    this.networkId = networkId;
    return this;
  }

  public WorkOrderOverviewValues addNetworkIdItem(Integer networkIdItem) {
    if (this.networkId == null) {
      this.networkId = new ArrayList<Integer>();
    }
    this.networkId.add(networkIdItem);
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/

  public List<Integer> getNetworkId() {
    return networkId;
  }

  public void setNetworkId(List<Integer> networkId) {
    this.networkId = networkId;
  }

  public WorkOrderOverviewValues serviceTypeId(List<Integer> serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
    return this;
  }

  public WorkOrderOverviewValues addServiceTypeIdItem(Integer serviceTypeIdItem) {
    if (this.serviceTypeId == null) {
      this.serviceTypeId = new ArrayList<Integer>();
    }
    this.serviceTypeId.add(serviceTypeIdItem);
    return this;
  }

   /**
   * Get serviceTypeId
   * @return serviceTypeId
  **/

  public List<Integer> getServiceTypeId() {
    return serviceTypeId;
  }

  public void setServiceTypeId(List<Integer> serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  public WorkOrderOverviewValues clients(List<WorkOrderOverviewValuesClients> clients) {
    this.clients = clients;
    return this;
  }

  public WorkOrderOverviewValues addClientsItem(WorkOrderOverviewValuesClients clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/

  public List<WorkOrderOverviewValuesClients> getClients() {
    return clients;
  }

  public void setClients(List<WorkOrderOverviewValuesClients> clients) {
    this.clients = clients;
  }

  public WorkOrderOverviewValues projects(List<WorkOrderOverviewValuesClients> projects) {
    this.projects = projects;
    return this;
  }

  public WorkOrderOverviewValues addProjectsItem(WorkOrderOverviewValuesClients projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/

  public List<WorkOrderOverviewValuesClients> getProjects() {
    return projects;
  }

  public void setProjects(List<WorkOrderOverviewValuesClients> projects) {
    this.projects = projects;
  }

  public WorkOrderOverviewValues networks(List<WorkOrderOverviewValuesClients> networks) {
    this.networks = networks;
    return this;
  }

  public WorkOrderOverviewValues addNetworksItem(WorkOrderOverviewValuesClients networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/

  public List<WorkOrderOverviewValuesClients> getNetworks() {
    return networks;
  }

  public void setNetworks(List<WorkOrderOverviewValuesClients> networks) {
    this.networks = networks;
  }

  public WorkOrderOverviewValues serviceContracts(List<WorkOrderOverviewValuesClients> serviceContracts) {
    this.serviceContracts = serviceContracts;
    return this;
  }

  public WorkOrderOverviewValues addServiceContractsItem(WorkOrderOverviewValuesClients serviceContractsItem) {
    if (this.serviceContracts == null) {
      this.serviceContracts = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.serviceContracts.add(serviceContractsItem);
    return this;
  }

   /**
   * Get serviceContracts
   * @return serviceContracts
  **/

  public List<WorkOrderOverviewValuesClients> getServiceContracts() {
    return serviceContracts;
  }

  public void setServiceContracts(List<WorkOrderOverviewValuesClients> serviceContracts) {
    this.serviceContracts = serviceContracts;
  }

  public WorkOrderOverviewValues typesOfWork(List<WorkOrderOverviewValuesClients> typesOfWork) {
    this.typesOfWork = typesOfWork;
    return this;
  }

  public WorkOrderOverviewValues addTypesOfWorkItem(WorkOrderOverviewValuesClients typesOfWorkItem) {
    if (this.typesOfWork == null) {
      this.typesOfWork = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.typesOfWork.add(typesOfWorkItem);
    return this;
  }

   /**
   * Get typesOfWork
   * @return typesOfWork
  **/

  public List<WorkOrderOverviewValuesClients> getTypesOfWork() {
    return typesOfWork;
  }

  public void setTypesOfWork(List<WorkOrderOverviewValuesClients> typesOfWork) {
    this.typesOfWork = typesOfWork;
  }

  public WorkOrderOverviewValues teams(List<WorkOrderOverviewValuesClients> teams) {
    this.teams = teams;
    return this;
  }

  public WorkOrderOverviewValues addTeamsItem(WorkOrderOverviewValuesClients teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/

  public List<WorkOrderOverviewValuesClients> getTeams() {
    return teams;
  }

  public void setTeams(List<WorkOrderOverviewValuesClients> teams) {
    this.teams = teams;
  }

  public WorkOrderOverviewValues clientRequests(WorkOrderOverviewValuesClientRequests clientRequests) {
    this.clientRequests = clientRequests;
    return this;
  }

   /**
   * Get clientRequests
   * @return clientRequests
  **/

  public WorkOrderOverviewValuesClientRequests getClientRequests() {
    return clientRequests;
  }

  public void setClientRequests(WorkOrderOverviewValuesClientRequests clientRequests) {
    this.clientRequests = clientRequests;
  }

  public WorkOrderOverviewValues serviceTypes(List<WorkOrderOverviewValuesClients> serviceTypes) {
    this.serviceTypes = serviceTypes;
    return this;
  }

  public WorkOrderOverviewValues addServiceTypesItem(WorkOrderOverviewValuesClients serviceTypesItem) {
    if (this.serviceTypes == null) {
      this.serviceTypes = new ArrayList<WorkOrderOverviewValuesClients>();
    }
    this.serviceTypes.add(serviceTypesItem);
    return this;
  }

   /**
   * Get serviceTypes
   * @return serviceTypes
  **/

  public List<WorkOrderOverviewValuesClients> getServiceTypes() {
    return serviceTypes;
  }

  public void setServiceTypes(List<WorkOrderOverviewValuesClients> serviceTypes) {
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
    WorkOrderOverviewValues workOrderOverviewValues = (WorkOrderOverviewValues) o;
    return Objects.equals(this.actions, workOrderOverviewValues.actions) &&
        Objects.equals(this.teamId, workOrderOverviewValues.teamId) &&
        Objects.equals(this.clientId, workOrderOverviewValues.clientId) &&
        Objects.equals(this.projectId, workOrderOverviewValues.projectId) &&
        Objects.equals(this.serviceContractId, workOrderOverviewValues.serviceContractId) &&
        Objects.equals(this.typeOfWorkId, workOrderOverviewValues.typeOfWorkId) &&
        Objects.equals(this.clientRequestId, workOrderOverviewValues.clientRequestId) &&
        Objects.equals(this.networkId, workOrderOverviewValues.networkId) &&
        Objects.equals(this.serviceTypeId, workOrderOverviewValues.serviceTypeId) &&
        Objects.equals(this.clients, workOrderOverviewValues.clients) &&
        Objects.equals(this.projects, workOrderOverviewValues.projects) &&
        Objects.equals(this.networks, workOrderOverviewValues.networks) &&
        Objects.equals(this.serviceContracts, workOrderOverviewValues.serviceContracts) &&
        Objects.equals(this.typesOfWork, workOrderOverviewValues.typesOfWork) &&
        Objects.equals(this.teams, workOrderOverviewValues.teams) &&
        Objects.equals(this.clientRequests, workOrderOverviewValues.clientRequests) &&
        Objects.equals(this.serviceTypes, workOrderOverviewValues.serviceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, teamId, clientId, projectId, serviceContractId, typeOfWorkId, clientRequestId, networkId, serviceTypeId, clients, projects, networks, serviceContracts, typesOfWork, teams, clientRequests, serviceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderOverviewValues {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    serviceContractId: ").append(toIndentedString(serviceContractId)).append("\n");
    sb.append("    typeOfWorkId: ").append(toIndentedString(typeOfWorkId)).append("\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    serviceTypeId: ").append(toIndentedString(serviceTypeId)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    serviceContracts: ").append(toIndentedString(serviceContracts)).append("\n");
    sb.append("    typesOfWork: ").append(toIndentedString(typesOfWork)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    clientRequests: ").append(toIndentedString(clientRequests)).append("\n");
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

