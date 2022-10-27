package com.aliyev.methodandclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate method called");

        testMethod();

        System.out.println(math(7, 8));

        System.out.println(newMethod("Life "));

        username = "onCreate Aliyev";

        MusicianMethod();

        SimpsonsMethod();

    }

    public void SimpsonsMethod() {
        Simpsons simp = new Simpsons("Simpo", "Developer", 27);
        //simp.age = 88;
        //System.out.println(simp.name + " " + simp.job + " " + simp.age);
        System.out.println(simp.getName());
        simp.setName("Simpo Aliyev");
        System.out.println(simp.getName());
    }


    public void MusicianMethod() {
          Musicians james = new Musicians("James", "Guitar", 26);
          System.out.println(james.instrument + " " + james.name);
//        james.age = 26;
//        james.instrument = "Guitar";
//        james.name = "James";
    }


    public void testMethod() {
        username = "TestMethod Aliyev";
        int x = 8 + 8;
        System.out.println(x);
    }


    public int math(int a, int b) {

        return a+b;
    }

    public String newMethod(String sstring) {

        return sstring + "New String Method";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume method called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause method called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("onStart method called");
    }
}