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


import com.fieldnation.models.CompanyJobs;
import com.fieldnation.models.Feature;
import com.fieldnation.models.Rating;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Company
 */

public class Company {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("features")
  private List<Feature> features = null;

  @SerializedName("rating")
  private Rating rating = null;

  @SerializedName("blocked")
  private Boolean blocked = null;

  @SerializedName("location_address1")
  private String locationAddress1 = null;

  @SerializedName("location_address2")
  private String locationAddress2 = null;

  @SerializedName("location_city")
  private String locationCity = null;

  @SerializedName("location_state")
  private String locationState = null;

  @SerializedName("location_zip")
  private String locationZip = null;

  @SerializedName("location_country")
  private String locationCountry = null;

  @SerializedName("about")
  private String about = null;

  @SerializedName("provider_count")
  private Integer providerCount = null;

  @SerializedName("jobs")
  private CompanyJobs jobs = null;

  @SerializedName("photo")
  private String photo = null;

  public Company id(Integer id) {
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

  public Company name(String name) {
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

  public Company features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public Company addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public Company rating(Rating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public Company blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/

  public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public Company locationAddress1(String locationAddress1) {
    this.locationAddress1 = locationAddress1;
    return this;
  }

   /**
   * Get locationAddress1
   * @return locationAddress1
  **/

  public String getLocationAddress1() {
    return locationAddress1;
  }

  public void setLocationAddress1(String locationAddress1) {
    this.locationAddress1 = locationAddress1;
  }

  public Company locationAddress2(String locationAddress2) {
    this.locationAddress2 = locationAddress2;
    return this;
  }

   /**
   * Get locationAddress2
   * @return locationAddress2
  **/

  public String getLocationAddress2() {
    return locationAddress2;
  }

  public void setLocationAddress2(String locationAddress2) {
    this.locationAddress2 = locationAddress2;
  }

  public Company locationCity(String locationCity) {
    this.locationCity = locationCity;
    return this;
  }

   /**
   * Get locationCity
   * @return locationCity
  **/

  public String getLocationCity() {
    return locationCity;
  }

  public void setLocationCity(String locationCity) {
    this.locationCity = locationCity;
  }

  public Company locationState(String locationState) {
    this.locationState = locationState;
    return this;
  }

   /**
   * Get locationState
   * @return locationState
  **/

  public String getLocationState() {
    return locationState;
  }

  public void setLocationState(String locationState) {
    this.locationState = locationState;
  }

  public Company locationZip(String locationZip) {
    this.locationZip = locationZip;
    return this;
  }

   /**
   * Get locationZip
   * @return locationZip
  **/

  public String getLocationZip() {
    return locationZip;
  }

  public void setLocationZip(String locationZip) {
    this.locationZip = locationZip;
  }

  public Company locationCountry(String locationCountry) {
    this.locationCountry = locationCountry;
    return this;
  }

   /**
   * Get locationCountry
   * @return locationCountry
  **/

  public String getLocationCountry() {
    return locationCountry;
  }

  public void setLocationCountry(String locationCountry) {
    this.locationCountry = locationCountry;
  }

  public Company about(String about) {
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

  public Company providerCount(Integer providerCount) {
    this.providerCount = providerCount;
    return this;
  }

   /**
   * Get providerCount
   * @return providerCount
  **/

  public Integer getProviderCount() {
    return providerCount;
  }

  public void setProviderCount(Integer providerCount) {
    this.providerCount = providerCount;
  }

  public Company jobs(CompanyJobs jobs) {
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/

  public CompanyJobs getJobs() {
    return jobs;
  }

  public void setJobs(CompanyJobs jobs) {
    this.jobs = jobs;
  }

  public Company photo(String photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.features, company.features) &&
        Objects.equals(this.rating, company.rating) &&
        Objects.equals(this.blocked, company.blocked) &&
        Objects.equals(this.locationAddress1, company.locationAddress1) &&
        Objects.equals(this.locationAddress2, company.locationAddress2) &&
        Objects.equals(this.locationCity, company.locationCity) &&
        Objects.equals(this.locationState, company.locationState) &&
        Objects.equals(this.locationZip, company.locationZip) &&
        Objects.equals(this.locationCountry, company.locationCountry) &&
        Objects.equals(this.about, company.about) &&
        Objects.equals(this.providerCount, company.providerCount) &&
        Objects.equals(this.jobs, company.jobs) &&
        Objects.equals(this.photo, company.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, features, rating, blocked, locationAddress1, locationAddress2, locationCity, locationState, locationZip, locationCountry, about, providerCount, jobs, photo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    locationAddress1: ").append(toIndentedString(locationAddress1)).append("\n");
    sb.append("    locationAddress2: ").append(toIndentedString(locationAddress2)).append("\n");
    sb.append("    locationCity: ").append(toIndentedString(locationCity)).append("\n");
    sb.append("    locationState: ").append(toIndentedString(locationState)).append("\n");
    sb.append("    locationZip: ").append(toIndentedString(locationZip)).append("\n");
    sb.append("    locationCountry: ").append(toIndentedString(locationCountry)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    providerCount: ").append(toIndentedString(providerCount)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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

