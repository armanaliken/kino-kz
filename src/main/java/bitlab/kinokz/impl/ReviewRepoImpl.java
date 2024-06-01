package bitlab.kinokz.impl;

import bitlab.kinokz.model.Review;
import bitlab.kinokz.repo_services.ReviewRepoInterface;
import bitlab.kinokz.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ReviewRepoImpl implements ReviewRepoInterface {

	private final ReviewRepository reviewRepository;

	@Override
	public List<Review> getAllComments() {
		return reviewRepository.findAll();
	}

	@Override
	public Review addComment(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getCommentByUserId(Long id) {
		return reviewRepository.findAllById(id);
	}

	@Override
	public List<Review> getAllCommentsByEventId(Long id) {
		return reviewRepository.findAllByEvent_Id(id);
	}
}
