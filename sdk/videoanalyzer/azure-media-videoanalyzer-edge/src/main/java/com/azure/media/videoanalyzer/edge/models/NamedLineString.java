// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a line configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.NamedLineString")
@Fluent
public final class NamedLineString extends NamedLineBase {
    /*
     * Point coordinates for the line start and end, respectively. Example:
     * '[[0.3, 0.2],[0.9, 0.8]]'. Each point is expressed as [LEFT, TOP]
     * coordinate ratios ranging from 0.0 to 1.0, where [0,0] is the upper-left
     * frame corner and [1, 1] is the bottom-right frame corner.
     */
    @JsonProperty(value = "line", required = true)
    private String line;

    /**
     * Creates an instance of NamedLineString class.
     *
     * @param name the name value to set.
     * @param line the line value to set.
     */
    @JsonCreator
    public NamedLineString(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "line", required = true) String line) {
        super(name);
        this.line = line;
    }

    /**
     * Get the line property: Point coordinates for the line start and end, respectively. Example: '[[0.3, 0.2],[0.9,
     * 0.8]]'. Each point is expressed as [LEFT, TOP] coordinate ratios ranging from 0.0 to 1.0, where [0,0] is the
     * upper-left frame corner and [1, 1] is the bottom-right frame corner.
     *
     * @return the line value.
     */
    public String getLine() {
        return this.line;
    }
}
