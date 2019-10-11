package com.stackroute.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ApiModel
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Movie {
    @Id
    @ApiModelProperty(notes = "Id of the movie primary key")
    int id;
    @ApiModelProperty(notes = "Title of the movie")
    String movieTitle;
    @ApiModelProperty(notes = "overview of the movie")
    String overview;
    @ApiModelProperty(notes = "Movie language")
    String language;


}
