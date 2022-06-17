package com.github.javakira.readist.entity;

import com.github.javakira.readist.dto.ReadSessionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ReadSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String bookName; //todo create Book entity
    private int pagesCount;

    public ReadSession(ReadSessionDto readSessionDto) {
        date = readSessionDto.getDate();
        bookName = readSessionDto.getBookName();
        pagesCount = readSessionDto.getPagesCount();
    }
}
