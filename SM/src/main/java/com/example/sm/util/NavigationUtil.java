package com.example.sm.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class NavigationUtil {

    public static void switchScene(Stage stage, String fxmlPath, String title) {

        try {

            URL resource = NavigationUtil.class.getResource(fxmlPath);

            if (resource == null) {
                throw new RuntimeException("FXML file not found: " + fxmlPath);
            }

            Parent root = FXMLLoader.load(resource);

            stage.setScene(new Scene(root, 1000, 650));
            stage.setTitle(title);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}