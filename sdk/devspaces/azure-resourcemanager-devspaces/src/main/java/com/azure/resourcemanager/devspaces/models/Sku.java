// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model representing SKU for Azure Dev Spaces Controller. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The name of the SKU for Azure Dev Spaces Controller.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The tier of the SKU for Azure Dev Spaces Controller.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * Get the name property: The name of the SKU for Azure Dev Spaces Controller.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU for Azure Dev Spaces Controller.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the SKU for Azure Dev Spaces Controller.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the SKU for Azure Dev Spaces Controller.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }
}
