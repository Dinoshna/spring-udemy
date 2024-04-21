Issues occurs with ssh and Github push / fetch 
Step-1:
add your GitHub account to Idea..
Step-2:
check the ssh key and add if not exists (Configure ur access with GitHub) use below commands:
The error message you’re encountering, “Permission denied (publickey),” typically occurs when Git is unable to authenticate using your SSH key. Let’s troubleshoot this issue:

Check Your SSH Key Setup:
Ensure you have an SSH key pair generated. If not, create one using the following command:
      ssh-keygen -t rsa -b 4096 -C "your_email@example.com"

This command generates a new SSH key. You can press Enter for the default path and passphrase.
Verify that the public key (id_rsa.pub) exists in your ~/.ssh directory.
Add Your SSH Key to GitHub:
Copy your public key using:
          cat ~/.ssh/id_rsa.pub  or copy from your .ssh/id_rsa.pub path and paste it in GitHub account as below step...

Add this key to your GitHub account by navigating to Settings > SSH and GPG keys and pasting it there.
Test SSH Connection:
Run the following command to verify your SSH connection to GitHub:
         ssh -T git@github.com

You should receive a welcome message in your console.
Update Your Git Remote URL:
If your Git remote URL starts with https or http, switch to using SSH:
          git remote rm origin
          git remote add origin git@github.com:<username>/<repo>.git

Replace <username> and <repo> with your GitHub username and repository name.
Try Pushing Again:
Navigate to your project folder and run:
git push -u origin master

This should work now.
