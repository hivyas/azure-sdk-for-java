// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BlobStorageTokenStore model. */
@JsonFlatten
@Fluent
public class BlobStorageTokenStore extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobStorageTokenStore.class);

    /*
     * The sasUrlSettingName property.
     */
    @JsonProperty(value = "properties.sasUrlSettingName")
    private String sasUrlSettingName;

    /**
     * Get the sasUrlSettingName property: The sasUrlSettingName property.
     *
     * @return the sasUrlSettingName value.
     */
    public String sasUrlSettingName() {
        return this.sasUrlSettingName;
    }

    /**
     * Set the sasUrlSettingName property: The sasUrlSettingName property.
     *
     * @param sasUrlSettingName the sasUrlSettingName value to set.
     * @return the BlobStorageTokenStore object itself.
     */
    public BlobStorageTokenStore withSasUrlSettingName(String sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobStorageTokenStore withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
