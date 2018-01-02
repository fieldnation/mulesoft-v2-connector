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


import java.io.IOException;

/**
 * ShipmentCarrier
 */

public class ShipmentCarrier {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    FEDEX("fedex"),
    
    UPS("ups"),
    
    USPS("usps"),
    
    OTHER("other");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  @SerializedName("other")
  private String other = null;

  @SerializedName("tracking")
  private String tracking = null;

  @SerializedName("arrival")
  private java.util.Date arrival = null;

  @SerializedName("arrived")
  private java.util.Date arrived = null;

  public ShipmentCarrier name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public ShipmentCarrier other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/

  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public ShipmentCarrier tracking(String tracking) {
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/

  public String getTracking() {
    return tracking;
  }

  public void setTracking(String tracking) {
    this.tracking = tracking;
  }

  public ShipmentCarrier arrival(java.util.Date arrival) {
    this.arrival = arrival;
    return this;
  }

   /**
   * Get arrival
   * @return arrival
  **/

  public java.util.Date getArrival() {
    return arrival;
  }

  public void setArrival(java.util.Date arrival) {
    this.arrival = arrival;
  }

  public ShipmentCarrier arrived(java.util.Date arrived) {
    this.arrived = arrived;
    return this;
  }

   /**
   * Get arrived
   * @return arrived
  **/

  public java.util.Date getArrived() {
    return arrived;
  }

  public void setArrived(java.util.Date arrived) {
    this.arrived = arrived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentCarrier shipmentCarrier = (ShipmentCarrier) o;
    return Objects.equals(this.name, shipmentCarrier.name) &&
        Objects.equals(this.other, shipmentCarrier.other) &&
        Objects.equals(this.tracking, shipmentCarrier.tracking) &&
        Objects.equals(this.arrival, shipmentCarrier.arrival) &&
        Objects.equals(this.arrived, shipmentCarrier.arrived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, other, tracking, arrival, arrived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentCarrier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    arrived: ").append(toIndentedString(arrived)).append("\n");
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

