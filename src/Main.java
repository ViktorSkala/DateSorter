import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();
        List<LocalDate> nonSorted = Arrays.asList(LocalDate.of(2004,07,01),
                LocalDate.of( 2005,01,02),
                LocalDate.of( 2007,01,01),
                LocalDate.of(2032, 05, 03));
        System.out.println(dateSorter.sortDates(nonSorted));
    }
}