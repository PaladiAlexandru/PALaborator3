package locations.interfaces;

import locations.Location;

import java.time.LocalTime;

public interface Visitable {
    default void setDefaultOpeningHour(Location location) {
        location.setOpeningHours(LocalTime.of(9, 30));
    }

    default void setDefaultClosingHour(Location location) {
        location.setClosingHours(LocalTime.of(20, 0));
    }

    static LocalTime getVisitingDuration(Location location) {
        long locationOpenMin = location.getOpeningHours().getMinute();
        long locationOpenHour = location.getOpeningHours().getHour();
        return location.getClosingHours().minusHours(locationOpenHour).minusMinutes(locationOpenMin);


    }

    LocalTime getOpeningHours();

    LocalTime getClosingHours();

}
