package systems.utility;

import pojos.Demon;

public class FusionCalculator {

    /**
     * Calculates the resulting level of a demon fusion involving two
     * {@link Demon}. The result is used to determine which {@link Demon} would
     * be the result if the two were to fuse. If there isn't a {@link Demon} in
     * the resulting family with that exact level, the next {@link Demon} of a
     * higher level is used instead.
     * @param demonOne The first {@link Demon} in the fusion.
     * @param demonTwo The second {@link Demon} in the fusion.
     * @return an {@link Integer} representing the level of the resulting
     * fusion, rounded up to the nearest whole number.
     */
    public static Integer calculateResultLevel(Demon demonOne, Demon demonTwo) {
        double demonOneDouble = Double.valueOf(demonOne.getLevel());
        double demonTwoDouble = Double.valueOf(demonTwo.getLevel());
        double result = (demonOneDouble + demonTwoDouble)/2;
        return (int) Math.round(result);
    }
}
