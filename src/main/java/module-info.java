module com.example.weatherapp.weather_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.weatherapp.weather_project to javafx.fxml;
    exports com.example.weatherapp.weather_project;
}