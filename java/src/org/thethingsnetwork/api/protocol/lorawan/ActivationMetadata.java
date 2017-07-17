// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.ActivationMetadata}
 */
public  final class ActivationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.ActivationMetadata)
    ActivationMetadataOrBuilder {
  // Use ActivationMetadata.newBuilder() to construct.
  private ActivationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivationMetadata() {
    appEui_ = com.google.protobuf.ByteString.EMPTY;
    devEui_ = com.google.protobuf.ByteString.EMPTY;
    devAddr_ = com.google.protobuf.ByteString.EMPTY;
    nwkSKey_ = com.google.protobuf.ByteString.EMPTY;
    rx1DrOffset_ = 0;
    rx2Dr_ = 0;
    rxDelay_ = 0;
    frequencyPlan_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ActivationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            appEui_ = input.readBytes();
            break;
          }
          case 18: {

            devEui_ = input.readBytes();
            break;
          }
          case 26: {

            devAddr_ = input.readBytes();
            break;
          }
          case 34: {

            nwkSKey_ = input.readBytes();
            break;
          }
          case 88: {

            rx1DrOffset_ = input.readUInt32();
            break;
          }
          case 96: {

            rx2Dr_ = input.readUInt32();
            break;
          }
          case 104: {

            rxDelay_ = input.readUInt32();
            break;
          }
          case 114: {
            org.thethingsnetwork.api.protocol.lorawan.CFList.Builder subBuilder = null;
            if (cfList_ != null) {
              subBuilder = cfList_.toBuilder();
            }
            cfList_ = input.readMessage(org.thethingsnetwork.api.protocol.lorawan.CFList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cfList_);
              cfList_ = subBuilder.buildPartial();
            }

            break;
          }
          case 120: {
            int rawValue = input.readEnum();

            frequencyPlan_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_ActivationMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_ActivationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.class, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder.class);
  }

  public static final int APP_EUI_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString appEui_;
  /**
   * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
   */
  public com.google.protobuf.ByteString getAppEui() {
    return appEui_;
  }

  public static final int DEV_EUI_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString devEui_;
  /**
   * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI"];</code>
   */
  public com.google.protobuf.ByteString getDevEui() {
    return devEui_;
  }

  public static final int DEV_ADDR_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString devAddr_;
  /**
   * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   */
  public com.google.protobuf.ByteString getDevAddr() {
    return devAddr_;
  }

  public static final int NWK_S_KEY_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString nwkSKey_;
  /**
   * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
   */
  public com.google.protobuf.ByteString getNwkSKey() {
    return nwkSKey_;
  }

  public static final int RX1_DR_OFFSET_FIELD_NUMBER = 11;
  private int rx1DrOffset_;
  /**
   * <code>uint32 rx1_dr_offset = 11;</code>
   */
  public int getRx1DrOffset() {
    return rx1DrOffset_;
  }

  public static final int RX2_DR_FIELD_NUMBER = 12;
  private int rx2Dr_;
  /**
   * <code>uint32 rx2_dr = 12;</code>
   */
  public int getRx2Dr() {
    return rx2Dr_;
  }

  public static final int RX_DELAY_FIELD_NUMBER = 13;
  private int rxDelay_;
  /**
   * <code>uint32 rx_delay = 13;</code>
   */
  public int getRxDelay() {
    return rxDelay_;
  }

  public static final int CF_LIST_FIELD_NUMBER = 14;
  private org.thethingsnetwork.api.protocol.lorawan.CFList cfList_;
  /**
   * <code>.lorawan.CFList cf_list = 14;</code>
   */
  public boolean hasCfList() {
    return cfList_ != null;
  }
  /**
   * <code>.lorawan.CFList cf_list = 14;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.CFList getCfList() {
    return cfList_ == null ? org.thethingsnetwork.api.protocol.lorawan.CFList.getDefaultInstance() : cfList_;
  }
  /**
   * <code>.lorawan.CFList cf_list = 14;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder getCfListOrBuilder() {
    return getCfList();
  }

  public static final int FREQUENCY_PLAN_FIELD_NUMBER = 15;
  private int frequencyPlan_;
  /**
   * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
   */
  public int getFrequencyPlanValue() {
    return frequencyPlan_;
  }
  /**
   * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan getFrequencyPlan() {
    org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan result = org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.valueOf(frequencyPlan_);
    return result == null ? org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!appEui_.isEmpty()) {
      output.writeBytes(1, appEui_);
    }
    if (!devEui_.isEmpty()) {
      output.writeBytes(2, devEui_);
    }
    if (!devAddr_.isEmpty()) {
      output.writeBytes(3, devAddr_);
    }
    if (!nwkSKey_.isEmpty()) {
      output.writeBytes(4, nwkSKey_);
    }
    if (rx1DrOffset_ != 0) {
      output.writeUInt32(11, rx1DrOffset_);
    }
    if (rx2Dr_ != 0) {
      output.writeUInt32(12, rx2Dr_);
    }
    if (rxDelay_ != 0) {
      output.writeUInt32(13, rxDelay_);
    }
    if (cfList_ != null) {
      output.writeMessage(14, getCfList());
    }
    if (frequencyPlan_ != org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.EU_863_870.getNumber()) {
      output.writeEnum(15, frequencyPlan_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!appEui_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, appEui_);
    }
    if (!devEui_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, devEui_);
    }
    if (!devAddr_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, devAddr_);
    }
    if (!nwkSKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, nwkSKey_);
    }
    if (rx1DrOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(11, rx1DrOffset_);
    }
    if (rx2Dr_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, rx2Dr_);
    }
    if (rxDelay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, rxDelay_);
    }
    if (cfList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(14, getCfList());
    }
    if (frequencyPlan_ != org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.EU_863_870.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(15, frequencyPlan_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata other = (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) obj;

    boolean result = true;
    result = result && getAppEui()
        .equals(other.getAppEui());
    result = result && getDevEui()
        .equals(other.getDevEui());
    result = result && getDevAddr()
        .equals(other.getDevAddr());
    result = result && getNwkSKey()
        .equals(other.getNwkSKey());
    result = result && (getRx1DrOffset()
        == other.getRx1DrOffset());
    result = result && (getRx2Dr()
        == other.getRx2Dr());
    result = result && (getRxDelay()
        == other.getRxDelay());
    result = result && (hasCfList() == other.hasCfList());
    if (hasCfList()) {
      result = result && getCfList()
          .equals(other.getCfList());
    }
    result = result && frequencyPlan_ == other.frequencyPlan_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APP_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getAppEui().hashCode();
    hash = (37 * hash) + DEV_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getDevEui().hashCode();
    hash = (37 * hash) + DEV_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getDevAddr().hashCode();
    hash = (37 * hash) + NWK_S_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getNwkSKey().hashCode();
    hash = (37 * hash) + RX1_DR_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getRx1DrOffset();
    hash = (37 * hash) + RX2_DR_FIELD_NUMBER;
    hash = (53 * hash) + getRx2Dr();
    hash = (37 * hash) + RX_DELAY_FIELD_NUMBER;
    hash = (53 * hash) + getRxDelay();
    if (hasCfList()) {
      hash = (37 * hash) + CF_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCfList().hashCode();
    }
    hash = (37 * hash) + FREQUENCY_PLAN_FIELD_NUMBER;
    hash = (53 * hash) + frequencyPlan_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lorawan.ActivationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.ActivationMetadata)
      org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_ActivationMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_ActivationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.class, org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      appEui_ = com.google.protobuf.ByteString.EMPTY;

      devEui_ = com.google.protobuf.ByteString.EMPTY;

      devAddr_ = com.google.protobuf.ByteString.EMPTY;

      nwkSKey_ = com.google.protobuf.ByteString.EMPTY;

      rx1DrOffset_ = 0;

      rx2Dr_ = 0;

      rxDelay_ = 0;

      if (cfListBuilder_ == null) {
        cfList_ = null;
      } else {
        cfList_ = null;
        cfListBuilder_ = null;
      }
      frequencyPlan_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_ActivationMetadata_descriptor;
    }

    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance();
    }

    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata build() {
      org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata result = new org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata(this);
      result.appEui_ = appEui_;
      result.devEui_ = devEui_;
      result.devAddr_ = devAddr_;
      result.nwkSKey_ = nwkSKey_;
      result.rx1DrOffset_ = rx1DrOffset_;
      result.rx2Dr_ = rx2Dr_;
      result.rxDelay_ = rxDelay_;
      if (cfListBuilder_ == null) {
        result.cfList_ = cfList_;
      } else {
        result.cfList_ = cfListBuilder_.build();
      }
      result.frequencyPlan_ = frequencyPlan_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata.getDefaultInstance()) return this;
      if (other.getAppEui() != com.google.protobuf.ByteString.EMPTY) {
        setAppEui(other.getAppEui());
      }
      if (other.getDevEui() != com.google.protobuf.ByteString.EMPTY) {
        setDevEui(other.getDevEui());
      }
      if (other.getDevAddr() != com.google.protobuf.ByteString.EMPTY) {
        setDevAddr(other.getDevAddr());
      }
      if (other.getNwkSKey() != com.google.protobuf.ByteString.EMPTY) {
        setNwkSKey(other.getNwkSKey());
      }
      if (other.getRx1DrOffset() != 0) {
        setRx1DrOffset(other.getRx1DrOffset());
      }
      if (other.getRx2Dr() != 0) {
        setRx2Dr(other.getRx2Dr());
      }
      if (other.getRxDelay() != 0) {
        setRxDelay(other.getRxDelay());
      }
      if (other.hasCfList()) {
        mergeCfList(other.getCfList());
      }
      if (other.frequencyPlan_ != 0) {
        setFrequencyPlanValue(other.getFrequencyPlanValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString appEui_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    public com.google.protobuf.ByteString getAppEui() {
      return appEui_;
    }
    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    public Builder setAppEui(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appEui_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    public Builder clearAppEui() {
      
      appEui_ = getDefaultInstance().getAppEui();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString devEui_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI"];</code>
     */
    public com.google.protobuf.ByteString getDevEui() {
      return devEui_;
    }
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI"];</code>
     */
    public Builder setDevEui(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devEui_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI"];</code>
     */
    public Builder clearDevEui() {
      
      devEui_ = getDefaultInstance().getDevEui();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString devAddr_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public com.google.protobuf.ByteString getDevAddr() {
      return devAddr_;
    }
    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public Builder setDevAddr(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public Builder clearDevAddr() {
      
      devAddr_ = getDefaultInstance().getDevAddr();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString nwkSKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    public com.google.protobuf.ByteString getNwkSKey() {
      return nwkSKey_;
    }
    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    public Builder setNwkSKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nwkSKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    public Builder clearNwkSKey() {
      
      nwkSKey_ = getDefaultInstance().getNwkSKey();
      onChanged();
      return this;
    }

    private int rx1DrOffset_ ;
    /**
     * <code>uint32 rx1_dr_offset = 11;</code>
     */
    public int getRx1DrOffset() {
      return rx1DrOffset_;
    }
    /**
     * <code>uint32 rx1_dr_offset = 11;</code>
     */
    public Builder setRx1DrOffset(int value) {
      
      rx1DrOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rx1_dr_offset = 11;</code>
     */
    public Builder clearRx1DrOffset() {
      
      rx1DrOffset_ = 0;
      onChanged();
      return this;
    }

    private int rx2Dr_ ;
    /**
     * <code>uint32 rx2_dr = 12;</code>
     */
    public int getRx2Dr() {
      return rx2Dr_;
    }
    /**
     * <code>uint32 rx2_dr = 12;</code>
     */
    public Builder setRx2Dr(int value) {
      
      rx2Dr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rx2_dr = 12;</code>
     */
    public Builder clearRx2Dr() {
      
      rx2Dr_ = 0;
      onChanged();
      return this;
    }

    private int rxDelay_ ;
    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    public int getRxDelay() {
      return rxDelay_;
    }
    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    public Builder setRxDelay(int value) {
      
      rxDelay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    public Builder clearRxDelay() {
      
      rxDelay_ = 0;
      onChanged();
      return this;
    }

    private org.thethingsnetwork.api.protocol.lorawan.CFList cfList_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.CFList, org.thethingsnetwork.api.protocol.lorawan.CFList.Builder, org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder> cfListBuilder_;
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public boolean hasCfList() {
      return cfListBuilder_ != null || cfList_ != null;
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.CFList getCfList() {
      if (cfListBuilder_ == null) {
        return cfList_ == null ? org.thethingsnetwork.api.protocol.lorawan.CFList.getDefaultInstance() : cfList_;
      } else {
        return cfListBuilder_.getMessage();
      }
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public Builder setCfList(org.thethingsnetwork.api.protocol.lorawan.CFList value) {
      if (cfListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cfList_ = value;
        onChanged();
      } else {
        cfListBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public Builder setCfList(
        org.thethingsnetwork.api.protocol.lorawan.CFList.Builder builderForValue) {
      if (cfListBuilder_ == null) {
        cfList_ = builderForValue.build();
        onChanged();
      } else {
        cfListBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public Builder mergeCfList(org.thethingsnetwork.api.protocol.lorawan.CFList value) {
      if (cfListBuilder_ == null) {
        if (cfList_ != null) {
          cfList_ =
            org.thethingsnetwork.api.protocol.lorawan.CFList.newBuilder(cfList_).mergeFrom(value).buildPartial();
        } else {
          cfList_ = value;
        }
        onChanged();
      } else {
        cfListBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public Builder clearCfList() {
      if (cfListBuilder_ == null) {
        cfList_ = null;
        onChanged();
      } else {
        cfList_ = null;
        cfListBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.CFList.Builder getCfListBuilder() {
      
      onChanged();
      return getCfListFieldBuilder().getBuilder();
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder getCfListOrBuilder() {
      if (cfListBuilder_ != null) {
        return cfListBuilder_.getMessageOrBuilder();
      } else {
        return cfList_ == null ?
            org.thethingsnetwork.api.protocol.lorawan.CFList.getDefaultInstance() : cfList_;
      }
    }
    /**
     * <code>.lorawan.CFList cf_list = 14;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.CFList, org.thethingsnetwork.api.protocol.lorawan.CFList.Builder, org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder> 
        getCfListFieldBuilder() {
      if (cfListBuilder_ == null) {
        cfListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.protocol.lorawan.CFList, org.thethingsnetwork.api.protocol.lorawan.CFList.Builder, org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder>(
                getCfList(),
                getParentForChildren(),
                isClean());
        cfList_ = null;
      }
      return cfListBuilder_;
    }

    private int frequencyPlan_ = 0;
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public int getFrequencyPlanValue() {
      return frequencyPlan_;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public Builder setFrequencyPlanValue(int value) {
      frequencyPlan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan getFrequencyPlan() {
      org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan result = org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.valueOf(frequencyPlan_);
      return result == null ? org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.UNRECOGNIZED : result;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public Builder setFrequencyPlan(org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      frequencyPlan_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public Builder clearFrequencyPlan() {
      
      frequencyPlan_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:lorawan.ActivationMetadata)
  }

  // @@protoc_insertion_point(class_scope:lorawan.ActivationMetadata)
  private static final org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ActivationMetadata>() {
    public ActivationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActivationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivationMetadata> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
