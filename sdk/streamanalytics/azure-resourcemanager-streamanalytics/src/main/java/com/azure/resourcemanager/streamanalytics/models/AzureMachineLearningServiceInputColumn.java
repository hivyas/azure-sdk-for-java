// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an input column for the Azure Machine Learning web service endpoint. */
@Fluent
public final class AzureMachineLearningServiceInputColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureMachineLearningServiceInputColumn.class);

    /*
     * The name of the input column.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The (Azure Machine Learning supported) data type of the input column.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /*
     * The zero based index of the function parameter this input maps to.
     */
    @JsonProperty(value = "mapTo")
    private Integer mapTo;

    /**
     * Get the name property: The name of the input column.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the input column.
     *
     * @param name the name value to set.
     * @return the AzureMachineLearningServiceInputColumn object itself.
     */
    public AzureMachineLearningServiceInputColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the dataType property: The (Azure Machine Learning supported) data type of the input column.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: The (Azure Machine Learning supported) data type of the input column.
     *
     * @param dataType the dataType value to set.
     * @return the AzureMachineLearningServiceInputColumn object itself.
     */
    public AzureMachineLearningServiceInputColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the mapTo property: The zero based index of the function parameter this input maps to.
     *
     * @return the mapTo value.
     */
    public Integer mapTo() {
        return this.mapTo;
    }

    /**
     * Set the mapTo property: The zero based index of the function parameter this input maps to.
     *
     * @param mapTo the mapTo value to set.
     * @return the AzureMachineLearningServiceInputColumn object itself.
     */
    public AzureMachineLearningServiceInputColumn withMapTo(Integer mapTo) {
        this.mapTo = mapTo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
