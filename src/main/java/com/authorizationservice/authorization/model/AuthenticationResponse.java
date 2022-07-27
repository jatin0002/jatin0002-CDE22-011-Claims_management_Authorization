package com.authorizationservice.authorization.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Creating model class for generating authorization token when any customer logs in")

public class AuthenticationResponse {

    @ApiModelProperty(value = "Username of the Customer doing login")
    private String username;

    @ApiModelProperty(value = "Authorization token of the customer")
    private String token;

    private long serverCurrentTime;

    private long tokenExpirationTime;
}
