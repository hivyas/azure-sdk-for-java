// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** WebHook activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebHook")
@JsonFlatten
@Fluent
public class WebhookActivity extends ControlActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhookActivity.class);

    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "typeProperties.method", required = true)
    private WebhookActivityMethod method;

    /*
     * WebHook activity target endpoint and path. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * The timeout within which the webhook should be called back. If there is
     * no value specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "typeProperties.timeout")
    private String timeout;

    /*
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.body")
    private Object body;

    /*
     * Authentication method used for calling the endpoint.
     */
    @JsonProperty(value = "typeProperties.authentication")
    private WebActivityAuthentication authentication;

    /*
     * When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by
     * setting statusCode >= 400 in callback request. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.reportStatusOnCallBack")
    private Object reportStatusOnCallBack;

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public WebhookActivityMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withMethod(WebhookActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     *
     * @param url the url value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value.
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     *
     * @return the authentication value.
     */
    public WebActivityAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     *
     * @param authentication the authentication value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the reportStatusOnCallBack value.
     */
    public Object reportStatusOnCallBack() {
        return this.reportStatusOnCallBack;
    }

    /**
     * Set the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param reportStatusOnCallBack the reportStatusOnCallBack value to set.
     * @return the WebhookActivity object itself.
     */
    public WebhookActivity withReportStatusOnCallBack(Object reportStatusOnCallBack) {
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebhookActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebhookActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebhookActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebhookActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (method() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property method in model WebhookActivity"));
        }
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model WebhookActivity"));
        }
        if (authentication() != null) {
            authentication().validate();
        }
    }
}
