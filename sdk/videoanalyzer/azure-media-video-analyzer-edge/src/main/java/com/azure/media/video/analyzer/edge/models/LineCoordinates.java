// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the start point and end point of a line in the frame. */
@Fluent
public final class LineCoordinates {
    /*
     * Sets the coordinates of the starting point for the line.
     */
    @JsonProperty(value = "start", required = true)
    private Point start;

    /*
     * Sets the coordinates of the ending point for the line.
     */
    @JsonProperty(value = "end", required = true)
    private Point end;

    /**
     * Creates an instance of LineCoordinates class.
     *
     * @param start the start value to set.
     * @param end the end value to set.
     */
    @JsonCreator
    public LineCoordinates(
            @JsonProperty(value = "start", required = true) Point start,
            @JsonProperty(value = "end", required = true) Point end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Get the start property: Sets the coordinates of the starting point for the line.
     *
     * @return the start value.
     */
    public Point getStart() {
        return this.start;
    }

    /**
     * Get the end property: Sets the coordinates of the ending point for the line.
     *
     * @return the end value.
     */
    public Point getEnd() {
        return this.end;
    }
}
