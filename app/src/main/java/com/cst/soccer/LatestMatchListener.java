package com.cst.soccer;


import java.util.ArrayList;

public interface LatestMatchListener {
    void onStart();
    void onEnd(String success, ArrayList<Match> arrayListCat);
}
