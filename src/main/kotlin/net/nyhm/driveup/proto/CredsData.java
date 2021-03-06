// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: creds.proto

package net.nyhm.driveup.proto;

/**
 * Protobuf type {@code net.nyhm.driveup.proto.CredsData}
 */
public  final class CredsData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.nyhm.driveup.proto.CredsData)
    CredsDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CredsData.newBuilder() to construct.
  private CredsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CredsData() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CredsData(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              entries_ = com.google.protobuf.MapField.newMapField(
                  EntriesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
            entries__ = input.readMessage(
                EntriesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            entries_.getMutableMap().put(
                entries__.getKey(), entries__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetEntries();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.nyhm.driveup.proto.CredsData.class, net.nyhm.driveup.proto.CredsData.Builder.class);
  }

  public static final int ENTRIES_FIELD_NUMBER = 1;
  private static final class EntriesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.ByteString> entries_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
  internalGetEntries() {
    if (entries_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          EntriesDefaultEntryHolder.defaultEntry);
    }
    return entries_;
  }

  public int getEntriesCount() {
    return internalGetEntries().getMap().size();
  }
  /**
   * <code>map&lt;string, bytes&gt; entries = 1;</code>
   */

  public boolean containsEntries(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetEntries().getMap().containsKey(key);
  }
  /**
   * Use {@link #getEntriesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEntries() {
    return getEntriesMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; entries = 1;</code>
   */

  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEntriesMap() {
    return internalGetEntries().getMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; entries = 1;</code>
   */

  public com.google.protobuf.ByteString getEntriesOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetEntries().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, bytes&gt; entries = 1;</code>
   */

  public com.google.protobuf.ByteString getEntriesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetEntries().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetEntries(),
        EntriesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ByteString> entry
         : internalGetEntries().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
      entries__ = EntriesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, entries__);
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
    if (!(obj instanceof net.nyhm.driveup.proto.CredsData)) {
      return super.equals(obj);
    }
    net.nyhm.driveup.proto.CredsData other = (net.nyhm.driveup.proto.CredsData) obj;

    boolean result = true;
    result = result && internalGetEntries().equals(
        other.internalGetEntries());
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
    if (!internalGetEntries().getMap().isEmpty()) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEntries().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.nyhm.driveup.proto.CredsData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.nyhm.driveup.proto.CredsData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.nyhm.driveup.proto.CredsData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.nyhm.driveup.proto.CredsData parseFrom(
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
  public static Builder newBuilder(net.nyhm.driveup.proto.CredsData prototype) {
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
   * Protobuf type {@code net.nyhm.driveup.proto.CredsData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.nyhm.driveup.proto.CredsData)
      net.nyhm.driveup.proto.CredsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetEntries();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableEntries();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.nyhm.driveup.proto.CredsData.class, net.nyhm.driveup.proto.CredsData.Builder.class);
    }

    // Construct using net.nyhm.driveup.proto.CredsData.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableEntries().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.nyhm.driveup.proto.Creds.internal_static_net_nyhm_driveup_proto_CredsData_descriptor;
    }

    @java.lang.Override
    public net.nyhm.driveup.proto.CredsData getDefaultInstanceForType() {
      return net.nyhm.driveup.proto.CredsData.getDefaultInstance();
    }

    @java.lang.Override
    public net.nyhm.driveup.proto.CredsData build() {
      net.nyhm.driveup.proto.CredsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.nyhm.driveup.proto.CredsData buildPartial() {
      net.nyhm.driveup.proto.CredsData result = new net.nyhm.driveup.proto.CredsData(this);
      int from_bitField0_ = bitField0_;
      result.entries_ = internalGetEntries();
      result.entries_.makeImmutable();
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
      if (other instanceof net.nyhm.driveup.proto.CredsData) {
        return mergeFrom((net.nyhm.driveup.proto.CredsData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.nyhm.driveup.proto.CredsData other) {
      if (other == net.nyhm.driveup.proto.CredsData.getDefaultInstance()) return this;
      internalGetMutableEntries().mergeFrom(
          other.internalGetEntries());
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
      net.nyhm.driveup.proto.CredsData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.nyhm.driveup.proto.CredsData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.ByteString> entries_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetEntries() {
      if (entries_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EntriesDefaultEntryHolder.defaultEntry);
      }
      return entries_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetMutableEntries() {
      onChanged();;
      if (entries_ == null) {
        entries_ = com.google.protobuf.MapField.newMapField(
            EntriesDefaultEntryHolder.defaultEntry);
      }
      if (!entries_.isMutable()) {
        entries_ = entries_.copy();
      }
      return entries_;
    }

    public int getEntriesCount() {
      return internalGetEntries().getMap().size();
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public boolean containsEntries(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetEntries().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEntriesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEntries() {
      return getEntriesMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getEntriesMap() {
      return internalGetEntries().getMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public com.google.protobuf.ByteString getEntriesOrDefault(
        java.lang.String key,
        com.google.protobuf.ByteString defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetEntries().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public com.google.protobuf.ByteString getEntriesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetEntries().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearEntries() {
      internalGetMutableEntries().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public Builder removeEntries(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableEntries().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString>
    getMutableEntries() {
      return internalGetMutableEntries().getMutableMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */
    public Builder putEntries(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableEntries().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; entries = 1;</code>
     */

    public Builder putAllEntries(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      internalGetMutableEntries().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:net.nyhm.driveup.proto.CredsData)
  }

  // @@protoc_insertion_point(class_scope:net.nyhm.driveup.proto.CredsData)
  private static final net.nyhm.driveup.proto.CredsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.nyhm.driveup.proto.CredsData();
  }

  public static net.nyhm.driveup.proto.CredsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CredsData>
      PARSER = new com.google.protobuf.AbstractParser<CredsData>() {
    @java.lang.Override
    public CredsData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CredsData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CredsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CredsData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.nyhm.driveup.proto.CredsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

