// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApiType. */
public final class ApiType extends ExpandableStringEnum<ApiType> {
    /** Static value NotSpecified for ApiType. */
    public static final ApiType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Rest for ApiType. */
    public static final ApiType REST = fromString("Rest");

    /** Static value Soap for ApiType. */
    public static final ApiType SOAP = fromString("Soap");

    /**
     * Creates or finds a ApiType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApiType.
     */
    @JsonCreator
    public static ApiType fromString(String name) {
        return fromString(name, ApiType.class);
    }

    /** @return known ApiType values. */
    public static Collection<ApiType> values() {
        return values(ApiType.class);
    }
}
