// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: creds.proto

package net.nyhm.driveup.proto;

public interface AppConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.nyhm.driveup.proto.AppConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>string app_name = 2;</code>
   */
  java.lang.String getAppName();
  /**
   * <code>string app_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getAppNameBytes();

  /**
   * <code>bytes client_secrets = 3;</code>
   */
  com.google.protobuf.ByteString getClientSecrets();

  /**
   * <code>.net.nyhm.driveup.proto.Access access = 4;</code>
   */
  int getAccessValue();
  /**
   * <code>.net.nyhm.driveup.proto.Access access = 4;</code>
   */
  net.nyhm.driveup.proto.Access getAccess();

  /**
   * <code>map&lt;string, .net.nyhm.driveup.proto.CredsData&gt; creds_store = 5;</code>
   */
  int getCredsStoreCount();
  /**
   * <code>map&lt;string, .net.nyhm.driveup.proto.CredsData&gt; creds_store = 5;</code>
   */
  boolean containsCredsStore(
      java.lang.String key);
  /**
   * Use {@link #getCredsStoreMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, net.nyhm.driveup.proto.CredsData>
  getCredsStore();
  /**
   * <code>map&lt;string, .net.nyhm.driveup.proto.CredsData&gt; creds_store = 5;</code>
   */
  java.util.Map<java.lang.String, net.nyhm.driveup.proto.CredsData>
  getCredsStoreMap();
  /**
   * <code>map&lt;string, .net.nyhm.driveup.proto.CredsData&gt; creds_store = 5;</code>
   */

  net.nyhm.driveup.proto.CredsData getCredsStoreOrDefault(
      java.lang.String key,
      net.nyhm.driveup.proto.CredsData defaultValue);
  /**
   * <code>map&lt;string, .net.nyhm.driveup.proto.CredsData&gt; creds_store = 5;</code>
   */

  net.nyhm.driveup.proto.CredsData getCredsStoreOrThrow(
      java.lang.String key);

  /**
   * <code>.net.nyhm.driveup.proto.GpgData gpg_data = 6;</code>
   */
  boolean hasGpgData();
  /**
   * <code>.net.nyhm.driveup.proto.GpgData gpg_data = 6;</code>
   */
  net.nyhm.driveup.proto.GpgData getGpgData();
  /**
   * <code>.net.nyhm.driveup.proto.GpgData gpg_data = 6;</code>
   */
  net.nyhm.driveup.proto.GpgDataOrBuilder getGpgDataOrBuilder();
}
