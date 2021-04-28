// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PeeringService provider. */
@JsonFlatten
@Fluent
public class PeeringServiceProviderInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringServiceProviderInner.class);

    /*
     * The name of the service provider.
     */
    @JsonProperty(value = "properties.serviceProviderName")
    private String serviceProviderName;

    /*
     * The list of locations at which the service provider peers with
     * Microsoft.
     */
    @JsonProperty(value = "properties.peeringLocations")
    private List<String> peeringLocations;

    /**
     * Get the serviceProviderName property: The name of the service provider.
     *
     * @return the serviceProviderName value.
     */
    public String serviceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * Set the serviceProviderName property: The name of the service provider.
     *
     * @param serviceProviderName the serviceProviderName value to set.
     * @return the PeeringServiceProviderInner object itself.
     */
    public PeeringServiceProviderInner withServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }

    /**
     * Get the peeringLocations property: The list of locations at which the service provider peers with Microsoft.
     *
     * @return the peeringLocations value.
     */
    public List<String> peeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set the peeringLocations property: The list of locations at which the service provider peers with Microsoft.
     *
     * @param peeringLocations the peeringLocations value to set.
     * @return the PeeringServiceProviderInner object itself.
     */
    public PeeringServiceProviderInner withPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
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
