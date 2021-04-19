// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.video.analyzer.edge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MotionDetectionSensitivity. */
public final class MotionDetectionSensitivity extends ExpandableStringEnum<MotionDetectionSensitivity> {
    /** Static value low for MotionDetectionSensitivity. */
    public static final MotionDetectionSensitivity LOW = fromString("low");

    /** Static value medium for MotionDetectionSensitivity. */
    public static final MotionDetectionSensitivity MEDIUM = fromString("medium");

    /** Static value high for MotionDetectionSensitivity. */
    public static final MotionDetectionSensitivity HIGH = fromString("high");

    /**
     * Creates or finds a MotionDetectionSensitivity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MotionDetectionSensitivity.
     */
    @JsonCreator
    public static MotionDetectionSensitivity fromString(String name) {
        return fromString(name, MotionDetectionSensitivity.class);
    }

    /** @return known MotionDetectionSensitivity values. */
    public static Collection<MotionDetectionSensitivity> values() {
        return values(MotionDetectionSensitivity.class);
    }
}
