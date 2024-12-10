package com.example.progect.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ChefsModel extends BaseEntity {


    private String experience;
    private String faceBookLink;
    private String instagramLink;
    private String twitterLink;




}
