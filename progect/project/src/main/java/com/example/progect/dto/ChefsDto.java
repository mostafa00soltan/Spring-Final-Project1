package com.example.progect.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)


public class ChefsDto {
    private long id;
    private String name;
    private String logoPath;
    private String experience;
    private String faceBookLink;
    private String instagramLink;
    private String twitterLink;
}
