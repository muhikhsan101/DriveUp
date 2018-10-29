// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: creds.proto

package net.nyhm.driveup.proto;

public final class Creds {
  private Creds() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_nyhm_driveup_proto_AppConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_nyhm_driveup_proto_AppConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_nyhm_driveup_proto_AppConfig_CredsStoreEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_nyhm_driveup_proto_AppConfig_CredsStoreEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_nyhm_driveup_proto_CredsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_nyhm_driveup_proto_CredsData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_nyhm_driveup_proto_GpgData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_nyhm_driveup_proto_GpgData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013creds.proto\022\026net.nyhm.driveup.proto\"\307\002" +
      "\n\tAppConfig\022\017\n\007version\030\001 \001(\005\022\020\n\010app_name" +
      "\030\002 \001(\t\022\026\n\016client_secrets\030\003 \001(\014\022.\n\006access" +
      "\030\004 \001(\0162\036.net.nyhm.driveup.proto.Access\022F" +
      "\n\013creds_store\030\005 \003(\01321.net.nyhm.driveup.p" +
      "roto.AppConfig.CredsStoreEntry\0221\n\010gpg_da" +
      "ta\030\006 \001(\0132\037.net.nyhm.driveup.proto.GpgDat" +
      "a\032T\n\017CredsStoreEntry\022\013\n\003key\030\001 \001(\t\0220\n\005val" +
      "ue\030\002 \001(\0132!.net.nyhm.driveup.proto.CredsD" +
      "ata:\0028\001\"|\n\tCredsData\022?\n\007entries\030\001 \003(\0132.." +
      "net.nyhm.driveup.proto.CredsData.Entries" +
      "Entry\032.\n\014EntriesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\014:\0028\001\"/\n\007GpgData\022\021\n\trecipient\030\001 " +
      "\001(\t\022\021\n\tpublicKey\030\002 \001(\014*&\n\006Access\022\010\n\004READ" +
      "\020\000\022\010\n\004PATH\020\001\022\010\n\004FULL\020\002B\002P\001b\006proto3"
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
        }, assigner);
    internal_static_net_nyhm_driveup_proto_AppConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_nyhm_driveup_proto_AppConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_nyhm_driveup_proto_AppConfig_descriptor,
        new java.lang.String[] { "Version", "AppName", "ClientSecrets", "Access", "CredsStore", "GpgData", });
    internal_static_net_nyhm_driveup_proto_AppConfig_CredsStoreEntry_descriptor =
      internal_static_net_nyhm_driveup_proto_AppConfig_descriptor.getNestedTypes().get(0);
    internal_static_net_nyhm_driveup_proto_AppConfig_CredsStoreEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_nyhm_driveup_proto_AppConfig_CredsStoreEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_net_nyhm_driveup_proto_CredsData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_nyhm_driveup_proto_CredsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_nyhm_driveup_proto_CredsData_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_descriptor =
      internal_static_net_nyhm_driveup_proto_CredsData_descriptor.getNestedTypes().get(0);
    internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_nyhm_driveup_proto_CredsData_EntriesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_net_nyhm_driveup_proto_GpgData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_net_nyhm_driveup_proto_GpgData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_nyhm_driveup_proto_GpgData_descriptor,
        new java.lang.String[] { "Recipient", "PublicKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}