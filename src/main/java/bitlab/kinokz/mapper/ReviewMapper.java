package bitlab.kinokz.mapper;


import bitlab.kinokz.dto.ReviewDTO;
import bitlab.kinokz.model.Review;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
	ReviewDTO toDto(Review review);

	Review toModel(ReviewDTO reviewDTO);

	List<ReviewDTO> toDtoList(List<Review> list);

	List<Review> toCommentList(List<ReviewDTO> list);
}
