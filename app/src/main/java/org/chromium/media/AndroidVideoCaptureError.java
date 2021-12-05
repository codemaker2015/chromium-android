
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/capture/video/android/video_capture_device_android.h

package org.chromium.media;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AndroidVideoCaptureError.ANDROID_API_1_CAMERA_ERROR_CALLBACK_RECEIVED,
    AndroidVideoCaptureError.ANDROID_API_2_CAMERA_DEVICE_ERROR_RECEIVED,
    AndroidVideoCaptureError.ANDROID_API_2_CAPTURE_SESSION_CONFIGURE_FAILED,
    AndroidVideoCaptureError.ANDROID_API_2_IMAGE_READER_UNEXPECTED_IMAGE_FORMAT,
    AndroidVideoCaptureError.ANDROID_API_2_IMAGE_READER_SIZE_DID_NOT_MATCH_IMAGE_SIZE,
    AndroidVideoCaptureError.ANDROID_API_2_ERROR_RESTARTING_PREVIEW,
    AndroidVideoCaptureError.ANDROID_API_2_ERROR_CONFIGURING_CAMERA
})
@Retention(RetentionPolicy.SOURCE)
public @interface AndroidVideoCaptureError {
  int ANDROID_API_1_CAMERA_ERROR_CALLBACK_RECEIVED = 68;
  int ANDROID_API_2_CAMERA_DEVICE_ERROR_RECEIVED = 69;
  int ANDROID_API_2_CAPTURE_SESSION_CONFIGURE_FAILED = 70;
  int ANDROID_API_2_IMAGE_READER_UNEXPECTED_IMAGE_FORMAT = 71;
  int ANDROID_API_2_IMAGE_READER_SIZE_DID_NOT_MATCH_IMAGE_SIZE = 72;
  int ANDROID_API_2_ERROR_RESTARTING_PREVIEW = 73;
  int ANDROID_API_2_ERROR_CONFIGURING_CAMERA = 114;
}
