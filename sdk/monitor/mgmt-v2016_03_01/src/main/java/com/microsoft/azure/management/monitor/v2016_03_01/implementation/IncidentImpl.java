/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01.implementation;

import com.microsoft.azure.management.monitor.v2016_03_01.Incident;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class IncidentImpl extends WrapperImpl<IncidentInner> implements Incident {
    private final MonitorManager manager;
    private String resourceGroupName;
    private String ruleName;
    private String incidentName;

    IncidentImpl(IncidentInner inner,  MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }



    @Override
    public DateTime activatedTime() {
        return this.inner().activatedTime();
    }

    @Override
    public Boolean isActive() {
        return this.inner().isActive();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime resolvedTime() {
        return this.inner().resolvedTime();
    }

    @Override
    public String ruleName() {
        return this.inner().ruleName();
    }

}
