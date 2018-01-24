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
import java.util.ArrayList;
import java.util.List;

/**
 * ListsInner
 */

public class ListsInner {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("empty_message")
  private String emptyMessage = null;

  @SerializedName("selected")
  private Boolean selected = null;

  @SerializedName("unread")
  private Integer unread = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("actions")
  private List<String> actions = null;

  public ListsInner count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ListsInner label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ListsInner emptyMessage(String emptyMessage) {
    this.emptyMessage = emptyMessage;
    return this;
  }

   /**
   * Get emptyMessage
   * @return emptyMessage
  **/

  public String getEmptyMessage() {
    return emptyMessage;
  }

  public void setEmptyMessage(String emptyMessage) {
    this.emptyMessage = emptyMessage;
  }

  public ListsInner selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/

  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public ListsInner unread(Integer unread) {
    this.unread = unread;
    return this;
  }

   /**
   * Get unread
   * @return unread
  **/

  public Integer getUnread() {
    return unread;
  }

  public void setUnread(Integer unread) {
    this.unread = unread;
  }

  public ListsInner updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/

  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ListsInner thumbnail(String thumbnail) {
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

  public ListsInner subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ListsInner actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public ListsInner addActionsItem(String actionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListsInner listsInner = (ListsInner) o;
    return Objects.equals(this.count, listsInner.count) &&
        Objects.equals(this.label, listsInner.label) &&
        Objects.equals(this.emptyMessage, listsInner.emptyMessage) &&
        Objects.equals(this.selected, listsInner.selected) &&
        Objects.equals(this.unread, listsInner.unread) &&
        Objects.equals(this.updated, listsInner.updated) &&
        Objects.equals(this.thumbnail, listsInner.thumbnail) &&
        Objects.equals(this.subject, listsInner.subject) &&
        Objects.equals(this.actions, listsInner.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, label, emptyMessage, selected, unread, updated, thumbnail, subject, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsInner {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    emptyMessage: ").append(toIndentedString(emptyMessage)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

