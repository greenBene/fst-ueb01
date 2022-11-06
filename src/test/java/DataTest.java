import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.Map;

public class DataTest {

    @Test
    public void testSuccessfullJsonParsing() {
        DataLoader dataLoader = new DataLoader();
        DataParser dataParser = new DataParser();
        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        Map<String, List<CountryDataPoint>> map = dataParser.parseJsonData(json);
        assertNull(map.get("Afghanistan"));
    }

}
