package com.jsp.product.review.service;

import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Review;

public class ReviewService {

	ReviewDao reviewDao = new ReviewDao();

	public Review saveReview(Review review) {
		return reviewDao.saveReview(review);
	}

	public Review deleteReview(int id) {
		return reviewDao.deleteReview(id);
	}

	public Review updateReview(Review review) {
		return reviewDao.updateReview(review);
	}

	public void getAllDetails() {
		reviewDao.getAllDetails();
	}

}
