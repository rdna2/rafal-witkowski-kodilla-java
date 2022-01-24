package stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

    public class WorldTestSuite {
        @Test
        public void testGetPeopleQuantity() {
            //Given
            List<Country> countryListEuropa = new ArrayList<>();
            countryListEuropa.add(new Country("Slovakia", new BigDecimal("5000000")));
            countryListEuropa.add(new Country("Russia", new BigDecimal("180000000")));
            countryListEuropa.add(new Country("Germany", new BigDecimal("80000000")));

            List<Country> countryListNorthAmerica = new ArrayList<>();
            countryListNorthAmerica.add(new Country("USA", new BigDecimal("340000000")));
            countryListNorthAmerica.add(new Country("Canada", new BigDecimal("30000000")));
            countryListNorthAmerica.add(new Country("Mexico", new BigDecimal("150000000")));

            List<Country> countryListAsia= new ArrayList<>();
            countryListAsia.add(new Country("Japan", new BigDecimal("130000000")));
            countryListAsia.add(new Country("Indonesia", new BigDecimal("200000000")));
            countryListAsia.add(new Country("India", new BigDecimal("1000000000")));


            List<Continent> continentList = new ArrayList<>();
            continentList.add(new Continent("Europe", countryListEuropa));
            continentList.add(new Continent("Asia", countryListAsia));
            continentList.add(new Continent("North America", countryListNorthAmerica));

            World world = new World(continentList);
            //When
            world.getPeopleQuantity();
            //Then
            Assert.assertEquals(new BigDecimal("2115000000"), world.getPeopleQuantity());
        }
    }
