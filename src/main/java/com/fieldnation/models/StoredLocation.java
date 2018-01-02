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


import com.fieldnation.models.Company;
import com.fieldnation.models.Contact;
import com.fieldnation.models.Coords;
import com.fieldnation.models.LocationAttribute;
import com.fieldnation.models.LocationGroup;
import com.fieldnation.models.LocationNotes;
import com.fieldnation.models.LocationType;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StoredLocation
 */

public class StoredLocation {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("group")
  private LocationGroup group = null;

  @SerializedName("type")
  private LocationType type = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("notes")
  private LocationNotes notes = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("client")
  private Company client = null;

  @SerializedName("geo")
  private Coords geo = null;

  @SerializedName("attributes")
  private List<LocationAttribute> attributes = null;

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

  public StoredLocation id(Integer id) {
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

  public StoredLocation name(String name) {
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

  public StoredLocation company(Company company) {
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

  public StoredLocation group(LocationGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/

  public LocationGroup getGroup() {
    return group;
  }

  public void setGroup(LocationGroup group) {
    this.group = group;
  }

  public StoredLocation type(LocationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public LocationType getType() {
    return type;
  }

  public void setType(LocationType type) {
    this.type = type;
  }

  public StoredLocation address1(String address1) {
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

  public StoredLocation address2(String address2) {
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

  public StoredLocation city(String city) {
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

  public StoredLocation state(String state) {
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

  public StoredLocation zip(String zip) {
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

  public StoredLocation country(String country) {
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

  public StoredLocation timeZone(TimeZone timeZone) {
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

  public StoredLocation contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public StoredLocation notes(LocationNotes notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/

  public LocationNotes getNotes() {
    return notes;
  }

  public void setNotes(LocationNotes notes) {
    this.notes = notes;
  }

  public StoredLocation active(Boolean active) {
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

  public StoredLocation client(Company client) {
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

  public StoredLocation geo(Coords geo) {
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/

  public Coords getGeo() {
    return geo;
  }

  public void setGeo(Coords geo) {
    this.geo = geo;
  }

  public StoredLocation attributes(List<LocationAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public StoredLocation addAttributesItem(LocationAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<LocationAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/

  public List<LocationAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<LocationAttribute> attributes) {
    this.attributes = attributes;
  }

  public StoredLocation actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public StoredLocation addActionsItem(ActionsEnum actionsItem) {
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
    StoredLocation storedLocation = (StoredLocation) o;
    return Objects.equals(this.id, storedLocation.id) &&
        Objects.equals(this.name, storedLocation.name) &&
        Objects.equals(this.company, storedLocation.company) &&
        Objects.equals(this.group, storedLocation.group) &&
        Objects.equals(this.type, storedLocation.type) &&
        Objects.equals(this.address1, storedLocation.address1) &&
        Objects.equals(this.address2, storedLocation.address2) &&
        Objects.equals(this.city, storedLocation.city) &&
        Objects.equals(this.state, storedLocation.state) &&
        Objects.equals(this.zip, storedLocation.zip) &&
        Objects.equals(this.country, storedLocation.country) &&
        Objects.equals(this.timeZone, storedLocation.timeZone) &&
        Objects.equals(this.contact, storedLocation.contact) &&
        Objects.equals(this.notes, storedLocation.notes) &&
        Objects.equals(this.active, storedLocation.active) &&
        Objects.equals(this.client, storedLocation.client) &&
        Objects.equals(this.geo, storedLocation.geo) &&
        Objects.equals(this.attributes, storedLocation.attributes) &&
        Objects.equals(this.actions, storedLocation.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, company, group, type, address1, address2, city, state, zip, country, timeZone, contact, notes, active, client, geo, attributes, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

