// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devspaces.fluent.ControllersClient;
import com.azure.resourcemanager.devspaces.fluent.models.ControllerConnectionDetailsListInner;
import com.azure.resourcemanager.devspaces.fluent.models.ControllerInner;
import com.azure.resourcemanager.devspaces.models.Controller;
import com.azure.resourcemanager.devspaces.models.ControllerConnectionDetailsList;
import com.azure.resourcemanager.devspaces.models.Controllers;
import com.azure.resourcemanager.devspaces.models.ListConnectionDetailsParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ControllersImpl implements Controllers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ControllersImpl.class);

    private final ControllersClient innerClient;

    private final com.azure.resourcemanager.devspaces.DevSpacesManager serviceManager;

    public ControllersImpl(
        ControllersClient innerClient, com.azure.resourcemanager.devspaces.DevSpacesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Controller getByResourceGroup(String resourceGroupName, String name) {
        ControllerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new ControllerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Controller> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context) {
        Response<ControllerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ControllerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public void delete(String resourceGroupName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, name, context);
    }

    public PagedIterable<Controller> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ControllerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ControllerImpl(inner1, this.manager()));
    }

    public PagedIterable<Controller> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ControllerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ControllerImpl(inner1, this.manager()));
    }

    public PagedIterable<Controller> list() {
        PagedIterable<ControllerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ControllerImpl(inner1, this.manager()));
    }

    public PagedIterable<Controller> list(Context context) {
        PagedIterable<ControllerInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ControllerImpl(inner1, this.manager()));
    }

    public ControllerConnectionDetailsList listConnectionDetails(
        String resourceGroupName, String name, ListConnectionDetailsParameters listConnectionDetailsParameters) {
        ControllerConnectionDetailsListInner inner =
            this.serviceClient().listConnectionDetails(resourceGroupName, name, listConnectionDetailsParameters);
        if (inner != null) {
            return new ControllerConnectionDetailsListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ControllerConnectionDetailsList> listConnectionDetailsWithResponse(
        String resourceGroupName,
        String name,
        ListConnectionDetailsParameters listConnectionDetailsParameters,
        Context context) {
        Response<ControllerConnectionDetailsListInner> inner =
            this
                .serviceClient()
                .listConnectionDetailsWithResponse(resourceGroupName, name, listConnectionDetailsParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ControllerConnectionDetailsListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Controller getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "controllers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'controllers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<Controller> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "controllers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'controllers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
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
        String name = Utils.getValueFromIdByName(id, "controllers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'controllers'.", id)));
        }
        this.delete(resourceGroupName, name, Context.NONE);
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
        String name = Utils.getValueFromIdByName(id, "controllers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'controllers'.", id)));
        }
        this.delete(resourceGroupName, name, context);
    }

    private ControllersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devspaces.DevSpacesManager manager() {
        return this.serviceManager;
    }

    public ControllerImpl define(String name) {
        return new ControllerImpl(name, this.manager());
    }
}
