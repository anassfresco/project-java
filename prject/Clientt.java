package prject;
import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Enumeration;
import java.util.Scanner;
public class fichier {
	public static void main(String[] args) throws IOException
	{
		BufferedReader entreeDepuisUtilisateur = new BufferedReader(new
				InputStreamReader(System.in));
				Socket socketClient = new Socket("localhost", 7778);
				
				DataOutputStream sortieVersServeur = new DataOutputStream(socketClient.getOutputStream());
				BufferedReader entreeDepuisServeur = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
				String phrase = entreeDepuisUtilisateur.readLine();
				sortieVersServeur.writeBytes(phrase + '\n');
				String phraseModifiee = entreeDepuisServeur.readLine();
				System.out.println("RECU DU SERVEUR: " + phraseModifiee);
				socketClient.close();
				

	}
}
	
	