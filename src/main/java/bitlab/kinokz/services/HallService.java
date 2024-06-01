package bitlab.kinokz.services;


import bitlab.kinokz.dto.HallDTO;
import bitlab.kinokz.impl.HallRepoImpl;
import bitlab.kinokz.mapper.HallMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HallService {

	private final HallRepoImpl hallRepo;

	private final HallMapper hallMapper;

	public List<HallDTO> getAllHalls() {
		return hallMapper.toDtoList(hallRepo.getAllHalls());
	}

	public HallDTO addHall(HallDTO hallDTO) {
		return hallMapper.toDto(hallRepo.addHall(hallMapper.toModel(hallDTO)));
	}

	public HallDTO getHallById(Long id) {
		return hallMapper.toDto(hallRepo.getHallById(id));
	}
}
