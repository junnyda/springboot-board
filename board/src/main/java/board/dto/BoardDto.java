package board.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	private int boardtext;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private LocalDateTime createdFatetime;
	private String updaterId;
	private LocalDateTime updatedDatetime;

}
