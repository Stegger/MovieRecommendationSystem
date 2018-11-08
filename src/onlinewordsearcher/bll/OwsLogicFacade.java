/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinewordsearcher.bll;

import java.util.List;
import onlinewordsearcher.be.Movie;
import onlinewordsearcher.be.User;

/**
 *
 * @author pgn
 */
public interface OwsLogicFacade
{
    
    public List<Movie> getRecommendations(User user);
    
    
}
