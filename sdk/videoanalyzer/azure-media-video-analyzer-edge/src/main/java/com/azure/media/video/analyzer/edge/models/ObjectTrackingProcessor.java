// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A node that accepts raw video as input, and detects objects. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.ObjectTrackingProcessor")
@Fluent
public final class ObjectTrackingProcessor extends Processor {
    /*
     * Enumeration that controls the accuracy of the tracker.
     */
    @JsonProperty(value = "accuracy")
    private ObjectTrackingAccuracy accuracy;

    /**
     * Creates an instance of ObjectTrackingProcessor class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     */
    @JsonCreator
    public ObjectTrackingProcessor(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs) {
        super(name, inputs);
    }

    /**
     * Get the accuracy property: Enumeration that controls the accuracy of the tracker.
     *
     * @return the accuracy value.
     */
    public ObjectTrackingAccuracy getAccuracy() {
        return this.accuracy;
    }

    /**
     * Set the accuracy property: Enumeration that controls the accuracy of the tracker.
     *
     * @param accuracy the accuracy value to set.
     * @return the ObjectTrackingProcessor object itself.
     */
    public ObjectTrackingProcessor setAccuracy(ObjectTrackingAccuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }
}
