import com.google.gson.Gson;
import model.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setId(1);
        person.setName("skx");

        String personJson = new Gson().toJson(person);
        System.out.println(personJson);

        Files.write(Paths.get("person.json"),personJson.getBytes(StandardCharsets.UTF_8));

    }
}
