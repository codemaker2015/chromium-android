
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/websocket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface WebSocketClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WebSocketClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WebSocketClient, WebSocketClient.Proxy> MANAGER = WebSocketClient_Internal.MANAGER;


    void onFailChannel(
String reason);



    void onStartOpeningHandshake(
WebSocketHandshakeRequest request);



    void onFinishOpeningHandshake(
WebSocketHandshakeResponse response);



    void onAddChannelResponse(
String selectedProtocol, String extensions);



    void onDataFrame(
boolean fin, int type, byte[] data);



    void onFlowControl(
long quota);



    void onDropChannel(
boolean wasClean, short code, String reason);



    void onClosingHandshake(
);


}
