//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto
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

internal protocol Lorawan_DeviceManagerGetDeviceCall: ClientCallUnary {}

fileprivate final class Lorawan_DeviceManagerGetDeviceCallBase: ClientCallUnaryBase<Lorawan_DeviceIdentifier, Lorawan_Device>, Lorawan_DeviceManagerGetDeviceCall {
  override class var method: String { return "/lorawan.DeviceManager/GetDevice" }
}

internal protocol Lorawan_DeviceManagerSetDeviceCall: ClientCallUnary {}

fileprivate final class Lorawan_DeviceManagerSetDeviceCallBase: ClientCallUnaryBase<Lorawan_Device, SwiftProtobuf.Google_Protobuf_Empty>, Lorawan_DeviceManagerSetDeviceCall {
  override class var method: String { return "/lorawan.DeviceManager/SetDevice" }
}

internal protocol Lorawan_DeviceManagerDeleteDeviceCall: ClientCallUnary {}

fileprivate final class Lorawan_DeviceManagerDeleteDeviceCallBase: ClientCallUnaryBase<Lorawan_DeviceIdentifier, SwiftProtobuf.Google_Protobuf_Empty>, Lorawan_DeviceManagerDeleteDeviceCall {
  override class var method: String { return "/lorawan.DeviceManager/DeleteDevice" }
}


/// Instantiate Lorawan_DeviceManagerServiceClient, then call methods of this protocol to make API calls.
internal protocol Lorawan_DeviceManagerService: ServiceClient {
  /// Synchronous. Unary.
  func getDevice(_ request: Lorawan_DeviceIdentifier) throws -> Lorawan_Device
  /// Asynchronous. Unary.
  func getDevice(_ request: Lorawan_DeviceIdentifier, completion: @escaping (Lorawan_Device?, CallResult) -> Void) throws -> Lorawan_DeviceManagerGetDeviceCall

  /// Synchronous. Unary.
  func setDevice(_ request: Lorawan_Device) throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Asynchronous. Unary.
  func setDevice(_ request: Lorawan_Device, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Lorawan_DeviceManagerSetDeviceCall

  /// Synchronous. Unary.
  func deleteDevice(_ request: Lorawan_DeviceIdentifier) throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Asynchronous. Unary.
  func deleteDevice(_ request: Lorawan_DeviceIdentifier, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Lorawan_DeviceManagerDeleteDeviceCall

}

internal final class Lorawan_DeviceManagerServiceClient: ServiceClientBase, Lorawan_DeviceManagerService {
  /// Synchronous. Unary.
  internal func getDevice(_ request: Lorawan_DeviceIdentifier) throws -> Lorawan_Device {
    return try Lorawan_DeviceManagerGetDeviceCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func getDevice(_ request: Lorawan_DeviceIdentifier, completion: @escaping (Lorawan_Device?, CallResult) -> Void) throws -> Lorawan_DeviceManagerGetDeviceCall {
    return try Lorawan_DeviceManagerGetDeviceCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func setDevice(_ request: Lorawan_Device) throws -> SwiftProtobuf.Google_Protobuf_Empty {
    return try Lorawan_DeviceManagerSetDeviceCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func setDevice(_ request: Lorawan_Device, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Lorawan_DeviceManagerSetDeviceCall {
    return try Lorawan_DeviceManagerSetDeviceCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func deleteDevice(_ request: Lorawan_DeviceIdentifier) throws -> SwiftProtobuf.Google_Protobuf_Empty {
    return try Lorawan_DeviceManagerDeleteDeviceCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func deleteDevice(_ request: Lorawan_DeviceIdentifier, completion: @escaping (SwiftProtobuf.Google_Protobuf_Empty?, CallResult) -> Void) throws -> Lorawan_DeviceManagerDeleteDeviceCall {
    return try Lorawan_DeviceManagerDeleteDeviceCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}

/// To build a server, implement a class that conforms to this protocol.
/// If one of the methods returning `ServerStatus?` returns nil,
/// it is expected that you have already returned a status to the client by means of `session.close`.
internal protocol Lorawan_DeviceManagerProvider: ServiceProvider {
  func getDevice(request: Lorawan_DeviceIdentifier, session: Lorawan_DeviceManagerGetDeviceSession) throws -> Lorawan_Device
  func setDevice(request: Lorawan_Device, session: Lorawan_DeviceManagerSetDeviceSession) throws -> SwiftProtobuf.Google_Protobuf_Empty
  func deleteDevice(request: Lorawan_DeviceIdentifier, session: Lorawan_DeviceManagerDeleteDeviceSession) throws -> SwiftProtobuf.Google_Protobuf_Empty
}

extension Lorawan_DeviceManagerProvider {
  internal var serviceName: String { return "lorawan.DeviceManager" }

  /// Determines and calls the appropriate request handler, depending on the request's method.
  /// Throws `HandleMethodError.unknownMethod` for methods not handled by this service.
  internal func handleMethod(_ method: String, handler: Handler) throws -> ServerStatus? {
    switch method {
    case "/lorawan.DeviceManager/GetDevice":
      return try Lorawan_DeviceManagerGetDeviceSessionBase(
        handler: handler,
        providerBlock: { try self.getDevice(request: $0, session: $1 as! Lorawan_DeviceManagerGetDeviceSessionBase) })
          .run()
    case "/lorawan.DeviceManager/SetDevice":
      return try Lorawan_DeviceManagerSetDeviceSessionBase(
        handler: handler,
        providerBlock: { try self.setDevice(request: $0, session: $1 as! Lorawan_DeviceManagerSetDeviceSessionBase) })
          .run()
    case "/lorawan.DeviceManager/DeleteDevice":
      return try Lorawan_DeviceManagerDeleteDeviceSessionBase(
        handler: handler,
        providerBlock: { try self.deleteDevice(request: $0, session: $1 as! Lorawan_DeviceManagerDeleteDeviceSessionBase) })
          .run()
    default:
      throw HandleMethodError.unknownMethod
    }
  }
}

internal protocol Lorawan_DeviceManagerGetDeviceSession: ServerSessionUnary {}

fileprivate final class Lorawan_DeviceManagerGetDeviceSessionBase: ServerSessionUnaryBase<Lorawan_DeviceIdentifier, Lorawan_Device>, Lorawan_DeviceManagerGetDeviceSession {}

internal protocol Lorawan_DeviceManagerSetDeviceSession: ServerSessionUnary {}

fileprivate final class Lorawan_DeviceManagerSetDeviceSessionBase: ServerSessionUnaryBase<Lorawan_Device, SwiftProtobuf.Google_Protobuf_Empty>, Lorawan_DeviceManagerSetDeviceSession {}

internal protocol Lorawan_DeviceManagerDeleteDeviceSession: ServerSessionUnary {}

fileprivate final class Lorawan_DeviceManagerDeleteDeviceSessionBase: ServerSessionUnaryBase<Lorawan_DeviceIdentifier, SwiftProtobuf.Google_Protobuf_Empty>, Lorawan_DeviceManagerDeleteDeviceSession {}

