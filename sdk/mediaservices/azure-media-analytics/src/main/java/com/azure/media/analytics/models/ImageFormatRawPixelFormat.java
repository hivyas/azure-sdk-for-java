// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.media.analytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImageFormatRawPixelFormat. */
public final class ImageFormatRawPixelFormat extends ExpandableStringEnum<ImageFormatRawPixelFormat> {
    /** Static value yuv420p for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat YUV420P = fromString("yuv420p");

    /** Static value rgb565be for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGB565BE = fromString("rgb565be");

    /** Static value rgb565le for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGB565LE = fromString("rgb565le");

    /** Static value rgb555be for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGB555BE = fromString("rgb555be");

    /** Static value rgb555le for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGB555LE = fromString("rgb555le");

    /** Static value rgb24 for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGB24 = fromString("rgb24");

    /** Static value bgr24 for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat BGR24 = fromString("bgr24");

    /** Static value argb for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat ARGB = fromString("argb");

    /** Static value rgba for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat RGBA = fromString("rgba");

    /** Static value abgr for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat ABGR = fromString("abgr");

    /** Static value bgra for ImageFormatRawPixelFormat. */
    public static final ImageFormatRawPixelFormat BGRA = fromString("bgra");

    /**
     * Creates or finds a ImageFormatRawPixelFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageFormatRawPixelFormat.
     */
    @JsonCreator
    public static ImageFormatRawPixelFormat fromString(String name) {
        return fromString(name, ImageFormatRawPixelFormat.class);
    }

    /** @return known ImageFormatRawPixelFormat values. */
    public static Collection<ImageFormatRawPixelFormat> values() {
        return values(ImageFormatRawPixelFormat.class);
    }
}
