// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/api.proto

package org.thethingsnetwork.api;

public interface SystemStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.SystemStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.SystemStats.Loadstats load = 1;</code>
   */
  boolean hasLoad();
  /**
   * <code>.api.SystemStats.Loadstats load = 1;</code>
   */
  org.thethingsnetwork.api.SystemStats.Loadstats getLoad();
  /**
   * <code>.api.SystemStats.Loadstats load = 1;</code>
   */
  org.thethingsnetwork.api.SystemStats.LoadstatsOrBuilder getLoadOrBuilder();

  /**
   * <code>.api.SystemStats.CPUStats cpu = 2;</code>
   */
  boolean hasCpu();
  /**
   * <code>.api.SystemStats.CPUStats cpu = 2;</code>
   */
  org.thethingsnetwork.api.SystemStats.CPUStats getCpu();
  /**
   * <code>.api.SystemStats.CPUStats cpu = 2;</code>
   */
  org.thethingsnetwork.api.SystemStats.CPUStatsOrBuilder getCpuOrBuilder();

  /**
   * <code>.api.SystemStats.MemoryStats memory = 3;</code>
   */
  boolean hasMemory();
  /**
   * <code>.api.SystemStats.MemoryStats memory = 3;</code>
   */
  org.thethingsnetwork.api.SystemStats.MemoryStats getMemory();
  /**
   * <code>.api.SystemStats.MemoryStats memory = 3;</code>
   */
  org.thethingsnetwork.api.SystemStats.MemoryStatsOrBuilder getMemoryOrBuilder();
}