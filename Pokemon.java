import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Pokemon{
    private String name;
    Pokemon(String name) {
        this.name = name;
        List<String[]> pokemon_search = search(name);
        String[] titles = pokemon_search.get(0);
        String[] pokemons = pokemon_search.get(1);
        for (int i = 0; i < titles.length; i++) {
            System.out.println((String)titles[i] + ":" + (String)pokemons[i]);
        }
    }

    private static List<String[]> search(String name)
    {
        List<String[]> data_list = new ArrayList<>();
        try {
            File f = new File("data/pokemon_status.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            // 1行ずつCSVファイルを読み込む
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", 0);
                if (count == 0) {
                    data_list.add(data);
                }
                if (Arrays.asList(data).contains(name)) {
                    data_list.add(data);
                    return data_list;
                }
                count++;
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("==========");
        System.out.println(data_list);
        return data_list;
    }

    public void character_status()
    {

    }

    public String name()
    {
        return this.name;
    }

    public void status()
    {
        System.out.println("ステータス表示...");
    }

    public void investigate_list()
    {
        // 後で実装
    }
}
