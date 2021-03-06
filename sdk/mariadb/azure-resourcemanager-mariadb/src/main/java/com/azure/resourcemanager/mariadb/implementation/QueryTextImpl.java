// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.fluent.models.QueryTextInner;
import com.azure.resourcemanager.mariadb.models.QueryText;

public final class QueryTextImpl implements QueryText {
    private QueryTextInner innerObject;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    QueryTextImpl(QueryTextInner innerObject, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String queryId() {
        return this.innerModel().queryId();
    }

    public String queryText() {
        return this.innerModel().queryText();
    }

    public QueryTextInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}
