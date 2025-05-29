package test;

import com.jcraft.jsch.*;

public class RemoteSanityCheck {

    public static void main(String[] args) {
        // SSH connection details
        String host = "your.remote.server.com";  // Replace with the remote server IP or hostname
        String user = "your-username";           // Replace with the username for SSH login
        String password = "your-password";       // Replace with your SSH password
        int port = 22;                           // Default SSH port

        // Command to check Java version on the remote machine
        String command = "java -version"; 

        try {
            // Create a JSch instance and configure the session
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);

            // Set password and strict host key checking
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");

            // Connect to the remote server
            session.connect();

            // Create a channel to execute the command
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            channel.setCommand(command);

            // Set up input/output streams for the command execution
            channel.setErrStream(System.err);
            channel.setOutputStream(System.out);

            // Execute the command
            channel.connect();

            // Wait for the command to complete
            while (!channel.isClosed()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Check the exit status
            if (channel.getExitStatus() == 0) {
                System.out.println("Sanity check passed!");
            } else {
                System.out.println("Sanity check failed!");
            }

            // Disconnect the channel and session
            channel.disconnect();
            session.disconnect();

        } catch (JSchException e) {
            e.printStackTrace();
        }
    }
}
