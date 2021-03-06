// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.FHDR}
 */
public  final class FHDR extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.FHDR)
    FHDROrBuilder {
private static final long serialVersionUID = 0L;
  // Use FHDR.newBuilder() to construct.
  private FHDR(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FHDR() {
    devAddr_ = com.google.protobuf.ByteString.EMPTY;
    fCnt_ = 0;
    fOpts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FHDR(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            devAddr_ = input.readBytes();
            break;
          }
          case 18: {
            org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder subBuilder = null;
            if (fCtrl_ != null) {
              subBuilder = fCtrl_.toBuilder();
            }
            fCtrl_ = input.readMessage(org.thethingsnetwork.api.protocol.lorawan.FCtrl.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fCtrl_);
              fCtrl_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            fCnt_ = input.readUInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              fOpts_ = new java.util.ArrayList<org.thethingsnetwork.api.protocol.lorawan.MACCommand>();
              mutable_bitField0_ |= 0x00000008;
            }
            fOpts_.add(
                input.readMessage(org.thethingsnetwork.api.protocol.lorawan.MACCommand.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        fOpts_ = java.util.Collections.unmodifiableList(fOpts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_FHDR_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_FHDR_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.FHDR.class, org.thethingsnetwork.api.protocol.lorawan.FHDR.Builder.class);
  }

  private int bitField0_;
  public static final int DEV_ADDR_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString devAddr_;
  /**
   * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   */
  public com.google.protobuf.ByteString getDevAddr() {
    return devAddr_;
  }

  public static final int F_CTRL_FIELD_NUMBER = 2;
  private org.thethingsnetwork.api.protocol.lorawan.FCtrl fCtrl_;
  /**
   * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  public boolean hasFCtrl() {
    return fCtrl_ != null;
  }
  /**
   * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.FCtrl getFCtrl() {
    return fCtrl_ == null ? org.thethingsnetwork.api.protocol.lorawan.FCtrl.getDefaultInstance() : fCtrl_;
  }
  /**
   * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.FCtrlOrBuilder getFCtrlOrBuilder() {
    return getFCtrl();
  }

  public static final int F_CNT_FIELD_NUMBER = 3;
  private int fCnt_;
  /**
   * <code>uint32 f_cnt = 3;</code>
   */
  public int getFCnt() {
    return fCnt_;
  }

  public static final int F_OPTS_FIELD_NUMBER = 4;
  private java.util.List<org.thethingsnetwork.api.protocol.lorawan.MACCommand> fOpts_;
  /**
   * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<org.thethingsnetwork.api.protocol.lorawan.MACCommand> getFOptsList() {
    return fOpts_;
  }
  /**
   * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
   */
  public java.util.List<? extends org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder> 
      getFOptsOrBuilderList() {
    return fOpts_;
  }
  /**
   * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
   */
  public int getFOptsCount() {
    return fOpts_.size();
  }
  /**
   * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.MACCommand getFOpts(int index) {
    return fOpts_.get(index);
  }
  /**
   * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder getFOptsOrBuilder(
      int index) {
    return fOpts_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!devAddr_.isEmpty()) {
      output.writeBytes(1, devAddr_);
    }
    if (fCtrl_ != null) {
      output.writeMessage(2, getFCtrl());
    }
    if (fCnt_ != 0) {
      output.writeUInt32(3, fCnt_);
    }
    for (int i = 0; i < fOpts_.size(); i++) {
      output.writeMessage(4, fOpts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!devAddr_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, devAddr_);
    }
    if (fCtrl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFCtrl());
    }
    if (fCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, fCnt_);
    }
    for (int i = 0; i < fOpts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, fOpts_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.FHDR)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.FHDR other = (org.thethingsnetwork.api.protocol.lorawan.FHDR) obj;

    boolean result = true;
    result = result && getDevAddr()
        .equals(other.getDevAddr());
    result = result && (hasFCtrl() == other.hasFCtrl());
    if (hasFCtrl()) {
      result = result && getFCtrl()
          .equals(other.getFCtrl());
    }
    result = result && (getFCnt()
        == other.getFCnt());
    result = result && getFOptsList()
        .equals(other.getFOptsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEV_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getDevAddr().hashCode();
    if (hasFCtrl()) {
      hash = (37 * hash) + F_CTRL_FIELD_NUMBER;
      hash = (53 * hash) + getFCtrl().hashCode();
    }
    hash = (37 * hash) + F_CNT_FIELD_NUMBER;
    hash = (53 * hash) + getFCnt();
    if (getFOptsCount() > 0) {
      hash = (37 * hash) + F_OPTS_FIELD_NUMBER;
      hash = (53 * hash) + getFOptsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.FHDR parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.FHDR prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code lorawan.FHDR}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.FHDR)
      org.thethingsnetwork.api.protocol.lorawan.FHDROrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_FHDR_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_FHDR_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.FHDR.class, org.thethingsnetwork.api.protocol.lorawan.FHDR.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.FHDR.newBuilder()
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
        getFOptsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      devAddr_ = com.google.protobuf.ByteString.EMPTY;

      if (fCtrlBuilder_ == null) {
        fCtrl_ = null;
      } else {
        fCtrl_ = null;
        fCtrlBuilder_ = null;
      }
      fCnt_ = 0;

      if (fOptsBuilder_ == null) {
        fOpts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        fOptsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_FHDR_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.FHDR getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.FHDR.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.FHDR build() {
      org.thethingsnetwork.api.protocol.lorawan.FHDR result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.FHDR buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.FHDR result = new org.thethingsnetwork.api.protocol.lorawan.FHDR(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.devAddr_ = devAddr_;
      if (fCtrlBuilder_ == null) {
        result.fCtrl_ = fCtrl_;
      } else {
        result.fCtrl_ = fCtrlBuilder_.build();
      }
      result.fCnt_ = fCnt_;
      if (fOptsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          fOpts_ = java.util.Collections.unmodifiableList(fOpts_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.fOpts_ = fOpts_;
      } else {
        result.fOpts_ = fOptsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.FHDR) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.FHDR)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.FHDR other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.FHDR.getDefaultInstance()) return this;
      if (other.getDevAddr() != com.google.protobuf.ByteString.EMPTY) {
        setDevAddr(other.getDevAddr());
      }
      if (other.hasFCtrl()) {
        mergeFCtrl(other.getFCtrl());
      }
      if (other.getFCnt() != 0) {
        setFCnt(other.getFCnt());
      }
      if (fOptsBuilder_ == null) {
        if (!other.fOpts_.isEmpty()) {
          if (fOpts_.isEmpty()) {
            fOpts_ = other.fOpts_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFOptsIsMutable();
            fOpts_.addAll(other.fOpts_);
          }
          onChanged();
        }
      } else {
        if (!other.fOpts_.isEmpty()) {
          if (fOptsBuilder_.isEmpty()) {
            fOptsBuilder_.dispose();
            fOptsBuilder_ = null;
            fOpts_ = other.fOpts_;
            bitField0_ = (bitField0_ & ~0x00000008);
            fOptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFOptsFieldBuilder() : null;
          } else {
            fOptsBuilder_.addAllMessages(other.fOpts_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.protocol.lorawan.FHDR parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.FHDR) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString devAddr_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public com.google.protobuf.ByteString getDevAddr() {
      return devAddr_;
    }
    /**
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
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
     * <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public Builder clearDevAddr() {
      
      devAddr_ = getDefaultInstance().getDevAddr();
      onChanged();
      return this;
    }

    private org.thethingsnetwork.api.protocol.lorawan.FCtrl fCtrl_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.FCtrl, org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder, org.thethingsnetwork.api.protocol.lorawan.FCtrlOrBuilder> fCtrlBuilder_;
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public boolean hasFCtrl() {
      return fCtrlBuilder_ != null || fCtrl_ != null;
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.FCtrl getFCtrl() {
      if (fCtrlBuilder_ == null) {
        return fCtrl_ == null ? org.thethingsnetwork.api.protocol.lorawan.FCtrl.getDefaultInstance() : fCtrl_;
      } else {
        return fCtrlBuilder_.getMessage();
      }
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder setFCtrl(org.thethingsnetwork.api.protocol.lorawan.FCtrl value) {
      if (fCtrlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fCtrl_ = value;
        onChanged();
      } else {
        fCtrlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder setFCtrl(
        org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder builderForValue) {
      if (fCtrlBuilder_ == null) {
        fCtrl_ = builderForValue.build();
        onChanged();
      } else {
        fCtrlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder mergeFCtrl(org.thethingsnetwork.api.protocol.lorawan.FCtrl value) {
      if (fCtrlBuilder_ == null) {
        if (fCtrl_ != null) {
          fCtrl_ =
            org.thethingsnetwork.api.protocol.lorawan.FCtrl.newBuilder(fCtrl_).mergeFrom(value).buildPartial();
        } else {
          fCtrl_ = value;
        }
        onChanged();
      } else {
        fCtrlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder clearFCtrl() {
      if (fCtrlBuilder_ == null) {
        fCtrl_ = null;
        onChanged();
      } else {
        fCtrl_ = null;
        fCtrlBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder getFCtrlBuilder() {
      
      onChanged();
      return getFCtrlFieldBuilder().getBuilder();
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.FCtrlOrBuilder getFCtrlOrBuilder() {
      if (fCtrlBuilder_ != null) {
        return fCtrlBuilder_.getMessageOrBuilder();
      } else {
        return fCtrl_ == null ?
            org.thethingsnetwork.api.protocol.lorawan.FCtrl.getDefaultInstance() : fCtrl_;
      }
    }
    /**
     * <code>.lorawan.FCtrl f_ctrl = 2 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.FCtrl, org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder, org.thethingsnetwork.api.protocol.lorawan.FCtrlOrBuilder> 
        getFCtrlFieldBuilder() {
      if (fCtrlBuilder_ == null) {
        fCtrlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.protocol.lorawan.FCtrl, org.thethingsnetwork.api.protocol.lorawan.FCtrl.Builder, org.thethingsnetwork.api.protocol.lorawan.FCtrlOrBuilder>(
                getFCtrl(),
                getParentForChildren(),
                isClean());
        fCtrl_ = null;
      }
      return fCtrlBuilder_;
    }

    private int fCnt_ ;
    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    public int getFCnt() {
      return fCnt_;
    }
    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    public Builder setFCnt(int value) {
      
      fCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 f_cnt = 3;</code>
     */
    public Builder clearFCnt() {
      
      fCnt_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.thethingsnetwork.api.protocol.lorawan.MACCommand> fOpts_ =
      java.util.Collections.emptyList();
    private void ensureFOptsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        fOpts_ = new java.util.ArrayList<org.thethingsnetwork.api.protocol.lorawan.MACCommand>(fOpts_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.MACCommand, org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder, org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder> fOptsBuilder_;

    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<org.thethingsnetwork.api.protocol.lorawan.MACCommand> getFOptsList() {
      if (fOptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fOpts_);
      } else {
        return fOptsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public int getFOptsCount() {
      if (fOptsBuilder_ == null) {
        return fOpts_.size();
      } else {
        return fOptsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.MACCommand getFOpts(int index) {
      if (fOptsBuilder_ == null) {
        return fOpts_.get(index);
      } else {
        return fOptsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setFOpts(
        int index, org.thethingsnetwork.api.protocol.lorawan.MACCommand value) {
      if (fOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFOptsIsMutable();
        fOpts_.set(index, value);
        onChanged();
      } else {
        fOptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setFOpts(
        int index, org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder builderForValue) {
      if (fOptsBuilder_ == null) {
        ensureFOptsIsMutable();
        fOpts_.set(index, builderForValue.build());
        onChanged();
      } else {
        fOptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addFOpts(org.thethingsnetwork.api.protocol.lorawan.MACCommand value) {
      if (fOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFOptsIsMutable();
        fOpts_.add(value);
        onChanged();
      } else {
        fOptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addFOpts(
        int index, org.thethingsnetwork.api.protocol.lorawan.MACCommand value) {
      if (fOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFOptsIsMutable();
        fOpts_.add(index, value);
        onChanged();
      } else {
        fOptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addFOpts(
        org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder builderForValue) {
      if (fOptsBuilder_ == null) {
        ensureFOptsIsMutable();
        fOpts_.add(builderForValue.build());
        onChanged();
      } else {
        fOptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addFOpts(
        int index, org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder builderForValue) {
      if (fOptsBuilder_ == null) {
        ensureFOptsIsMutable();
        fOpts_.add(index, builderForValue.build());
        onChanged();
      } else {
        fOptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllFOpts(
        java.lang.Iterable<? extends org.thethingsnetwork.api.protocol.lorawan.MACCommand> values) {
      if (fOptsBuilder_ == null) {
        ensureFOptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fOpts_);
        onChanged();
      } else {
        fOptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearFOpts() {
      if (fOptsBuilder_ == null) {
        fOpts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        fOptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeFOpts(int index) {
      if (fOptsBuilder_ == null) {
        ensureFOptsIsMutable();
        fOpts_.remove(index);
        onChanged();
      } else {
        fOptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder getFOptsBuilder(
        int index) {
      return getFOptsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder getFOptsOrBuilder(
        int index) {
      if (fOptsBuilder_ == null) {
        return fOpts_.get(index);  } else {
        return fOptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder> 
         getFOptsOrBuilderList() {
      if (fOptsBuilder_ != null) {
        return fOptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fOpts_);
      }
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder addFOptsBuilder() {
      return getFOptsFieldBuilder().addBuilder(
          org.thethingsnetwork.api.protocol.lorawan.MACCommand.getDefaultInstance());
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder addFOptsBuilder(
        int index) {
      return getFOptsFieldBuilder().addBuilder(
          index, org.thethingsnetwork.api.protocol.lorawan.MACCommand.getDefaultInstance());
    }
    /**
     * <code>repeated .lorawan.MACCommand f_opts = 4 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder> 
         getFOptsBuilderList() {
      return getFOptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.protocol.lorawan.MACCommand, org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder, org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder> 
        getFOptsFieldBuilder() {
      if (fOptsBuilder_ == null) {
        fOptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.thethingsnetwork.api.protocol.lorawan.MACCommand, org.thethingsnetwork.api.protocol.lorawan.MACCommand.Builder, org.thethingsnetwork.api.protocol.lorawan.MACCommandOrBuilder>(
                fOpts_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        fOpts_ = null;
      }
      return fOptsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lorawan.FHDR)
  }

  // @@protoc_insertion_point(class_scope:lorawan.FHDR)
  private static final org.thethingsnetwork.api.protocol.lorawan.FHDR DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.FHDR();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.FHDR getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHDR>
      PARSER = new com.google.protobuf.AbstractParser<FHDR>() {
    @java.lang.Override
    public FHDR parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FHDR(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FHDR> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHDR> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.protocol.lorawan.FHDR getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

