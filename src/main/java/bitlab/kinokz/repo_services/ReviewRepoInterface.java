package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.Review;

import java.util.List;

public interface ReviewRepoInterface {
	public List<Review> getAllComments();

	public Review addComment(Review review);

	public List<Review> getCommentByUserId(Long id);

	public List<Review> getAllCommentsByEventId(Long id);
}
