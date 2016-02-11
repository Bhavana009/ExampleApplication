package com.example.bhavanas.exampleapplication.mainactivitytest;

import com.example.bhavanas.exampleapplication.BuildConfig;
import com.example.bhavanas.exampleapplication.RoboTesting;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by bhavana.s on 2/10/2016.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21,manifest=Config.NONE)

public class MainActivityTest extends TestCase {
    private RoboTesting calculator;
    @Before
    public void setup() {
        calculator = Robolectric.buildActivity(RoboTesting.class).create().get();
    }

    @Test
    public void testClickAddButton_withPositiveValues() {

        calculator.getFirstNumber().setText("1");
        calculator.getSecondNumber().setText("2");
        calculator.getAddButton().performClick();
        Assert.assertEquals("3", calculator.getTotal().getText().toString());



    }


}
