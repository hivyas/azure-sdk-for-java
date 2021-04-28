// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.fluent.models.QueryPerformanceInsightResetDataResultInner;
import com.azure.resourcemanager.mariadb.models.QueryPerformanceInsightResetDataResult;
import com.azure.resourcemanager.mariadb.models.QueryPerformanceInsightResetDataResultState;

public final class QueryPerformanceInsightResetDataResultImpl implements QueryPerformanceInsightResetDataResult {
    private QueryPerformanceInsightResetDataResultInner innerObject;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    QueryPerformanceInsightResetDataResultImpl(
        QueryPerformanceInsightResetDataResultInner innerObject,
        com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public QueryPerformanceInsightResetDataResultState status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public QueryPerformanceInsightResetDataResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}
