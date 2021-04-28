// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.DscNodeInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of DscNode. */
public interface DscNode {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the lastSeen property: Gets or sets the last seen time of the node.
     *
     * @return the lastSeen value.
     */
    OffsetDateTime lastSeen();

    /**
     * Gets the registrationTime property: Gets or sets the registration time of the node.
     *
     * @return the registrationTime value.
     */
    OffsetDateTime registrationTime();

    /**
     * Gets the ip property: Gets or sets the ip of the node.
     *
     * @return the ip value.
     */
    String ip();

    /**
     * Gets the accountId property: Gets or sets the account id of the node.
     *
     * @return the accountId value.
     */
    String accountId();

    /**
     * Gets the status property: Gets or sets the status of the node.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the nodeId property: Gets or sets the node id.
     *
     * @return the nodeId value.
     */
    String nodeId();

    /**
     * Gets the etag property: Gets or sets the etag of the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the totalCount property: Gets the total number of records matching filter criteria.
     *
     * @return the totalCount value.
     */
    Integer totalCount();

    /**
     * Gets the extensionHandler property: Gets or sets the list of extensionHandler properties for a Node.
     *
     * @return the extensionHandler value.
     */
    List<DscNodeExtensionHandlerAssociationProperty> extensionHandler();

    /**
     * Gets the namePropertiesNodeConfigurationName property: Gets or sets the name of the dsc node configuration.
     *
     * @return the namePropertiesNodeConfigurationName value.
     */
    String namePropertiesNodeConfigurationName();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.DscNodeInner object.
     *
     * @return the inner object.
     */
    DscNodeInner innerModel();
}
