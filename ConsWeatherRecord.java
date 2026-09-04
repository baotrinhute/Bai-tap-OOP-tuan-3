public class ConsWeatherRecord extends AList{
    private WeatherRecord first;
    private AList rest;
    public ConsWeatherRecord(WeatherRecord first, AList rest){
        this.first = first;
        this.rest  = rest;
    }
}
