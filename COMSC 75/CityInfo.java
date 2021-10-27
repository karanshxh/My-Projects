/* Karan Shah
 * CityInfo
 * Create object city
 * Read citylist file
 * Ask for country tag
 * Display number of cities
 * Display average population per city
 * Create new file showing each element with the country tag
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

// Create object City
class City {
	private String country;
	private String name;
	private int population;
	
	public City(String country, String name, int population) {
		this.country = country;
		this.name = name;
		this.population = population;
	}

	// Get/Set variables
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
        return String.format("%s;%s;%d", country, name, population);
	}
}

// City Info class
public class CityInfo {
	
	// Read City File Method
	public static ArrayList<City> readCityFile(String fileName) {
		ArrayList<City> result = new ArrayList<City>();
		File file = new File(fileName);
		
		try {
			Scanner inFile = new Scanner(file);
			
			while (inFile.hasNextLine()) {
				String oneLine = inFile.nextLine();
				String[] info = oneLine.split(";");
				
				if (info.length != 3) {
                    System.out.printf("\"%s\" does not have three "
                    		+ "entries.\n", oneLine);
                }
				
				else {
                    try {
                        result.add(new City(info[0], info[1], 
                        		Integer.valueOf(info[2])));
                    }
                    catch (NumberFormatException ex) {
                        System.out.printf("\"%s\" does not have "
                        		+ "a number on it.\n", oneLine);
                    }
				}
			}
			
			inFile.close();
		}
		
		// Catch exceptions
		catch (FileNotFoundException ex) {
            System.out.printf("Cannot open file %s.\n", fileName);
		}
		
		catch (Exception ex) {
            System.out.printf("Error processing %s.\n", fileName);
            result.clear();
        }
		
        return result;
    }
	
	// Method to display country, number of cities and average population
	public static int statistics(String countryName, ArrayList<City> 
				cityList) {
        int totalCities = 0;
        int totalPopulation = 0;
        
        for (City c: cityList) {
            if (c.getCountry().equals(countryName)) {
                totalCities++;
                totalPopulation += c.getPopulation();
            }
        }
        
        if (totalCities > 0) {
            System.out.printf("Number of cities in %s: %d\n",
                countryName, totalCities);
            System.out.printf("Average population is %,.0f.\n",
                (double) (totalPopulation / totalCities));
        } 
        
        else {
            System.out.printf("No cities found in %s.\n", countryName);
        }
        
        return totalCities;
    }
	
	// Method to create new file with country's cities
	public static void writeCountryFile(String countryName, 
			ArrayList<City> cityList) {
        String fileName = countryName + ".dat";
        File file = new File(fileName);
        
        try (PrintWriter output = new PrintWriter(file)) {
            for (City city: cityList) {
                if (city.getCountry().equals(countryName)) {
                    output.write(city.toString() + "\n");
                }
            }
            
            System.out.printf("File %s written successfully.\n", 
            		fileName);
        }
        
        catch (IOException ex) {
            System.out.printf("Error writing %s\n", fileName);
            System.out.println(ex.getMessage());
        }
    }
	
	
	// Main, run program until user presses enter
	public static void main(String[] args) {
		ArrayList<City> cityList = readCityFile("citylist.dat");
		
	    if (cityList.size() > 0) {
	        Scanner input = new Scanner(System.in);
	        boolean finished = false;
	        System.out.println(); // print a blank line for spacing
	        
	        while (!finished) {
	            System.out.print("Enter a two-letter country code, or "
	            		+ "press ENTER to quit: ");
	            String countryName = input.nextLine();
	            
	            if (!countryName.equals("")) {
	                countryName = countryName.toUpperCase();
	                int nFound = statistics(countryName, cityList);
	                if (nFound > 0) {
	                    writeCountryFile(countryName, cityList);
	                }
	            } 
	            
	            else {
	                finished = true;
	            }
	        }
	    }
	}
}

