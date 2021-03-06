/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_08_01.implementation.PrivateDnsZoneGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing PrivateDnsZoneGroup.
 */
public interface PrivateDnsZoneGroup extends HasInner<PrivateDnsZoneGroupInner>, Indexable, Refreshable<PrivateDnsZoneGroup>, Updatable<PrivateDnsZoneGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the privateDnsZoneConfigs value.
     */
    List<PrivateDnsZoneConfig> privateDnsZoneConfigs();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the PrivateDnsZoneGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateDnsZoneGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateDnsZoneGroup definition.
         */
        interface Blank extends WithPrivateEndpoint {
        }

        /**
         * The stage of the privatednszonegroup definition allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
           /**
            * Specifies resourceGroupName, privateEndpointName.
            * @param resourceGroupName The name of the resource group
            * @param privateEndpointName The name of the private endpoint
            * @return the next definition stage
            */
            WithCreate withExistingPrivateEndpoint(String resourceGroupName, String privateEndpointName);
        }

        /**
         * The stage of the privatednszonegroup definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the privatednszonegroup definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the privatednszonegroup definition allowing to specify PrivateDnsZoneConfigs.
         */
        interface WithPrivateDnsZoneConfigs {
            /**
             * Specifies privateDnsZoneConfigs.
             * @param privateDnsZoneConfigs A collection of private dns zone configurations of the private dns zone group
             * @return the next definition stage
             */
            WithCreate withPrivateDnsZoneConfigs(List<PrivateDnsZoneConfig> privateDnsZoneConfigs);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateDnsZoneGroup>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPrivateDnsZoneConfigs {
        }
    }
    /**
     * The template for a PrivateDnsZoneGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateDnsZoneGroup>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPrivateDnsZoneConfigs {
    }

    /**
     * Grouping of PrivateDnsZoneGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privatednszonegroup update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the privatednszonegroup update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the privatednszonegroup update allowing to specify PrivateDnsZoneConfigs.
         */
        interface WithPrivateDnsZoneConfigs {
            /**
             * Specifies privateDnsZoneConfigs.
             * @param privateDnsZoneConfigs A collection of private dns zone configurations of the private dns zone group
             * @return the next update stage
             */
            Update withPrivateDnsZoneConfigs(List<PrivateDnsZoneConfig> privateDnsZoneConfigs);
        }

    }
}
