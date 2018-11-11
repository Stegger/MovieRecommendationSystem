/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.be;

import java.util.Random;
import movierecsys.bll.exception.MovieRecSysException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author pgn
 */
public class RatingTest
{
    private static final Movie MOVIE = new Movie(3, 1994, "Shawshank redemption");
    private static final User USER = new User(100, "Stegger");
    
    public RatingTest()
    {
    }

    @Test(expected = MovieRecSysException.class)
    public void testConstructor()
    {
        System.out.println("Rating Constructor Illegal Rating");
        int rating = new Random().nextInt(Integer.MAX_VALUE-6)+6;
        Rating instance = new Rating(MOVIE, USER, rating);
        fail("You should not be able to construct a rating with an invalid ratings value.");
    }
    
    @Test
    public void testSetRatingLegal()
    {
        System.out.println("setRating: Legal");
        int expected = -5;
        Rating instance = new Rating(MOVIE, USER, -3);
        instance.setRating(expected);
        int actual = instance.getRating();
        assertEquals(expected, actual);
    }
    
    /**
     * Test of setRating method, of class Rating, using an invalid parameter.
     */
    @Test(expected = MovieRecSysException.class)
    public void testSetRatingIllegal()
    {
        System.out.println("setRating: Illegal");
        int rating = 2;
        Rating instance = new Rating(MOVIE, USER, -3);
        instance.setRating(rating);
        fail("You should not be allowed to set an illegal rating");
    }
    
    /**
     * Test of setRating method, of class Rating, using a high invalid parameter.
     */
    @Test(expected = MovieRecSysException.class)
    public void testSetRatingHighRandomIllegal()
    {
        System.out.println("setRating: High Random Illegal");
        int rating = new Random().nextInt(Integer.MAX_VALUE-6)+6;
        Rating instance = new Rating(MOVIE, USER, 1);
        instance.setRating(rating);
        fail("You should not be allowed to set an illegal rating");
    }
   
    /**
     * Test of setRating method, of class Rating, using a low invalid parameter.
     */
    @Test(expected = MovieRecSysException.class)
    public void testSetRatingLowRandomIllegal()
    {
        System.out.println("setRating: Low Random ILlegal");
        int rating = (new Random().nextInt(Integer.MAX_VALUE-6)+6) * -1;
        Rating instance = new Rating(MOVIE, USER, 1);
        instance.setRating(rating);
        fail("You should not be allowed to set an illegal rating");
    }
    
    /**
     * Test of getMovie method, of class Rating.
     */
    @Test
    public void testGetMovie()
    {
        System.out.println("getMovie");
        Rating instance = new Rating(MOVIE, USER, 1);
        Movie expResult = MOVIE;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Rating.
     */
    @Test
    public void testGetUser()
    {
        System.out.println("getUser");
        Rating instance = new Rating(MOVIE, USER, 5);
        User expResult = USER;
        User result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRating method, of class Rating.
     */
    @Test
    public void testGetRating()
    {
        System.out.println("getRating");
        Rating instance = new Rating(MOVIE, USER, 3);
        int expResult = 3;
        int result = instance.getRating();
        assertEquals(expResult, result);
    }
    
}
