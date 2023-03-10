package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.BoardDto;

@Service
public class BoardServicelmpl implements BoardService {
	
	@Autowired
	private board.mapper.BoardMapper boardMapper;
	
	
	@Override
    public List<BoardDto> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }
}
