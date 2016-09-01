/*
 * Copyright (c) Microsoft. All rights reserved. Licensed under the MIT license.
 * See LICENSE in the project root for license information.
 */
package com.microsoft.graph.connect;

public class Constants {
    public static final String AUTHORITY_URL = "https://login.microsoftonline.com/common";
    public static final String AUTHORIZATION_ENDPOINT = "/oauth2/authorize";
    public static final String TOKEN_ENDPOINT = "/oauth2/token";
    // Update these two constants with the values for your application:
    public static String CLIENT_ID = "ENTER_YOUR_CLIENT_ID";
    public static final String REDIRECT_URI = "com.microsoft.graph://connect/oauth/redirect";
    public static final String MICROSOFT_GRAPH_API_ENDPOINT_RESOURCE_ID = "https://graph.microsoft.com/";
}
