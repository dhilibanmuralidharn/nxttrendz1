/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */
package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.service.ReviewJpaService;
import java.util.*;

@RestController

public class ReviewController {

    @Autowired
    public ReviewJpaService reviewJpaService;

    @GetMapping("/reviews")
    public ArrayList<Review> getReviews(){
        return reviewJpaService.getReviews()
    }
    @GetMapping("/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId){
        return reviewJpaService.getReviewById(reviewId);
    }
    @PostMapping("/reviews")
    public Review addReview(@RequestBody Review review){
        return reviewJpaService.addReview(review);
    }
    @PutMapping("/reviews/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review){
        return reviewJpaService.updateReview(reviewId, review);
    }
    @DeleteMapping("/reviews/{reviewId}")
    public void deleteReview (@PathVariable("reviewId") int reviewId){
        reviewJpaService.deleteReview(reviewId);
    }
}