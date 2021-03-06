// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto

package org.thethingsnetwork.api.protocol.lorawan;

public final class LoRaWANDeviceProto {
  private LoRaWANDeviceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_DeviceIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_DeviceIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_Device_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=github.com/TheThingsNetwork/api/protoc" +
      "ol/lorawan/device.proto\022\007lorawan\032\033google" +
      "/protobuf/empty.proto\032-github.com/gogo/p" +
      "rotobuf/gogoproto/gogo.proto\"\276\001\n\020DeviceI" +
      "dentifier\022T\n\007app_eui\030\001 \001(\014BC\342\336\037\006AppEUI\310\336" +
      "\037\000\332\336\0371github.com/TheThingsNetwork/ttn/co" +
      "re/types.AppEUI\022T\n\007dev_eui\030\002 \001(\014BC\342\336\037\006De" +
      "vEUI\310\336\037\000\332\336\0371github.com/TheThingsNetwork/" +
      "ttn/core/types.DevEUI\"\306\006\n\006Device\022T\n\007app_" +
      "eui\030\001 \001(\014BC\342\336\037\006AppEUI\310\336\037\000\332\336\0371github.com/" +
      "TheThingsNetwork/ttn/core/types.AppEUI\022T" +
      "\n\007dev_eui\030\002 \001(\014BC\342\336\037\006DevEUI\310\336\037\000\332\336\0371githu" +
      "b.com/TheThingsNetwork/ttn/core/types.De" +
      "vEUI\022\031\n\006app_id\030\003 \001(\tB\t\342\336\037\005AppID\022\031\n\006dev_i" +
      "d\030\004 \001(\tB\t\342\336\037\005DevID\022H\n\010dev_addr\030\005 \001(\014B6\332\336" +
      "\0372github.com/TheThingsNetwork/ttn/core/t" +
      "ypes.DevAddr\022I\n\tnwk_s_key\030\006 \001(\014B6\332\336\0372git" +
      "hub.com/TheThingsNetwork/ttn/core/types." +
      "NwkSKey\022I\n\tapp_s_key\030\007 \001(\014B6\332\336\0372github.c" +
      "om/TheThingsNetwork/ttn/core/types.AppSK" +
      "ey\022F\n\007app_key\030\010 \001(\014B5\332\336\0371github.com/TheT" +
      "hingsNetwork/ttn/core/types.AppKey\022\020\n\010f_" +
      "cnt_up\030\t \001(\r\022\022\n\nf_cnt_down\030\n \001(\r\022\033\n\023disa" +
      "ble_f_cnt_check\030\013 \001(\010\022\030\n\020uses32_bit_f_cn" +
      "t\030\014 \001(\010\022\036\n\026activation_constraints\030\r \001(\t\022" +
      "P\n\017used_dev_nonces\030\016 \003(\014B7\332\336\0373github.com" +
      "/TheThingsNetwork/ttn/core/types.DevNonc" +
      "e\022P\n\017used_app_nonces\030\017 \003(\014B7\332\336\0373github.c" +
      "om/TheThingsNetwork/ttn/core/types.AppNo" +
      "nce\022\021\n\tlast_seen\030\025 \001(\0032\301\001\n\rDeviceManager" +
      "\0227\n\tGetDevice\022\031.lorawan.DeviceIdentifier" +
      "\032\017.lorawan.Device\0224\n\tSetDevice\022\017.lorawan" +
      ".Device\032\026.google.protobuf.Empty\022A\n\014Delet" +
      "eDevice\022\031.lorawan.DeviceIdentifier\032\026.goo" +
      "gle.protobuf.EmptyB\232\001\n)org.thethingsnetw" +
      "ork.api.protocol.lorawanB\022LoRaWANDeviceP" +
      "rotoP\001Z0github.com/TheThingsNetwork/api/" +
      "protocol/lorawan\252\002$TheThingsNetwork.API." +
      "LoRaWANProtocolb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_lorawan_DeviceIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lorawan_DeviceIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_DeviceIdentifier_descriptor,
        new java.lang.String[] { "AppEui", "DevEui", });
    internal_static_lorawan_Device_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lorawan_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_Device_descriptor,
        new java.lang.String[] { "AppEui", "DevEui", "AppId", "DevId", "DevAddr", "NwkSKey", "AppSKey", "AppKey", "FCntUp", "FCntDown", "DisableFCntCheck", "Uses32BitFCnt", "ActivationConstraints", "UsedDevNonces", "UsedAppNonces", "LastSeen", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
