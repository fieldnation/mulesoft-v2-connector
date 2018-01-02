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


import com.fieldnation.models.Block;
import com.fieldnation.models.Certifications;
import com.fieldnation.models.Company;
import com.fieldnation.models.Coords;
import com.fieldnation.models.Educations;
import com.fieldnation.models.Experiences;
import com.fieldnation.models.Finances;
import com.fieldnation.models.Insurances;
import com.fieldnation.models.Licenses;
import com.fieldnation.models.Messages;
import com.fieldnation.models.Notifications;
import com.fieldnation.models.Request;
import com.fieldnation.models.Route;
import com.fieldnation.models.TimeZone;
import com.fieldnation.models.TypesOfWork;
import com.fieldnation.models.UserBackgroundChecks;
import com.fieldnation.models.UserCompany;
import com.fieldnation.models.UserDrugTests;
import com.fieldnation.models.UserExperiments;
import com.fieldnation.models.UserFeatures;
import com.fieldnation.models.UserGroup;
import com.fieldnation.models.UserJobs;
import com.fieldnation.models.UserNotes;
import com.fieldnation.models.UserPortal;
import com.fieldnation.models.UserPreferences;
import com.fieldnation.models.UserPreferredGroups;
import com.fieldnation.models.UserPreviousAssignment;
import com.fieldnation.models.UserPreviousRequest;
import com.fieldnation.models.UserRating;
import com.fieldnation.models.UserUpcomingSchedule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */

public class User {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

  @SerializedName("w2")
  private Boolean w2 = null;

  @SerializedName("created")
  private java.util.Date created = null;

  @SerializedName("worker_compensation")
  private Boolean workerCompensation = null;

  @SerializedName("time_zone")
  private TimeZone timeZone = null;

  @SerializedName("insurances")
  private Insurances insurances = null;

  @SerializedName("request")
  private Request request = null;

  @SerializedName("notifications")
  private Notifications notifications = null;

  @SerializedName("messages")
  private Messages messages = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("coords")
  private Coords coords = null;

  @SerializedName("protec")
  private Boolean protec = null;

  @SerializedName("marketplace")
  private Boolean marketplace = null;

  @SerializedName("routable")
  private Boolean routable = null;

  @SerializedName("assigned")
  private Boolean assigned = null;

  @SerializedName("assignable")
  private Boolean assignable = null;

  @SerializedName("unassignable")
  private Boolean unassignable = null;

  @SerializedName("work_order")
  private Object workOrder = null;

  @SerializedName("previous_request")
  private UserPreviousRequest previousRequest = null;

  @SerializedName("previous_assignment")
  private UserPreviousAssignment previousAssignment = null;

  @SerializedName("background_checks")
  private UserBackgroundChecks backgroundChecks = null;

  @SerializedName("drug_tests")
  private UserDrugTests drugTests = null;

  @SerializedName("upcoming_schedule")
  private List<UserUpcomingSchedule> upcomingSchedule = null;

  @SerializedName("worked_with")
  private Boolean workedWith = null;

  @SerializedName("jobs")
  private UserJobs jobs = null;

  @SerializedName("managed")
  private Boolean managed = null;

  @SerializedName("rating")
  private UserRating rating = null;

  @SerializedName("company")
  private UserCompany company = null;

  @SerializedName("client")
  private Company client = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("last_active")
  private java.util.Date lastActive = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("finance")
  private Finances finance = null;

  @SerializedName("preferred_groups")
  private UserPreferredGroups preferredGroups = null;

  @SerializedName("about")
  private String about = null;

  @SerializedName("tagline")
  private String tagline = null;

  @SerializedName("block")
  private Block block = null;

  @SerializedName("types_of_work")
  private TypesOfWork typesOfWork = null;

  @SerializedName("experience")
  private Experiences experience = null;

  @SerializedName("certifications")
  private Certifications certifications = null;

  @SerializedName("notes")
  private UserNotes notes = null;

  @SerializedName("licenses")
  private Licenses licenses = null;

  @SerializedName("correlation_id")
  private String correlationId = null;

  @SerializedName("education")
  private Educations education = null;

  @SerializedName("group")
  private UserGroup group = null;

  @SerializedName("experiments")
  private UserExperiments experiments = null;

  @SerializedName("preferences")
  private UserPreferences preferences = null;

  @SerializedName("features")
  private UserFeatures features = null;

  @SerializedName("is_end_client")
  private Boolean isEndClient = null;

  @SerializedName("portal")
  private UserPortal portal = null;

  @SerializedName("home")
  private String home = null;

  @SerializedName("email_verification")
  private Boolean emailVerification = null;

  @SerializedName("is_screening_administrator")
  private Boolean isScreeningAdministrator = null;

  public User actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public User addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public User id(Integer id) {
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

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User city(String city) {
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

  public User state(String state) {
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

  public User zip(String zip) {
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

  public User country(String country) {
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

  public User thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public User w2(Boolean w2) {
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

  public User created(java.util.Date created) {
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

  public User workerCompensation(Boolean workerCompensation) {
    this.workerCompensation = workerCompensation;
    return this;
  }

   /**
   * Get workerCompensation
   * @return workerCompensation
  **/

  public Boolean isWorkerCompensation() {
    return workerCompensation;
  }

  public void setWorkerCompensation(Boolean workerCompensation) {
    this.workerCompensation = workerCompensation;
  }

  public User timeZone(TimeZone timeZone) {
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

  public User insurances(Insurances insurances) {
    this.insurances = insurances;
    return this;
  }

   /**
   * Get insurances
   * @return insurances
  **/

  public Insurances getInsurances() {
    return insurances;
  }

  public void setInsurances(Insurances insurances) {
    this.insurances = insurances;
  }

  public User request(Request request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/

  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public User notifications(Notifications notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/

  public Notifications getNotifications() {
    return notifications;
  }

  public void setNotifications(Notifications notifications) {
    this.notifications = notifications;
  }

  public User messages(Messages messages) {
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

  public User route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/

  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public User website(String website) {
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

  public User coords(Coords coords) {
    this.coords = coords;
    return this;
  }

   /**
   * Get coords
   * @return coords
  **/

  public Coords getCoords() {
    return coords;
  }

  public void setCoords(Coords coords) {
    this.coords = coords;
  }

  public User protec(Boolean protec) {
    this.protec = protec;
    return this;
  }

   /**
   * Get protec
   * @return protec
  **/

  public Boolean isProtec() {
    return protec;
  }

  public void setProtec(Boolean protec) {
    this.protec = protec;
  }

  public User marketplace(Boolean marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public Boolean isMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Boolean marketplace) {
    this.marketplace = marketplace;
  }

  public User routable(Boolean routable) {
    this.routable = routable;
    return this;
  }

   /**
   * Get routable
   * @return routable
  **/

  public Boolean isRoutable() {
    return routable;
  }

  public void setRoutable(Boolean routable) {
    this.routable = routable;
  }

  public User assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/

  public Boolean isAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public User assignable(Boolean assignable) {
    this.assignable = assignable;
    return this;
  }

   /**
   * Get assignable
   * @return assignable
  **/

  public Boolean isAssignable() {
    return assignable;
  }

  public void setAssignable(Boolean assignable) {
    this.assignable = assignable;
  }

  public User unassignable(Boolean unassignable) {
    this.unassignable = unassignable;
    return this;
  }

   /**
   * Get unassignable
   * @return unassignable
  **/

  public Boolean isUnassignable() {
    return unassignable;
  }

  public void setUnassignable(Boolean unassignable) {
    this.unassignable = unassignable;
  }

  public User workOrder(Object workOrder) {
    this.workOrder = workOrder;
    return this;
  }

   /**
   * Get workOrder
   * @return workOrder
  **/

  public Object getWorkOrder() {
    return workOrder;
  }

  public void setWorkOrder(Object workOrder) {
    this.workOrder = workOrder;
  }

  public User previousRequest(UserPreviousRequest previousRequest) {
    this.previousRequest = previousRequest;
    return this;
  }

   /**
   * Get previousRequest
   * @return previousRequest
  **/

  public UserPreviousRequest getPreviousRequest() {
    return previousRequest;
  }

  public void setPreviousRequest(UserPreviousRequest previousRequest) {
    this.previousRequest = previousRequest;
  }

  public User previousAssignment(UserPreviousAssignment previousAssignment) {
    this.previousAssignment = previousAssignment;
    return this;
  }

   /**
   * Get previousAssignment
   * @return previousAssignment
  **/

  public UserPreviousAssignment getPreviousAssignment() {
    return previousAssignment;
  }

  public void setPreviousAssignment(UserPreviousAssignment previousAssignment) {
    this.previousAssignment = previousAssignment;
  }

  public User backgroundChecks(UserBackgroundChecks backgroundChecks) {
    this.backgroundChecks = backgroundChecks;
    return this;
  }

   /**
   * Get backgroundChecks
   * @return backgroundChecks
  **/

  public UserBackgroundChecks getBackgroundChecks() {
    return backgroundChecks;
  }

  public void setBackgroundChecks(UserBackgroundChecks backgroundChecks) {
    this.backgroundChecks = backgroundChecks;
  }

  public User drugTests(UserDrugTests drugTests) {
    this.drugTests = drugTests;
    return this;
  }

   /**
   * Get drugTests
   * @return drugTests
  **/

  public UserDrugTests getDrugTests() {
    return drugTests;
  }

  public void setDrugTests(UserDrugTests drugTests) {
    this.drugTests = drugTests;
  }

  public User upcomingSchedule(List<UserUpcomingSchedule> upcomingSchedule) {
    this.upcomingSchedule = upcomingSchedule;
    return this;
  }

  public User addUpcomingScheduleItem(UserUpcomingSchedule upcomingScheduleItem) {
    if (this.upcomingSchedule == null) {
      this.upcomingSchedule = new ArrayList<UserUpcomingSchedule>();
    }
    this.upcomingSchedule.add(upcomingScheduleItem);
    return this;
  }

   /**
   * Get upcomingSchedule
   * @return upcomingSchedule
  **/

  public List<UserUpcomingSchedule> getUpcomingSchedule() {
    return upcomingSchedule;
  }

  public void setUpcomingSchedule(List<UserUpcomingSchedule> upcomingSchedule) {
    this.upcomingSchedule = upcomingSchedule;
  }

  public User workedWith(Boolean workedWith) {
    this.workedWith = workedWith;
    return this;
  }

   /**
   * Get workedWith
   * @return workedWith
  **/

  public Boolean isWorkedWith() {
    return workedWith;
  }

  public void setWorkedWith(Boolean workedWith) {
    this.workedWith = workedWith;
  }

  public User jobs(UserJobs jobs) {
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/

  public UserJobs getJobs() {
    return jobs;
  }

  public void setJobs(UserJobs jobs) {
    this.jobs = jobs;
  }

  public User managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/

  public Boolean isManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  public User rating(UserRating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/

  public UserRating getRating() {
    return rating;
  }

  public void setRating(UserRating rating) {
    this.rating = rating;
  }

  public User company(UserCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/

  public UserCompany getCompany() {
    return company;
  }

  public void setCompany(UserCompany company) {
    this.company = company;
  }

  public User client(Company client) {
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

  public User role(String role) {
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

  public User lastActive(java.util.Date lastActive) {
    this.lastActive = lastActive;
    return this;
  }

   /**
   * Get lastActive
   * @return lastActive
  **/

  public java.util.Date getLastActive() {
    return lastActive;
  }

  public void setLastActive(java.util.Date lastActive) {
    this.lastActive = lastActive;
  }

  public User email(String email) {
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

  public User phone(String phone) {
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

  public User finance(Finances finance) {
    this.finance = finance;
    return this;
  }

   /**
   * Get finance
   * @return finance
  **/

  public Finances getFinance() {
    return finance;
  }

  public void setFinance(Finances finance) {
    this.finance = finance;
  }

  public User preferredGroups(UserPreferredGroups preferredGroups) {
    this.preferredGroups = preferredGroups;
    return this;
  }

   /**
   * Get preferredGroups
   * @return preferredGroups
  **/

  public UserPreferredGroups getPreferredGroups() {
    return preferredGroups;
  }

  public void setPreferredGroups(UserPreferredGroups preferredGroups) {
    this.preferredGroups = preferredGroups;
  }

  public User about(String about) {
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

  public User tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }

   /**
   * Get tagline
   * @return tagline
  **/

  public String getTagline() {
    return tagline;
  }

  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  public User block(Block block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/

  public Block getBlock() {
    return block;
  }

  public void setBlock(Block block) {
    this.block = block;
  }

  public User typesOfWork(TypesOfWork typesOfWork) {
    this.typesOfWork = typesOfWork;
    return this;
  }

   /**
   * Get typesOfWork
   * @return typesOfWork
  **/

  public TypesOfWork getTypesOfWork() {
    return typesOfWork;
  }

  public void setTypesOfWork(TypesOfWork typesOfWork) {
    this.typesOfWork = typesOfWork;
  }

  public User experience(Experiences experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/

  public Experiences getExperience() {
    return experience;
  }

  public void setExperience(Experiences experience) {
    this.experience = experience;
  }

  public User certifications(Certifications certifications) {
    this.certifications = certifications;
    return this;
  }

   /**
   * Get certifications
   * @return certifications
  **/

  public Certifications getCertifications() {
    return certifications;
  }

  public void setCertifications(Certifications certifications) {
    this.certifications = certifications;
  }

  public User notes(UserNotes notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/

  public UserNotes getNotes() {
    return notes;
  }

  public void setNotes(UserNotes notes) {
    this.notes = notes;
  }

  public User licenses(Licenses licenses) {
    this.licenses = licenses;
    return this;
  }

   /**
   * Get licenses
   * @return licenses
  **/

  public Licenses getLicenses() {
    return licenses;
  }

  public void setLicenses(Licenses licenses) {
    this.licenses = licenses;
  }

  public User correlationId(String correlationId) {
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

  public User education(Educations education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/

  public Educations getEducation() {
    return education;
  }

  public void setEducation(Educations education) {
    this.education = education;
  }

  public User group(UserGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/

  public UserGroup getGroup() {
    return group;
  }

  public void setGroup(UserGroup group) {
    this.group = group;
  }

  public User experiments(UserExperiments experiments) {
    this.experiments = experiments;
    return this;
  }

   /**
   * Get experiments
   * @return experiments
  **/

  public UserExperiments getExperiments() {
    return experiments;
  }

  public void setExperiments(UserExperiments experiments) {
    this.experiments = experiments;
  }

  public User preferences(UserPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/

  public UserPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(UserPreferences preferences) {
    this.preferences = preferences;
  }

  public User features(UserFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/

  public UserFeatures getFeatures() {
    return features;
  }

  public void setFeatures(UserFeatures features) {
    this.features = features;
  }

  public User isEndClient(Boolean isEndClient) {
    this.isEndClient = isEndClient;
    return this;
  }

   /**
   * Get isEndClient
   * @return isEndClient
  **/

  public Boolean isIsEndClient() {
    return isEndClient;
  }

  public void setIsEndClient(Boolean isEndClient) {
    this.isEndClient = isEndClient;
  }

  public User portal(UserPortal portal) {
    this.portal = portal;
    return this;
  }

   /**
   * Get portal
   * @return portal
  **/

  public UserPortal getPortal() {
    return portal;
  }

  public void setPortal(UserPortal portal) {
    this.portal = portal;
  }

  public User home(String home) {
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public User emailVerification(Boolean emailVerification) {
    this.emailVerification = emailVerification;
    return this;
  }

   /**
   * Get emailVerification
   * @return emailVerification
  **/

  public Boolean isEmailVerification() {
    return emailVerification;
  }

  public void setEmailVerification(Boolean emailVerification) {
    this.emailVerification = emailVerification;
  }

  public User isScreeningAdministrator(Boolean isScreeningAdministrator) {
    this.isScreeningAdministrator = isScreeningAdministrator;
    return this;
  }

   /**
   * Get isScreeningAdministrator
   * @return isScreeningAdministrator
  **/

  public Boolean isIsScreeningAdministrator() {
    return isScreeningAdministrator;
  }

  public void setIsScreeningAdministrator(Boolean isScreeningAdministrator) {
    this.isScreeningAdministrator = isScreeningAdministrator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.actions, user.actions) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.zip, user.zip) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.thumbnail, user.thumbnail) &&
        Objects.equals(this.w2, user.w2) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.workerCompensation, user.workerCompensation) &&
        Objects.equals(this.timeZone, user.timeZone) &&
        Objects.equals(this.insurances, user.insurances) &&
        Objects.equals(this.request, user.request) &&
        Objects.equals(this.notifications, user.notifications) &&
        Objects.equals(this.messages, user.messages) &&
        Objects.equals(this.route, user.route) &&
        Objects.equals(this.website, user.website) &&
        Objects.equals(this.coords, user.coords) &&
        Objects.equals(this.protec, user.protec) &&
        Objects.equals(this.marketplace, user.marketplace) &&
        Objects.equals(this.routable, user.routable) &&
        Objects.equals(this.assigned, user.assigned) &&
        Objects.equals(this.assignable, user.assignable) &&
        Objects.equals(this.unassignable, user.unassignable) &&
        Objects.equals(this.workOrder, user.workOrder) &&
        Objects.equals(this.previousRequest, user.previousRequest) &&
        Objects.equals(this.previousAssignment, user.previousAssignment) &&
        Objects.equals(this.backgroundChecks, user.backgroundChecks) &&
        Objects.equals(this.drugTests, user.drugTests) &&
        Objects.equals(this.upcomingSchedule, user.upcomingSchedule) &&
        Objects.equals(this.workedWith, user.workedWith) &&
        Objects.equals(this.jobs, user.jobs) &&
        Objects.equals(this.managed, user.managed) &&
        Objects.equals(this.rating, user.rating) &&
        Objects.equals(this.company, user.company) &&
        Objects.equals(this.client, user.client) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.lastActive, user.lastActive) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.finance, user.finance) &&
        Objects.equals(this.preferredGroups, user.preferredGroups) &&
        Objects.equals(this.about, user.about) &&
        Objects.equals(this.tagline, user.tagline) &&
        Objects.equals(this.block, user.block) &&
        Objects.equals(this.typesOfWork, user.typesOfWork) &&
        Objects.equals(this.experience, user.experience) &&
        Objects.equals(this.certifications, user.certifications) &&
        Objects.equals(this.notes, user.notes) &&
        Objects.equals(this.licenses, user.licenses) &&
        Objects.equals(this.correlationId, user.correlationId) &&
        Objects.equals(this.education, user.education) &&
        Objects.equals(this.group, user.group) &&
        Objects.equals(this.experiments, user.experiments) &&
        Objects.equals(this.preferences, user.preferences) &&
        Objects.equals(this.features, user.features) &&
        Objects.equals(this.isEndClient, user.isEndClient) &&
        Objects.equals(this.portal, user.portal) &&
        Objects.equals(this.home, user.home) &&
        Objects.equals(this.emailVerification, user.emailVerification) &&
        Objects.equals(this.isScreeningAdministrator, user.isScreeningAdministrator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, id, firstName, lastName, address, city, state, zip, country, thumbnail, w2, created, workerCompensation, timeZone, insurances, request, notifications, messages, route, website, coords, protec, marketplace, routable, assigned, assignable, unassignable, workOrder, previousRequest, previousAssignment, backgroundChecks, drugTests, upcomingSchedule, workedWith, jobs, managed, rating, company, client, role, lastActive, email, phone, finance, preferredGroups, about, tagline, block, typesOfWork, experience, certifications, notes, licenses, correlationId, education, group, experiments, preferences, features, isEndClient, portal, home, emailVerification, isScreeningAdministrator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    w2: ").append(toIndentedString(w2)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    workerCompensation: ").append(toIndentedString(workerCompensation)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    insurances: ").append(toIndentedString(insurances)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    protec: ").append(toIndentedString(protec)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    routable: ").append(toIndentedString(routable)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    assignable: ").append(toIndentedString(assignable)).append("\n");
    sb.append("    unassignable: ").append(toIndentedString(unassignable)).append("\n");
    sb.append("    workOrder: ").append(toIndentedString(workOrder)).append("\n");
    sb.append("    previousRequest: ").append(toIndentedString(previousRequest)).append("\n");
    sb.append("    previousAssignment: ").append(toIndentedString(previousAssignment)).append("\n");
    sb.append("    backgroundChecks: ").append(toIndentedString(backgroundChecks)).append("\n");
    sb.append("    drugTests: ").append(toIndentedString(drugTests)).append("\n");
    sb.append("    upcomingSchedule: ").append(toIndentedString(upcomingSchedule)).append("\n");
    sb.append("    workedWith: ").append(toIndentedString(workedWith)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    finance: ").append(toIndentedString(finance)).append("\n");
    sb.append("    preferredGroups: ").append(toIndentedString(preferredGroups)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    typesOfWork: ").append(toIndentedString(typesOfWork)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    isEndClient: ").append(toIndentedString(isEndClient)).append("\n");
    sb.append("    portal: ").append(toIndentedString(portal)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    emailVerification: ").append(toIndentedString(emailVerification)).append("\n");
    sb.append("    isScreeningAdministrator: ").append(toIndentedString(isScreeningAdministrator)).append("\n");
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

