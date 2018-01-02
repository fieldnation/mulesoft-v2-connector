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
import com.fieldnation.models.UserCompanyJobs;
import com.fieldnation.models.UserCompanyRole;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserCompany
 */

public class UserCompany {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("features")
  private List<String> features = null;

  @SerializedName("technicians")
  private Integer technicians = null;

  @SerializedName("vendors")
  private List<Company> vendors = null;

  @SerializedName("jobs")
  private UserCompanyJobs jobs = null;

  @SerializedName("role")
  private UserCompanyRole role = null;

  public UserCompany id(Integer id) {
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

  public UserCompany name(String name) {
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

  public UserCompany features(List<String> features) {
    this.features = features;
    return this;
  }

  public UserCompany addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/

  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public UserCompany technicians(Integer technicians) {
    this.technicians = technicians;
    return this;
  }

   /**
   * Get technicians
   * @return technicians
  **/

  public Integer getTechnicians() {
    return technicians;
  }

  public void setTechnicians(Integer technicians) {
    this.technicians = technicians;
  }

  public UserCompany vendors(List<Company> vendors) {
    this.vendors = vendors;
    return this;
  }

  public UserCompany addVendorsItem(Company vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<Company>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * Get vendors
   * @return vendors
  **/

  public List<Company> getVendors() {
    return vendors;
  }

  public void setVendors(List<Company> vendors) {
    this.vendors = vendors;
  }

  public UserCompany jobs(UserCompanyJobs jobs) {
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/

  public UserCompanyJobs getJobs() {
    return jobs;
  }

  public void setJobs(UserCompanyJobs jobs) {
    this.jobs = jobs;
  }

  public UserCompany role(UserCompanyRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/

  public UserCompanyRole getRole() {
    return role;
  }

  public void setRole(UserCompanyRole role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCompany userCompany = (UserCompany) o;
    return Objects.equals(this.id, userCompany.id) &&
        Objects.equals(this.name, userCompany.name) &&
        Objects.equals(this.features, userCompany.features) &&
        Objects.equals(this.technicians, userCompany.technicians) &&
        Objects.equals(this.vendors, userCompany.vendors) &&
        Objects.equals(this.jobs, userCompany.jobs) &&
        Objects.equals(this.role, userCompany.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, features, technicians, vendors, jobs, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompany {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    technicians: ").append(toIndentedString(technicians)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

