// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * This activity evaluates a boolean expression and executes either the activities under the ifTrueActivities property
 * or the ifFalseActivities property depending on the result of the expression.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("IfCondition")
@JsonFlatten
@Fluent
public class IfConditionActivity extends ControlActivity {
    /*
     * An expression that would evaluate to Boolean. This is used to determine
     * the block of activities (ifTrueActivities or ifFalseActivities) that
     * will be executed.
     */
    @JsonProperty(value = "typeProperties.expression", required = true)
    private Expression expression;

    /*
     * List of activities to execute if expression is evaluated to true. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifTrueActivities")
    private List<Activity> ifTrueActivities;

    /*
     * List of activities to execute if expression is evaluated to false. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifFalseActivities")
    private List<Activity> ifFalseActivities;

    /**
     * Get the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @return the expression value.
     */
    public Expression getExpression() {
        return this.expression;
    }

    /**
     * Set the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @param expression the expression value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity setExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifTrueActivities value.
     */
    public List<Activity> getIfTrueActivities() {
        return this.ifTrueActivities;
    }

    /**
     * Set the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @param ifTrueActivities the ifTrueActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity setIfTrueActivities(List<Activity> ifTrueActivities) {
        this.ifTrueActivities = ifTrueActivities;
        return this;
    }

    /**
     * Get the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifFalseActivities value.
     */
    public List<Activity> getIfFalseActivities() {
        return this.ifFalseActivities;
    }

    /**
     * Set the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     *
     * @param ifFalseActivities the ifFalseActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity setIfFalseActivities(List<Activity> ifFalseActivities) {
        this.ifFalseActivities = ifFalseActivities;
        return this;
    }
}
