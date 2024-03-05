# DataApi

All URIs are relative to *http://localhost:4001*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abortTransaction**](DataApi.md#abortTransaction) | **POST** /app-api/v1/data/transaction/abort | Aborts a transaction |
| [**commitTransaction**](DataApi.md#commitTransaction) | **POST** /app-api/v1/data/transaction/commit | Commits a transaction |
| [**createDocument**](DataApi.md#createDocument) | **POST** /app-api/v1/data/colls/{coll}/docs | Creates one document in database |
| [**createTransaction**](DataApi.md#createTransaction) | **POST** /app-api/v1/data/transaction | Creates a transaction |
| [**deleteCollection**](DataApi.md#deleteCollection) | **DELETE** /app-api/v1-api/v1/data/colls/{coll} | Deletes a collection from database |
| [**deleteDocumentById**](DataApi.md#deleteDocumentById) | **DELETE** /app-api/v1/data/colls/{coll}/docs/{id} | Deletes a document from database |
| [**findDocuments**](DataApi.md#findDocuments) | **POST** /app-api/v1/data/colls/{coll}/find | Finds documents in database |
| [**getDocumentById**](DataApi.md#getDocumentById) | **GET** /app-api/v1/data/colls/{coll}/docs/{id} | Gets a document from database |
| [**getDocuments**](DataApi.md#getDocuments) | **GET** /app-api/v1/data/colls/{coll}/docs | Gets documents from database |
| [**insertManyDocuments**](DataApi.md#insertManyDocuments) | **POST** /app-api/v1/data/colls/{coll}/insertMany | Inserts many documents in database |
| [**updateDocumentById**](DataApi.md#updateDocumentById) | **PUT** /app-api/v1/data/colls/{coll}/docs/{id} | Updates a document in database |
| [**updateManyDocuments**](DataApi.md#updateManyDocuments) | **POST** /app-api/v1/data/colls/{coll}/updateMany | Updates many documents in database |


<a id="abortTransaction"></a>
# **abortTransaction**
> abortTransaction()

Aborts a transaction

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      apiInstance.abortTransaction();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#abortTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction aborted |  -  |

<a id="commitTransaction"></a>
# **commitTransaction**
> commitTransaction()

Commits a transaction

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      apiInstance.commitTransaction();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#commitTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction commited |  -  |

<a id="createDocument"></a>
# **createDocument**
> Map&lt;String, Object&gt; createDocument(coll, body)

Creates one document in database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    Object body = null; // Object | The document to create
    try {
      Map<String, Object> result = apiInstance.createDocument(coll, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#createDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **body** | **Object**| The document to create | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document created |  -  |

<a id="createTransaction"></a>
# **createTransaction**
> String createTransaction()

Creates a transaction

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      String result = apiInstance.createTransaction();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#createTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction created |  -  |

<a id="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(coll)

Deletes a collection from database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    try {
      apiInstance.deleteCollection(coll);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#deleteCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection deleted |  -  |

<a id="deleteDocumentById"></a>
# **deleteDocumentById**
> Map&lt;String, Object&gt; deleteDocumentById(coll, id)

Deletes a document from database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    String id = "id_example"; // String | The document identifier
    try {
      Map<String, Object> result = apiInstance.deleteDocumentById(coll, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#deleteDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **id** | **String**| The document identifier | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document deleted |  -  |

<a id="findDocuments"></a>
# **findDocuments**
> List&lt;Map&lt;String, Object&gt;&gt; findDocuments(coll, findDocumentsRequest)

Finds documents in database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    FindDocumentsRequest findDocumentsRequest = new FindDocumentsRequest(); // FindDocumentsRequest | The query to find documents
    try {
      List<Map<String, Object>> result = apiInstance.findDocuments(coll, findDocumentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#findDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **findDocumentsRequest** | [**FindDocumentsRequest**](FindDocumentsRequest.md)| The query to find documents | |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Documents found |  -  |

<a id="getDocumentById"></a>
# **getDocumentById**
> Map&lt;String, Object&gt; getDocumentById(coll, id)

Gets a document from database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    String id = "id_example"; // String | The document identifier
    try {
      Map<String, Object> result = apiInstance.getDocumentById(coll, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **id** | **String**| The document identifier | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document created |  -  |

<a id="getDocuments"></a>
# **getDocuments**
> List&lt;Map&lt;String, Object&gt;&gt; getDocuments(coll)

Gets documents from database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    try {
      List<Map<String, Object>> result = apiInstance.getDocuments(coll);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Documents found |  -  |

<a id="insertManyDocuments"></a>
# **insertManyDocuments**
> InsertManyDocuments200Response insertManyDocuments(coll, insertManyDocumentsRequest)

Inserts many documents in database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The documents collection name
    InsertManyDocumentsRequest insertManyDocumentsRequest = new InsertManyDocumentsRequest(); // InsertManyDocumentsRequest | The documents to create
    try {
      InsertManyDocuments200Response result = apiInstance.insertManyDocuments(coll, insertManyDocumentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#insertManyDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The documents collection name | |
| **insertManyDocumentsRequest** | [**InsertManyDocumentsRequest**](InsertManyDocumentsRequest.md)| The documents to create | |

### Return type

[**InsertManyDocuments200Response**](InsertManyDocuments200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Documents inserted |  -  |

<a id="updateDocumentById"></a>
# **updateDocumentById**
> Map&lt;String, Object&gt; updateDocumentById(coll, id, requestBody)

Updates a document in database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    String id = "id_example"; // String | The document identifier
    Map<String, Object> requestBody = null; // Map<String, Object> | The document to update
    try {
      Map<String, Object> result = apiInstance.updateDocumentById(coll, id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#updateDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **id** | **String**| The document identifier | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The document to update | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document updated |  -  |

<a id="updateManyDocuments"></a>
# **updateManyDocuments**
> Object updateManyDocuments(coll, updateManyDocumentsRequest)

Updates many documents in database

### Example
```java
// Import classes:
import io.lenra.api.internal.ApiClient;
import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.Configuration;
import io.lenra.api.internal.auth.*;
import io.lenra.api.internal.models.*;
import io.lenra.api.internal.client.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:4001");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String coll = "coll_example"; // String | The document collection name
    UpdateManyDocumentsRequest updateManyDocumentsRequest = new UpdateManyDocumentsRequest(); // UpdateManyDocumentsRequest | The query to find documents
    try {
      Object result = apiInstance.updateManyDocuments(coll, updateManyDocumentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#updateManyDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coll** | **String**| The document collection name | |
| **updateManyDocumentsRequest** | [**UpdateManyDocumentsRequest**](UpdateManyDocumentsRequest.md)| The query to find documents | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Documents updated |  -  |

