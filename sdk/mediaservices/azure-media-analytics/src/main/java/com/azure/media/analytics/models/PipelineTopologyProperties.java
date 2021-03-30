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
import java.util.List;

/** A description of the properties of a pipeline topology. */
@Fluent
public final class PipelineTopologyProperties {
    /*
     * A description of a pipeline topology. It is recommended to use this to
     * describe the expected use of the pipeline topology.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The list of parameters defined in the pipeline topology. The value for
     * these parameters are supplied by streams of this pipeline topology.
     */
    @JsonProperty(value = "parameters")
    private List<ParameterDeclaration> parameters;

    /*
     * The list of source nodes in this pipeline topology.
     */
    @JsonProperty(value = "sources")
    private List<Source> sources;

    /*
     * The list of processor nodes in this pipeline topology.
     */
    @JsonProperty(value = "processors")
    private List<Processor> processors;

    /*
     * The list of sink nodes in this pipeline topology.
     */
    @JsonProperty(value = "sinks")
    private List<Sink> sinks;

    /**
     * Get the description property: A description of a pipeline topology. It is recommended to use this to describe the
     * expected use of the pipeline topology.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A description of a pipeline topology. It is recommended to use this to describe the
     * expected use of the pipeline topology.
     *
     * @param description the description value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the parameters property: The list of parameters defined in the pipeline topology. The value for these
     * parameters are supplied by streams of this pipeline topology.
     *
     * @return the parameters value.
     */
    public List<ParameterDeclaration> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The list of parameters defined in the pipeline topology. The value for these
     * parameters are supplied by streams of this pipeline topology.
     *
     * @param parameters the parameters value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties setParameters(List<ParameterDeclaration> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the sources property: The list of source nodes in this pipeline topology.
     *
     * @return the sources value.
     */
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * Set the sources property: The list of source nodes in this pipeline topology.
     *
     * @param sources the sources value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties setSources(List<Source> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the processors property: The list of processor nodes in this pipeline topology.
     *
     * @return the processors value.
     */
    public List<Processor> getProcessors() {
        return this.processors;
    }

    /**
     * Set the processors property: The list of processor nodes in this pipeline topology.
     *
     * @param processors the processors value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties setProcessors(List<Processor> processors) {
        this.processors = processors;
        return this;
    }

    /**
     * Get the sinks property: The list of sink nodes in this pipeline topology.
     *
     * @return the sinks value.
     */
    public List<Sink> getSinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: The list of sink nodes in this pipeline topology.
     *
     * @param sinks the sinks value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties setSinks(List<Sink> sinks) {
        this.sinks = sinks;
        return this;
    }
}
