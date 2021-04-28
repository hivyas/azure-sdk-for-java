// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.billing.fluent.models.InvoiceSectionInner;

/** An instance of this class provides access to all the operations defined in InvoiceSectionsClient. */
public interface InvoiceSectionsClient {
    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoice sections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InvoiceSectionInner> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoice sections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InvoiceSectionInner> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context);

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section by its ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InvoiceSectionInner get(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section by its ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InvoiceSectionInner> getWithResponse(
        String billingAccountName, String billingProfileName, String invoiceSectionName, Context context);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InvoiceSectionInner>, InvoiceSectionInner> beginCreateOrUpdate(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        InvoiceSectionInner parameters);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InvoiceSectionInner>, InvoiceSectionInner> beginCreateOrUpdate(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        InvoiceSectionInner parameters,
        Context context);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InvoiceSectionInner createOrUpdate(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        InvoiceSectionInner parameters);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InvoiceSectionInner createOrUpdate(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        InvoiceSectionInner parameters,
        Context context);
}
