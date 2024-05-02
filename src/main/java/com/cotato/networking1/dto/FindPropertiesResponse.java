package com.cotato.networking1.dto;

import java.util.List;

public record FindPropertiesResponse(List<PropertyResponse> properties) {
    public static FindPropertiesResponse from(List<PropertyResponse> properties) {
        return new FindPropertiesResponse(properties);
    }
}