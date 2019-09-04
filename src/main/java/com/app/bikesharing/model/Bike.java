package com.app.bikesharing.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
public class Bike {

    @Id
    @GeneratedValue
    private int id;
    private int userId;
    // Blob type file for image
    @Lob
    @NotNull(message = "upload image")
    private byte[] image;
    @Enumerated(EnumType.STRING)
    private BikeType type;
    @Enumerated(EnumType.STRING)
    private Size size;
    private double price;
  }
