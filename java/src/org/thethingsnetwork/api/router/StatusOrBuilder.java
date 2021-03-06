// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/router/router.proto

package org.thethingsnetwork.api.router;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:router.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.SystemStats system = 1;</code>
   */
  boolean hasSystem();
  /**
   * <code>.api.SystemStats system = 1;</code>
   */
  org.thethingsnetwork.api.SystemStats getSystem();
  /**
   * <code>.api.SystemStats system = 1;</code>
   */
  org.thethingsnetwork.api.SystemStatsOrBuilder getSystemOrBuilder();

  /**
   * <code>.api.ComponentStats component = 2;</code>
   */
  boolean hasComponent();
  /**
   * <code>.api.ComponentStats component = 2;</code>
   */
  org.thethingsnetwork.api.ComponentStats getComponent();
  /**
   * <code>.api.ComponentStats component = 2;</code>
   */
  org.thethingsnetwork.api.ComponentStatsOrBuilder getComponentOrBuilder();

  /**
   * <code>.api.Rates gateway_status = 11;</code>
   */
  boolean hasGatewayStatus();
  /**
   * <code>.api.Rates gateway_status = 11;</code>
   */
  org.thethingsnetwork.api.Rates getGatewayStatus();
  /**
   * <code>.api.Rates gateway_status = 11;</code>
   */
  org.thethingsnetwork.api.RatesOrBuilder getGatewayStatusOrBuilder();

  /**
   * <code>.api.Rates uplink = 12;</code>
   */
  boolean hasUplink();
  /**
   * <code>.api.Rates uplink = 12;</code>
   */
  org.thethingsnetwork.api.Rates getUplink();
  /**
   * <code>.api.Rates uplink = 12;</code>
   */
  org.thethingsnetwork.api.RatesOrBuilder getUplinkOrBuilder();

  /**
   * <code>.api.Rates downlink = 13;</code>
   */
  boolean hasDownlink();
  /**
   * <code>.api.Rates downlink = 13;</code>
   */
  org.thethingsnetwork.api.Rates getDownlink();
  /**
   * <code>.api.Rates downlink = 13;</code>
   */
  org.thethingsnetwork.api.RatesOrBuilder getDownlinkOrBuilder();

  /**
   * <code>.api.Rates activations = 14;</code>
   */
  boolean hasActivations();
  /**
   * <code>.api.Rates activations = 14;</code>
   */
  org.thethingsnetwork.api.Rates getActivations();
  /**
   * <code>.api.Rates activations = 14;</code>
   */
  org.thethingsnetwork.api.RatesOrBuilder getActivationsOrBuilder();

  /**
   * <pre>
   * Connections
   * </pre>
   *
   * <code>uint32 connected_gateways = 21;</code>
   */
  int getConnectedGateways();

  /**
   * <code>uint32 connected_brokers = 22;</code>
   */
  int getConnectedBrokers();
}
