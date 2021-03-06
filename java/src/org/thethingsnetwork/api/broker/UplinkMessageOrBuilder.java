// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public interface UplinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:broker.UplinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes payload = 1;</code>
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.protocol.Message message = 2;</code>
   */
  boolean hasMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.Message getMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>bytes dev_eui = 11 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
   */
  com.google.protobuf.ByteString getDevEui();

  /**
   * <code>bytes app_eui = 12 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
   */
  com.google.protobuf.ByteString getAppEui();

  /**
   * <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
   */
  java.lang.String getDevId();
  /**
   * <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
   */
  com.google.protobuf.ByteString
      getDevIdBytes();

  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.protocol.RxMetadata getProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.protocol.RxMetadataOrBuilder getProtocolMetadataOrBuilder();

  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22 [(.gogoproto.nullable) = false];</code>
   */
  boolean hasGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadata getGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22 [(.gogoproto.nullable) = false];</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadataOrBuilder getGatewayMetadataOrBuilder();

  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  java.util.List<org.thethingsnetwork.api.broker.DownlinkOption> 
      getDownlinkOptionsList();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkOption getDownlinkOptions(int index);
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  int getDownlinkOptionsCount();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  java.util.List<? extends org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder> 
      getDownlinkOptionsOrBuilderList();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder getDownlinkOptionsOrBuilder(
      int index);

  /**
   * <code>.trace.Trace trace = 41;</code>
   */
  boolean hasTrace();
  /**
   * <code>.trace.Trace trace = 41;</code>
   */
  org.thethingsnetwork.api.trace.Trace getTrace();
  /**
   * <code>.trace.Trace trace = 41;</code>
   */
  org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder();
}
