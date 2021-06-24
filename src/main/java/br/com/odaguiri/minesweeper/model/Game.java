package br.com.odaguiri.minesweeper.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Game {

    @Id
    private String id;
}
