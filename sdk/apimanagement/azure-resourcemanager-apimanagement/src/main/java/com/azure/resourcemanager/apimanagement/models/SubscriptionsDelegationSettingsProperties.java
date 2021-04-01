// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscriptions delegation settings properties. */
@Fluent
public final class SubscriptionsDelegationSettingsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionsDelegationSettingsProperties.class);

    /*
     * Enable or disable delegation for subscriptions.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Enable or disable delegation for subscriptions.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enable or disable delegation for subscriptions.
     *
     * @param enabled the enabled value to set.
     * @return the SubscriptionsDelegationSettingsProperties object itself.
     */
    public SubscriptionsDelegationSettingsProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
