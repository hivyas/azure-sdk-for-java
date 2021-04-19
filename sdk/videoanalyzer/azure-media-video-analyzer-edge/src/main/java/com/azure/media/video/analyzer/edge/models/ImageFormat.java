// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Encoding settings for an image. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = ImageFormat.class)
@JsonTypeName("ImageFormat")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.ImageFormatRaw", value = ImageFormatRaw.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.ImageFormatJpeg", value = ImageFormatJpeg.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.ImageFormatBmp", value = ImageFormatBmp.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.ImageFormatPng", value = ImageFormatPng.class)
})
@Immutable
public class ImageFormat {}
