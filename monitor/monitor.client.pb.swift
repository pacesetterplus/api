/*
 * DO NOT EDIT.
 *
 * Generated by the protocol buffer compiler.
 * Source: github.com/TheThingsNetwork/api/monitor/monitor.proto
 *
 */

/*
 * Copyright 2017, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import Foundation
import Dispatch
import gRPC

/// Type for errors thrown from generated client code.
internal enum Monitor_MonitorClientError : Error {
  case endOfStream
  case invalidMessageReceived
  case error(c: CallResult)
}

/// RouterStatus (Client Streaming)
internal class Monitor_MonitorRouterStatusCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/RouterStatus")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorRouterStatusCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Router_Status, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// GatewayStatus (Client Streaming)
internal class Monitor_MonitorGatewayStatusCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/GatewayStatus")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorGatewayStatusCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Gateway_Status, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// GatewayUplink (Client Streaming)
internal class Monitor_MonitorGatewayUplinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/GatewayUplink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorGatewayUplinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Router_UplinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// GatewayDownlink (Client Streaming)
internal class Monitor_MonitorGatewayDownlinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/GatewayDownlink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorGatewayDownlinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Router_DownlinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// BrokerStatus (Client Streaming)
internal class Monitor_MonitorBrokerStatusCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/BrokerStatus")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorBrokerStatusCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Broker_Status, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// BrokerUplink (Client Streaming)
internal class Monitor_MonitorBrokerUplinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/BrokerUplink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorBrokerUplinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Broker_DeduplicatedUplinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// BrokerDownlink (Client Streaming)
internal class Monitor_MonitorBrokerDownlinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/BrokerDownlink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorBrokerDownlinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Broker_DownlinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// HandlerStatus (Client Streaming)
internal class Monitor_MonitorHandlerStatusCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/HandlerStatus")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorHandlerStatusCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Handler_Status, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// HandlerUplink (Client Streaming)
internal class Monitor_MonitorHandlerUplinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/HandlerUplink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorHandlerUplinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Broker_DeduplicatedUplinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// HandlerDownlink (Client Streaming)
internal class Monitor_MonitorHandlerDownlinkCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/HandlerDownlink")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorHandlerDownlinkCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Broker_DownlinkMessage, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// NetworkServerStatus (Client Streaming)
internal class Monitor_MonitorNetworkServerStatusCall {
  private var call : Call

  /// Create a call.
  fileprivate init(_ channel: Channel) {
    self.call = channel.makeCall("/monitor.Monitor/NetworkServerStatus")
  }

  /// Call this to start a call. Nonblocking.
  fileprivate func start(metadata:Metadata, completion:@escaping (CallResult)->())
    throws -> Monitor_MonitorNetworkServerStatusCall {
      try self.call.start(.clientStreaming, metadata:metadata, completion:completion)
      return self
  }

  /// Call this to send each message in the request stream. Nonblocking.
  internal func send(_ message:Networkserver_Status, errorHandler:@escaping (Error)->()) throws {
    let messageData = try message.serializedData()
    try call.sendMessage(data:messageData, errorHandler:errorHandler)
  }

  /// Call this to close the connection and wait for a response. Blocking.
  internal func closeAndReceive() throws -> Google_Protobuf_Empty {
    var returnError : Monitor_MonitorClientError?
    var returnResponse : Google_Protobuf_Empty!
    let sem = DispatchSemaphore(value: 0)
    do {
      try closeAndReceive() {response, error in
        returnResponse = response
        returnError = error
        sem.signal()
      }
      _ = sem.wait(timeout: DispatchTime.distantFuture)
    } catch (let error) {
      throw error
    }
    if let returnError = returnError {
      throw returnError
    }
    return returnResponse
  }

  /// Call this to close the connection and wait for a response. Nonblocking.
  internal func closeAndReceive(completion:@escaping (Google_Protobuf_Empty?, Monitor_MonitorClientError?)->())
    throws {
      do {
        try call.receiveMessage() {(responseData) in
          if let responseData = responseData,
            let response = try? Google_Protobuf_Empty(serializedData:responseData) {
            completion(response, nil)
          } else {
            completion(nil, Monitor_MonitorClientError.invalidMessageReceived)
          }
        }
        try call.close(completion:{})
      } catch (let error) {
        throw error
      }
  }
}

/// Call methods of this class to make API calls.
internal class Monitor_MonitorService {
  private var channel: Channel

  /// This metadata will be sent with all requests.
  internal var metadata : Metadata

  /// This property allows the service host name to be overridden.
  /// For example, it can be used to make calls to "localhost:8080"
  /// appear to be to "example.com".
  internal var host : String {
    get {
      return self.channel.host
    }
    set {
      self.channel.host = newValue
    }
  }

  /// Create a client that makes insecure connections.
  internal init(address: String) {
    gRPC.initialize()
    channel = Channel(address:address)
    metadata = Metadata()
  }

  /// Create a client that makes secure connections.
  internal init(address: String, certificates: String?, host: String?) {
    gRPC.initialize()
    channel = Channel(address:address, certificates:certificates, host:host)
    metadata = Metadata()
  }

  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func routerstatus(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorRouterStatusCall {
      return try Monitor_MonitorRouterStatusCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func gatewaystatus(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorGatewayStatusCall {
      return try Monitor_MonitorGatewayStatusCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func gatewayuplink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorGatewayUplinkCall {
      return try Monitor_MonitorGatewayUplinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func gatewaydownlink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorGatewayDownlinkCall {
      return try Monitor_MonitorGatewayDownlinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func brokerstatus(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorBrokerStatusCall {
      return try Monitor_MonitorBrokerStatusCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func brokeruplink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorBrokerUplinkCall {
      return try Monitor_MonitorBrokerUplinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func brokerdownlink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorBrokerDownlinkCall {
      return try Monitor_MonitorBrokerDownlinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func handlerstatus(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorHandlerStatusCall {
      return try Monitor_MonitorHandlerStatusCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func handleruplink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorHandlerUplinkCall {
      return try Monitor_MonitorHandlerUplinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func handlerdownlink(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorHandlerDownlinkCall {
      return try Monitor_MonitorHandlerDownlinkCall(channel).start(metadata:metadata, completion:completion)
  }
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func networkserverstatus(completion: @escaping (CallResult)->())
    throws
    -> Monitor_MonitorNetworkServerStatusCall {
      return try Monitor_MonitorNetworkServerStatusCall(channel).start(metadata:metadata, completion:completion)
  }
}