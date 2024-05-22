package com.example.demo.service;

import com.example.demo.domain.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {
    @Autowired
    private BoardService boardService;
    @Autowired
    private BoardRepository boardRepository;
    @Test
    void deleteById() {
//        case 2: 있을 때
        // given
        Board save = boardRepository.save(new Board(null, "test", "test"));
        Long id = save.getId();

        //when
        boardService.deleteById(id);

        //then
        assertEquals(0, boardRepository.findAll().size());
    }
    @Test
    void deleteByIdFail() {
//        case 1: id 이런 것이 없을때 IllegalArgumentException
        // given
        Long id = 80000L;

        //when & then
        assertThrows(IllegalArgumentException.class, () -> {
            boardService.deleteById(id);
        });
    }
}