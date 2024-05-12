package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "life is infinite loop";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "life time travel";
        reviews[1] = aboutTime;

        for(MovieReview review : reviews) {
            System.out.println("title: " + review.title + " review: " + review.review);
        }
    }
}
