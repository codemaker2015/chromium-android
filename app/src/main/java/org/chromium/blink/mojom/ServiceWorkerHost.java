
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface ServiceWorkerHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ServiceWorkerHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ServiceWorkerHost, ServiceWorkerHost.Proxy> MANAGER = ServiceWorkerHost_Internal.MANAGER;


    void setCachedMetadata(
org.chromium.url.mojom.Url url, byte[] data);



    void clearCachedMetadata(
org.chromium.url.mojom.Url url);



    void getClients(
ServiceWorkerClientQueryOptions options, 
GetClientsResponse callback);

    interface GetClientsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ServiceWorkerClientInfo[]> { }



    void getClient(
String clientUuid, 
GetClientResponse callback);

    interface GetClientResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ServiceWorkerClientInfo> { }



    void openNewTab(
org.chromium.url.mojom.Url url, 
OpenNewTabResponse callback);

    interface OpenNewTabResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> { }



    void openPaymentHandlerWindow(
org.chromium.url.mojom.Url url, 
OpenPaymentHandlerWindowResponse callback);

    interface OpenPaymentHandlerWindowResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> { }



    void postMessageToClient(
String clientUuid, TransferableMessage message);



    void focusClient(
String clientUuid, 
FocusClientResponse callback);

    interface FocusClientResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ServiceWorkerClientInfo> { }



    void navigateClient(
String clientUuid, org.chromium.url.mojom.Url url, 
NavigateClientResponse callback);

    interface NavigateClientResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> { }



    void skipWaiting(

SkipWaitingResponse callback);

    interface SkipWaitingResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void claimClients(

ClaimClientsResponse callback);

    interface ClaimClientsResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, String> { }


}
