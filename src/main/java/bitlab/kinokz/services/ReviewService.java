package bitlab.kinokz.services;


import bitlab.kinokz.BodySample.ReviewSample;
import bitlab.kinokz.dto.ReviewDTO;
import bitlab.kinokz.impl.EventRepoImpl;
import bitlab.kinokz.impl.ReviewRepoImpl;
import bitlab.kinokz.impl.UserRepoImpl;
import bitlab.kinokz.mapper.ReviewMapper;
import bitlab.kinokz.model.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

	private final ReviewMapper reviewMapper;

	private final ReviewRepoImpl commentRepo;

	private final UserRepoImpl userRepo;

	private final EventRepoImpl eventRepo;

	public List<ReviewDTO> getAllComments() {
		return reviewMapper.toDtoList(commentRepo.getAllComments());
	}

	public List<ReviewDTO> getCommentByUserId(Long id) {
		return reviewMapper.toDtoList(commentRepo.getCommentByUserId(id));
	}

	public ReviewDTO addReview(ReviewSample reviewSample){
		Review review = new Review();
		review.setUser(userRepo.getUserById(reviewSample.getUser_id()));
		review.setEvent(eventRepo.getEventById(reviewSample.getEvent_id()));
		review.setComment(reviewSample.getComment());
		return reviewMapper.toDto(commentRepo.addComment(review));
	}

	public List<ReviewDTO> getAllCommentsByEventId(Long id){
		return reviewMapper.toDtoList(commentRepo.getAllCommentsByEventId(id));
	}
}
