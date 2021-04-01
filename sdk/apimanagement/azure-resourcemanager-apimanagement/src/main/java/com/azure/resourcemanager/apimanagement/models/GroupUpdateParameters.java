// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Update Group operation. */
@JsonFlatten
@Fluent
public class GroupUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupUpdateParameters.class);

    /*
     * Group name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Group description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Group type.
     */
    @JsonProperty(value = "properties.type")
    private GroupType type;

    /*
     * Identifier of the external groups, this property contains the id of the
     * group from the external identity provider, e.g. for Azure Active
     * Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`;
     * otherwise the value is null.
     */
    @JsonProperty(value = "properties.externalId")
    private String externalId;

    /**
     * Get the displayName property: Group name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Group name.
     *
     * @param displayName the displayName value to set.
     * @return the GroupUpdateParameters object itself.
     */
    public GroupUpdateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Group description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Group description.
     *
     * @param description the description value to set.
     * @return the GroupUpdateParameters object itself.
     */
    public GroupUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type property: Group type.
     *
     * @return the type value.
     */
    public GroupType type() {
        return this.type;
    }

    /**
     * Set the type property: Group type.
     *
     * @param type the type value to set.
     * @return the GroupUpdateParameters object itself.
     */
    public GroupUpdateParameters withType(GroupType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the externalId property: Identifier of the external groups, this property contains the id of the group from
     * the external identity provider, e.g. for Azure Active Directory
     * `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @return the externalId value.
     */
    public String externalId() {
        return this.externalId;
    }

    /**
     * Set the externalId property: Identifier of the external groups, this property contains the id of the group from
     * the external identity provider, e.g. for Azure Active Directory
     * `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @param externalId the externalId value to set.
     * @return the GroupUpdateParameters object itself.
     */
    public GroupUpdateParameters withExternalId(String externalId) {
        this.externalId = externalId;
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
