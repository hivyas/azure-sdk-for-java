// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A signal gate determines when to block (gate) incoming media, and when to allow it through. It gathers input events
 * over the activationEvaluationWindow, and determines whether to open or close the gate.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SignalGateProcessor")
@Fluent
public final class SignalGateProcessor extends Processor {
    /*
     * The period of time over which the gate gathers input events before
     * evaluating them.
     */
    @JsonProperty(value = "activationEvaluationWindow")
    private String activationEvaluationWindow;

    /*
     * Signal offset once the gate is activated (can be negative). It is an
     * offset between the time the event is received, and the timestamp of the
     * first media sample (eg. video frame) that is allowed through by the
     * gate.
     */
    @JsonProperty(value = "activationSignalOffset")
    private String activationSignalOffset;

    /*
     * The minimum period for which the gate remains open in the absence of
     * subsequent triggers (events).
     */
    @JsonProperty(value = "minimumActivationTime")
    private String minimumActivationTime;

    /*
     * The maximum period for which the gate remains open in the presence of
     * subsequent events.
     */
    @JsonProperty(value = "maximumActivationTime")
    private String maximumActivationTime;

    /**
     * Creates an instance of SignalGateProcessor class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     */
    @JsonCreator
    public SignalGateProcessor(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs) {
        super(name, inputs);
    }

    /**
     * Get the activationEvaluationWindow property: The period of time over which the gate gathers input events before
     * evaluating them.
     *
     * @return the activationEvaluationWindow value.
     */
    public String getActivationEvaluationWindow() {
        return this.activationEvaluationWindow;
    }

    /**
     * Set the activationEvaluationWindow property: The period of time over which the gate gathers input events before
     * evaluating them.
     *
     * @param activationEvaluationWindow the activationEvaluationWindow value to set.
     * @return the SignalGateProcessor object itself.
     */
    public SignalGateProcessor setActivationEvaluationWindow(String activationEvaluationWindow) {
        this.activationEvaluationWindow = activationEvaluationWindow;
        return this;
    }

    /**
     * Get the activationSignalOffset property: Signal offset once the gate is activated (can be negative). It is an
     * offset between the time the event is received, and the timestamp of the first media sample (eg. video frame) that
     * is allowed through by the gate.
     *
     * @return the activationSignalOffset value.
     */
    public String getActivationSignalOffset() {
        return this.activationSignalOffset;
    }

    /**
     * Set the activationSignalOffset property: Signal offset once the gate is activated (can be negative). It is an
     * offset between the time the event is received, and the timestamp of the first media sample (eg. video frame) that
     * is allowed through by the gate.
     *
     * @param activationSignalOffset the activationSignalOffset value to set.
     * @return the SignalGateProcessor object itself.
     */
    public SignalGateProcessor setActivationSignalOffset(String activationSignalOffset) {
        this.activationSignalOffset = activationSignalOffset;
        return this;
    }

    /**
     * Get the minimumActivationTime property: The minimum period for which the gate remains open in the absence of
     * subsequent triggers (events).
     *
     * @return the minimumActivationTime value.
     */
    public String getMinimumActivationTime() {
        return this.minimumActivationTime;
    }

    /**
     * Set the minimumActivationTime property: The minimum period for which the gate remains open in the absence of
     * subsequent triggers (events).
     *
     * @param minimumActivationTime the minimumActivationTime value to set.
     * @return the SignalGateProcessor object itself.
     */
    public SignalGateProcessor setMinimumActivationTime(String minimumActivationTime) {
        this.minimumActivationTime = minimumActivationTime;
        return this;
    }

    /**
     * Get the maximumActivationTime property: The maximum period for which the gate remains open in the presence of
     * subsequent events.
     *
     * @return the maximumActivationTime value.
     */
    public String getMaximumActivationTime() {
        return this.maximumActivationTime;
    }

    /**
     * Set the maximumActivationTime property: The maximum period for which the gate remains open in the presence of
     * subsequent events.
     *
     * @param maximumActivationTime the maximumActivationTime value to set.
     * @return the SignalGateProcessor object itself.
     */
    public SignalGateProcessor setMaximumActivationTime(String maximumActivationTime) {
        this.maximumActivationTime = maximumActivationTime;
        return this;
    }
}
