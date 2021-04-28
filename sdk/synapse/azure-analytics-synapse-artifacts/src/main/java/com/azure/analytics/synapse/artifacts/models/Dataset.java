// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Azure Data Factory nested object which identifies data within different data stores, such as tables, files,
 * folders, and documents.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = Dataset.class)
@JsonTypeName("Dataset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AmazonS3Object", value = AmazonS3Dataset.class),
    @JsonSubTypes.Type(name = "Avro", value = AvroDataset.class),
    @JsonSubTypes.Type(name = "Excel", value = ExcelDataset.class),
    @JsonSubTypes.Type(name = "Parquet", value = ParquetDataset.class),
    @JsonSubTypes.Type(name = "DelimitedText", value = DelimitedTextDataset.class),
    @JsonSubTypes.Type(name = "Json", value = JsonDataset.class),
    @JsonSubTypes.Type(name = "Xml", value = XmlDataset.class),
    @JsonSubTypes.Type(name = "Orc", value = OrcDataset.class),
    @JsonSubTypes.Type(name = "Binary", value = BinaryDataset.class),
    @JsonSubTypes.Type(name = "AzureBlob", value = AzureBlobDataset.class),
    @JsonSubTypes.Type(name = "AzureTable", value = AzureTableDataset.class),
    @JsonSubTypes.Type(name = "AzureSqlTable", value = AzureSqlTableDataset.class),
    @JsonSubTypes.Type(name = "AzureSqlMITable", value = AzureSqlMITableDataset.class),
    @JsonSubTypes.Type(name = "AzureSqlDWTable", value = AzureSqlDWTableDataset.class),
    @JsonSubTypes.Type(name = "CassandraTable", value = CassandraTableDataset.class),
    @JsonSubTypes.Type(name = "CustomDataset", value = CustomDataset.class),
    @JsonSubTypes.Type(name = "CosmosDbSqlApiCollection", value = CosmosDbSqlApiCollectionDataset.class),
    @JsonSubTypes.Type(name = "DocumentDbCollection", value = DocumentDbCollectionDataset.class),
    @JsonSubTypes.Type(name = "DynamicsEntity", value = DynamicsEntityDataset.class),
    @JsonSubTypes.Type(name = "DynamicsCrmEntity", value = DynamicsCrmEntityDataset.class),
    @JsonSubTypes.Type(name = "CommonDataServiceForAppsEntity", value = CommonDataServiceForAppsEntityDataset.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreFile", value = AzureDataLakeStoreDataset.class),
    @JsonSubTypes.Type(name = "AzureBlobFSFile", value = AzureBlobFSDataset.class),
    @JsonSubTypes.Type(name = "Office365Table", value = Office365Dataset.class),
    @JsonSubTypes.Type(name = "FileShare", value = FileShareDataset.class),
    @JsonSubTypes.Type(name = "MongoDbCollection", value = MongoDbCollectionDataset.class),
    @JsonSubTypes.Type(name = "MongoDbAtlasCollection", value = MongoDbAtlasCollectionDataset.class),
    @JsonSubTypes.Type(name = "MongoDbV2Collection", value = MongoDbV2CollectionDataset.class),
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApiCollection", value = CosmosDbMongoDbApiCollectionDataset.class),
    @JsonSubTypes.Type(name = "ODataResource", value = ODataResourceDataset.class),
    @JsonSubTypes.Type(name = "OracleTable", value = OracleTableDataset.class),
    @JsonSubTypes.Type(name = "TeradataTable", value = TeradataTableDataset.class),
    @JsonSubTypes.Type(name = "AzureMySqlTable", value = AzureMySqlTableDataset.class),
    @JsonSubTypes.Type(name = "AmazonRedshiftTable", value = AmazonRedshiftTableDataset.class),
    @JsonSubTypes.Type(name = "Db2Table", value = Db2TableDataset.class),
    @JsonSubTypes.Type(name = "RelationalTable", value = RelationalTableDataset.class),
    @JsonSubTypes.Type(name = "InformixTable", value = InformixTableDataset.class),
    @JsonSubTypes.Type(name = "OdbcTable", value = OdbcTableDataset.class),
    @JsonSubTypes.Type(name = "MySqlTable", value = MySqlTableDataset.class),
    @JsonSubTypes.Type(name = "PostgreSqlTable", value = PostgreSqlTableDataset.class),
    @JsonSubTypes.Type(name = "MicrosoftAccessTable", value = MicrosoftAccessTableDataset.class),
    @JsonSubTypes.Type(name = "SalesforceObject", value = SalesforceObjectDataset.class),
    @JsonSubTypes.Type(name = "SalesforceServiceCloudObject", value = SalesforceServiceCloudObjectDataset.class),
    @JsonSubTypes.Type(name = "SybaseTable", value = SybaseTableDataset.class),
    @JsonSubTypes.Type(name = "SapBwCube", value = SapBwCubeDataset.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerResource", value = SapCloudForCustomerResourceDataset.class),
    @JsonSubTypes.Type(name = "SapEccResource", value = SapEccResourceDataset.class),
    @JsonSubTypes.Type(name = "SapHanaTable", value = SapHanaTableDataset.class),
    @JsonSubTypes.Type(name = "SapOpenHubTable", value = SapOpenHubTableDataset.class),
    @JsonSubTypes.Type(name = "SqlServerTable", value = SqlServerTableDataset.class),
    @JsonSubTypes.Type(name = "RestResource", value = RestResourceDataset.class),
    @JsonSubTypes.Type(name = "SapTableResource", value = SapTableResourceDataset.class),
    @JsonSubTypes.Type(name = "WebTable", value = WebTableDataset.class),
    @JsonSubTypes.Type(name = "AzureSearchIndex", value = AzureSearchIndexDataset.class),
    @JsonSubTypes.Type(name = "HttpFile", value = HttpDataset.class),
    @JsonSubTypes.Type(name = "AmazonMWSObject", value = AmazonMWSObjectDataset.class),
    @JsonSubTypes.Type(name = "AzurePostgreSqlTable", value = AzurePostgreSqlTableDataset.class),
    @JsonSubTypes.Type(name = "ConcurObject", value = ConcurObjectDataset.class),
    @JsonSubTypes.Type(name = "CouchbaseTable", value = CouchbaseTableDataset.class),
    @JsonSubTypes.Type(name = "DrillTable", value = DrillTableDataset.class),
    @JsonSubTypes.Type(name = "EloquaObject", value = EloquaObjectDataset.class),
    @JsonSubTypes.Type(name = "GoogleBigQueryObject", value = GoogleBigQueryObjectDataset.class),
    @JsonSubTypes.Type(name = "GreenplumTable", value = GreenplumTableDataset.class),
    @JsonSubTypes.Type(name = "HBaseObject", value = HBaseObjectDataset.class),
    @JsonSubTypes.Type(name = "HiveObject", value = HiveObjectDataset.class),
    @JsonSubTypes.Type(name = "HubspotObject", value = HubspotObjectDataset.class),
    @JsonSubTypes.Type(name = "ImpalaObject", value = ImpalaObjectDataset.class),
    @JsonSubTypes.Type(name = "JiraObject", value = JiraObjectDataset.class),
    @JsonSubTypes.Type(name = "MagentoObject", value = MagentoObjectDataset.class),
    @JsonSubTypes.Type(name = "MariaDBTable", value = MariaDBTableDataset.class),
    @JsonSubTypes.Type(name = "AzureMariaDBTable", value = AzureMariaDBTableDataset.class),
    @JsonSubTypes.Type(name = "MarketoObject", value = MarketoObjectDataset.class),
    @JsonSubTypes.Type(name = "PaypalObject", value = PaypalObjectDataset.class),
    @JsonSubTypes.Type(name = "PhoenixObject", value = PhoenixObjectDataset.class),
    @JsonSubTypes.Type(name = "PrestoObject", value = PrestoObjectDataset.class),
    @JsonSubTypes.Type(name = "QuickBooksObject", value = QuickBooksObjectDataset.class),
    @JsonSubTypes.Type(name = "ServiceNowObject", value = ServiceNowObjectDataset.class),
    @JsonSubTypes.Type(name = "ShopifyObject", value = ShopifyObjectDataset.class),
    @JsonSubTypes.Type(name = "SparkObject", value = SparkObjectDataset.class),
    @JsonSubTypes.Type(name = "SquareObject", value = SquareObjectDataset.class),
    @JsonSubTypes.Type(name = "XeroObject", value = XeroObjectDataset.class),
    @JsonSubTypes.Type(name = "ZohoObject", value = ZohoObjectDataset.class),
    @JsonSubTypes.Type(name = "NetezzaTable", value = NetezzaTableDataset.class),
    @JsonSubTypes.Type(name = "VerticaTable", value = VerticaTableDataset.class),
    @JsonSubTypes.Type(name = "SalesforceMarketingCloudObject", value = SalesforceMarketingCloudObjectDataset.class),
    @JsonSubTypes.Type(name = "ResponsysObject", value = ResponsysObjectDataset.class),
    @JsonSubTypes.Type(name = "DynamicsAXResource", value = DynamicsAXResourceDataset.class),
    @JsonSubTypes.Type(name = "OracleServiceCloudObject", value = OracleServiceCloudObjectDataset.class),
    @JsonSubTypes.Type(name = "AzureDataExplorerTable", value = AzureDataExplorerTableDataset.class),
    @JsonSubTypes.Type(name = "GoogleAdWordsObject", value = GoogleAdWordsObjectDataset.class),
    @JsonSubTypes.Type(name = "SnowflakeTable", value = SnowflakeDataset.class),
    @JsonSubTypes.Type(name = "SharePointOnlineListResource", value = SharePointOnlineListResourceDataset.class),
    @JsonSubTypes.Type(name = "AzureDatabricksDeltaLakeDataset", value = AzureDatabricksDeltaLakeDataset.class)
})
@Fluent
public class Dataset {
    /*
     * Dataset description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Columns that define the structure of the dataset. Type: array (or
     * Expression with resultType array), itemType: DatasetDataElement.
     */
    @JsonProperty(value = "structure")
    private Object structure;

    /*
     * Columns that define the physical type schema of the dataset. Type: array
     * (or Expression with resultType array), itemType:
     * DatasetSchemaDataElement.
     */
    @JsonProperty(value = "schema")
    private Object schema;

    /*
     * Linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * Parameters for dataset.
     */
    @JsonProperty(value = "parameters")
    private Map<String, ParameterSpecification> parameters;

    /*
     * List of tags that can be used for describing the Dataset.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /*
     * The folder that this Dataset is in. If not specified, Dataset will
     * appear at the root level.
     */
    @JsonProperty(value = "folder")
    private DatasetFolder folder;

    /*
     * The Azure Data Factory nested object which identifies data within
     * different data stores, such as tables, files, folders, and documents.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: Dataset description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Dataset description.
     *
     * @param description the description value to set.
     * @return the Dataset object itself.
     */
    public Dataset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the structure property: Columns that define the structure of the dataset. Type: array (or Expression with
     * resultType array), itemType: DatasetDataElement.
     *
     * @return the structure value.
     */
    public Object getStructure() {
        return this.structure;
    }

    /**
     * Set the structure property: Columns that define the structure of the dataset. Type: array (or Expression with
     * resultType array), itemType: DatasetDataElement.
     *
     * @param structure the structure value to set.
     * @return the Dataset object itself.
     */
    public Dataset setStructure(Object structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Get the schema property: Columns that define the physical type schema of the dataset. Type: array (or Expression
     * with resultType array), itemType: DatasetSchemaDataElement.
     *
     * @return the schema value.
     */
    public Object getSchema() {
        return this.schema;
    }

    /**
     * Set the schema property: Columns that define the physical type schema of the dataset. Type: array (or Expression
     * with resultType array), itemType: DatasetSchemaDataElement.
     *
     * @param schema the schema value to set.
     * @return the Dataset object itself.
     */
    public Dataset setSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the linkedServiceName property: Linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the Dataset object itself.
     */
    public Dataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the parameters property: Parameters for dataset.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterSpecification> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for dataset.
     *
     * @param parameters the parameters value to set.
     * @return the Dataset object itself.
     */
    public Dataset setParameters(Map<String, ParameterSpecification> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the Dataset.
     *
     * @return the annotations value.
     */
    public List<Object> getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the Dataset.
     *
     * @param annotations the annotations value to set.
     * @return the Dataset object itself.
     */
    public Dataset setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the folder property: The folder that this Dataset is in. If not specified, Dataset will appear at the root
     * level.
     *
     * @return the folder value.
     */
    public DatasetFolder getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this Dataset is in. If not specified, Dataset will appear at the root
     * level.
     *
     * @param folder the folder value to set.
     * @return the Dataset object itself.
     */
    public Dataset setFolder(DatasetFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the additionalProperties property: The Azure Data Factory nested object which identifies data within
     * different data stores, such as tables, files, folders, and documents.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The Azure Data Factory nested object which identifies data within
     * different data stores, such as tables, files, folders, and documents.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Dataset object itself.
     */
    public Dataset setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
