package com.jsp.product.review.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Akshay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Review saveReview(Review review) {
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
		System.out.println("all good");
		return review;
	}

	public Review deleteReview(int id) {
		Review review=entityManager.find(Review.class, id);
		entityTransaction.begin();
		entityManager.remove(review);
		entityTransaction.commit();
		System.out.println("Record deleted ");
		return review;
	}

	public Review updateReview(Review review) {
		Review review2=entityManager.find(Review.class, review.getId());
		if (review2 != null) {
			review2.setFeedback(review.getFeedback());
			review2.setRating(review.getRating());
			System.out.println("Record Deleted");
		} else
			System.out.println("Record not found");
		return review2;
	}

	public void getAllDetails() {
		String sql = "select review from Review review";
		Query query = entityManager.createQuery(sql);

		List<Review> reviews = query.getResultList();
		for (Review r1 : reviews) {
			System.out.println("============================================");
			System.out.println(r1.getId());
			System.out.println(r1.getFeedback());
			System.out.println(r1.getRating());
		}

	}
	

}
