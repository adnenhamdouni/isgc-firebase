package tn.itskills.android.isgc_firebase.models;

/**
 * Created by adnenhamdouni on 25/11/2016.
 */

public class User {

    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
