// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

public interface GetByAppEUIRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:discovery.GetByAppEUIRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * compatible with Metadata message
   * </pre>
   *
   * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
   */
  com.google.protobuf.ByteString getAppEui();
}