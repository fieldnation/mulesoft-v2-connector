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


import com.fieldnation.models.Client;
import com.fieldnation.models.MinimalProject;
import com.fieldnation.models.MinimalUser;
import com.fieldnation.models.ServiceContract;
import com.fieldnation.models.TypeOfWork;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Template
 */

public class Template {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("project")
  private MinimalProject project = null;

  @SerializedName("client")
  private Client client = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("updated")
  private java.util.Date updated = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    DELETE("delete"),
    
    CREATE_WORK_ORDER("create_work_order"),
    
    COPY("copy");

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

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("work_order_title")
  private String workOrderTitle = null;

  @SerializedName("type_of_work")
  private TypeOfWork typeOfWork = null;

  @SerializedName("service_contract")
  private ServiceContract serviceContract = null;

  @SerializedName("work_orders")
  private Integer workOrders = null;

  public Template id(Integer id) {
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

  public Template name(String name) {
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

  public Template getDefault(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/

  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public Template project(MinimalProject project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/

  public MinimalProject getProject() {
    return project;
  }

  public void setProject(MinimalProject project) {
    this.project = project;
  }

  public Template client(Client client) {
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

  public Template created(java.util.Date created) {
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

  public Template updated(java.util.Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/

  public java.util.Date getUpdated() {
    return updated;
  }

  public void setUpdated(java.util.Date updated) {
    this.updated = updated;
  }

  public Template actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Template addActionsItem(ActionsEnum actionsItem) {
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

  public Template author(MinimalUser author) {
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

  public Template workOrderTitle(String workOrderTitle) {
    this.workOrderTitle = workOrderTitle;
    return this;
  }

   /**
   * Get workOrderTitle
   * @return workOrderTitle
  **/

  public String getWorkOrderTitle() {
    return workOrderTitle;
  }

  public void setWorkOrderTitle(String workOrderTitle) {
    this.workOrderTitle = workOrderTitle;
  }

  public Template typeOfWork(TypeOfWork typeOfWork) {
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

  public Template serviceContract(ServiceContract serviceContract) {
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

  public Template workOrders(Integer workOrders) {
    this.workOrders = workOrders;
    return this;
  }

   /**
   * Get workOrders
   * @return workOrders
  **/

  public Integer getWorkOrders() {
    return workOrders;
  }

  public void setWorkOrders(Integer workOrders) {
    this.workOrders = workOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.id, template.id) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this._default, template._default) &&
        Objects.equals(this.project, template.project) &&
        Objects.equals(this.client, template.client) &&
        Objects.equals(this.created, template.created) &&
        Objects.equals(this.updated, template.updated) &&
        Objects.equals(this.actions, template.actions) &&
        Objects.equals(this.author, template.author) &&
        Objects.equals(this.workOrderTitle, template.workOrderTitle) &&
        Objects.equals(this.typeOfWork, template.typeOfWork) &&
        Objects.equals(this.serviceContract, template.serviceContract) &&
        Objects.equals(this.workOrders, template.workOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, _default, project, client, created, updated, actions, author, workOrderTitle, typeOfWork, serviceContract, workOrders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    workOrderTitle: ").append(toIndentedString(workOrderTitle)).append("\n");
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
    sb.append("    serviceContract: ").append(toIndentedString(serviceContract)).append("\n");
    sb.append("    workOrders: ").append(toIndentedString(workOrders)).append("\n");
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

