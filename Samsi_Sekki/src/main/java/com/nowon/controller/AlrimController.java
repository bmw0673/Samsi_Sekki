package com.nowon.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nowon.domain.entity.DTO.ShoppingAlrimVO;
import com.nowon.domain.entity.DTO.StyleAlrimVO;

@RestController
public class AlrimController {
	List<ShoppingAlrimVO> alrimShoppringcate=new ArrayList<>();
	List<ShoppingAlrimVO> alrimStyleList=new ArrayList<>();
	
	public AlrimController() {
		alrimShoppringcate.add(ShoppingAlrimVO.builder()
				.category("거래").content("HTML능력 사고 싶다").division("거래 완료")
				.build());
		alrimShoppringcate.add(ShoppingAlrimVO.builder()
				.category("혜택").content("도움이 필요하다고 어필하면 성심껏 도와주십니다. 적극 이용합시다.").division("강사님 도와줘요")
				.build()); 
		alrimShoppringcate.add(ShoppingAlrimVO.builder()
				.category("기타").content("HTML으로 뇌 용량이 초과되었습니다. 휴식이 필요합니다. 휴식을 취해주세요").division("뇌 용량 초과")
				.build());
		alrimShoppringcate.add(ShoppingAlrimVO.builder()
				.category("기타").content("HTML으로 뇌 용량이 초과되었습니다. 휴식이 필요합니다. 휴식을 취해주세요").division("뇌 용량 초과")
				.build());
		alrimShoppringcate.add(ShoppingAlrimVO.builder()
				.category("기타").content("HTML으로 뇌 용량이 초과되었습니다. 휴식이 필요합니다. 휴식을 취해주세요").division("뇌 용량 초과")
				.build());
		
		alrimStyleList.add(ShoppingAlrimVO.builder()
				.content("HTML은 제스타일이 아닙니다.").division("스트레스 초과")
				.build());				
	}

	@GetMapping("/alrimShopping")
	public ModelAndView alrimShoppringList(ModelAndView mv) {
		mv.addObject("list", alrimShoppringcate);
		mv.setViewName("views/alrim/list");
		return mv;
	}
	
	@GetMapping("/alrimStyle")
	public ModelAndView alrimStyleList(ModelAndView mv) {
		
		mv.addObject("list", alrimStyleList);
		mv.setViewName("views/alrim/list");
		return mv;
	}
	
	@GetMapping("/alrimShoppinggure/{division}")
	public ModelAndView alrimShoppringListgure(ModelAndView mv, 
			@PathVariable String division) {
		System.out.println(division);
		
		
		mv.addObject("list", alrimShoppringcate.stream()
				.filter(vo->vo.getCategory().equals(division))
				.collect(Collectors.toList()));
		mv.setViewName("views/alrim/list");
		return mv;
	}

	
	
	ShoppingAlrimVO toShoppingAlrimVO() {
		return ShoppingAlrimVO.builder()
				.category("거래").content("HTML 거래가 완료 되었습니다.").division("거래 완료")
				.build();
	}
	
	ShoppingAlrimVO tocateShoppingAlrimVO() {
		return ShoppingAlrimVO.builder()
				.category("혜택").content("도움이 필요하다고 어필하면 성심껏 도와주십니다. 적극 이용합시다.").division("강사님 도와줘요")
				.build();
	}
	
	StyleAlrimVO toStyleAlrimVO() {
		return StyleAlrimVO.builder()
				.content("HTML은 제스타일이 아닙니다.").division("스트레스 초과")
				.build();
	}
	
}
