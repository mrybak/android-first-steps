package com.example.android_first_steps;

import android.test.ActivityInstrumentationTestCase2;
import junit.framework.Assert;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.android_first_steps.HelloWorldActivityTest \
 * com.example.android_first_steps.tests/android.test.InstrumentationTestRunner
 */
public class HelloWorldActivityTest extends ActivityInstrumentationTestCase2<HelloWorldActivity> {

    public HelloWorldActivityTest() {
        super("com.example.android_first_steps", HelloWorldActivity.class);
    }

    public void testStringForDisplay() throws Exception {
        // given
        int counter = 1;
        HelloWorldActivity activity = getActivity();

        // when
        String result = activity.getStringForDisplay(counter);

        // then
        Assert.assertEquals(result, "once");
    }
}
