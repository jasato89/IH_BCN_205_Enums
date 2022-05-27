package classes;


public class TemperatureHelper {

    /*
        Celcius to Fahrenheit: °F = (°C × 9/5) + 32
        Celcius to Kelvin: °C + 273.15
        Fahrenheit to Celcius: °C = (°F − 32) × 5/9
        Fahrenheit to Kelvin: K = (°F − 32) × 5/9 + 273.15
        Kelvin to Celcius: °C = K − 273.15
        Kelvin to Fahrenheit: °F = (K − 273.15) × 9/5 + 32
     */


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {

        return (fahrenheit - 32.0) * 5.0 / 9.0 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9.0 / 5.0 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }


}
