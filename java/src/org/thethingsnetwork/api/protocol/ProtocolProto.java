// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/protocol.proto

package org.thethingsnetwork.api.protocol;

public final class ProtocolProto {
  private ProtocolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_RxMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_RxMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_TxConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_TxConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_ActivationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_ActivationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7github.com/TheThingsNetwork/api/protoc" +
      "ol/protocol.proto\022\010protocol\032-github.com/" +
      "gogo/protobuf/gogoproto/gogo.proto\032>gith" +
      "ub.com/TheThingsNetwork/api/protocol/lor" +
      "awan/lorawan.proto\"G\n\007Message\0220\n\007lorawan" +
      "\030\001 \001(\0132\020.lorawan.MessageB\013\342\336\037\007LoRaWANH\000B" +
      "\n\n\010protocol\"K\n\nRxMetadata\0221\n\007lorawan\030\001 \001" +
      "(\0132\021.lorawan.MetadataB\013\342\336\037\007LoRaWANH\000B\n\n\010" +
      "protocol\"W\n\017TxConfiguration\0228\n\007lorawan\030\001" +
      " \001(\0132\030.lorawan.TxConfigurationB\013\342\336\037\007LoRa" +
      "WANH\000B\n\n\010protocol\"]\n\022ActivationMetadata\022" +
      ";\n\007lorawan\030\001 \001(\0132\033.lorawan.ActivationMet" +
      "adataB\013\342\336\037\007LoRaWANH\000B\n\n\010protocolB~\n!org." +
      "thethingsnetwork.api.protocolB\rProtocolP" +
      "rotoP\001Z(github.com/TheThingsNetwork/api/" +
      "protocol\252\002\035TheThingsNetwork.API.Protocol" +
      "b\006proto3"
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
          com.google.protobuf.GoGoProtos.getDescriptor(),
          org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.getDescriptor(),
        }, assigner);
    internal_static_protocol_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_Message_descriptor,
        new java.lang.String[] { "Lorawan", "Protocol", });
    internal_static_protocol_RxMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protocol_RxMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_RxMetadata_descriptor,
        new java.lang.String[] { "Lorawan", "Protocol", });
    internal_static_protocol_TxConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protocol_TxConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_TxConfiguration_descriptor,
        new java.lang.String[] { "Lorawan", "Protocol", });
    internal_static_protocol_ActivationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_protocol_ActivationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_ActivationMetadata_descriptor,
        new java.lang.String[] { "Lorawan", "Protocol", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
