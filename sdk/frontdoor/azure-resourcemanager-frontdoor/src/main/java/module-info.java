// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.frontdoor {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.frontdoor;
    exports com.azure.resourcemanager.frontdoor.fluent;
    exports com.azure.resourcemanager.frontdoor.fluent.models;
    exports com.azure.resourcemanager.frontdoor.models;

    opens com.azure.resourcemanager.frontdoor.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.frontdoor.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
