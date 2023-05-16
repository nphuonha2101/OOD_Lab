package clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.swing.Timer;

public class ClockTime implements ClockSubject {
   private List<ClockObserver> clockObserverList = new ArrayList<>();
   private Timer timer;
   private int hour;
   private int minute;
   private int second;

   public ClockTime(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      timer = new Timer(1000, new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tick();
         }
      });
      timer.start();
   }

   public void tick() {
      second++;
      if ((second %= 60) == 0)
         minute++;
      if ((minute %= 60) == 0)
         hour++;
      hour %= 24;
      notifyObservers();
   }

   public int getHour() {
      return hour;
   }

   public int getMinute() {
      return minute;
   }

   public int getSecond() {
      return second;
   }

   @Override
   public void registerObserver(ClockObserver clockObserver) {
      this.clockObserverList.add(clockObserver);
   }

   @Override
   public void unregisterObserver(ClockObserver clockObserver) {
      this.clockObserverList.remove(clockObserver);
   }

   @Override
   public void notifyObservers() {
      LocalTime localTime = LocalTime.now();
      for (ClockObserver clockObserver: this.clockObserverList
           ) {
         clockObserver.update(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
      }
   }
}
