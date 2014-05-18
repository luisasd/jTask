package jtask;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class httpGET {

    private final String USER_AGENT = "Mozilla/5.0";

    public void urlGet(String parametros) throws Exception {
        String url = "http://grifo.dynip.sapo.pt/API/index.php?type=json&" + parametros;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        //System.out.println("\nSending 'GET' request to URL : " + url);
        //System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            inputLine = inputLine + "\n";
            response.append(inputLine);
        }
        in.close();

        String[] mainResult;
        mainResult = response.toString().replace("{", "").replace("}", "").split(",");
        String nome;
        String info = "";
        nome = mainResult[0].split(":")[1].replace("\"", "");
        if (mainResult.length > 1 && mainResult[1] != null) {
            info = mainResult[1].split(":")[1].replace("\"", "") + "\n";
        }
        //print result
        JOptionPane.showMessageDialog(null, nome + "\n" +
                info + response.toString());

    }

}
