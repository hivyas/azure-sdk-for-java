// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON schema. */
@Fluent
public final class JsonSchemaInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JsonSchemaInner.class);

    /*
     * The JSON title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The JSON content.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * Get the title property: The JSON title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The JSON title.
     *
     * @param title the title value to set.
     * @return the JsonSchemaInner object itself.
     */
    public JsonSchemaInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: The JSON content.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The JSON content.
     *
     * @param content the content value to set.
     * @return the JsonSchemaInner object itself.
     */
    public JsonSchemaInner withContent(String content) {
        this.content = content;
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
