// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.PredictionModelStatusInner;
import com.azure.resourcemanager.customerinsights.fluent.models.PredictionResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.PredictionGradesItem;
import com.azure.resourcemanager.customerinsights.models.PredictionMappings;
import com.azure.resourcemanager.customerinsights.models.PredictionModelStatus;
import com.azure.resourcemanager.customerinsights.models.PredictionResourceFormat;
import com.azure.resourcemanager.customerinsights.models.PredictionSystemGeneratedEntities;
import com.azure.resourcemanager.customerinsights.models.PredictionTrainingResults;
import com.azure.resourcemanager.customerinsights.models.ProvisioningStates;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PredictionResourceFormatImpl
    implements PredictionResourceFormat, PredictionResourceFormat.Definition, PredictionResourceFormat.Update {
    private PredictionResourceFormatInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> description() {
        Map<String, String> inner = this.innerModel().description();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> displayName() {
        Map<String, String> inner = this.innerModel().displayName();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> involvedInteractionTypes() {
        List<String> inner = this.innerModel().involvedInteractionTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> involvedKpiTypes() {
        List<String> inner = this.innerModel().involvedKpiTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> involvedRelationships() {
        List<String> inner = this.innerModel().involvedRelationships();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String negativeOutcomeExpression() {
        return this.innerModel().negativeOutcomeExpression();
    }

    public String positiveOutcomeExpression() {
        return this.innerModel().positiveOutcomeExpression();
    }

    public String primaryProfileType() {
        return this.innerModel().primaryProfileType();
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String predictionName() {
        return this.innerModel().predictionName();
    }

    public String scopeExpression() {
        return this.innerModel().scopeExpression();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Boolean autoAnalyze() {
        return this.innerModel().autoAnalyze();
    }

    public PredictionMappings mappings() {
        return this.innerModel().mappings();
    }

    public String scoreLabel() {
        return this.innerModel().scoreLabel();
    }

    public List<PredictionGradesItem> grades() {
        List<PredictionGradesItem> inner = this.innerModel().grades();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PredictionSystemGeneratedEntities systemGeneratedEntities() {
        return this.innerModel().systemGeneratedEntities();
    }

    public PredictionResourceFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hubName;

    private String predictionName;

    public PredictionResourceFormatImpl withExistingHub(String resourceGroupName, String hubName) {
        this.resourceGroupName = resourceGroupName;
        this.hubName = hubName;
        return this;
    }

    public PredictionResourceFormat create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .createOrUpdate(resourceGroupName, hubName, predictionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PredictionResourceFormat create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .createOrUpdate(resourceGroupName, hubName, predictionName, this.innerModel(), context);
        return this;
    }

    PredictionResourceFormatImpl(
        String name, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = new PredictionResourceFormatInner();
        this.serviceManager = serviceManager;
        this.predictionName = name;
    }

    public PredictionResourceFormatImpl update() {
        return this;
    }

    public PredictionResourceFormat apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .createOrUpdate(resourceGroupName, hubName, predictionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PredictionResourceFormat apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .createOrUpdate(resourceGroupName, hubName, predictionName, this.innerModel(), context);
        return this;
    }

    PredictionResourceFormatImpl(
        PredictionResourceFormatInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hubName = Utils.getValueFromIdByName(innerObject.id(), "hubs");
        this.predictionName = Utils.getValueFromIdByName(innerObject.id(), "predictions");
    }

    public PredictionResourceFormat refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .getWithResponse(resourceGroupName, hubName, predictionName, Context.NONE)
                .getValue();
        return this;
    }

    public PredictionResourceFormat refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPredictions()
                .getWithResponse(resourceGroupName, hubName, predictionName, context)
                .getValue();
        return this;
    }

    public PredictionTrainingResults getTrainingResults() {
        return serviceManager.predictions().getTrainingResults(resourceGroupName, hubName, predictionName);
    }

    public Response<PredictionTrainingResults> getTrainingResultsWithResponse(Context context) {
        return serviceManager
            .predictions()
            .getTrainingResultsWithResponse(resourceGroupName, hubName, predictionName, context);
    }

    public PredictionModelStatus getModelStatus() {
        return serviceManager.predictions().getModelStatus(resourceGroupName, hubName, predictionName);
    }

    public Response<PredictionModelStatus> getModelStatusWithResponse(Context context) {
        return serviceManager
            .predictions()
            .getModelStatusWithResponse(resourceGroupName, hubName, predictionName, context);
    }

    public void modelStatus(PredictionModelStatusInner parameters) {
        serviceManager.predictions().modelStatus(resourceGroupName, hubName, predictionName, parameters);
    }

    public Response<Void> modelStatusWithResponse(PredictionModelStatusInner parameters, Context context) {
        return serviceManager
            .predictions()
            .modelStatusWithResponse(resourceGroupName, hubName, predictionName, parameters, context);
    }

    public PredictionResourceFormatImpl withDescription(Map<String, String> description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public PredictionResourceFormatImpl withDisplayName(Map<String, String> displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public PredictionResourceFormatImpl withInvolvedInteractionTypes(List<String> involvedInteractionTypes) {
        this.innerModel().withInvolvedInteractionTypes(involvedInteractionTypes);
        return this;
    }

    public PredictionResourceFormatImpl withInvolvedKpiTypes(List<String> involvedKpiTypes) {
        this.innerModel().withInvolvedKpiTypes(involvedKpiTypes);
        return this;
    }

    public PredictionResourceFormatImpl withInvolvedRelationships(List<String> involvedRelationships) {
        this.innerModel().withInvolvedRelationships(involvedRelationships);
        return this;
    }

    public PredictionResourceFormatImpl withNegativeOutcomeExpression(String negativeOutcomeExpression) {
        this.innerModel().withNegativeOutcomeExpression(negativeOutcomeExpression);
        return this;
    }

    public PredictionResourceFormatImpl withPositiveOutcomeExpression(String positiveOutcomeExpression) {
        this.innerModel().withPositiveOutcomeExpression(positiveOutcomeExpression);
        return this;
    }

    public PredictionResourceFormatImpl withPrimaryProfileType(String primaryProfileType) {
        this.innerModel().withPrimaryProfileType(primaryProfileType);
        return this;
    }

    public PredictionResourceFormatImpl withPredictionName(String predictionName) {
        this.innerModel().withPredictionName(predictionName);
        return this;
    }

    public PredictionResourceFormatImpl withScopeExpression(String scopeExpression) {
        this.innerModel().withScopeExpression(scopeExpression);
        return this;
    }

    public PredictionResourceFormatImpl withAutoAnalyze(Boolean autoAnalyze) {
        this.innerModel().withAutoAnalyze(autoAnalyze);
        return this;
    }

    public PredictionResourceFormatImpl withMappings(PredictionMappings mappings) {
        this.innerModel().withMappings(mappings);
        return this;
    }

    public PredictionResourceFormatImpl withScoreLabel(String scoreLabel) {
        this.innerModel().withScoreLabel(scoreLabel);
        return this;
    }

    public PredictionResourceFormatImpl withGrades(List<PredictionGradesItem> grades) {
        this.innerModel().withGrades(grades);
        return this;
    }
}
