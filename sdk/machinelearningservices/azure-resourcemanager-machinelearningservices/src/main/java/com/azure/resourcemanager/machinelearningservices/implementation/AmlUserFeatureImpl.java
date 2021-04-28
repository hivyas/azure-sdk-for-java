// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.AmlUserFeatureInner;
import com.azure.resourcemanager.machinelearningservices.models.AmlUserFeature;

public final class AmlUserFeatureImpl implements AmlUserFeature {
    private AmlUserFeatureInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    AmlUserFeatureImpl(
        AmlUserFeatureInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public AmlUserFeatureInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
