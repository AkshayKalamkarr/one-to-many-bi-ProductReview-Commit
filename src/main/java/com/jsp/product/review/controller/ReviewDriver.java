package com.jsp.product.review.controller;

import com.jsp.product.review.dto.Review;
import com.jsp.product.review.service.ReviewService;

public class ReviewDriver {
	public static void main(String[] args) {
		ReviewService reviewService = new ReviewService();
		// insert
		
		Review review=new Review();
		review.setId(0);
		review.setRating(0);
		review.setFeedback(null);
		review.setProduct(null);
		
		
		
		// delete

		Review review1=new Review();
		review1.setId(0);
		
		ReviewService reviewService2=new ReviewService();
		reviewService.deleteReview(0);
		
		
		
		// update
		
		Review review2=new Review();
		review2.setId(0);
		review2.setRating(0);
		review2.setFeedback(null);
		
		ReviewService reviewService3=new ReviewService();
		reviewService3.updateReview(review2);
		
		
		
		

		// get all
		Review review4 = new Review();

	}
}
