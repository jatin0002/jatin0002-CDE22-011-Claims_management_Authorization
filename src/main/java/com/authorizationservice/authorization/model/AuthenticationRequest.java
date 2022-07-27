package com.authorizationservice.authorization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor // need default constructor for JSON Parsing
@AllArgsConstructor
@ApiModel(description = "Creating model class for user logging in")
public class AuthenticationRequest {

    @Id
    @Column(name = "username")
    @ApiModelProperty(value = "Username of the Customer doing login")
    private String username;

    @Column(name = "password")
    @ApiModelProperty(value = "Password of the Customer doing login")
    private String password;

}
