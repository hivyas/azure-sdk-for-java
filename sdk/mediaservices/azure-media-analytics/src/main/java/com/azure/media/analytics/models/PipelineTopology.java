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

/** The definition of a pipeline topology. */
@Fluent
public class PipelineTopology {
    /*
     * The identifier for the pipeline topology.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The system data for a resource.
     */
    @JsonProperty(value = "systemData")
    private SystemData systemData;

    /*
     * The properties of the pipeline topology.
     */
    @JsonProperty(value = "properties")
    private PipelineTopologyProperties properties;

    /**
     * Get the name property: The identifier for the pipeline topology.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The identifier for the pipeline topology.
     *
     * @param name the name value to set.
     * @return the PipelineTopology object itself.
     */
    public PipelineTopology setName(String name) {
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
     * @return the PipelineTopology object itself.
     */
    public PipelineTopology setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: The properties of the pipeline topology.
     *
     * @return the properties value.
     */
    public PipelineTopologyProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the pipeline topology.
     *
     * @param properties the properties value to set.
     * @return the PipelineTopology object itself.
     */
    public PipelineTopology setProperties(PipelineTopologyProperties properties) {
        this.properties = properties;
        return this;
    }
}
