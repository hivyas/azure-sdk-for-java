// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Enables a pipeline topology to write media data to a destination outside of the Azure Video Analyzer IoT Edge module.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = Sink.class)
@JsonTypeName("Sink")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.IotHubMessageSink", value = IotHubMessageSink.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.FileSink", value = FileSink.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.AssetSink", value = AssetSink.class)
})
@Fluent
public class Sink {
    /*
     * The name to be used for the topology sink.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * An array of the names of the other nodes in the pipeline topology, the
     * outputs of which are used as input for this sink node.
     */
    @JsonProperty(value = "inputs", required = true)
    private List<NodeInput> inputs;

    /**
     * Creates an instance of Sink class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     */
    @JsonCreator
    public Sink(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs) {
        this.name = name;
        this.inputs = inputs;
    }

    /**
     * Get the name property: The name to be used for the topology sink.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the inputs property: An array of the names of the other nodes in the pipeline topology, the outputs of which
     * are used as input for this sink node.
     *
     * @return the inputs value.
     */
    public List<NodeInput> getInputs() {
        return this.inputs;
    }
}
