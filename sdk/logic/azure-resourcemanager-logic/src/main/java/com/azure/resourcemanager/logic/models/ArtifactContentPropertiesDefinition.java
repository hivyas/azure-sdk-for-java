// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The artifact content properties definition. */
@Fluent
public class ArtifactContentPropertiesDefinition extends ArtifactProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArtifactContentPropertiesDefinition.class);

    /*
     * Any object
     */
    @JsonProperty(value = "content")
    private Object content;

    /*
     * The content type.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * The content link.
     */
    @JsonProperty(value = "contentLink")
    private ContentLink contentLink;

    /**
     * Get the content property: Any object.
     *
     * @return the content value.
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content property: Any object.
     *
     * @param content the content value to set.
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Get the contentType property: The content type.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type.
     *
     * @param contentType the contentType value to set.
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLink property: The content link.
     *
     * @return the contentLink value.
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set the contentLink property: The content link.
     *
     * @param contentLink the contentLink value to set.
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ArtifactContentPropertiesDefinition withCreatedTime(OffsetDateTime createdTime) {
        super.withCreatedTime(createdTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ArtifactContentPropertiesDefinition withChangedTime(OffsetDateTime changedTime) {
        super.withChangedTime(changedTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ArtifactContentPropertiesDefinition withMetadata(Object metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (contentLink() != null) {
            contentLink().validate();
        }
    }
}
