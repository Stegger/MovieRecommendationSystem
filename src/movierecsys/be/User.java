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
public class User
{

    private int id;
    private String name;

    /**
     * Constructs a new user object.
     *
     * @param id Id of the user
     * @param name Name of the user
     */
    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    /**
     * Sets the user name to a new one
     *
     * @param name The new name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the ID of the user
     *
     * @return Id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Gets the users name.
     *
     * @return Name of user.
     */
    public String getName()
    {
        return name;
    }

}
