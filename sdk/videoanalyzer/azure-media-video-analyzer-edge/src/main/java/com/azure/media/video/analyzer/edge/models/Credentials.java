// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Credentials to present during authentication. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = Credentials.class)
@JsonTypeName("Credentials")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "#Microsoft.VideoAnalyzer.UsernamePasswordCredentials",
            value = UsernamePasswordCredentials.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.HttpHeaderCredentials", value = HttpHeaderCredentials.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.SymmetricKeyCredentials", value = SymmetricKeyCredentials.class)
})
@Immutable
public class Credentials {}
