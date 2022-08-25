package ibu.edu.Homework5;
import java.io.IOException;
public class App {
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[4600000];
		long start=System.currentTimeMillis();
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		QuickSort.sort(ipAddress);
		System.out.println((System.currentTimeMillis()-start)+ " ms");
		IPaddress.writeToFile("/Users/acaus/Downloads/quicksort.csv", ipAddress);
			}
		}
//first time Merge sort:  48297 ms  and quick sort 45982 ms
//second time Merge sort: 48208 ms and quick sort 46902 ms
//third time Merge sort: 51070 ms and quick sort 46959 ms 
// As we can see in my case quick sort performs better than merge sort 
