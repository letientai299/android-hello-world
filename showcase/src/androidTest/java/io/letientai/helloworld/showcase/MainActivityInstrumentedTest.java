package io.letientai.helloworld.showcase;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

  @Rule
  public ActivityTestRule<MainActivity> mActivityRule
      = new ActivityTestRule<>(MainActivity.class);

  @Test
  public void helloCheckMessage() {
    onView(withId(R.id.hello_message))
        .check(matches(withText(containsString("Android"))));
  }
}
