//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/protocol/lorawan/device_address.proto
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

internal protocol Lorawan_DevAddrManagerGetPrefixesCall: ClientCallUnary {}

fileprivate final class Lorawan_DevAddrManagerGetPrefixesCallBase: ClientCallUnaryBase<Lorawan_PrefixesRequest, Lorawan_PrefixesResponse>, Lorawan_DevAddrManagerGetPrefixesCall {
  override class var method: String { return "/lorawan.DevAddrManager/GetPrefixes" }
}

internal protocol Lorawan_DevAddrManagerGetDevAddrCall: ClientCallUnary {}

fileprivate final class Lorawan_DevAddrManagerGetDevAddrCallBase: ClientCallUnaryBase<Lorawan_DevAddrRequest, Lorawan_DevAddrResponse>, Lorawan_DevAddrManagerGetDevAddrCall {
  override class var method: String { return "/lorawan.DevAddrManager/GetDevAddr" }
}


/// Instantiate Lorawan_DevAddrManagerServiceClient, then call methods of this protocol to make API calls.
internal protocol Lorawan_DevAddrManagerService: ServiceClient {
  /// Synchronous. Unary.
  func getPrefixes(_ request: Lorawan_PrefixesRequest) throws -> Lorawan_PrefixesResponse
  /// Asynchronous. Unary.
  func getPrefixes(_ request: Lorawan_PrefixesRequest, completion: @escaping (Lorawan_PrefixesResponse?, CallResult) -> Void) throws -> Lorawan_DevAddrManagerGetPrefixesCall

  /// Synchronous. Unary.
  func getDevAddr(_ request: Lorawan_DevAddrRequest) throws -> Lorawan_DevAddrResponse
  /// Asynchronous. Unary.
  func getDevAddr(_ request: Lorawan_DevAddrRequest, completion: @escaping (Lorawan_DevAddrResponse?, CallResult) -> Void) throws -> Lorawan_DevAddrManagerGetDevAddrCall

}

internal final class Lorawan_DevAddrManagerServiceClient: ServiceClientBase, Lorawan_DevAddrManagerService {
  /// Synchronous. Unary.
  internal func getPrefixes(_ request: Lorawan_PrefixesRequest) throws -> Lorawan_PrefixesResponse {
    return try Lorawan_DevAddrManagerGetPrefixesCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func getPrefixes(_ request: Lorawan_PrefixesRequest, completion: @escaping (Lorawan_PrefixesResponse?, CallResult) -> Void) throws -> Lorawan_DevAddrManagerGetPrefixesCall {
    return try Lorawan_DevAddrManagerGetPrefixesCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func getDevAddr(_ request: Lorawan_DevAddrRequest) throws -> Lorawan_DevAddrResponse {
    return try Lorawan_DevAddrManagerGetDevAddrCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func getDevAddr(_ request: Lorawan_DevAddrRequest, completion: @escaping (Lorawan_DevAddrResponse?, CallResult) -> Void) throws -> Lorawan_DevAddrManagerGetDevAddrCall {
    return try Lorawan_DevAddrManagerGetDevAddrCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Lorawan_DevAddrManagerProvider {
  func getPrefixes(request: Lorawan_PrefixesRequest, session: Lorawan_DevAddrManagerGetPrefixesSession) throws -> Lorawan_PrefixesResponse
  func getDevAddr(request: Lorawan_DevAddrRequest, session: Lorawan_DevAddrManagerGetDevAddrSession) throws -> Lorawan_DevAddrResponse
}

internal protocol Lorawan_DevAddrManagerGetPrefixesSession: ServerSessionUnary {}

fileprivate final class Lorawan_DevAddrManagerGetPrefixesSessionBase: ServerSessionUnaryBase<Lorawan_PrefixesRequest, Lorawan_PrefixesResponse>, Lorawan_DevAddrManagerGetPrefixesSession {}

internal protocol Lorawan_DevAddrManagerGetDevAddrSession: ServerSessionUnary {}

fileprivate final class Lorawan_DevAddrManagerGetDevAddrSessionBase: ServerSessionUnaryBase<Lorawan_DevAddrRequest, Lorawan_DevAddrResponse>, Lorawan_DevAddrManagerGetDevAddrSession {}


/// Main server for generated service
internal final class Lorawan_DevAddrManagerServer: ServiceServer {
  private let provider: Lorawan_DevAddrManagerProvider

  internal init(address: String, provider: Lorawan_DevAddrManagerProvider) {
    self.provider = provider
    super.init(address: address)
  }

  internal init?(address: String, certificateURL: URL, keyURL: URL, provider: Lorawan_DevAddrManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateURL: certificateURL, keyURL: keyURL)
  }

  internal init?(address: String, certificateString: String, keyString: String, provider: Lorawan_DevAddrManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateString: certificateString, keyString: keyString)
  }

  /// Start the server.
  internal override func handleMethod(_ method: String, handler: Handler, queue: DispatchQueue) throws -> Bool {
    let provider = self.provider
    switch method {
    case "/lorawan.DevAddrManager/GetPrefixes":
      try Lorawan_DevAddrManagerGetPrefixesSessionBase(
        handler: handler,
        providerBlock: { try provider.getPrefixes(request: $0, session: $1 as! Lorawan_DevAddrManagerGetPrefixesSessionBase) })
          .run(queue: queue)
      return true
    case "/lorawan.DevAddrManager/GetDevAddr":
      try Lorawan_DevAddrManagerGetDevAddrSessionBase(
        handler: handler,
        providerBlock: { try provider.getDevAddr(request: $0, session: $1 as! Lorawan_DevAddrManagerGetDevAddrSessionBase) })
          .run(queue: queue)
      return true
    default:
      return false
    }
  }
}

