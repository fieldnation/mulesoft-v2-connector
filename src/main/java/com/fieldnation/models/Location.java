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


import com.fieldnation.models.Contact;
import com.fieldnation.models.Coords;
import com.fieldnation.models.InlineResponse2001;
import com.fieldnation.models.LocationNotes;
import com.fieldnation.models.LocationValidation;
import com.fieldnation.models.StoredLocation;
import com.fieldnation.models.TimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Location
 */

public class Location {
  @SerializedName("work_order_id")
  private Integer workOrderId = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CUSTOM("custom"),
    
    REMOTE("remote"),
    
    LOCATION("location");

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

  @SerializedName("role")
  private String role = null;

  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    EDIT("edit"),
    
    MAP("map");

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

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("status_id")
  private Integer statusId = null;

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

  @SerializedName("coordinates")
  private Coords coordinates = null;

  @SerializedName("type")
  private InlineResponse2001 type = null;

  @SerializedName("save_location")
  private String saveLocation = null;

  @SerializedName("save_location_group")
  private Integer saveLocationGroup = null;

  @SerializedName("saved_location")
  private StoredLocation savedLocation = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("contacts")
  private List<Contact> contacts = null;

  @SerializedName("map")
  private java.util.Map map = null;

  @SerializedName("notes")
  private LocationNotes notes = null;

  @SerializedName("validation")
  private LocationValidation validation = null;

  public Location workOrderId(Integer workOrderId) {
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

  public Location mode(ModeEnum mode) {
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

  public Location role(String role) {
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

  public Location actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public Location addActionsItem(ActionsEnum actionsItem) {
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

  public Location correlationId(String correlationId) {
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

  public Location statusId(Integer statusId) {
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

  public Location address1(String address1) {
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

  public Location address2(String address2) {
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

  public Location city(String city) {
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

  public Location state(String state) {
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

  public Location zip(String zip) {
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

  public Location country(String country) {
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

  public Location coordinates(Coords coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/

  public Coords getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coords coordinates) {
    this.coordinates = coordinates;
  }

  public Location type(InlineResponse2001 type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  public InlineResponse2001 getType() {
    return type;
  }

  public void setType(InlineResponse2001 type) {
    this.type = type;
  }

  public Location saveLocation(String saveLocation) {
    this.saveLocation = saveLocation;
    return this;
  }

   /**
   * Get saveLocation
   * @return saveLocation
  **/

  public String getSaveLocation() {
    return saveLocation;
  }

  public void setSaveLocation(String saveLocation) {
    this.saveLocation = saveLocation;
  }

  public Location saveLocationGroup(Integer saveLocationGroup) {
    this.saveLocationGroup = saveLocationGroup;
    return this;
  }

   /**
   * Get saveLocationGroup
   * @return saveLocationGroup
  **/

  public Integer getSaveLocationGroup() {
    return saveLocationGroup;
  }

  public void setSaveLocationGroup(Integer saveLocationGroup) {
    this.saveLocationGroup = saveLocationGroup;
  }

  public Location savedLocation(StoredLocation savedLocation) {
    this.savedLocation = savedLocation;
    return this;
  }

   /**
   * Get savedLocation
   * @return savedLocation
  **/

  public StoredLocation getSavedLocation() {
    return savedLocation;
  }

  public void setSavedLocation(StoredLocation savedLocation) {
    this.savedLocation = savedLocation;
  }

  public Location timeZone(TimeZone timeZone) {
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

  public Location contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Location addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Location map(java.util.Map map) {
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/

  public java.util.Map getMap() {
    return map;
  }

  public void setMap(java.util.Map map) {
    this.map = map;
  }

  public Location notes(LocationNotes notes) {
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

  public Location validation(LocationValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/

  public LocationValidation getValidation() {
    return validation;
  }

  public void setValidation(LocationValidation validation) {
    this.validation = validation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.workOrderId, location.workOrderId) &&
        Objects.equals(this.mode, location.mode) &&
        Objects.equals(this.role, location.role) &&
        Objects.equals(this.actions, location.actions) &&
        Objects.equals(this.correlationId, location.correlationId) &&
        Objects.equals(this.statusId, location.statusId) &&
        Objects.equals(this.address1, location.address1) &&
        Objects.equals(this.address2, location.address2) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.zip, location.zip) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.coordinates, location.coordinates) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.saveLocation, location.saveLocation) &&
        Objects.equals(this.saveLocationGroup, location.saveLocationGroup) &&
        Objects.equals(this.savedLocation, location.savedLocation) &&
        Objects.equals(this.timeZone, location.timeZone) &&
        Objects.equals(this.contacts, location.contacts) &&
        Objects.equals(this.map, location.map) &&
        Objects.equals(this.notes, location.notes) &&
        Objects.equals(this.validation, location.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workOrderId, mode, role, actions, correlationId, statusId, address1, address2, city, state, zip, country, coordinates, type, saveLocation, saveLocationGroup, savedLocation, timeZone, contacts, map, notes, validation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    saveLocation: ").append(toIndentedString(saveLocation)).append("\n");
    sb.append("    saveLocationGroup: ").append(toIndentedString(saveLocationGroup)).append("\n");
    sb.append("    savedLocation: ").append(toIndentedString(savedLocation)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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

