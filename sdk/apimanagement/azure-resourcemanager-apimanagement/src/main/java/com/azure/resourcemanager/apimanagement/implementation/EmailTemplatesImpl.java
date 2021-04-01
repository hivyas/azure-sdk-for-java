// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.EmailTemplatesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.EmailTemplateContractInner;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateContract;
import com.azure.resourcemanager.apimanagement.models.EmailTemplates;
import com.azure.resourcemanager.apimanagement.models.EmailTemplatesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.EmailTemplatesGetResponse;
import com.azure.resourcemanager.apimanagement.models.TemplateName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EmailTemplatesImpl implements EmailTemplates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EmailTemplatesImpl.class);

    private final EmailTemplatesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public EmailTemplatesImpl(
        EmailTemplatesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EmailTemplateContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<EmailTemplateContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new EmailTemplateContractImpl(inner1, this.manager()));
    }

    public PagedIterable<EmailTemplateContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<EmailTemplateContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new EmailTemplateContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, TemplateName templateName) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, templateName);
    }

    public EmailTemplatesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, templateName, context);
    }

    public EmailTemplateContract get(String resourceGroupName, String serviceName, TemplateName templateName) {
        EmailTemplateContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, templateName);
        if (inner != null) {
            return new EmailTemplateContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EmailTemplateContract> getWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, Context context) {
        EmailTemplatesGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, templateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EmailTemplateContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, TemplateName templateName, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, templateName, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, TemplateName templateName, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, templateName, ifMatch, context);
    }

    public EmailTemplateContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        TemplateName templateName = TemplateName.fromString(Utils.getValueFromIdByName(id, "templates"));
        if (templateName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'templates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, templateName, Context.NONE).getValue();
    }

    public Response<EmailTemplateContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        TemplateName templateName = TemplateName.fromString(Utils.getValueFromIdByName(id, "templates"));
        if (templateName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'templates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, templateName, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        TemplateName templateName = TemplateName.fromString(Utils.getValueFromIdByName(id, "templates"));
        if (templateName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'templates'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, templateName, localIfMatch, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        TemplateName templateName = TemplateName.fromString(Utils.getValueFromIdByName(id, "templates"));
        if (templateName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'templates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, templateName, ifMatch, context);
    }

    private EmailTemplatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public EmailTemplateContractImpl define(TemplateName name) {
        return new EmailTemplateContractImpl(name, this.manager());
    }
}
