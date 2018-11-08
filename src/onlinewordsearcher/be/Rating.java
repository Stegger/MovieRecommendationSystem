/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinewordsearcher.be;

/**
 *
 * @author pgn
 */
public class Rating
{

    private final Movie movie;
    private final User user;
    private int rating;

    public Rating(Movie movie, User user, int rating)
    {
        this.movie = movie;
        this.user = user;
        this.rating = rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public User getUser()
    {
        return user;
    }

    public int getRating()
    {
        return rating;
    }

}
