/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.btm.processor.btxn.builder;

import java.util.List;

import org.hawkular.btm.api.model.trace.BusinessTransactionTrace;

/**
 * @author gbrown
 */
public interface BTxnTraceScheduler {

    /**
     * This method requests that a list of business transaction traces
     * should be scheduled for resolution at a particular time interval.
     *
     * @param tenantId The tenant
     * @param traces The list of traces
     * @param timeValue The time interval
     */
    void schedule(String tenantId, List<BusinessTransactionTrace> traces, long timeValue);

}