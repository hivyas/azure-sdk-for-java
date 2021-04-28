// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A skill that detects the language of input text and reports a single language code for every document submitted on
 * the request. The language code is paired with a score indicating the confidence of the analysis.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Text.LanguageDetectionSkill")
@JsonFlatten
@Fluent
public final class LanguageDetectionSkill extends SearchIndexerSkill {
    /*
     * A country code to use as a hint to the language detection model if it
     * cannot disambiguate the language.
     */
    @JsonProperty(value = "defaultCountryHint")
    private String defaultCountryHint;

    /*
     * The version of the model to use when calling the Text Analytics service.
     * It will default to the latest available when not specified. We recommend
     * you do not specify this value unless absolutely necessary.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /**
     * Creates an instance of LanguageDetectionSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public LanguageDetectionSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultCountryHint property: A country code to use as a hint to the language detection model if it cannot
     * disambiguate the language.
     *
     * @return the defaultCountryHint value.
     */
    public String getDefaultCountryHint() {
        return this.defaultCountryHint;
    }

    /**
     * Set the defaultCountryHint property: A country code to use as a hint to the language detection model if it cannot
     * disambiguate the language.
     *
     * @param defaultCountryHint the defaultCountryHint value to set.
     * @return the LanguageDetectionSkill object itself.
     */
    public LanguageDetectionSkill setDefaultCountryHint(String defaultCountryHint) {
        this.defaultCountryHint = defaultCountryHint;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the LanguageDetectionSkill object itself.
     */
    public LanguageDetectionSkill setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
}
