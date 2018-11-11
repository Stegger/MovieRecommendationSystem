/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.bll;

import java.util.List;
import movierecsys.be.Movie;
import movierecsys.be.Rating;
import movierecsys.be.User;

/**
 *
 * @author pgn
 */
public interface OwsLogicFacade
{

    /**
     * Gets a list of ratings given by the current user.
     * @param user The current user
     * @return Users ratings.
     */
    List<Rating> getRecommendedMovies(User user);

    /**
     * Gets a list of all movies sorted by their rating.
     * @return A list of movies.
     */
    List<Movie> getAllTimeTopRatedMovies();

    /**
     * Gets a list of movies recommended for the given user.
     * @param user The user we are recommending movies to.
     * @return List of recommended movies sorted in descending order.
     */
    List<Movie> getMovieReccomendations(User user);

    /**
     * Searches for all mmovies that matches the given query somehow.
     * @param query The search query
     * @return A list of movies that matches the search query.
     */
    List<Movie> searchMovies(String query);

    /**
     * Create and add a new movie to the systems storage.
     * @param year Year of the movie.
     * @param title Title of the movie
     * @return The newly created movie
     */
    Movie createMovie(int year, String title);

    /**
     * Updated the saved version of the movie to the values in the given one.
     * @param movie The updated movie.
     */
    void updateMovie(Movie movie);

    /**
     * Deletes the given movie from storage.
     * @param movie The movie to delete.
     */
    void deleteMovie(Movie movie);

    /**
     * Creates a new Rating in the system.
     * @param movie The movie to rate.
     * @param user The user whom rates the movie.
     * @param rating The rating score of the movie
     */
    void rateMovie(Movie movie, User user, int rating);

    /**
     * Create a new user in the system.
     * @param name Name of the new user.
     * @return The new user object.
     */
    User createNewUser(String name);

    /**
     * Searches for the user with the given ID.
     * @param id
     * @return 
     */
    User getUserById(int id);
    
    /**
     * Gets a list of all users in the system.
     * @return 
     */
    List<User> getAllUsers();

}