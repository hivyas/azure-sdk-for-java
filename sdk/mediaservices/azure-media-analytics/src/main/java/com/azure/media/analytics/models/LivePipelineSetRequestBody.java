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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the livePipelineSet request body. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "methodName")
@JsonTypeName("livePipelineSetRequestBody")
@Fluent
public final class LivePipelineSetRequestBody extends MethodRequest {
    /*
     * The identifier for the live pipeline.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The system data for a resource.
     */
    @JsonProperty(value = "systemData")
    private SystemData systemData;

    /*
     * The properties of the live pipeline.
     */
    @JsonProperty(value = "properties")
    private LivePipelineProperties properties;

    /**
     * Get the name property: The identifier for the live pipeline.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The identifier for the live pipeline.
     *
     * @param name the name value to set.
     * @return the LivePipelineSetRequestBody object itself.
     */
    public LivePipelineSetRequestBody setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the systemData property: The system data for a resource.
     *
     * @return the systemData value.
     */
    public SystemData getSystemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: The system data for a resource.
     *
     * @param systemData the systemData value to set.
     * @return the LivePipelineSetRequestBody object itself.
     */
    public LivePipelineSetRequestBody setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: The properties of the live pipeline.
     *
     * @return the properties value.
     */
    public LivePipelineProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the live pipeline.
     *
     * @param properties the properties value to set.
     * @return the LivePipelineSetRequestBody object itself.
     */
    public LivePipelineSetRequestBody setProperties(LivePipelineProperties properties) {
        this.properties = properties;
        return this;
    }
}
