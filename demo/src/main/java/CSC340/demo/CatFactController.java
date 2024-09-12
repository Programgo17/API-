package CSC340.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;



    @RestController
    public class CatFactController {

        // URL of the Cat Facts API
        private static final String CAT_FACT_API_URL = "https://catfact.ninja/fact";

        @GetMapping("/catfact")
        public CatFact getCatFact() {
            // Create a RestTemplate instance
            RestTemplate restTemplate = new RestTemplate();

            // Call the Cat Facts API and get the response as a string
            ResponseEntity<String> response = restTemplate.getForEntity(CAT_FACT_API_URL, String.class);

            // Parse the response and extract the 'fact' and 'length' fields
            String json = response.getBody();


            String fact = json.split("\"fact\":\"")[1].split("\"")[0]; // Get the 'fact' value
            int length = Integer.parseInt(json.split("\"length\":")[1].split("}")[0]); // Get the 'length' value

            // Create a new CatFact object and return it
            return new CatFact(fact, length);
        }
    }

