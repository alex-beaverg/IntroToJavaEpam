package by.epam.bobrikov.stage01.linear;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае
 */
public class Task06 {
    public boolean taskCalculation(double coordinateX, double coordinateY) {
        return ((coordinateX < 2 && coordinateX > -2) && (coordinateY < 4 && coordinateY >= 0)) ||
                ((coordinateX < 4 && coordinateX > -4) && (coordinateY < 0 && coordinateY > -3));
    }
}
