
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_tiles/tile_title_source.h

package org.chromium.chrome.browser.suggestions;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TileTitleSource.UNKNOWN, TileTitleSource.MANIFEST, TileTitleSource.META_TAG,
    TileTitleSource.TITLE_TAG, TileTitleSource.INFERRED, TileTitleSource.LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface TileTitleSource {
  /**
   * The title might be invalid, aggregated, user-set, extracted from history, not loaded or simply
   * not known.
   */
  int UNKNOWN = 0;
  /**
   * The site's manifest contained a usable "(short_)name" attribute.
   */
  int MANIFEST = 1;
  /**
   * The site provided a meta tag (e.g. OpenGraph's site_name).
   */
  int META_TAG = 2;
  /**
   * The site's title is used as tile title, extracted from the title tag.
   */
  int TITLE_TAG = 3;
  /**
   * The title was inferred from multiple signals (e.g. meta tags, url, title).
   */
  int INFERRED = 4;
  /**
   * The maximum tile title source value that gets recorded in UMA.
   */
  int LAST = INFERRED;
}