// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

public interface MetadataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:discovery.MetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the service that should be modified
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the service that should be modified
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name of the service (router/broker/handler) that should be modified
   * </pre>
   *
   * <code>string service_name = 2;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name of the service (router/broker/handler) that should be modified
   * </pre>
   *
   * <code>string service_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * Metadata to add or remove
   * </pre>
   *
   * <code>.discovery.Metadata metadata = 12;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata to add or remove
   * </pre>
   *
   * <code>.discovery.Metadata metadata = 12;</code>
   */
  org.thethingsnetwork.api.discovery.Metadata getMetadata();
  /**
   * <pre>
   * Metadata to add or remove
   * </pre>
   *
   * <code>.discovery.Metadata metadata = 12;</code>
   */
  org.thethingsnetwork.api.discovery.MetadataOrBuilder getMetadataOrBuilder();
}