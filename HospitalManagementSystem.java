package h;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;



class HospitalManagementSystem 
{
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public HospitalManagementSystem() {
	 System.out.println("\u001B[96m\033[5m                                .::::.                           \u001B[0m");      
 	 System.out.println("\u001B[96m\033[5m                         :=*#%%%%%%%%%%#*=:                      \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m                      -*%%%%%%%%%%%%%%%%%%%%*-                   \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m                    =%%%%%%%*+-::..::-=*%%%%%%%=                 \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m                  -%%%%%%+:              :+%%%%%%-               \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m                 +%%%%%=      =%%%%%%=      =%%%%%+              \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m                +%%%%#.       =%%%%%%=       .*%%%%*             \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m               -%%%%#         =%%%%%%=         *%%%%=            \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m               #%%%%.  :------+%%%%%%*------:  .%%%%%            \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m              .%%%%*   #%%%%%%%%%%%%%%%%%%%%#   *%%%%:           \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m              :%%%%+   #%%%%%%%%%%%%%%%%%%%%#   +%%%%-           \u001B[0m");     
  	 System.out.println("\u001B[96m\033[5m              .%%%%#   #%%%%%%%%%%%%%%%%%%%%#   *%%%%:           \u001B[0m");     
 	 System.out.println("\u001B[96m\033[5m               *%%%%:  .......=%%%%%%+.......  .%%%%#            \u001B[0m");     
  	 System.out.println("\u001B[96m\033[5m                :%%%%#.        =%%%%%%=         #%%%%:           \u001B[0m");      
  	 System.out.println("\u001B[96m\033[5m         .==:    =%%%%%:       =%%%%%%=       :#%%%%=    :==.    \u001B[0m");      
	 System.out.println("\u001B[96m\033[5m        .@:.**+++--%%%%%*.     -######-     .+%%%%%=-++++#..@.   \u001B[0m");      
	 System.out.println("\u001B[96m\033[5m         #=  #*  #-.*%%%%%#=.            .=#%%%%%#.-%  +%  -#    \u001B[0m");      
  	 System.out.println("\u001B[96m\033[5m          %-  %: .%: :*%%%%%%%*+==--==+*%%%%%%%*: .%. :%. :%.    \u001B[0m");      
 	 System.out.println("\u001B[96m\033[5m          .%. .%. -@.  .=#%%#%%%%%%%%%%%%%%%#=.   %=  #: .%.     \u001B[0m");      
 	 System.out.println("\u001B[96m\033[5m           :%  -%#+=+*+-.  :-=*#%%%%%%##+=:  .-+*+==##:  %-      \u001B[0m");      
 	 System.out.println("\u001B[96m\033[5m            -#  =#     :=+*+-.          .-+*+=:     #+  #=       \u001B[0m");      
  	 System.out.println("\u001B[96m\033[5m             +*  :+*+=:     :+#-      -*+:     :=+*+:  +*        \u001B[0m");      
 	 System.out.println("\u001B[96m\033[5m              #+     .-+*=     +#    *+     =*+-.     =#         \u001B[0m");      
	 System.out.println("\u001B[96m\033[5m               =#=:             +*  +*             :=#=          \u001B[0m");      
	 System.out.println("\u001B[96m\033[5m                 .-+++++=:       #==#       :=+++++-.            \u001B[0m");       
 	 System.out.println("\u001B[96m\033[5m                        .-%.      %%       %=.                   \u001B[0m");      
        System.out.println("\u001B[32m=**-  -**-  .=*#*+:    =***+-  -****+=:  **+.=********:  ***=   :**\u001B[0m");         
        System.out.println("\u001B[32m+##=  =##+ .#######+  *##**##+ =#######- ###.+########- =####   -##*\u001B[0m");         
        System.out.println("\u001B[32m+##=  =##+ *##*::###- ### .**+ =##+ =##+ ###.:--*##+--. #####-  -##*\u001B[0m");         
        System.out.println("\u001B[32m+###**###+.###.  =##* *###*=.  =##+.+##+ ###.   *##=   -##+##*  -##*\u001B[0m");        
	System.out.println("\u001B[32m+########+:###   -### .+#####+ =#######: ###.   *##=   *##:*##: -##*\u001B[0m");         
	System.out.println("\u001B[32m+##*--*##+.###.  =##* ...:=###:=##*++=.  ###.   *##=  .###=*##+ -##*\u001B[0m");       
	System.out.println("\u001B[32m+##=  =##+ *##+.:###=:##*  *##:=##+      ###.   *##=  =########.-##*\u001B[0m");    
	System.out.println("\u001B[32m+##=  =##+ .*######*  *##*###* =##+      ###.   *##=  ###=--*##=-#######-\u001B[0m");    
	System.out.println("\u001B[32m=**=  =**=   =*##*=    =*###=  -**=      ***.   +**- :***   :**+-*******:\u001B[0m"); 
        initializeSystem();
    }

    // Initialize system with default data
    private void initializeSystem() {
        // Adding a default admin
        admins.add(new Admin("Admin", "Admin@123"));

        // Adding default doctors
        doctors.add(new Doctor("drsmith", "Docpass@1", 101, "Dr. Smith", "Cardiology"));
        doctors.add(new Doctor("drjohnson", "Docpass@2", 102, "Dr. Johnson", "Neurology"));
	doctors.add(new Doctor("drjohn", "Docpass@3", 103, "Dr. John", "Dermotology"));
	doctors.add(new Doctor("drPrudhvi", "Docpass@4", 104, "Dr. Prudhvi Raj", "Dental"));



        // Adding default rooms (Room Numbers 1 to 10)
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));
        }

        // Adding default patients
        // Assigning rooms to patients
        Room availableRoom = getAvailableRoom();
        if (availableRoom != null) {
            availableRoom.assignRoom();
            patients.add(new Patient("john", "John@123", 201, "John Doe", 30, "123 Main St", "Heart Disease", availableRoom.getRoomNumber()));
	   
        }

        availableRoom = getAvailableRoom();
        if (availableRoom != null) {
            availableRoom.assignRoom();
            patients.add(new Patient("jane", "jane123", 202, "Jane Smith", 25, "456 Elm St", "Migraine", availableRoom.getRoomNumber()));
        }
	availableRoom = getAvailableRoom();
        if (availableRoom != null) {
            availableRoom.assignRoom();
            patients.add(new Patient("javed", "Javed@123", 203, "Javed Don", 29, "ROAD 1, KPHB", "Dental Disease", availableRoom.getRoomNumber()));
        }

	

        // Adding default appointments
        appointments.add(new Appointment(101, 201, LocalDate.of(2024, 12, 15)));
        appointments.add(new Appointment(102, 202, LocalDate.of(2024, 12, 16)));
	appointments.add(new Appointment(103, 204, LocalDate.of(2024, 12, 10)));

		
    }

    // Get the first available room
    private Room getAvailableRoom() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return room;
            }
        }
        return null; // No rooms available
    }

    // Start the system

    public void start() {
        while (true) {
            showMainMenu();
        }
    }

    // Display the main menu with separate login options

    private void showMainMenu() {
        System.out.println("\n---- Hospital Management System ----");
        System.out.println("1. Admin Login");
        System.out.println("2. Doctor Login");
        System.out.println("3. Patient Login");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = getIntegerInput();

        switch (choice) {
            case 1:
                adminLogin();
                break;
            case 2:
                doctorLogin();
                break;
            case 3:
                patientLogin();
                break;
            case 4:
System.out.println("\u001B[95m               .%@:                        ---             :.      :**:                  ::.        \u001B[0m");   
System.out.println("\u001B[95m  .-=++*#%%@@@%@@=                        =@@:             @@:   .#@%:                  =@@*        \u001B[0m"); 
System.out.println("\u001B[95m  -#**#@@+-. .%@-                        -@@:              *@*  *@%-   ..              :@@*         \u001B[0m");   
System.out.println("\u001B[95m      %@+   .%@*+%%+   .=*##@* +%*+##=  :@@: :+:           :@@+@@=  :*@@@@-  :%%: .#%= %@#          \u001B[0m");   
System.out.println("\u001B[95m     #@#    %@@*-#@* :#@*-+@# +@@%-*@% .@@++%@*=            *@@+  .#@#: *@# +@#. -@@* :@#           \u001B[0m");   
System.out.println("\u001B[95m    *@%    %@%. *@#.#@*. *@# +@@- =@@:.%@@@*-              .@@-  .@@=  .@@-#@*  *@@#  +%            \u001B[0m");   
System.out.println("\u001B[95m   =@@.   #@%  +@@:%@- :%@% =@@. =@@: %@##@%-              %@#   *@+  -@@-#@+ =@@@#  .:             \u001B[0m");   
System.out.println("\u001B[95m  :@@:   *@%. =@@:=@%+#@@%.=@@. :@@: #@#  =@@#.           =@@    =@#+%@#: @@@@%+@%  -@@.            \u001B[0m");   
System.out.println("\u001B[95m   --    .=.  .=:  =+=:=+. .=.   -:  -#    .=:.            ::     .=+=.   .==.  -.   -:              \u001B[0m"); 


                System.out.println("Exiting system...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    /* ************************************************************** Admin login process *********************************************************** */
    private void adminLogin() {
System.out.println("\u001B[33m    .=%%#    :%%%=%%%%:  -%%%:    *%%+ +%%%%# .%%%=  *%%:   \u001B[0m");   
System.out.println("\u001B[33m    *+%@@=   :@@@:==@@@= **@@@. .*#@@* -%@@%= ==@@@- *@@:   \u001B[0m"); 
System.out.println("\u001B[33m   :@@=@@@.  :@@@.  %@@* %#*@@%.%##@@*  *@@#  +@+@@@:*@@:   \u001B[0m");   
System.out.println("\u001B[33m   #@@:#@@*  :@@@.  %@@* %@*#@@@@##@@*  *@@#  +@%+@@@=@@:   \u001B[0m");   
System.out.println("\u001B[33m  -@@#.-@@@: :@@@.  %@@* %@@=%@@@=#@@*  *@@#  +@@=+@@@+@:   \u001B[0m");   
System.out.println("\u001B[33m  %@@=@@@@@% :@@@:==%@@= %@@-.%@+ #@@* -%@@%= +@@= *@@%+:   \u001B[0m");   
System.out.println("\u001B[33m =@@# ..:%@@=:@@@=@@@%-  #@@- .+  #@@* *@@@@# +@@-  #@@#   \u001B[0m");   
      System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine().trim();

        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                System.out.println("\033[93mAdmin login successful! Welcome, \033[0m" + username + ".");
                adminMenu();
                return;
            }
        }

        System.out.println("Invalid Admin credentials. Please try again.");
    }

    /* **************************************************************  Admin menu ******************************************************************* */
    private void adminMenu() {
        while (true) {
            System.out.println("\n---- Admin Menu ----");
            System.out.println("1. Add Doctor");
            System.out.println("2. Patient Registration");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. View Room Vacancies");
            System.out.println("6.  Logout");
            System.out.print("Enter your choice: ");
            int choice = getIntegerInput();

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    registerPatient();
                    break;
                case 3:
                    viewDoctors();
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewRoomVacancies();
                    break;
                case 6:
                    
                    System.out.println("Logging out from Admin account...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    /* ******************************************************************* Admin: Add Doctor ************************************************************* */

    private void addDoctor() 
    {
        String username;
        while (true) {
            System.out.print("Enter Doctor Username: ");
            username = scanner.nextLine().trim();
            if (isValidUsername(username))
	    {
                break;
            } 
	    else {
                System.out.println("Invalid username. Please use only alphanumeric characters and underscores.");
            }
        }

        String password;
        while (true) {
            System.out.print("Enter Doctor Password: ");
            password = scanner.nextLine().trim();
            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("Invalid password. Password must be at least 6 characters long,atleast contain one special character,captial letter and number");
            }
        }

        System.out.print("Enter Doctor ID: ");
        int doctorId = getIntegerInput();

	String name;
	while (true) {
            System.out.print("Enter Doctor Name: ");
            name = scanner.nextLine().trim();
            if (isValidName(name)) {
                break;
            } else {
                System.out.println("Invalid name. Please use only letters and spaces.");
            }
        }

        System.out.print("Enter Doctor Specialty: ");
        String specialty = scanner.nextLine().trim();


	

        // Check for duplicate Doctor ID or Username

        if (findDoctorById(doctorId) != null) {
            System.out.println("Doctor with ID " + doctorId + " already exists.");
            return;
        }

        if (findDoctorByUsername(username) != null) {
            System.out.println("Doctor with Username " + username + " already exists.");
            return;
        }

        Doctor newDoctor = new Doctor(username, password, doctorId, name, specialty);
        doctors.add(newDoctor);
        System.out.println("\033[93mDoctor added successfully!\033[0m");
    }


    /* *********************************** Admin: Patient Registration *********************************** */


    private void registerPatient() {
        if (getAvailableRoom() == null) {
            System.out.println("No room vacancies available. Cannot register new patient.");
            return;
        }

        String username;
        while (true) {
            System.out.print("Enter Patient Username: ");
            username = scanner.nextLine().trim();
            if (isValidUsername(username)) {
               
                    break;
            } 
	    else {
                System.out.println("Invalid username. Please use only alphanumeric characters and underscores.");
            }
        }

        String password;
        while (true) {
            System.out.print("Enter Patient Password: ");
            password = scanner.nextLine().trim();
            if (isValidPassword(password)) {
                break;
            } 
	    else {
                System.out.println("Invalid password. Password must be at least 6 characters long,atleast contain one special character,captial letter and number");
            }
        }

        System.out.print("Enter Patient ID: ");
        int patientId = getIntegerInput();

	String name;
        while (true) {
            System.out.print("Enter Patient Name: ");
            name = scanner.nextLine().trim();
            if (isValidName(name)) {
                break;
            } 
	    else {
                System.out.println("Invalid name. Please use only letters and spaces.");
            }
        }

        System.out.print("Enter Patient Age: ");
        int age = getIntegerInput();

        System.out.print("Enter Patient Address: ");
        String address = scanner.nextLine().trim();
        System.out.print("Enter Patient Disease: ");
        String disease = scanner.nextLine().trim();


        // Check for duplicate Patient ID or Username


        if (findPatientById(patientId) != null) 
	{

            System.out.println("Patient with ID " + patientId + " already exists.");
            return;
        }

        if (findPatientByUsername(username) != null) 
	{
            System.out.println("Patient with Username " + username + " already exists.");
            return;
        }

        Room assignedRoom = getAvailableRoom();

        if (assignedRoom == null)
	 {
            System.out.println("No room vacancies available. Cannot register new patient.");
            return;
        }

        assignedRoom.assignRoom();
        Patient newPatient = new Patient(username, password, patientId, name, age, address, disease, assignedRoom.getRoomNumber());
        patients.add(newPatient);
        System.out.println("Patient registered successfully! Assigned Room Number: " + assignedRoom.getRoomNumber());
    }

    /* ******************************************** Admin: View Doctors ****************************************** */
    private void viewDoctors()
    {
        if (doctors.isEmpty()) 
	{
            System.out.println("No doctors available.");
            return;
        }

        System.out.println("\n---- List of Doctors ----");

        for (Doctor doctor : doctors)
	{
            System.out.println(doctor);
        }
    }

    /* ********************************************** Admin: View Patients **************************************** */

    private void viewPatients() 
    {
        if (patients.isEmpty()) 
	{
            System.out.println("No patients available.");
            return;
        }

        System.out.println("\n---- List of Patients ----");

        for (Patient patient : patients) 
	{
            System.out.println(patient);
        }
    }

    /* ************************************************** Admin: View Room Vacancies ********************************* */
    private void viewRoomVacancies() 
    {
        boolean hasVacancies = false;
        System.out.println("\n---- Room Vacancies ----");

        for (Room room : rooms)
	 {
            if (!room.isOccupied()) {
                System.out.println("Room Number: " + room.getRoomNumber());
                hasVacancies = true;
            }
        }

        if (!hasVacancies) 
	{
            System.out.println("No room vacancies available.");
        }
    }


    /* ************************************** Doctor login process *************************************** */

    private void doctorLogin() {
System.out.println("\u001B[36m                      .  .%=--                                        \u001B[0m");   
System.out.println("\u001B[36m                    --*:     =.                                       \u001B[0m"); 
System.out.println("\u001B[36m                    =.       :-                                       \u001B[0m");   
System.out.println("\u001B[36m                     --      =.     :---====.                         \u001B[0m");   
System.out.println("\u001B[36m          =+=-:       .--..-=: -==:.#%@@@%%%:      -----:             \u001B[0m");   
System.out.println("\u001B[36m          #@@@@@#:   -+**=:+*+@@@@@%. @@@:  -+*+-  @@@@@@@#.          \u001B[0m");   
System.out.println("\u001B[36m          #@@*:%@@: #@@#@@# *@@%:-=: .@@@: #@@#@@# @@@- *@@#          \u001B[0m");   
System.out.println("\u001B[36m          #@@# .@@*=@@. +@@:@@@=     .@@@:-@@: =@@:@@@=:%@@+          \u001B[0m");   
System.out.println("\u001B[36m          *@@# +@@+=@@. *@@.@@@+ =+-.:@@@:=@@: *@@.@@@@@@%=           \u001B[0m"); 
System.out.println("\u001B[36m          *@@@%@@*  %@@@@@-=+@@@@@@@.:@@@- #@@@@@- @@@@@%+=:          \u001B[0m");   
System.out.println("\u001B[36m          *@@@%+:    -++- -: .+#%%+. :@@@-  -++-   %%%+*%@@:          \u001B[0m");   
System.out.println("\u001B[36m                           =-.   -=::-=::-:.                          \u001B[0m");   
System.out.println("\u001B[36m                             :-:-.     :+**+                          \u001B[0m");   
System.out.println("\u001B[36m                                         ::                           \u001B[0m");         
        System.out.print("Enter Doctor Username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter Doctor Password: ");
        String password = scanner.nextLine().trim();

        Doctor loggedInDoctor = null;
        for (Doctor doctor : doctors) {
            if (doctor.getUsername().equals(username) && doctor.getPassword().equals(password)) {
                loggedInDoctor = doctor;
                break;
            }
        }

        if (loggedInDoctor != null) {
            System.out.println("\033[93mDoctor login successful! Welcome, \033[0m" + loggedInDoctor.getName() + ".");
            doctorMenu(loggedInDoctor);
            return;
        }

        System.out.println("Invalid Doctor credentials. Please try again.");
    }


    /* ***************************************** Doctor menu ********************************************** */

    private void doctorMenu(Doctor doctor) 
    {
        while (true)
	 {
            System.out.println("\n---- Doctor Menu ----");
            System.out.println("1. View Appointments");
            System.out.println("2. Logout");
            System.out.print("Enter your choice: ");
            int choice = getIntegerInput();

            switch (choice) 
	    {
                case 1:
                    viewDoctorAppointments(doctor);
                    break;
                case 2:
                    System.out.println("Logging out from Doctor account...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    /* ****************************************** Doctor: View Appointments **************************************** */

    private void viewDoctorAppointments(Doctor doctor) 
    {
        boolean hasAppointments = false;
        System.out.println("\n---- Your Appointments ----");
        for (Appointment appointment : appointments) {
            if (appointment.getDoctorId() == doctor.getDoctorId()) {
                System.out.println(appointment);
                hasAppointments = true;
            }
        }
        if (!hasAppointments) {
            System.out.println("No appointments assigned to you.");
        }
    }





    /* ***************************************** Check if doctor is assigned to the patient (based on appointments) ************************************************ */

    private boolean isDoctorAssignedToPatient(Doctor doctor, Patient patient) 
   {
        for (Appointment appointment : appointments) 
	{
            if (appointment.getDoctorId() == doctor.getDoctorId() &&
                appointment.getPatientId() == patient.getPatientId())
	    {
                return true;
            }
        }
        return false;
    }

    /* ********************************************************* Patient login process *************************************************************** */

    private void patientLogin() {
        System.out.println("\u001B[35m"+"                     ##       ##                         ##    "+"\u001B[0m");
        System.out.println("\u001B[35m"+"                     ##                                  ##    "+"\u001B[0m");
        System.out.println("\u001B[35m"+" ######    ####     #####    ###      ####    #####     #####  "+"\u001B[0m");
        System.out.println("\u001B[35m"+"  ##  ##      ##     ##       ##     ##  ##   ##  ##     ##    "+"\u001B[0m");
        System.out.println("\u001B[35m"+"  ##  ##   #####     ##       ##     ######   ##  ##     ##    "+"\u001B[0m");
        System.out.println("\u001B[35m"+"  #####   ##  ##     ## ##    ##     ##       ##  ##     ## ## "+"\u001B[0m");
        System.out.println("\u001B[35m"+"  ##       #####      ###    ####     #####   ##  ##      ###  "+"\u001B[0m");
        System.out.println("\u001B[35m"+" ####    "+"\u001B[0m");

        System.out.print("Enter Patient Username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter Patient Password: ");
        String password = scanner.nextLine().trim();

        Patient loggedInPatient = null;
        for (Patient patient : patients) {
            if (patient.getUsername().equals(username) && patient.getPassword().equals(password)) {
                loggedInPatient = patient;
                break;
            }
        }

        if (loggedInPatient != null) {
            System.out.println("\033[93mPatient login successful! Welcome, \033[0m" + loggedInPatient.getName() + ".");
            patientMenu(loggedInPatient);
            return;
        }

        System.out.println("Invalid Patient credentials. Please try again.");
    }

    /* ************************************************************************************** Patient menu ***************************************************************** */

    private void patientMenu(Patient patient) {
        while (true) {
            System.out.println("\n---- Patient Menu ----");
            System.out.println("1. View Appointments");
            System.out.println("2. Book Appointment");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = getIntegerInput();

            switch (choice) {
                case 1:
                    viewPatientAppointments(patient);
                    break;
                case 2:
                    bookAppointment(patient);
                    break;
                case 3:
                    System.out.println("Logging out from Patient account...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /* *************************************************************************** Patient: View Appointments ********************************************************** */

    private void viewPatientAppointments(Patient patient) 
    {
        System.out.print("Enter Month (1-12): ");
        int month = getIntegerInput();
        System.out.print("Enter Year (e.g., 2024): ");
        int year = getIntegerInput();

        boolean hasAppointments = false;
        System.out.println("\n---- Your Appointments for " + month + "/" + year + " ----");

        for (Appointment appointment : appointments) 
	{
            if (appointment.getPatientId() == patient.getPatientId()) 
	    {
                LocalDate date = appointment.getDate();
                if (date.getMonthValue() == month && date.getYear() == year) {
                    System.out.println(appointment);
                    hasAppointments = true;
                }
            }
        }
        if (!hasAppointments) {
            System.out.println("No appointments found for the specified month and year.");
        }
    }

    /* ***************************************************************** Patient: Book Appointment ************************************************ */

    private void bookAppointment(Patient patient) {
    System.out.println("\n---- Book Appointment ----");
    System.out.println("Available Specialties:");
    ArrayList<String> specialties = getUniqueSpecialties();

    // Display specialties and get user selection
    for (int i = 0; i < specialties.size(); i++) {
        System.out.println((i + 1) + ". " + specialties.get(i));
    }

    System.out.print("Select Specialty by number: ");
    int specialtyChoice = getIntegerInput();

    if (specialtyChoice < 1 || specialtyChoice > specialties.size()) {
        System.out.println("Invalid specialty choice. Booking canceled.");
        return;
    }

    String selectedSpecialty = specialties.get(specialtyChoice - 1);
    ArrayList<Doctor> specializedDoctors = getDoctorsBySpecialty(selectedSpecialty);

    if (specializedDoctors.isEmpty()) {
        System.out.println("No doctors available with specialty: " + selectedSpecialty);
        return;
    }

    // Display doctors and get user selection
    System.out.println("\n---- Available Doctors ----");
    for (int i = 0; i < specializedDoctors.size(); i++) {
        System.out.println((i + 1) + ". " + specializedDoctors.get(i));
    }

    System.out.print("Select Doctor by number: ");
    int doctorChoice = getIntegerInput();

    if (doctorChoice < 1 || doctorChoice > specializedDoctors.size()) {
        System.out.println("Invalid doctor choice. Booking canceled.");
        return;
    }

    Doctor selectedDoctor = specializedDoctors.get(doctorChoice - 1);
    
    // Get patient's medical problem
    scanner.nextLine(); // Consume leftover newline
    System.out.println("Enter patient problem: ");
    String problem = scanner.nextLine();
    patient.disease = problem;

    // Get year and month for the appointment
    System.out.println("Enter year for appointment: ");
    int year = scanner.nextInt();
    System.out.println("Enter Month for appointment: ");
    int month = scanner.nextInt();

    // Create the first day of the chosen month
    LocalDate date1 = LocalDate.of(year, month, 1);
    System.out.println("Su Mo Tu We Th Fr Sa");

    // Print the calendar for the month
    int dayOfWeek = date1.getDayOfWeek().getValue() % 7;  // Adjust for Sunday = 0
    for (int i = 0; i < dayOfWeek; i++) {
        System.out.print("   ");
    }

    while (date1.getMonthValue() == month) {
        System.out.printf("%2d ", date1.getDayOfMonth());
        if (date1.getDayOfWeek().getValue() % 7 == 6) {
            System.out.println();
        }
        date1 = date1.plusDays(1);
    }
    System.out.println();

    // Get the day of the month for the appointment
    scanner.nextLine(); // Consume leftover newline
    System.out.print("Enter Appointment Date (DD): ");
    String dateInput = scanner.nextLine().trim();

    // Ensure the day is two digits
    String formattedMonth = String.format("%02d", month);  // Two digits for the month
    String formattedDay = String.format("%02d", Integer.parseInt(dateInput));  // Two digits for the day

    // Create the date string
    dateInput = year + "-" + formattedMonth + "-" + formattedDay;

    LocalDate date;
    try {
        date = LocalDate.parse(dateInput);
    } catch (DateTimeParseException e) {
        System.out.println("Invalid date. Booking canceled.");
        return;
    }

    // Check if the date is in the past
    if (date.isBefore(LocalDate.now())) {
        System.out.println("You cannot book an appointment in the past. Please select a future date.");
        return;
    }

    // Check if the selected date is a Sunday
    DayOfWeek dayOfWeek1 = date.getDayOfWeek();
    if (dayOfWeek1 == DayOfWeek.SUNDAY) {
        System.out.println("Sorry, doctors are not available on Sunday. Try with another date.");
        return;
    }

    // Check if the patient already has an appointment on the selected date
    for (Appointment appointment : appointments) {
        if (appointment.getPatientId() == patient.getPatientId() && appointment.getDate().equals(date)) {
            System.out.println("You already have an appointment on this date. Booking canceled.");
            return;
        }
    }

    // Create and add the new appointment
    Appointment newAppointment = new Appointment(selectedDoctor.getDoctorId(), patient.getPatientId(), date);
    appointments.add(newAppointment);
    System.out.println("\033[93mAppointment booked successfully! Appointment ID: \033[0m" + newAppointment.getAppointmentId());
   }


    // Get unique specialties from the list of doctors

    private ArrayList<String> getUniqueSpecialties() {
        ArrayList<String> specialties = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (!specialties.contains(doctor.getSpecialty())) {
                specialties.add(doctor.getSpecialty());
            }
        }
        return specialties;
    }

    // Get doctors by specialty

    private ArrayList<Doctor> getDoctorsBySpecialty(String specialty) {
        ArrayList<Doctor> specializedDoctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getSpecialty().equalsIgnoreCase(specialty)) {
                specializedDoctors.add(doctor);
            }
        }
        return specializedDoctors;
    }

    // Check if a string is a valid date (basic validation)
    private boolean isValidDate(String date) {
        // Basic regex for YYYY-MM-DD
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    // Find Doctor by Username

    private Doctor findDoctorByUsername(String username) {
        for (Doctor doctor : doctors) {
            if (doctor.getUsername().equalsIgnoreCase(username)) {
                return doctor;
            }	
        }
        return null;
    }

    // Find Doctor by ID

    private Doctor findDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    // Find Patient by Username

    private Patient findPatientByUsername(String username) {
        for (Patient patient : patients) {
            if (patient.getUsername().equalsIgnoreCase(username)) {
                return patient;
            }
        }
        return null;
    }

    // Find Patient by ID

    private Patient findPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    // Utility method to get integer input with validation

    private int getIntegerInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                return input;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    public static boolean isValidName(String name) {
        return name.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_]+$");
    }

    public static boolean isValidPassword(String password) {
        // Check if password length is at least 6
        if (password.length() < 6) {
            return false;
        }
    
        // Variables to track constraints
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        boolean hasNumber = false;
    
        // Iterate through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
    
            // Break early if all conditions are satisfied
            if (hasUpperCase && hasSpecialChar && hasNumber) {
                return true;
            }
        }
    
        // Return false if any condition is not satisfied
        return false;
    }

    // Main method
    public static void main(String[] args)
    {
        HospitalManagementSystem system = new HospitalManagementSystem();
        system.start();
    }
}
