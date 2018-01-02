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


import com.fieldnation.models.ClientWorkOrderCounts;
import com.fieldnation.models.MinimalProjects;
import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Client
 */

public class Client {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    DELETE("delete"),
    
    CREATE_WORK_ORDER("create_work_order"),
    
    CREATE_PROJECT("create_project"),
    
    INVOICING("invoicing"),
    
    CREATE_CLIENT_REQUEST("create_client_request"),
    
    DEACTIVATE("deactivate"),
    
    REACTIVATE("reactivate"),
    
    CREATE_USER("create_user");

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

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("print_logo")
  private Boolean printLogo = null;

  @SerializedName("address_1")
  private String address1 = null;

  @SerializedName("address_2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("location_type")
  private Integer locationType = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("policy_procedure")
  private String policyProcedure = null;

  @SerializedName("standard_instruction")
  private String standardInstruction = null;

  @SerializedName("about")
  private String about = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("projects")
  private MinimalProjects projects = null;

  @SerializedName("manager")
  private MinimalUser manager = null;

  @SerializedName("work_order_counts")
  private ClientWorkOrderCounts workOrderCounts = null;

  public Client actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Client addActionsItem(ActionsEnum actionsItem) {
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

  public Client active(Boolean active) {
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

  public Client name(String name) {
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

  public Client id(Integer id) {
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

  public Client printLogo(Boolean printLogo) {
    this.printLogo = printLogo;
    return this;
  }

   /**
   * Get printLogo
   * @return printLogo
  **/

  public Boolean isPrintLogo() {
    return printLogo;
  }

  public void setPrintLogo(Boolean printLogo) {
    this.printLogo = printLogo;
  }

  public Client address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Client address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Client city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Client state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Client zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Client country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Client locationType(Integer locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/

  public Integer getLocationType() {
    return locationType;
  }

  public void setLocationType(Integer locationType) {
    this.locationType = locationType;
  }

  public Client website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Client policyProcedure(String policyProcedure) {
    this.policyProcedure = policyProcedure;
    return this;
  }

   /**
   * Get policyProcedure
   * @return policyProcedure
  **/

  public String getPolicyProcedure() {
    return policyProcedure;
  }

  public void setPolicyProcedure(String policyProcedure) {
    this.policyProcedure = policyProcedure;
  }

  public Client standardInstruction(String standardInstruction) {
    this.standardInstruction = standardInstruction;
    return this;
  }

   /**
   * Get standardInstruction
   * @return standardInstruction
  **/

  public String getStandardInstruction() {
    return standardInstruction;
  }

  public void setStandardInstruction(String standardInstruction) {
    this.standardInstruction = standardInstruction;
  }

  public Client about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Get about
   * @return about
  **/

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public Client created(java.util.Date created) {
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

  public Client projects(MinimalProjects projects) {
    this.projects = projects;
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/

  public MinimalProjects getProjects() {
    return projects;
  }

  public void setProjects(MinimalProjects projects) {
    this.projects = projects;
  }

  public Client manager(MinimalUser manager) {
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

  public Client workOrderCounts(ClientWorkOrderCounts workOrderCounts) {
    this.workOrderCounts = workOrderCounts;
    return this;
  }

   /**
   * Get workOrderCounts
   * @return workOrderCounts
  **/

  public ClientWorkOrderCounts getWorkOrderCounts() {
    return workOrderCounts;
  }

  public void setWorkOrderCounts(ClientWorkOrderCounts workOrderCounts) {
    this.workOrderCounts = workOrderCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.actions, client.actions) &&
        Objects.equals(this.active, client.active) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.id, client.id) &&
        Objects.equals(this.printLogo, client.printLogo) &&
        Objects.equals(this.address1, client.address1) &&
        Objects.equals(this.address2, client.address2) &&
        Objects.equals(this.city, client.city) &&
        Objects.equals(this.state, client.state) &&
        Objects.equals(this.zip, client.zip) &&
        Objects.equals(this.country, client.country) &&
        Objects.equals(this.locationType, client.locationType) &&
        Objects.equals(this.website, client.website) &&
        Objects.equals(this.policyProcedure, client.policyProcedure) &&
        Objects.equals(this.standardInstruction, client.standardInstruction) &&
        Objects.equals(this.about, client.about) &&
        Objects.equals(this.created, client.created) &&
        Objects.equals(this.projects, client.projects) &&
        Objects.equals(this.manager, client.manager) &&
        Objects.equals(this.workOrderCounts, client.workOrderCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, active, name, id, printLogo, address1, address2, city, state, zip, country, locationType, website, policyProcedure, standardInstruction, about, created, projects, manager, workOrderCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    printLogo: ").append(toIndentedString(printLogo)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    policyProcedure: ").append(toIndentedString(policyProcedure)).append("\n");
    sb.append("    standardInstruction: ").append(toIndentedString(standardInstruction)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    workOrderCounts: ").append(toIndentedString(workOrderCounts)).append("\n");
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

