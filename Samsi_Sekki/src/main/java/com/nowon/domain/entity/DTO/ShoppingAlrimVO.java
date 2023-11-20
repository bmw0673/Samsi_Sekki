package com.nowon.domain.entity.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ShoppingAlrimVO {
	
	private String division;
	private String content;
	private LocalDateTime createdDate;
	private String category;

}
