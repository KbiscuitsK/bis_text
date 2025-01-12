package nxu.it.movieapi.service;
import nxu.it.api.common.result.Pageable;
import nxu.it.api.model.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public interface AuthorService {
    default List<Author> findAll(){
        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author("12022246775","郭智成",2022,"计4"));
        authorList.add(new Author("12022246857","毛自鹏",2022,"计4"));
        authorList.add(new Author("12022246770","罗学仙",2022,"计4"));
        authorList.add(new Author("12022246858","马嘉骏",2022,"计4"));
        authorList.add(new Author("12022246837","买金虎",2022,"计4"));
        authorList.add(new Author("12022246723","邓子鹏",2022,"计4"));
        authorList.add(new Author("12022246864","孔德豪",2022,"计4"));
        return authorList;
        };
}