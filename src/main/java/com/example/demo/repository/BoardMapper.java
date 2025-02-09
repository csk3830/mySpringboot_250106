package com.example.demo.repository;

import com.example.demo.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void register(BoardVO boardVO);

    List<BoardVO> getList();

    BoardVO getBoardById(long id);

    void updateBoard(BoardVO boardVO);

    void isDelUpdate(long id);
}
