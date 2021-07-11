package prject;

import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException{
		String phraseClient;
		String[] splitted;
		double result=0,USDMAD=8.82,USDEURO=0.83,EUROMAD=10.68;

		ServerSocket ss = new ServerSocket(7778);
		// Socket s = ss.accept();
		// System.out.println("client connected");
		while(true) { // boucle infinie
			Socket socketConnexion = ss.accept();
			BufferedReader entreeDepuisClient = new BufferedReader (new InputStreamReader(socketConnexion.getInputStream()));
			DataOutputStream sortieVersClient = new DataOutputStream( socketConnexion.getOutputStream());
			phraseClient = entreeDepuisClient.readLine();
			System.out.println("RECU DU Client: " + phraseClient);
			splitted = phraseClient.split(" ",3);
			switch (splitted[1]){
				case "USD":
					if (splitted[2].equals("MAD")){
						result = Integer.parseInt(splitted[0])*USDMAD;n
					}
					else if (splitted[2].equals("EURO")){
						result = Integer.parseInt(splitted[0])*USDEURO;
					}
					break;
				case "EURO":
					if (splitted[2].equals("MAD")){
						result = Integer.parseInt(splitted[0])*EUROMAD;
					}
					else if (splitted[2].equals("USD")){
						result = Integer.parseInt(splitted[0])/USDEURO;
					}
					break;
				case "MAD":
					if (splitted[2].equals("EURO")){
						result = Integer.parseInt(splitted[0])/EUROMAD;
					}
					else if (splitted[2].equals("USD")){
						result = Integer.parseInt(splitted[0])/USDMAD;
					}
					break;
			}
			sortieVersClient.writeBytes(""+ result + splitted[2] +'\n');
		}
	}

}