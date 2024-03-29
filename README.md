# lenra-internal-api-client

Lenra server internal API
- API version: 0.0.0
  - Build date: 2023-12-20T13:30:58.062007Z[Etc/UTC]

The API usable by the Lenra applications

For more information, please visit [https://www.lenra.io/contact.html](https://www.lenra.io/contact.html)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.lenra</groupId>
  <artifactId>lenra-internal-api-client</artifactId>
  <version>0.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'lenra-internal-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'lenra-internal-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "io.lenra:lenra-internal-api-client:0.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lenra-internal-api-client-0.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:4001*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataApi* | [**abortTransaction**](docs/DataApi.md#abortTransaction) | **POST** /app-api/v1/data/transaction/abort | Aborts a transaction
*DataApi* | [**commitTransaction**](docs/DataApi.md#commitTransaction) | **POST** /app-api/v1/data/transaction/commit | Commits a transaction
*DataApi* | [**createDocument**](docs/DataApi.md#createDocument) | **POST** /app-api/v1/data/colls/{coll}/docs | Creates a document in database
*DataApi* | [**createTransaction**](docs/DataApi.md#createTransaction) | **POST** /app-api/v1/data/transaction | Creates a transaction
*DataApi* | [**deleteCollection**](docs/DataApi.md#deleteCollection) | **DELETE** /app-api/v1-api/v1/data/colls/{coll} | Deletes a collection from database
*DataApi* | [**deleteDocumentById**](docs/DataApi.md#deleteDocumentById) | **DELETE** /app-api/v1/data/colls/{coll}/docs/{id} | Deletes a document from database
*DataApi* | [**findDocuments**](docs/DataApi.md#findDocuments) | **POST** /app-api/v1/data/colls/{coll}/find | Finds documents in database
*DataApi* | [**getDocumentById**](docs/DataApi.md#getDocumentById) | **GET** /app-api/v1/data/colls/{coll}/docs/{id} | Gets a document from database
*DataApi* | [**getDocuments**](docs/DataApi.md#getDocuments) | **GET** /app-api/v1/data/colls/{coll}/docs | Gets documents from database
*DataApi* | [**updateDocumentById**](docs/DataApi.md#updateDocumentById) | **PUT** /app-api/v1/data/colls/{coll}/docs/{id} | Updates a document in database
*DataApi* | [**updateManyDocuments**](docs/DataApi.md#updateManyDocuments) | **POST** /app-api/v1/data/colls/{coll}/updateMany | Updates many documents in database


## Documentation for Models

 - [DataDocument](docs/DataDocument.md)
 - [FindDocumentsRequest](docs/FindDocumentsRequest.md)
 - [UpdateManyDocumentsRequest](docs/UpdateManyDocumentsRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please open an issue with the tag "enhancement".
Don't forget to give the project a star if you liked it! Thanks again!generate

### Generate classes

A part of this lib is generated from the [Lenra API](https://github.com/lenra-io/api).
To generate the classes, run the following commands:

```bash
# Load API
## With wget
wget https://github.com/lenra-io/api/releases/latest/download/load-api.sh -O - -q | bash
## With curl
curl -fsSL https://github.com/lenra-io/api/releases/latest/download/load-api.sh | bash
```

Generate

```bash
docker run --rm -v ${PWD}:/local --workdir /local openapitools/openapi-generator-cli batch /local/gen-conf/java.yml
```

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the **MIT** License. See [LICENSE](./LICENSE) for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

