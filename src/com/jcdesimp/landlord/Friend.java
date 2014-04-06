package com.jcdesimp.landlord;


import com.avaje.ebean.validation.NotNull;
import org.bukkit.entity.Player;

import javax.persistence.*;

/**
 * Friend object
 */

@SuppressWarnings("UnusedDeclaration")
@Entity
@Table(name="ll_friend")
public class Friend {

    public static Friend friendFromPlayer(Player p) {
        Friend fd = new Friend();
        fd.setPlayerName(p.getUniqueId().toString());
        return fd;
    }



    @Id
    private int id;


    @NotNull
    private String playerName;



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Friend && ((Friend) obj).getPlayerName().equalsIgnoreCase(playerName);
    }


    /*
    public void setFriendOf(List<OwnedLand> friendOf) {
        this.friendOf = friendOf;
    }

    public List<OwnedLand> getFriendOf() {
        return friendOf;
    }
    */
}
