package com.serenitydojo.datatypes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;

        int timeJump = 30;

        int targetYear = initialYear + timeJump;


        // TODO: create a new int variable called timeJump and assign it a value
        //  Next, add this variable to initialYear and assign the result to targetYear, so that targetYear is equal to 2015


      //  System.out.println(targetYear);
        assertThat(targetYear, equalTo(2015));
    }
}
