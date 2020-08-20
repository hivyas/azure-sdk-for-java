/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFirewallSkuName.
 */
public final class AzureFirewallSkuName extends ExpandableStringEnum<AzureFirewallSkuName> {
    /** Static value AZFW_VNet for AzureFirewallSkuName. */
    public static final AzureFirewallSkuName AZFW_VNET = fromString("AZFW_VNet");

    /** Static value AZFW_Hub for AzureFirewallSkuName. */
    public static final AzureFirewallSkuName AZFW_HUB = fromString("AZFW_Hub");

    /**
     * Creates or finds a AzureFirewallSkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFirewallSkuName
     */
    @JsonCreator
    public static AzureFirewallSkuName fromString(String name) {
        return fromString(name, AzureFirewallSkuName.class);
    }

    /**
     * @return known AzureFirewallSkuName values
     */
    public static Collection<AzureFirewallSkuName> values() {
        return values(AzureFirewallSkuName.class);
    }
}