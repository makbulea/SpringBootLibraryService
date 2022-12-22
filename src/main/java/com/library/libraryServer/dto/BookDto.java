package com.library.libraryServer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BookDto {
    private Long id;
    private String bookName;
    private String pageNumber;
    private  Date releaseDate;
}
