package com.github.javakira.readist.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReadSessionDto {
    private Date date;
    private String bookName; //todo create Book entity
    private String exposition;
    private int pagesCount;
}
