package com.vit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloDto {

    @NonNull
    String name;
}
