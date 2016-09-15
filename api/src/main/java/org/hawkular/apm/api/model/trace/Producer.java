/*
 * Copyright 2015-2016 Red Hat, Inc. and/or its affiliates
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
package org.hawkular.apm.api.model.trace;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;

/**
 * This class represents the situation where the trace flow
 * is communicating with an external participant.
 *
 * @author gbrown
 *
 */
@ApiModel(parent = InteractionNode.class)
public class Producer extends InteractionNode {

    @JsonInclude
    private String endpointType;

    public Producer() {
        super(NodeType.Producer);
    }

    public Producer(String uri, String endpointType) {
        super(NodeType.Producer, uri);
        this.endpointType = endpointType;
    }

    /**
     * @return the endpointType
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * @param endpointType the endpointType to set
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((endpointType == null) ? 0 : endpointType.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Producer other = (Producer) obj;
        if (endpointType == null) {
            if (other.endpointType != null) {
                return false;
            }
        } else if (!endpointType.equals(other.endpointType)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Producer [endpointType=" + endpointType + ", getIn()=" + getIn() + ", getOut()=" + getOut()
                + ", getNodes()=" + getNodes() + ", getType()=" + getType() + ", getUri()=" + getUri()
                + ", getOperation()=" + getOperation() + ", getBaseTime()=" + getBaseTime() + ", getDuration()="
                + getDuration() + ", getFault()=" + getFault() + ", getProperties()=" + getProperties()
                + ", getDetails()=" + getDetails() + ", getCorrelationIds()=" + getCorrelationIds() + ", getIssues()="
                + getIssues() + "]";
    }

}
