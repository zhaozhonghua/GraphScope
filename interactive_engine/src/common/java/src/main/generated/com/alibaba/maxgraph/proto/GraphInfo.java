// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code GraphInfo}
 */
public  final class GraphInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GraphInfo)
    GraphInfoOrBuilder {
  // Use GraphInfo.newBuilder() to construct.
  private GraphInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphInfo() {
    vertexCount_ = 0L;
    edgeCount_ = 0L;
    activePartitions_ = java.util.Collections.emptyList();
    replicas_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GraphInfo(
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
          case 8: {

            vertexCount_ = input.readUInt64();
            break;
          }
          case 16: {

            edgeCount_ = input.readUInt64();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              activePartitions_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            activePartitions_.add(input.readUInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
              activePartitions_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              activePartitions_.add(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              replicas_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.ReplicaInfo>();
              mutable_bitField0_ |= 0x00000008;
            }
            replicas_.add(
                input.readMessage(com.alibaba.maxgraph.proto.ReplicaInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        activePartitions_ = java.util.Collections.unmodifiableList(activePartitions_);
      }
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        replicas_ = java.util.Collections.unmodifiableList(replicas_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_GraphInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_GraphInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.GraphInfo.class, com.alibaba.maxgraph.proto.GraphInfo.Builder.class);
  }

  private int bitField0_;
  public static final int VERTEX_COUNT_FIELD_NUMBER = 1;
  private long vertexCount_;
  /**
   * <code>optional uint64 vertex_count = 1;</code>
   */
  public long getVertexCount() {
    return vertexCount_;
  }

  public static final int EDGE_COUNT_FIELD_NUMBER = 2;
  private long edgeCount_;
  /**
   * <code>optional uint64 edge_count = 2;</code>
   */
  public long getEdgeCount() {
    return edgeCount_;
  }

  public static final int ACTIVE_PARTITIONS_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> activePartitions_;
  /**
   * <code>repeated uint32 active_partitions = 3;</code>
   */
  public java.util.List<java.lang.Integer>
      getActivePartitionsList() {
    return activePartitions_;
  }
  /**
   * <code>repeated uint32 active_partitions = 3;</code>
   */
  public int getActivePartitionsCount() {
    return activePartitions_.size();
  }
  /**
   * <code>repeated uint32 active_partitions = 3;</code>
   */
  public int getActivePartitions(int index) {
    return activePartitions_.get(index);
  }
  private int activePartitionsMemoizedSerializedSize = -1;

  public static final int REPLICAS_FIELD_NUMBER = 4;
  private java.util.List<com.alibaba.maxgraph.proto.ReplicaInfo> replicas_;
  /**
   * <code>repeated .ReplicaInfo replicas = 4;</code>
   */
  public java.util.List<com.alibaba.maxgraph.proto.ReplicaInfo> getReplicasList() {
    return replicas_;
  }
  /**
   * <code>repeated .ReplicaInfo replicas = 4;</code>
   */
  public java.util.List<? extends com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder> 
      getReplicasOrBuilderList() {
    return replicas_;
  }
  /**
   * <code>repeated .ReplicaInfo replicas = 4;</code>
   */
  public int getReplicasCount() {
    return replicas_.size();
  }
  /**
   * <code>repeated .ReplicaInfo replicas = 4;</code>
   */
  public com.alibaba.maxgraph.proto.ReplicaInfo getReplicas(int index) {
    return replicas_.get(index);
  }
  /**
   * <code>repeated .ReplicaInfo replicas = 4;</code>
   */
  public com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder getReplicasOrBuilder(
      int index) {
    return replicas_.get(index);
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
    getSerializedSize();
    if (vertexCount_ != 0L) {
      output.writeUInt64(1, vertexCount_);
    }
    if (edgeCount_ != 0L) {
      output.writeUInt64(2, edgeCount_);
    }
    if (getActivePartitionsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(activePartitionsMemoizedSerializedSize);
    }
    for (int i = 0; i < activePartitions_.size(); i++) {
      output.writeUInt32NoTag(activePartitions_.get(i));
    }
    for (int i = 0; i < replicas_.size(); i++) {
      output.writeMessage(4, replicas_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vertexCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, vertexCount_);
    }
    if (edgeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, edgeCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < activePartitions_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(activePartitions_.get(i));
      }
      size += dataSize;
      if (!getActivePartitionsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      activePartitionsMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < replicas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, replicas_.get(i));
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.GraphInfo)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.GraphInfo other = (com.alibaba.maxgraph.proto.GraphInfo) obj;

    boolean result = true;
    result = result && (getVertexCount()
        == other.getVertexCount());
    result = result && (getEdgeCount()
        == other.getEdgeCount());
    result = result && getActivePartitionsList()
        .equals(other.getActivePartitionsList());
    result = result && getReplicasList()
        .equals(other.getReplicasList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VERTEX_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVertexCount());
    hash = (37 * hash) + EDGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEdgeCount());
    if (getActivePartitionsCount() > 0) {
      hash = (37 * hash) + ACTIVE_PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActivePartitionsList().hashCode();
    }
    if (getReplicasCount() > 0) {
      hash = (37 * hash) + REPLICAS_FIELD_NUMBER;
      hash = (53 * hash) + getReplicasList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GraphInfo parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.GraphInfo prototype) {
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
   * Protobuf type {@code GraphInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GraphInfo)
      com.alibaba.maxgraph.proto.GraphInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GraphInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GraphInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.GraphInfo.class, com.alibaba.maxgraph.proto.GraphInfo.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.GraphInfo.newBuilder()
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
        getReplicasFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      vertexCount_ = 0L;

      edgeCount_ = 0L;

      activePartitions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      if (replicasBuilder_ == null) {
        replicas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        replicasBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GraphInfo_descriptor;
    }

    public com.alibaba.maxgraph.proto.GraphInfo getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.GraphInfo.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.GraphInfo build() {
      com.alibaba.maxgraph.proto.GraphInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.GraphInfo buildPartial() {
      com.alibaba.maxgraph.proto.GraphInfo result = new com.alibaba.maxgraph.proto.GraphInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.vertexCount_ = vertexCount_;
      result.edgeCount_ = edgeCount_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        activePartitions_ = java.util.Collections.unmodifiableList(activePartitions_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.activePartitions_ = activePartitions_;
      if (replicasBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          replicas_ = java.util.Collections.unmodifiableList(replicas_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.replicas_ = replicas_;
      } else {
        result.replicas_ = replicasBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.alibaba.maxgraph.proto.GraphInfo) {
        return mergeFrom((com.alibaba.maxgraph.proto.GraphInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.GraphInfo other) {
      if (other == com.alibaba.maxgraph.proto.GraphInfo.getDefaultInstance()) return this;
      if (other.getVertexCount() != 0L) {
        setVertexCount(other.getVertexCount());
      }
      if (other.getEdgeCount() != 0L) {
        setEdgeCount(other.getEdgeCount());
      }
      if (!other.activePartitions_.isEmpty()) {
        if (activePartitions_.isEmpty()) {
          activePartitions_ = other.activePartitions_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureActivePartitionsIsMutable();
          activePartitions_.addAll(other.activePartitions_);
        }
        onChanged();
      }
      if (replicasBuilder_ == null) {
        if (!other.replicas_.isEmpty()) {
          if (replicas_.isEmpty()) {
            replicas_ = other.replicas_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureReplicasIsMutable();
            replicas_.addAll(other.replicas_);
          }
          onChanged();
        }
      } else {
        if (!other.replicas_.isEmpty()) {
          if (replicasBuilder_.isEmpty()) {
            replicasBuilder_.dispose();
            replicasBuilder_ = null;
            replicas_ = other.replicas_;
            bitField0_ = (bitField0_ & ~0x00000008);
            replicasBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReplicasFieldBuilder() : null;
          } else {
            replicasBuilder_.addAllMessages(other.replicas_);
          }
        }
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
      com.alibaba.maxgraph.proto.GraphInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.GraphInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long vertexCount_ ;
    /**
     * <code>optional uint64 vertex_count = 1;</code>
     */
    public long getVertexCount() {
      return vertexCount_;
    }
    /**
     * <code>optional uint64 vertex_count = 1;</code>
     */
    public Builder setVertexCount(long value) {
      
      vertexCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 vertex_count = 1;</code>
     */
    public Builder clearVertexCount() {
      
      vertexCount_ = 0L;
      onChanged();
      return this;
    }

    private long edgeCount_ ;
    /**
     * <code>optional uint64 edge_count = 2;</code>
     */
    public long getEdgeCount() {
      return edgeCount_;
    }
    /**
     * <code>optional uint64 edge_count = 2;</code>
     */
    public Builder setEdgeCount(long value) {
      
      edgeCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 edge_count = 2;</code>
     */
    public Builder clearEdgeCount() {
      
      edgeCount_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> activePartitions_ = java.util.Collections.emptyList();
    private void ensureActivePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        activePartitions_ = new java.util.ArrayList<java.lang.Integer>(activePartitions_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getActivePartitionsList() {
      return java.util.Collections.unmodifiableList(activePartitions_);
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public int getActivePartitionsCount() {
      return activePartitions_.size();
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public int getActivePartitions(int index) {
      return activePartitions_.get(index);
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public Builder setActivePartitions(
        int index, int value) {
      ensureActivePartitionsIsMutable();
      activePartitions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public Builder addActivePartitions(int value) {
      ensureActivePartitionsIsMutable();
      activePartitions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public Builder addAllActivePartitions(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureActivePartitionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, activePartitions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 active_partitions = 3;</code>
     */
    public Builder clearActivePartitions() {
      activePartitions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private java.util.List<com.alibaba.maxgraph.proto.ReplicaInfo> replicas_ =
      java.util.Collections.emptyList();
    private void ensureReplicasIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        replicas_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.ReplicaInfo>(replicas_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.ReplicaInfo, com.alibaba.maxgraph.proto.ReplicaInfo.Builder, com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder> replicasBuilder_;

    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.ReplicaInfo> getReplicasList() {
      if (replicasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(replicas_);
      } else {
        return replicasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public int getReplicasCount() {
      if (replicasBuilder_ == null) {
        return replicas_.size();
      } else {
        return replicasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public com.alibaba.maxgraph.proto.ReplicaInfo getReplicas(int index) {
      if (replicasBuilder_ == null) {
        return replicas_.get(index);
      } else {
        return replicasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder setReplicas(
        int index, com.alibaba.maxgraph.proto.ReplicaInfo value) {
      if (replicasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplicasIsMutable();
        replicas_.set(index, value);
        onChanged();
      } else {
        replicasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder setReplicas(
        int index, com.alibaba.maxgraph.proto.ReplicaInfo.Builder builderForValue) {
      if (replicasBuilder_ == null) {
        ensureReplicasIsMutable();
        replicas_.set(index, builderForValue.build());
        onChanged();
      } else {
        replicasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder addReplicas(com.alibaba.maxgraph.proto.ReplicaInfo value) {
      if (replicasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplicasIsMutable();
        replicas_.add(value);
        onChanged();
      } else {
        replicasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder addReplicas(
        int index, com.alibaba.maxgraph.proto.ReplicaInfo value) {
      if (replicasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplicasIsMutable();
        replicas_.add(index, value);
        onChanged();
      } else {
        replicasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder addReplicas(
        com.alibaba.maxgraph.proto.ReplicaInfo.Builder builderForValue) {
      if (replicasBuilder_ == null) {
        ensureReplicasIsMutable();
        replicas_.add(builderForValue.build());
        onChanged();
      } else {
        replicasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder addReplicas(
        int index, com.alibaba.maxgraph.proto.ReplicaInfo.Builder builderForValue) {
      if (replicasBuilder_ == null) {
        ensureReplicasIsMutable();
        replicas_.add(index, builderForValue.build());
        onChanged();
      } else {
        replicasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder addAllReplicas(
        java.lang.Iterable<? extends com.alibaba.maxgraph.proto.ReplicaInfo> values) {
      if (replicasBuilder_ == null) {
        ensureReplicasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, replicas_);
        onChanged();
      } else {
        replicasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder clearReplicas() {
      if (replicasBuilder_ == null) {
        replicas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        replicasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public Builder removeReplicas(int index) {
      if (replicasBuilder_ == null) {
        ensureReplicasIsMutable();
        replicas_.remove(index);
        onChanged();
      } else {
        replicasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public com.alibaba.maxgraph.proto.ReplicaInfo.Builder getReplicasBuilder(
        int index) {
      return getReplicasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder getReplicasOrBuilder(
        int index) {
      if (replicasBuilder_ == null) {
        return replicas_.get(index);  } else {
        return replicasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public java.util.List<? extends com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder> 
         getReplicasOrBuilderList() {
      if (replicasBuilder_ != null) {
        return replicasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(replicas_);
      }
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public com.alibaba.maxgraph.proto.ReplicaInfo.Builder addReplicasBuilder() {
      return getReplicasFieldBuilder().addBuilder(
          com.alibaba.maxgraph.proto.ReplicaInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public com.alibaba.maxgraph.proto.ReplicaInfo.Builder addReplicasBuilder(
        int index) {
      return getReplicasFieldBuilder().addBuilder(
          index, com.alibaba.maxgraph.proto.ReplicaInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .ReplicaInfo replicas = 4;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.ReplicaInfo.Builder> 
         getReplicasBuilderList() {
      return getReplicasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.ReplicaInfo, com.alibaba.maxgraph.proto.ReplicaInfo.Builder, com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder> 
        getReplicasFieldBuilder() {
      if (replicasBuilder_ == null) {
        replicasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alibaba.maxgraph.proto.ReplicaInfo, com.alibaba.maxgraph.proto.ReplicaInfo.Builder, com.alibaba.maxgraph.proto.ReplicaInfoOrBuilder>(
                replicas_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        replicas_ = null;
      }
      return replicasBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:GraphInfo)
  }

  // @@protoc_insertion_point(class_scope:GraphInfo)
  private static final com.alibaba.maxgraph.proto.GraphInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.GraphInfo();
  }

  public static com.alibaba.maxgraph.proto.GraphInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphInfo>
      PARSER = new com.google.protobuf.AbstractParser<GraphInfo>() {
    public GraphInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GraphInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphInfo> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.GraphInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
