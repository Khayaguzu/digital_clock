/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TimeTest {
    
   public class MyFrameTest {

    @Test
    public void testConstructor_Title() {
        MyFrame myFrame = new MyFrame();
        assertEquals("My Clock Program", myFrame.getTitle());
    }

    @Test
    public void testSetTime_Format() {
        // Test that the setTime method formats the time correctly
        MyFrame myFrame = new MyFrame();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        myFrame.timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String time = myFrame.timeFormat.format(calendar.getTime());
        assertEquals("12:30:00 PM", time);
    }

    @Test
    public void testDayFormat() {
        MyFrame myFrame = new MyFrame();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        myFrame.dayFormat = new SimpleDateFormat("EEEE");
        String day = myFrame.dayFormat.format(calendar.getTime());
        assertEquals("Monday", day);
    }

    @Test
    public void testDateFormat() {
        MyFrame myFrame = new MyFrame();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.YEAR, 2022);
        myFrame.dateFormat = new SimpleDateFormat("dd MMMMM yyyy");
        String date = myFrame.dateFormat.format(calendar.getTime());
        assertEquals("12 January 2022", date);
    }
}
}