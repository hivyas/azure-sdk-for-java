// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.RemediationDeploymentSummary;
import com.azure.resourcemanager.policyinsights.models.RemediationFilters;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The remediation definition. */
@JsonFlatten
@Fluent
public class RemediationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RemediationInner.class);

    /*
     * The resource ID of the policy assignment that should be remediated.
     */
    @JsonProperty(value = "properties.policyAssignmentId")
    private String policyAssignmentId;

    /*
     * The policy definition reference ID of the individual definition that
     * should be remediated. Required when the policy assignment being
     * remediated assigns a policy set definition.
     */
    @JsonProperty(value = "properties.policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * The way resources to remediate are discovered. Defaults to
     * ExistingNonCompliant if not specified.
     */
    @JsonProperty(value = "properties.resourceDiscoveryMode")
    private ResourceDiscoveryMode resourceDiscoveryMode;

    /*
     * The status of the remediation.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The time at which the remediation was created.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * The time at which the remediation was last updated.
     */
    @JsonProperty(value = "properties.lastUpdatedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * The filters that will be applied to determine which resources to
     * remediate.
     */
    @JsonProperty(value = "properties.filters")
    private RemediationFilters filters;

    /*
     * The deployment status summary for all deployments created by the
     * remediation.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RemediationDeploymentSummary deploymentStatus;

    /**
     * Get the policyAssignmentId property: The resource ID of the policy assignment that should be remediated.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: The resource ID of the policy assignment that should be remediated.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The policy definition reference ID of the individual definition
     * that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: The policy definition reference ID of the individual definition
     * that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the resourceDiscoveryMode property: The way resources to remediate are discovered. Defaults to
     * ExistingNonCompliant if not specified.
     *
     * @return the resourceDiscoveryMode value.
     */
    public ResourceDiscoveryMode resourceDiscoveryMode() {
        return this.resourceDiscoveryMode;
    }

    /**
     * Set the resourceDiscoveryMode property: The way resources to remediate are discovered. Defaults to
     * ExistingNonCompliant if not specified.
     *
     * @param resourceDiscoveryMode the resourceDiscoveryMode value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withResourceDiscoveryMode(ResourceDiscoveryMode resourceDiscoveryMode) {
        this.resourceDiscoveryMode = resourceDiscoveryMode;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the remediation.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdOn property: The time at which the remediation was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: The time at which the remediation was last updated.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime lastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the filters property: The filters that will be applied to determine which resources to remediate.
     *
     * @return the filters value.
     */
    public RemediationFilters filters() {
        return this.filters;
    }

    /**
     * Set the filters property: The filters that will be applied to determine which resources to remediate.
     *
     * @param filters the filters value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withFilters(RemediationFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the deploymentStatus property: The deployment status summary for all deployments created by the remediation.
     *
     * @return the deploymentStatus value.
     */
    public RemediationDeploymentSummary deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().validate();
        }
        if (deploymentStatus() != null) {
            deploymentStatus().validate();
        }
    }
}
