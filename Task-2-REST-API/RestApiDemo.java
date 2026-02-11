 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RestApiDemo {

    public static void main(String[] args) {

        try {
            // API URL
            String apiUrl = "https://randomuser.me/api/";

            // Create URL object
            URL url = new URL(apiUrl);

            // Open connection
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Read response
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();

            // Parse JSON
            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray results = jsonObject.getJSONArray("results");
            JSONObject user = results.getJSONObject(0);

            JSONObject name = user.getJSONObject("name");
            String fullName = name.getString("title") + " " +
                              name.getString("first") + " " +
                              name.getString("last");

            String gender = user.getString("gender");
            String email = user.getString("email");
            String country = user.getJSONObject("location").getString("country");

            // Display output
            System.out.println("User Details:");
            System.out.println("Name    : " + fullName);
            System.out.println("Gender  : " + gender);
            System.out.println("Email   : " + email);
            System.out.println("Country : " + country);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
