package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import lombok.Setter;
@Service
public class ReplyServiceImpl implements ReplyService {

	
	@Setter(onMethod_= {@Autowired})
	private ReplyMapper mapper;
	
	@Override
	public int create(ReplyVO vo) {
		
		return mapper.create(vo);
	}

	@Override
	public ReplyVO read(Integer rno) {
		
		return mapper.read(rno);
	}

	@Override
	public int update(ReplyVO vo) {
		
		return mapper.update(vo);
	}

	@Override
	public int delete(Integer rno) {
		
		return mapper.delete(rno);
	}

	@Override
	public ReplyDTO list(Criteria cri, Integer bno) {
		
		ReplyDTO dto = new ReplyDTO();
		dto.setList(mapper.list(cri, bno));
		dto.setReplyCnt(mapper.getTotal(bno));
		
		return dto;
	}

}
