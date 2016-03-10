package com.twitter.lorenzorisi.twitterapi;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {


    ListView mListView;
    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.BLACK, "Florent", "Mon premier tweet !"));
        tweets.add(new Tweet(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        tweets.add(new Tweet(Color.GREEN, "Logan", "Que c'est beau..."));
        tweets.add(new Tweet(Color.RED, "Mathieu", "Il est quelle heure ??"));
        tweets.add(new Tweet(Color.GRAY, "Willy", "On y est presque"));
        return tweets;
    }



}
