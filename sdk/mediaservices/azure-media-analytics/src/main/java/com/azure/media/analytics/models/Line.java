// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.media.analytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a line. */
@Fluent
public final class Line {
    /*
     * Sets the properties of the line.
     */
    @JsonProperty(value = "line", required = true)
    private LineCoordinates line;

    /*
     * The name of the line.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the line property: Sets the properties of the line.
     *
     * @return the line value.
     */
    public LineCoordinates getLine() {
        return this.line;
    }

    /**
     * Set the line property: Sets the properties of the line.
     *
     * @param line the line value to set.
     * @return the Line object itself.
     */
    public Line setLine(LineCoordinates line) {
        this.line = line;
        return this;
    }

    /**
     * Get the name property: The name of the line.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the line.
     *
     * @param name the name value to set.
     * @return the Line object itself.
     */
    public Line setName(String name) {
        this.name = name;
        return this;
    }
}
