package Face_book_task_16_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class facebooklogin {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
