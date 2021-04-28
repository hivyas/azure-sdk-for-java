// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An error response from the Azure Migrate service. */
@Immutable
public final class MoveResourceErrorBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MoveResourceErrorBody.class);

    /*
     * An identifier for the error. Codes are invariant and are intended to be
     * consumed programmatically.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * A message describing the error, intended to be suitable for display in a
     * user interface.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The target of the particular error. For example, the name of the
     * property in error.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<MoveResourceErrorBody> details;

    /**
     * Get the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target property: The target of the particular error. For example, the name of the property in error.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the details property: A list of additional details about the error.
     *
     * @return the details value.
     */
    public List<MoveResourceErrorBody> details() {
        return this.details;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
