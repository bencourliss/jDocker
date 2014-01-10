package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by magnayn on 09/01/2014.
 */
public class ExposedPort {

    @JsonProperty
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
    String port;
}