// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/endpoint_security.proto

package org.wso2.choreo.connect.discovery.api;

public interface EndpointSecurityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.api.EndpointSecurity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string password = 1;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 1;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>bool enabled = 3;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>string username = 4;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 4;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
