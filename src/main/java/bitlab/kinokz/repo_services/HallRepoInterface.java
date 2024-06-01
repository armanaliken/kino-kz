package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.Hall;

import java.util.List;

public interface HallRepoInterface {

	List<Hall> getAllHalls();

	Hall addHall(Hall hall);

	Hall getHallById(Long id);
}
