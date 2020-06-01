package util;

import org.apache.commons.lang3.time.StopWatch;

public class Timer {

   public static void Perf(String name, Runnable method) {
      StopWatch watch = new StopWatch();
      watch.start();
      try {
         System.out.printf("%-15s -> ", name);
         method.run();
      } catch(RuntimeException ex) {
         ex.printStackTrace();
      }
      watch.stop();
      System.out.printf("%s ms\n", watch.getTime());
   }

}
