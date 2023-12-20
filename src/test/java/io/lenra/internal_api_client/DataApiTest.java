/*
 * Lenra server internal API
 * The API usable by the Lenra applications
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lenra.internal_api_client;

import io.lenra.ApiException;
import org.openapitools.client.model.DataDocument;
import org.openapitools.client.model.FindDocumentsRequest;
import org.openapitools.client.model.UpdateManyDocumentsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataApi
 */
@Disabled
public class DataApiTest {

    private final DataApi api = new DataApi();

    /**
     * Aborts a transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void abortTransactionTest() throws ApiException {
        api.abortTransaction();
        // TODO: test validations
    }

    /**
     * Commits a transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commitTransactionTest() throws ApiException {
        api.commitTransaction();
        // TODO: test validations
    }

    /**
     * Creates a document in database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDocumentTest() throws ApiException {
        String coll = null;
        Object body = null;
        Map<String, Object> response = api.createDocument(coll, body);
        // TODO: test validations
    }

    /**
     * Creates a transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTransactionTest() throws ApiException {
        String response = api.createTransaction();
        // TODO: test validations
    }

    /**
     * Deletes a collection from database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String coll = null;
        api.deleteCollection(coll);
        // TODO: test validations
    }

    /**
     * Deletes a document from database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDocumentByIdTest() throws ApiException {
        String coll = null;
        String id = null;
        Map<String, Object> response = api.deleteDocumentById(coll, id);
        // TODO: test validations
    }

    /**
     * Finds documents in database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findDocumentsTest() throws ApiException {
        String coll = null;
        FindDocumentsRequest findDocumentsRequest = null;
        Map<String, Object> response = api.findDocuments(coll, findDocumentsRequest);
        // TODO: test validations
    }

    /**
     * Gets a document from database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentByIdTest() throws ApiException {
        String coll = null;
        String id = null;
        Map<String, Object> response = api.getDocumentById(coll, id);
        // TODO: test validations
    }

    /**
     * Gets documents from database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentsTest() throws ApiException {
        String coll = null;
        List<Map<String, Object>> response = api.getDocuments(coll);
        // TODO: test validations
    }

    /**
     * Updates a document in database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDocumentByIdTest() throws ApiException {
        String coll = null;
        String id = null;
        DataDocument dataDocument = null;
        Map<String, Object> response = api.updateDocumentById(coll, id, dataDocument);
        // TODO: test validations
    }

    /**
     * Updates many documents in database
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateManyDocumentsTest() throws ApiException {
        String coll = null;
        UpdateManyDocumentsRequest updateManyDocumentsRequest = null;
        Object response = api.updateManyDocuments(coll, updateManyDocumentsRequest);
        // TODO: test validations
    }

}
