// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.AzureSku;
import com.azure.resourcemanager.kusto.models.EngineType;
import com.azure.resourcemanager.kusto.models.Identity;
import com.azure.resourcemanager.kusto.models.KeyVaultProperties;
import com.azure.resourcemanager.kusto.models.LanguageExtensionsList;
import com.azure.resourcemanager.kusto.models.OptimizedAutoscale;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.azure.resourcemanager.kusto.models.State;
import com.azure.resourcemanager.kusto.models.TrustedExternalTenant;
import com.azure.resourcemanager.kusto.models.VirtualNetworkConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Class representing a Kusto cluster. */
@JsonFlatten
@Fluent
public class ClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterInner.class);

    /*
     * The SKU of the cluster.
     */
    @JsonProperty(value = "sku", required = true)
    private AzureSku sku;

    /*
     * The availability zones of the cluster.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The identity of the cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The state of the resource.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The cluster URI.
     */
    @JsonProperty(value = "properties.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * The cluster data ingestion URI.
     */
    @JsonProperty(value = "properties.dataIngestionUri", access = JsonProperty.Access.WRITE_ONLY)
    private String dataIngestionUri;

    /*
     * The reason for the cluster's current state.
     */
    @JsonProperty(value = "properties.stateReason", access = JsonProperty.Access.WRITE_ONLY)
    private String stateReason;

    /*
     * The cluster's external tenants.
     */
    @JsonProperty(value = "properties.trustedExternalTenants")
    private List<TrustedExternalTenant> trustedExternalTenants;

    /*
     * Optimized auto scale definition.
     */
    @JsonProperty(value = "properties.optimizedAutoscale")
    private OptimizedAutoscale optimizedAutoscale;

    /*
     * A boolean value that indicates if the cluster's disks are encrypted.
     */
    @JsonProperty(value = "properties.enableDiskEncryption")
    private Boolean enableDiskEncryption;

    /*
     * A boolean value that indicates if the streaming ingest is enabled.
     */
    @JsonProperty(value = "properties.enableStreamingIngest")
    private Boolean enableStreamingIngest;

    /*
     * Virtual network definition.
     */
    @JsonProperty(value = "properties.virtualNetworkConfiguration")
    private VirtualNetworkConfiguration virtualNetworkConfiguration;

    /*
     * KeyVault properties for the cluster encryption.
     */
    @JsonProperty(value = "properties.keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * A boolean value that indicates if the purge operations are enabled.
     */
    @JsonProperty(value = "properties.enablePurge")
    private Boolean enablePurge;

    /*
     * List of the cluster's language extensions.
     */
    @JsonProperty(value = "properties.languageExtensions", access = JsonProperty.Access.WRITE_ONLY)
    private LanguageExtensionsList languageExtensions;

    /*
     * A boolean value that indicates if double encryption is enabled.
     */
    @JsonProperty(value = "properties.enableDoubleEncryption")
    private Boolean enableDoubleEncryption;

    /*
     * The engine type
     */
    @JsonProperty(value = "properties.engineType")
    private EngineType engineType;

    /**
     * Get the sku property: The SKU of the cluster.
     *
     * @return the sku value.
     */
    public AzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the cluster.
     *
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(AzureSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: The availability zones of the cluster.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The availability zones of the cluster.
     *
     * @param zones the zones value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identity property: The identity of the cluster, if configured.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the cluster, if configured.
     *
     * @param identity the identity value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the state property: The state of the resource.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uri property: The cluster URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the dataIngestionUri property: The cluster data ingestion URI.
     *
     * @return the dataIngestionUri value.
     */
    public String dataIngestionUri() {
        return this.dataIngestionUri;
    }

    /**
     * Get the stateReason property: The reason for the cluster's current state.
     *
     * @return the stateReason value.
     */
    public String stateReason() {
        return this.stateReason;
    }

    /**
     * Get the trustedExternalTenants property: The cluster's external tenants.
     *
     * @return the trustedExternalTenants value.
     */
    public List<TrustedExternalTenant> trustedExternalTenants() {
        return this.trustedExternalTenants;
    }

    /**
     * Set the trustedExternalTenants property: The cluster's external tenants.
     *
     * @param trustedExternalTenants the trustedExternalTenants value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants) {
        this.trustedExternalTenants = trustedExternalTenants;
        return this;
    }

    /**
     * Get the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @return the optimizedAutoscale value.
     */
    public OptimizedAutoscale optimizedAutoscale() {
        return this.optimizedAutoscale;
    }

    /**
     * Set the optimizedAutoscale property: Optimized auto scale definition.
     *
     * @param optimizedAutoscale the optimizedAutoscale value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale) {
        this.optimizedAutoscale = optimizedAutoscale;
        return this;
    }

    /**
     * Get the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are encrypted.
     *
     * @return the enableDiskEncryption value.
     */
    public Boolean enableDiskEncryption() {
        return this.enableDiskEncryption;
    }

    /**
     * Set the enableDiskEncryption property: A boolean value that indicates if the cluster's disks are encrypted.
     *
     * @param enableDiskEncryption the enableDiskEncryption value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEnableDiskEncryption(Boolean enableDiskEncryption) {
        this.enableDiskEncryption = enableDiskEncryption;
        return this;
    }

    /**
     * Get the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @return the enableStreamingIngest value.
     */
    public Boolean enableStreamingIngest() {
        return this.enableStreamingIngest;
    }

    /**
     * Set the enableStreamingIngest property: A boolean value that indicates if the streaming ingest is enabled.
     *
     * @param enableStreamingIngest the enableStreamingIngest value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEnableStreamingIngest(Boolean enableStreamingIngest) {
        this.enableStreamingIngest = enableStreamingIngest;
        return this;
    }

    /**
     * Get the virtualNetworkConfiguration property: Virtual network definition.
     *
     * @return the virtualNetworkConfiguration value.
     */
    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }

    /**
     * Set the virtualNetworkConfiguration property: Virtual network definition.
     *
     * @param virtualNetworkConfiguration the virtualNetworkConfiguration value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration) {
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        return this;
    }

    /**
     * Get the keyVaultProperties property: KeyVault properties for the cluster encryption.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: KeyVault properties for the cluster encryption.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @return the enablePurge value.
     */
    public Boolean enablePurge() {
        return this.enablePurge;
    }

    /**
     * Set the enablePurge property: A boolean value that indicates if the purge operations are enabled.
     *
     * @param enablePurge the enablePurge value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEnablePurge(Boolean enablePurge) {
        this.enablePurge = enablePurge;
        return this;
    }

    /**
     * Get the languageExtensions property: List of the cluster's language extensions.
     *
     * @return the languageExtensions value.
     */
    public LanguageExtensionsList languageExtensions() {
        return this.languageExtensions;
    }

    /**
     * Get the enableDoubleEncryption property: A boolean value that indicates if double encryption is enabled.
     *
     * @return the enableDoubleEncryption value.
     */
    public Boolean enableDoubleEncryption() {
        return this.enableDoubleEncryption;
    }

    /**
     * Set the enableDoubleEncryption property: A boolean value that indicates if double encryption is enabled.
     *
     * @param enableDoubleEncryption the enableDoubleEncryption value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEnableDoubleEncryption(Boolean enableDoubleEncryption) {
        this.enableDoubleEncryption = enableDoubleEncryption;
        return this;
    }

    /**
     * Get the engineType property: The engine type.
     *
     * @return the engineType value.
     */
    public EngineType engineType() {
        return this.engineType;
    }

    /**
     * Set the engineType property: The engine type.
     *
     * @param engineType the engineType value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEngineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model ClusterInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (trustedExternalTenants() != null) {
            trustedExternalTenants().forEach(e -> e.validate());
        }
        if (optimizedAutoscale() != null) {
            optimizedAutoscale().validate();
        }
        if (virtualNetworkConfiguration() != null) {
            virtualNetworkConfiguration().validate();
        }
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
        if (languageExtensions() != null) {
            languageExtensions().validate();
        }
    }
}
