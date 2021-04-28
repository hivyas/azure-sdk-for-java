// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hanaonazure.fluent.models.HanaInstanceInner;
import com.azure.resourcemanager.hanaonazure.models.Tags;

/** An instance of this class provides access to all the operations defined in HanaInstancesClient. */
public interface HanaInstancesClient {
    /**
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of
     * each SAP HANA on Azure instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HanaInstanceInner> list();

    /**
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of
     * each SAP HANA on Azure instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HanaInstanceInner> list(Context context);

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns
     * various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription and the resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HanaInstanceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns
     * various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription and the resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HanaInstanceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HanaInstanceInner getByResourceGroup(String resourceGroupName, String hanaInstanceName);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HanaInstanceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * Creates a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param hanaInstanceParameter Request body representing a HanaInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<HanaInstanceInner>, HanaInstanceInner> beginCreate(
        String resourceGroupName, String hanaInstanceName, HanaInstanceInner hanaInstanceParameter);

    /**
     * Creates a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param hanaInstanceParameter Request body representing a HanaInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<HanaInstanceInner>, HanaInstanceInner> beginCreate(
        String resourceGroupName, String hanaInstanceName, HanaInstanceInner hanaInstanceParameter, Context context);

    /**
     * Creates a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param hanaInstanceParameter Request body representing a HanaInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HanaInstanceInner create(
        String resourceGroupName, String hanaInstanceName, HanaInstanceInner hanaInstanceParameter);

    /**
     * Creates a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param hanaInstanceParameter Request body representing a HanaInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HanaInstanceInner create(
        String resourceGroupName, String hanaInstanceName, HanaInstanceInner hanaInstanceParameter, Context context);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hanaInstanceName);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hanaInstanceName);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * Patches the Tags field of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param tagsParameter Request body that only contains the new Tags field.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HanaInstanceInner update(String resourceGroupName, String hanaInstanceName, Tags tagsParameter);

    /**
     * Patches the Tags field of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param tagsParameter Request body that only contains the new Tags field.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hANA instance info on Azure (ARM properties and HANA properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HanaInstanceInner> updateWithResponse(
        String resourceGroupName, String hanaInstanceName, Tags tagsParameter, Context context);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginShutdown(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginShutdown(
        String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void shutdown(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void shutdown(String resourceGroupName, String hanaInstanceName, Context context);
}
