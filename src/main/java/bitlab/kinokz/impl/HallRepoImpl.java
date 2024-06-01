package bitlab.kinokz.impl;

import bitlab.kinokz.model.Hall;
import bitlab.kinokz.repo_services.HallRepoInterface;
import bitlab.kinokz.repository.HallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class HallRepoImpl implements HallRepoInterface {

	private final HallRepository hallRepository;

	@Override
	public List<Hall> getAllHalls() {
		return hallRepository.findAll();
	}

	@Override
	public Hall addHall(Hall hall) {
		return hallRepository.save(hall);
	}

	@Override
	public Hall getHallById(Long id) {
		return hallRepository.findAllById(id);
	}
}
