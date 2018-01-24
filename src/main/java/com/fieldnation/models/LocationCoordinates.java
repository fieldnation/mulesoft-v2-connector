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
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/**
 * LocationCoordinates
 */

public class LocationCoordinates {
  @SerializedName("type")
  private String type = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("exact")
  private Boolean exact = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  public LocationCoordinates type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the object being looked up
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LocationCoordinates id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the item being looked up.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocationCoordinates latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of the item being looked up.
   * @return latitude
  **/
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public LocationCoordinates longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of the item being looked up.
   * @return longitude
  **/
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public LocationCoordinates exact(Boolean exact) {
    this.exact = exact;
    return this;
  }

   /**
   * Whether the coordinates are an exact match.
   * @return exact
  **/
  public Boolean isExact() {
    return exact;
  }

  public void setExact(Boolean exact) {
    this.exact = exact;
  }

  public LocationCoordinates city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of the item
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocationCoordinates state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of the item
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LocationCoordinates zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip/Postal Code of the item
   * @return zip
  **/
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public LocationCoordinates country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the item
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationCoordinates locationCoordinates = (LocationCoordinates) o;
    return Objects.equals(this.type, locationCoordinates.type) &&
        Objects.equals(this.id, locationCoordinates.id) &&
        Objects.equals(this.latitude, locationCoordinates.latitude) &&
        Objects.equals(this.longitude, locationCoordinates.longitude) &&
        Objects.equals(this.exact, locationCoordinates.exact) &&
        Objects.equals(this.city, locationCoordinates.city) &&
        Objects.equals(this.state, locationCoordinates.state) &&
        Objects.equals(this.zip, locationCoordinates.zip) &&
        Objects.equals(this.country, locationCoordinates.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, latitude, longitude, exact, city, state, zip, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationCoordinates {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

