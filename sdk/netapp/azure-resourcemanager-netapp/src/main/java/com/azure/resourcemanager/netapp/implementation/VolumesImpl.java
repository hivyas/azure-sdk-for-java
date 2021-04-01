// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.VolumesClient;
import com.azure.resourcemanager.netapp.fluent.models.ReplicationStatusInner;
import com.azure.resourcemanager.netapp.fluent.models.VolumeInner;
import com.azure.resourcemanager.netapp.models.AuthorizeRequest;
import com.azure.resourcemanager.netapp.models.BreakReplicationRequest;
import com.azure.resourcemanager.netapp.models.PoolChangeRequest;
import com.azure.resourcemanager.netapp.models.ReplicationStatus;
import com.azure.resourcemanager.netapp.models.Volume;
import com.azure.resourcemanager.netapp.models.VolumeRevert;
import com.azure.resourcemanager.netapp.models.Volumes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VolumesImpl implements Volumes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumesImpl.class);

    private final VolumesClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public VolumesImpl(VolumesClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Volume> list(String resourceGroupName, String accountName, String poolName) {
        PagedIterable<VolumeInner> inner = this.serviceClient().list(resourceGroupName, accountName, poolName);
        return Utils.mapPage(inner, inner1 -> new VolumeImpl(inner1, this.manager()));
    }

    public PagedIterable<Volume> list(String resourceGroupName, String accountName, String poolName, Context context) {
        PagedIterable<VolumeInner> inner = this.serviceClient().list(resourceGroupName, accountName, poolName, context);
        return Utils.mapPage(inner, inner1 -> new VolumeImpl(inner1, this.manager()));
    }

    public Volume get(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumeInner inner = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName);
        if (inner != null) {
            return new VolumeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Volume> getWithResponse(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        Response<VolumeInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VolumeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName);
    }

    public void delete(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void revert(
        String resourceGroupName, String accountName, String poolName, String volumeName, VolumeRevert body) {
        this.serviceClient().revert(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void revert(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        VolumeRevert body,
        Context context) {
        this.serviceClient().revert(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public void breakReplication(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        BreakReplicationRequest body) {
        this.serviceClient().breakReplication(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void breakReplication(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.serviceClient().breakReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void breakReplication(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        BreakReplicationRequest body,
        Context context) {
        this.serviceClient().breakReplication(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public ReplicationStatus replicationStatus(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        ReplicationStatusInner inner =
            this.serviceClient().replicationStatus(resourceGroupName, accountName, poolName, volumeName);
        if (inner != null) {
            return new ReplicationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReplicationStatus> replicationStatusWithResponse(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        Response<ReplicationStatusInner> inner =
            this
                .serviceClient()
                .replicationStatusWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReplicationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void resyncReplication(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.serviceClient().resyncReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void resyncReplication(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        this.serviceClient().resyncReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void deleteReplication(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.serviceClient().deleteReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void deleteReplication(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        this.serviceClient().deleteReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void authorizeReplication(
        String resourceGroupName, String accountName, String poolName, String volumeName, AuthorizeRequest body) {
        this.serviceClient().authorizeReplication(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void authorizeReplication(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        AuthorizeRequest body,
        Context context) {
        this.serviceClient().authorizeReplication(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public void reInitializeReplication(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.serviceClient().reInitializeReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void reInitializeReplication(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        this.serviceClient().reInitializeReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void poolChange(
        String resourceGroupName, String accountName, String poolName, String volumeName, PoolChangeRequest body) {
        this.serviceClient().poolChange(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void poolChange(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        PoolChangeRequest body,
        Context context) {
        this.serviceClient().poolChange(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public Volume getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, Context.NONE).getValue();
    }

    public Response<Volume> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, context);
    }

    private VolumesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public VolumeImpl define(String name) {
        return new VolumeImpl(name, this.manager());
    }
}
