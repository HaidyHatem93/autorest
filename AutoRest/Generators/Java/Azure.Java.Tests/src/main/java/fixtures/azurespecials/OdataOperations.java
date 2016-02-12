/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import fixtures.azurespecials.models.OdataFilter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in OdataOperations.
 */
public interface OdataOperations {
    /**
     * The interface defining all the services for OdataOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OdataService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/odata/filter")
        Call<ResponseBody> getWithFilter(@Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderby") String orderby, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getWithFilter(OdataFilter filter, Integer top, String orderby) throws ErrorException, IOException;

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getWithFilterAsync(OdataFilter filter, Integer top, String orderby, final ServiceCallback<Void> serviceCallback);

}
