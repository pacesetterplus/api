//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/broker/broker.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import Foundation
import Dispatch
import SwiftGRPC
import SwiftProtobuf

internal protocol Broker_BrokerAssociateCall: ClientCallBidirectionalStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Broker_DownlinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Broker_DownlinkMessage?>) -> Void) throws

  /// Send a message to the stream. Nonblocking.
  func send(_ message: Broker_UplinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Broker_UplinkMessage, timeout: DispatchTime) throws

  /// Call this to close the sending connection. Blocking.
  func closeSend() throws
  /// Call this to close the sending connection. Nonblocking.
  func closeSend(completion: (() -> Void)?) throws
}

internal extension Broker_BrokerAssociateCall {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Broker_DownlinkMessage? { return try self._receive(timeout: timeout) }
}

internal extension Broker_BrokerAssociateCall {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Broker_UplinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Broker_BrokerAssociateCallBase: ClientCallBidirectionalStreamingBase<Broker_UplinkMessage, Broker_DownlinkMessage>, Broker_BrokerAssociateCall {
  override class var method: String { return "/broker.Broker/Associate" }
}

internal protocol Broker_BrokerSubscribeCall: ClientCallServerStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Broker_DeduplicatedUplinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Broker_DeduplicatedUplinkMessage?>) -> Void) throws
}

internal extension Broker_BrokerSubscribeCall {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Broker_DeduplicatedUplinkMessage? { return try self._receive(timeout: timeout) }
}

fileprivate final class Broker_BrokerSubscribeCallBase: ClientCallServerStreamingBase<Broker_SubscribeRequest, Broker_DeduplicatedUplinkMessage>, Broker_BrokerSubscribeCall {
  override class var method: String { return "/broker.Broker/Subscribe" }
}

internal protocol Broker_BrokerPublishCall: ClientCallClientStreaming {
  /// Send a message to the stream. Nonblocking.
  func send(_ message: Broker_DownlinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Broker_DownlinkMessage, timeout: DispatchTime) throws

  /// Call this to close the connection and wait for a response. Blocking.
  func closeAndReceive() throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Call this to close the connection and wait for a response. Nonblocking.
  func closeAndReceive(completion: @escaping (ResultOrRPCError<SwiftProtobuf.Google_Protobuf_Empty>) -> Void) throws
}

internal extension Broker_BrokerPublishCall {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Broker_DownlinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Broker_BrokerPublishCallBase: ClientCallClientStreamingBase<Broker_DownlinkMessage, SwiftProtobuf.Google_Protobuf_Empty>, Broker_BrokerPublishCall {
  override class var method: String { return "/broker.Broker/Publish" }
}

internal protocol Broker_BrokerActivateCall: ClientCallUnary {}

fileprivate final class Broker_BrokerActivateCallBase: ClientCallUnaryBase<Broker_DeviceActivationRequest, Broker_DeviceActivationResponse>, Broker_BrokerActivateCall {
  override class var method: String { return "/broker.Broker/Activate" }
}


/// Instantiate Broker_BrokerServiceClient, then call methods of this protocol to make API calls.
internal protocol Broker_BrokerService: ServiceClient {
  /// Asynchronous. Bidirectional-streaming.
  /// Use methods on the returned object to stream messages,
  /// to wait for replies, and to close the connection.
  func associate(completion: ((CallResult) -> Void)?) throws -> Broker_BrokerAssociateCall

  /// Asynchronous. Server-streaming.
  /// Send the initial message.
  /// Use methods on the returned object to get streamed responses.
  func subscribe(_ request: Broker_SubscribeRequest, completion: ((CallResult) -> Void)?) throws -> Broker_BrokerSubscribeCall

  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  func publish(completion: ((CallResult) -> Void)?) throws -> Broker_BrokerPublishCall

  /// Synchronous. Unary.
  func activate(_ request: Broker_DeviceActivationRequest) throws -> Broker_DeviceActivationResponse
  /// Asynchronous. Unary.
  func activate(_ request: Broker_DeviceActivationRequest, completion: @escaping (Broker_DeviceActivationResponse?, CallResult) -> Void) throws -> Broker_BrokerActivateCall

}

internal final class Broker_BrokerServiceClient: ServiceClientBase, Broker_BrokerService {
  /// Asynchronous. Bidirectional-streaming.
  /// Use methods on the returned object to stream messages,
  /// to wait for replies, and to close the connection.
  internal func associate(completion: ((CallResult) -> Void)?) throws -> Broker_BrokerAssociateCall {
    return try Broker_BrokerAssociateCallBase(channel)
      .start(metadata: metadata, completion: completion)
  }

  /// Asynchronous. Server-streaming.
  /// Send the initial message.
  /// Use methods on the returned object to get streamed responses.
  internal func subscribe(_ request: Broker_SubscribeRequest, completion: ((CallResult) -> Void)?) throws -> Broker_BrokerSubscribeCall {
    return try Broker_BrokerSubscribeCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func publish(completion: ((CallResult) -> Void)?) throws -> Broker_BrokerPublishCall {
    return try Broker_BrokerPublishCallBase(channel)
      .start(metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func activate(_ request: Broker_DeviceActivationRequest) throws -> Broker_DeviceActivationResponse {
    return try Broker_BrokerActivateCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func activate(_ request: Broker_DeviceActivationRequest, completion: @escaping (Broker_DeviceActivationResponse?, CallResult) -> Void) throws -> Broker_BrokerActivateCall {
    return try Broker_BrokerActivateCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}
internal protocol Broker_BrokerManagerRegisterApplicationHandlerCall: ClientCallUnary {}

fileprivate final class Broker_BrokerManagerRegisterApplicationHandlerCallBase: ClientCallUnaryBase<Broker_ApplicationHandlerRegistration, SwiftProtobuf.Google_Protobuf_Empty>, Broker_BrokerManagerRegisterApplicationHandlerCall {
  override class var method: String { return "/broker.BrokerManager/RegisterApplicationHandler" }
}

internal protocol Broker_BrokerManagerGetStatusCall: ClientCallUnary {}

fileprivate final class Broker_BrokerManagerGetStatusCallBase: ClientCallUnaryBase<Broker_StatusRequest, Broker_Status>, Broker_BrokerManagerGetStatusCall {
  override class var method: String { return "/broker.BrokerManager/GetStatus" }
}


/// Instantiate Broker_BrokerManagerServiceClient, then call methods of this protocol to make API calls.
internal protocol Broker_BrokerManagerService: ServiceClient {
  /// Synchronous. Unary.
  func registerApplicationHandler(_ request: Broker_ApplicationHandlerRegistration) throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Asynchronous. Unary.
  func registerApplicationHandler(_ request: Broker_ApplicationHandlerRegistration, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Broker_BrokerManagerRegisterApplicationHandlerCall

  /// Synchronous. Unary.
  func getStatus(_ request: Broker_StatusRequest) throws -> Broker_Status
  /// Asynchronous. Unary.
  func getStatus(_ request: Broker_StatusRequest, completion: @escaping (Broker_Status?, CallResult) -> Void) throws -> Broker_BrokerManagerGetStatusCall

}

internal final class Broker_BrokerManagerServiceClient: ServiceClientBase, Broker_BrokerManagerService {
  /// Synchronous. Unary.
  internal func registerApplicationHandler(_ request: Broker_ApplicationHandlerRegistration) throws -> SwiftProtobuf.Google_Protobuf_Empty {
    return try Broker_BrokerManagerRegisterApplicationHandlerCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func registerApplicationHandler(_ request: Broker_ApplicationHandlerRegistration, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Broker_BrokerManagerRegisterApplicationHandlerCall {
    return try Broker_BrokerManagerRegisterApplicationHandlerCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func getStatus(_ request: Broker_StatusRequest) throws -> Broker_Status {
    return try Broker_BrokerManagerGetStatusCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func getStatus(_ request: Broker_StatusRequest, completion: @escaping (Broker_Status?, CallResult) -> Void) throws -> Broker_BrokerManagerGetStatusCall {
    return try Broker_BrokerManagerGetStatusCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Broker_BrokerProvider {
  func associate(session: Broker_BrokerAssociateSession) throws
  func subscribe(request: Broker_SubscribeRequest, session: Broker_BrokerSubscribeSession) throws
  func publish(session: Broker_BrokerPublishSession) throws
  func activate(request: Broker_DeviceActivationRequest, session: Broker_BrokerActivateSession) throws -> Broker_DeviceActivationResponse
}

internal protocol Broker_BrokerAssociateSession: ServerSessionBidirectionalStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Broker_UplinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Broker_UplinkMessage?>) -> Void) throws

  /// Send a message to the stream. Nonblocking.
  func send(_ message: Broker_DownlinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Broker_DownlinkMessage, timeout: DispatchTime) throws

  /// Close the connection and send the status. Non-blocking.
  /// You MUST call this method once you are done processing the request.
  func close(withStatus status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Broker_BrokerAssociateSession {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Broker_UplinkMessage? { return try self._receive(timeout: timeout) }
}

internal extension Broker_BrokerAssociateSession {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Broker_DownlinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Broker_BrokerAssociateSessionBase: ServerSessionBidirectionalStreamingBase<Broker_UplinkMessage, Broker_DownlinkMessage>, Broker_BrokerAssociateSession {}

internal protocol Broker_BrokerSubscribeSession: ServerSessionServerStreaming {
  /// Send a message to the stream. Nonblocking.
  func send(_ message: Broker_DeduplicatedUplinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Broker_DeduplicatedUplinkMessage, timeout: DispatchTime) throws

  /// Close the connection and send the status. Non-blocking.
  /// You MUST call this method once you are done processing the request.
  func close(withStatus status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Broker_BrokerSubscribeSession {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Broker_DeduplicatedUplinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Broker_BrokerSubscribeSessionBase: ServerSessionServerStreamingBase<Broker_SubscribeRequest, Broker_DeduplicatedUplinkMessage>, Broker_BrokerSubscribeSession {}

internal protocol Broker_BrokerPublishSession: ServerSessionClientStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Broker_DownlinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Broker_DownlinkMessage?>) -> Void) throws

  /// You MUST call one of these two methods once you are done processing the request.
  /// Close the connection and send a single result. Non-blocking.
  func sendAndClose(response: SwiftProtobuf.Google_Protobuf_Empty, status: ServerStatus, completion: (() -> Void)?) throws
  /// Close the connection and send an error. Non-blocking.
  /// Use this method if you encountered an error that makes it impossible to send a response.
  /// Accordingly, it does not make sense to call this method with a status of `.ok`.
  func sendErrorAndClose(status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Broker_BrokerPublishSession {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Broker_DownlinkMessage? { return try self._receive(timeout: timeout) }
}

fileprivate final class Broker_BrokerPublishSessionBase: ServerSessionClientStreamingBase<Broker_DownlinkMessage, SwiftProtobuf.Google_Protobuf_Empty>, Broker_BrokerPublishSession {}

internal protocol Broker_BrokerActivateSession: ServerSessionUnary {}

fileprivate final class Broker_BrokerActivateSessionBase: ServerSessionUnaryBase<Broker_DeviceActivationRequest, Broker_DeviceActivationResponse>, Broker_BrokerActivateSession {}


/// Main server for generated service
internal final class Broker_BrokerServer: ServiceServer {
  private let provider: Broker_BrokerProvider

  internal init(address: String, provider: Broker_BrokerProvider) {
    self.provider = provider
    super.init(address: address)
  }

  internal init?(address: String, certificateURL: URL, keyURL: URL, provider: Broker_BrokerProvider) {
    self.provider = provider
    super.init(address: address, certificateURL: certificateURL, keyURL: keyURL)
  }

  internal init?(address: String, certificateString: String, keyString: String, provider: Broker_BrokerProvider) {
    self.provider = provider
    super.init(address: address, certificateString: certificateString, keyString: keyString)
  }

  /// Start the server.
  internal override func handleMethod(_ method: String, handler: Handler, queue: DispatchQueue) throws -> Bool {
    let provider = self.provider
    switch method {
    case "/broker.Broker/Associate":
      try Broker_BrokerAssociateSessionBase(
        handler: handler,
        providerBlock: { try provider.associate(session: $0 as! Broker_BrokerAssociateSessionBase) })
          .run(queue: queue)
      return true
    case "/broker.Broker/Subscribe":
      try Broker_BrokerSubscribeSessionBase(
        handler: handler,
        providerBlock: { try provider.subscribe(request: $0, session: $1 as! Broker_BrokerSubscribeSessionBase) })
          .run(queue: queue)
      return true
    case "/broker.Broker/Publish":
      try Broker_BrokerPublishSessionBase(
        handler: handler,
        providerBlock: { try provider.publish(session: $0 as! Broker_BrokerPublishSessionBase) })
          .run(queue: queue)
      return true
    case "/broker.Broker/Activate":
      try Broker_BrokerActivateSessionBase(
        handler: handler,
        providerBlock: { try provider.activate(request: $0, session: $1 as! Broker_BrokerActivateSessionBase) })
          .run(queue: queue)
      return true
    default:
      return false
    }
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Broker_BrokerManagerProvider {
  func registerApplicationHandler(request: Broker_ApplicationHandlerRegistration, session: Broker_BrokerManagerRegisterApplicationHandlerSession) throws -> SwiftProtobuf.Google_Protobuf_Empty
  func getStatus(request: Broker_StatusRequest, session: Broker_BrokerManagerGetStatusSession) throws -> Broker_Status
}

internal protocol Broker_BrokerManagerRegisterApplicationHandlerSession: ServerSessionUnary {}

fileprivate final class Broker_BrokerManagerRegisterApplicationHandlerSessionBase: ServerSessionUnaryBase<Broker_ApplicationHandlerRegistration, SwiftProtobuf.Google_Protobuf_Empty>, Broker_BrokerManagerRegisterApplicationHandlerSession {}

internal protocol Broker_BrokerManagerGetStatusSession: ServerSessionUnary {}

fileprivate final class Broker_BrokerManagerGetStatusSessionBase: ServerSessionUnaryBase<Broker_StatusRequest, Broker_Status>, Broker_BrokerManagerGetStatusSession {}


/// Main server for generated service
internal final class Broker_BrokerManagerServer: ServiceServer {
  private let provider: Broker_BrokerManagerProvider

  internal init(address: String, provider: Broker_BrokerManagerProvider) {
    self.provider = provider
    super.init(address: address)
  }

  internal init?(address: String, certificateURL: URL, keyURL: URL, provider: Broker_BrokerManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateURL: certificateURL, keyURL: keyURL)
  }

  internal init?(address: String, certificateString: String, keyString: String, provider: Broker_BrokerManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateString: certificateString, keyString: keyString)
  }

  /// Start the server.
  internal override func handleMethod(_ method: String, handler: Handler, queue: DispatchQueue) throws -> Bool {
    let provider = self.provider
    switch method {
    case "/broker.BrokerManager/RegisterApplicationHandler":
      try Broker_BrokerManagerRegisterApplicationHandlerSessionBase(
        handler: handler,
        providerBlock: { try provider.registerApplicationHandler(request: $0, session: $1 as! Broker_BrokerManagerRegisterApplicationHandlerSessionBase) })
          .run(queue: queue)
      return true
    case "/broker.BrokerManager/GetStatus":
      try Broker_BrokerManagerGetStatusSessionBase(
        handler: handler,
        providerBlock: { try provider.getStatus(request: $0, session: $1 as! Broker_BrokerManagerGetStatusSessionBase) })
          .run(queue: queue)
      return true
    default:
      return false
    }
  }
}

