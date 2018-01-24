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
 * TimeZone
 */

public class TimeZone {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("short")
  private String _short = null;

  @SerializedName("offset")
  private BigDecimal offset = null;

  public TimeZone id(Integer id) {
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

  public TimeZone name(String name) {
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

  public TimeZone getShort(String _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/

  public String getShort() {
    return _short;
  }

  public void setShort(String _short) {
    this._short = _short;
  }

  public TimeZone offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/

  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZone timeZone = (TimeZone) o;
    return Objects.equals(this.id, timeZone.id) &&
        Objects.equals(this.name, timeZone.name) &&
        Objects.equals(this._short, timeZone._short) &&
        Objects.equals(this.offset, timeZone.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, _short, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

