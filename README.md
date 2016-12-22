# Repository:

[https://github.com/sethRait/botnet](https://github.com/sethRait/botnet)

# Class Overview:

* **CommandAndControl**- C&C server to manage the network and assign tasks to workers.  This will eventually be decentralized, but perhaps starting with a centralized control mechanism will decrease complexity (though this scheme is inherently unsafe).

* **ConnectionManager** - Manage the active and inactive connections between workers and the C&C as well as handling authentication and validation.

* **Worker** - The client bots which will be assigned jobs to do.  Each bot knows how to do specific tasks applied to specific input arguments.

* **Dispatcher** - execute a given task on a new processes.

    * Individual tasks for execution based on command selection and supplied arguments.

    * Tasks:

        * Keylogger - Log keystrokes specifically for mining and targeting sensitive data.  Ie. only when the user is inputting usernames and passwords to online forms.

        * MITM - Phishing attack based on previously visited login forms.  Edit HOSTS file???

        * DDoS

        * Spam

* **CommandInterpreter** - Parse and interpret issued commands and arguments.

* **DatabaseManager** - MySQL database to hold bot connection info and reports

# Implementation:

With the exception of individual tasks, which are implemented in various python scripts, each class is implemented by a Java program in the "botnet" package.