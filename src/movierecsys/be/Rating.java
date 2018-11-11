/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.be;

/**
 *
 * @author pgn
 */
public class Rating
{

    public static final int SUPER_BAD = -5;
    public static final int BAD = -3;
    public static final int NEUTRAL = 1;
    public static final int GOOD = 3;
    public static final int SUPER_GOOD = 5;

    private final Movie movie;
    private final User user;
    private int rating;

    /**
     * Constructs a new rating.
     *
     * @param movie The movie being rated.
     * @param user The rating user.
     * @param rating The value of the rating. Only the constants of the Rating
     * class are allowed values.
     */
    public Rating(Movie movie, User user, int rating)
    {
        this.movie = movie;
        this.user = user;
        this.rating = rating;
    }

    /**
     * Sets the rating to a new value. Only the constants of the Rating class
     * are allowed values.
     *
     * @param rating The rating to set.
     */
    public void setRating(int rating)
    {
        this.rating = rating;
    }

    /**
     * Gets the movie being rated.
     *
     * @return A movie
     */
    public Movie getMovie()
    {
        return movie;
    }

    /**
     * Gets the rating user.
     *
     * @return A user.
     */
    public User getUser()
    {
        return user;
    }

    /**
     * Gets the rating value.
     *
     * @return An integer.
     */
    public int getRating()
    {
        return rating;
    }

}
