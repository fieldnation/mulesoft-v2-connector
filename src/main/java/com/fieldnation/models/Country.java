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


import com.fieldnation.models.CountryAddress1;
import com.fieldnation.models.CountryAmexfx;
import com.fieldnation.models.CountryState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Country
 */

public class Country {
  @SerializedName("name")
  private String name = null;

  @SerializedName("iso")
  private String iso = null;

  @SerializedName("address1")
  private CountryAddress1 address1 = null;

  @SerializedName("address2")
  private CountryAddress1 address2 = null;

  @SerializedName("city")
  private CountryAddress1 city = null;

  @SerializedName("state")
  private CountryState state = null;

  @SerializedName("zip")
  private CountryAddress1 zip = null;

  @SerializedName("amexfx")
  private List<CountryAmexfx> amexfx = null;

  public Country name(String name) {
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

  public Country iso(String iso) {
    this.iso = iso;
    return this;
  }

   /**
   * Get iso
   * @return iso
  **/

  public String getIso() {
    return iso;
  }

  public void setIso(String iso) {
    this.iso = iso;
  }

  public Country address1(CountryAddress1 address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/

  public CountryAddress1 getAddress1() {
    return address1;
  }

  public void setAddress1(CountryAddress1 address1) {
    this.address1 = address1;
  }

  public Country address2(CountryAddress1 address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/

  public CountryAddress1 getAddress2() {
    return address2;
  }

  public void setAddress2(CountryAddress1 address2) {
    this.address2 = address2;
  }

  public Country city(CountryAddress1 city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/

  public CountryAddress1 getCity() {
    return city;
  }

  public void setCity(CountryAddress1 city) {
    this.city = city;
  }

  public Country state(CountryState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/

  public CountryState getState() {
    return state;
  }

  public void setState(CountryState state) {
    this.state = state;
  }

  public Country zip(CountryAddress1 zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/

  public CountryAddress1 getZip() {
    return zip;
  }

  public void setZip(CountryAddress1 zip) {
    this.zip = zip;
  }

  public Country amexfx(List<CountryAmexfx> amexfx) {
    this.amexfx = amexfx;
    return this;
  }

  public Country addAmexfxItem(CountryAmexfx amexfxItem) {
    if (this.amexfx == null) {
      this.amexfx = new ArrayList<CountryAmexfx>();
    }
    this.amexfx.add(amexfxItem);
    return this;
  }

   /**
   * Get amexfx
   * @return amexfx
  **/

  public List<CountryAmexfx> getAmexfx() {
    return amexfx;
  }

  public void setAmexfx(List<CountryAmexfx> amexfx) {
    this.amexfx = amexfx;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.name, country.name) &&
        Objects.equals(this.iso, country.iso) &&
        Objects.equals(this.address1, country.address1) &&
        Objects.equals(this.address2, country.address2) &&
        Objects.equals(this.city, country.city) &&
        Objects.equals(this.state, country.state) &&
        Objects.equals(this.zip, country.zip) &&
        Objects.equals(this.amexfx, country.amexfx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, iso, address1, address2, city, state, zip, amexfx);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iso: ").append(toIndentedString(iso)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    amexfx: ").append(toIndentedString(amexfx)).append("\n");
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

