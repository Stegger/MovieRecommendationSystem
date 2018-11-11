/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.bll.util;

import java.util.ArrayList;
import java.util.List;
import movierecsys.be.Movie;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author pgn
 */
public class MovieSearcherTest
{

    public MovieSearcherTest()
    {
    }

    /**
     * Test of search method, of class MovieSearcher.
     */
    @Test
    public void testSearch()
    {
        System.out.println("search");
        List<Movie> searchBase = new ArrayList<>();
        Movie expectedResult = new Movie(1,1994, "Shawshank Redemption");
        searchBase.add(expectedResult);
        searchBase.add(new Movie(2, 2004,"I Robot"));
        searchBase.add(new Movie(3,1999, "Pirates of Silicon Valley"));

        String query = "red";
        MovieSearcher instance = new MovieSearcher();
        List<Movie> result = instance.search(searchBase, query);

        assertNotNull("Assert that the search method returns an object", result);
        assertTrue("Search for \"red\" should return one result", result.size() == 1);
        assertTrue("Search for \"red\" should return result with ID: 1", result.get(0).getId() == 1);

        query = "Red";
        result = instance.search(searchBase, query);

        assertNotNull("Assert that the search method returns an object", result);
        assertTrue("Search for \"Red\" should return one result", result.size() == 1);
        assertTrue("Search for \"Red\" should return result with ID: 1", result.get(0).getId() == 1);

        query = "ir";
        result = instance.search(searchBase, query);

        assertNotNull("Assert that the search method returns an object", result);
        assertTrue("Search for \"ir\" should return two results", result.size() == 2);

        query = "qwerty";
        result = instance.search(searchBase, query);

        assertNotNull("Assert that the search method returns an object", result);
        assertTrue("Assert that no results are found for search \"qwerty\"", result.isEmpty());

    }

}
