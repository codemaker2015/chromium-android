
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_items_collection/core/pending_state.h

package org.chromium.components.offline_items_collection;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PendingState.NOT_PENDING, PendingState.PENDING_NETWORK, PendingState.PENDING_ANOTHER_DOWNLOAD
})
@Retention(RetentionPolicy.SOURCE)
public @interface PendingState {
  /**
   * Enum for reason OfflineItem is pending, if any.
   */
  int NOT_PENDING = 0;
  int PENDING_NETWORK = 1;
  int PENDING_ANOTHER_DOWNLOAD = 2;
}
