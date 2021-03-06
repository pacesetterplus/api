// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface DeviceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.Device)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
   * </pre>
   *
   * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
   */
  com.google.protobuf.ByteString getAppEui();

  /**
   * <pre>
   * The DevEUI is a unique, 8 byte identifier for the device.
   * </pre>
   *
   * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
   */
  com.google.protobuf.ByteString getDevEui();

  /**
   * <pre>
   * The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
   * </pre>
   *
   * <code>string app_id = 3 [(.gogoproto.customname) = "AppID"];</code>
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
   * </pre>
   *
   * <code>string app_id = 3 [(.gogoproto.customname) = "AppID"];</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
   * </pre>
   *
   * <code>string dev_id = 4 [(.gogoproto.customname) = "DevID"];</code>
   */
  java.lang.String getDevId();
  /**
   * <pre>
   * The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
   * </pre>
   *
   * <code>string dev_id = 4 [(.gogoproto.customname) = "DevID"];</code>
   */
  com.google.protobuf.ByteString
      getDevIdBytes();

  /**
   * <pre>
   * The DevAddr is a dynamic, 4 byte session address for the device.
   * </pre>
   *
   * <code>bytes dev_addr = 5 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   */
  com.google.protobuf.ByteString getDevAddr();

  /**
   * <pre>
   * The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
   * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
   * </pre>
   *
   * <code>bytes nwk_s_key = 6 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
   */
  com.google.protobuf.ByteString getNwkSKey();

  /**
   * <pre>
   * The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
   * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
   * </pre>
   *
   * <code>bytes app_s_key = 7 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppSKey"];</code>
   */
  com.google.protobuf.ByteString getAppSKey();

  /**
   * <pre>
   * The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
   * </pre>
   *
   * <code>bytes app_key = 8 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppKey"];</code>
   */
  com.google.protobuf.ByteString getAppKey();

  /**
   * <pre>
   * FCntUp is the uplink frame counter for a device session.
   * </pre>
   *
   * <code>uint32 f_cnt_up = 9;</code>
   */
  int getFCntUp();

  /**
   * <pre>
   * FCntDown is the downlink frame counter for a device session.
   * </pre>
   *
   * <code>uint32 f_cnt_down = 10;</code>
   */
  int getFCntDown();

  /**
   * <pre>
   * The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
   * </pre>
   *
   * <code>bool disable_f_cnt_check = 11;</code>
   */
  boolean getDisableFCntCheck();

  /**
   * <pre>
   * The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
   * </pre>
   *
   * <code>bool uses32_bit_f_cnt = 12;</code>
   */
  boolean getUses32BitFCnt();

  /**
   * <pre>
   * The ActivationContstraints are used to allocate a device address for a device (comma-separated).
   * There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
   * </pre>
   *
   * <code>string activation_constraints = 13;</code>
   */
  java.lang.String getActivationConstraints();
  /**
   * <pre>
   * The ActivationContstraints are used to allocate a device address for a device (comma-separated).
   * There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
   * </pre>
   *
   * <code>string activation_constraints = 13;</code>
   */
  com.google.protobuf.ByteString
      getActivationConstraintsBytes();

  /**
   * <pre>
   * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
   */
  java.util.List<com.google.protobuf.ByteString> getUsedDevNoncesList();
  /**
   * <pre>
   * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
   */
  int getUsedDevNoncesCount();
  /**
   * <pre>
   * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
   */
  com.google.protobuf.ByteString getUsedDevNonces(int index);

  /**
   * <pre>
   * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
   */
  java.util.List<com.google.protobuf.ByteString> getUsedAppNoncesList();
  /**
   * <pre>
   * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
   */
  int getUsedAppNoncesCount();
  /**
   * <pre>
   * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
   * </pre>
   *
   * <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
   */
  com.google.protobuf.ByteString getUsedAppNonces(int index);

  /**
   * <pre>
   * When the device was last seen (Unix nanoseconds)
   * </pre>
   *
   * <code>int64 last_seen = 21;</code>
   */
  long getLastSeen();
}
