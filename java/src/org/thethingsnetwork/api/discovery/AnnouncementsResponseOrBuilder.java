// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

public interface AnnouncementsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:discovery.AnnouncementsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  java.util.List<org.thethingsnetwork.api.discovery.Announcement> 
      getServicesList();
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  org.thethingsnetwork.api.discovery.Announcement getServices(int index);
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  int getServicesCount();
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  java.util.List<? extends org.thethingsnetwork.api.discovery.AnnouncementOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  org.thethingsnetwork.api.discovery.AnnouncementOrBuilder getServicesOrBuilder(
      int index);
}
