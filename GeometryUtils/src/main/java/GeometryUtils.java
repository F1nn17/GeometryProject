
public class GeometryUtils {
    /**
     * Конвертирование м в см и наоборот
     *
     * @param value конвертируемое значение
     * @param fromUnit конвертировать из м (см)
     * @param toUnit в см (м)
     * @return значение в см или в м
     */
    public static double convertUnits(double value, String fromUnit, String toUnit) {
        if ("m".equals(fromUnit) && "cm".equals(toUnit)) {
            return value * 100;
        } else if ("cm".equals(fromUnit) && "m".equals(toUnit)) {
            return value / 100;
        }
        return value;
    }
}
