package com.mycompany.chapter17.exercise;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

/**
 * A simple client program that connects to a server
 * and sends 10 "ping" messages, one every second.
 *
 * @author letha
 */
public class PingingClient {

    public static void main(String[] args) {

        // Create the server address using localhost (127.0.0.1)
        // and port number 5000
        InetSocketAddress server = new InetSocketAddress("127.0.0.1", 5000);

        // Open a connection to the server
        try (SocketChannel channel = SocketChannel.open(server)) {

            // Create a PrintWriter to send text data through the channel
            // UTF_8 specifies the character encoding
            PrintWriter writer = new PrintWriter(
                    Channels.newWriter(channel, UTF_8));

            // Confirm that the connection was successful
            System.out.println("Networking established");

            // Send 10 ping messages to the server
            for (int i = 0; i < 10; i++) {

                // Create the message
                String message = "ping " + i;

                // Send the message
                writer.println(message);

                // Force the message to be sent immediately
                writer.flush();

                // Get the current time
                String currentTime = now().format(
                        ofLocalizedTime(FormatStyle.MEDIUM));

                // Display the time and the message that was sent
                System.out.println(currentTime + " Sent " + message);

                // Wait one second before sending the next message
                TimeUnit.SECONDS.sleep(1);
            }

        } catch (IOException | InterruptedException e) {

            // Print any networking or interruption errors
            e.printStackTrace();
        }
    }
}