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

/**
 * MessageCounts
 */

public class MessageCounts {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("per_page")
  private Integer perPage = null;

  @SerializedName("columns")
  private String columns = null;

  @SerializedName("view")
  private String view = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("has_unread_messages")
  private Boolean hasUnreadMessages = null;

  public MessageCounts total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public MessageCounts page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public MessageCounts perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/

  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public MessageCounts columns(String columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/

  public String getColumns() {
    return columns;
  }

  public void setColumns(String columns) {
    this.columns = columns;
  }

  public MessageCounts view(String view) {
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/

  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }

  public MessageCounts sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public MessageCounts order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public MessageCounts hasUnreadMessages(Boolean hasUnreadMessages) {
    this.hasUnreadMessages = hasUnreadMessages;
    return this;
  }

   /**
   * Get hasUnreadMessages
   * @return hasUnreadMessages
  **/

  public Boolean isHasUnreadMessages() {
    return hasUnreadMessages;
  }

  public void setHasUnreadMessages(Boolean hasUnreadMessages) {
    this.hasUnreadMessages = hasUnreadMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageCounts messageCounts = (MessageCounts) o;
    return Objects.equals(this.total, messageCounts.total) &&
        Objects.equals(this.page, messageCounts.page) &&
        Objects.equals(this.perPage, messageCounts.perPage) &&
        Objects.equals(this.columns, messageCounts.columns) &&
        Objects.equals(this.view, messageCounts.view) &&
        Objects.equals(this.sort, messageCounts.sort) &&
        Objects.equals(this.order, messageCounts.order) &&
        Objects.equals(this.hasUnreadMessages, messageCounts.hasUnreadMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, perPage, columns, view, sort, order, hasUnreadMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCounts {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    hasUnreadMessages: ").append(toIndentedString(hasUnreadMessages)).append("\n");
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

