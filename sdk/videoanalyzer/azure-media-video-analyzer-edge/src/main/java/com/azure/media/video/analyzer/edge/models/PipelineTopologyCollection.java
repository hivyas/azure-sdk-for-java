// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of pipeline topologies. */
@Fluent
public final class PipelineTopologyCollection {
    /*
     * A collection of pipeline topologies.
     */
    @JsonProperty(value = "value")
    private List<PipelineTopology> value;

    /*
     * A continuation token to use in subsequent calls to enumerate through the
     * pipeline topology collection. This is used when the collection contains
     * too many results to return in one response.
     */
    @JsonProperty(value = "@continuationToken")
    private String continuationToken;

    /**
     * Get the value property: A collection of pipeline topologies.
     *
     * @return the value value.
     */
    public List<PipelineTopology> getValue() {
        return this.value;
    }

    /**
     * Set the value property: A collection of pipeline topologies.
     *
     * @param value the value value to set.
     * @return the PipelineTopologyCollection object itself.
     */
    public PipelineTopologyCollection setValue(List<PipelineTopology> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuationToken property: A continuation token to use in subsequent calls to enumerate through the
     * pipeline topology collection. This is used when the collection contains too many results to return in one
     * response.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: A continuation token to use in subsequent calls to enumerate through the
     * pipeline topology collection. This is used when the collection contains too many results to return in one
     * response.
     *
     * @param continuationToken the continuationToken value to set.
     * @return the PipelineTopologyCollection object itself.
     */
    public PipelineTopologyCollection setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
}
