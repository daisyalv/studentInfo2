import java.util.*;

public class studenProfile {

    private String m_fname;
    private String m_lname;
    private int m_peoplesoft;
    private String m_sclass;
    private String m_email;
    private String m_address;
    private String m_city;
    private String m_state;
    private int m_zipcode;

    public studenProfile(String fname, String lname, int peoplesoft, String sclass, String email, String address, String city, String state, int zipcode) {
        m_fname = fname;
        m_lname= lname;
        m_peoplesoft = peoplesoft;
        m_sclass = sclass;
        m_email = email;
        m_address = address;
        m_city= city;
        m_state=state;
        m_zipcode= zipcode;
    }

    public String getfName() {
        return m_fname;
    }
    public String getlName() {
        return m_lname;
    }


    public int getPeoplesoft() {
        return m_peoplesoft;
    }

    public String getSclass() {
        return m_sclass;
    }

    public String getEmail() {
        return m_email;
    }

    public String getAddress() {
        return m_address;
    }
    public String getCity() {
        return m_city;
    }
        public String getState() {
            return m_state;

    }
    public int getZipcode() {
        return m_zipcode;
    }
    public String toString() {
        return "First name: " + m_fname + "Last name: " + m_fname +  ", Peoplesoft ID: " + m_peoplesoft +
                ", Class Classification: " + m_sclass + ", Email: " + m_email +
                ", Address: " + m_address + "City: " + m_city + "State: " + m_state + "Zipcode: " + m_zipcode;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuChoice = 4;
            System.out.println("\t\t\tStudent Record Menu");
            System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
            {
                System.out.println("Enter a choice: ");
                menuChoice = Integer.parseInt(input.nextLine());
            }


            if (menuChoice == 1) {
                System.out.println("First name:");
                String fname = input.nextLine();
                System.out.println("Last  name:");
                String lname = input.nextLine();

                int peoplesoft = -1;
                do {
                    try {
                        System.out.println("Peoplesoft:");
                        peoplesoft = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Enter your Peoplesoft ID!");
                    }
                }
                while (peoplesoft <= 0);

                System.out.println("Class Classification:");
                String sclass = input.nextLine();

                System.out.println("Email:");
                String email = input.nextLine();

                System.out.println("Address:");
                String address = input.nextLine();

                System.out.println("City:");
                String city = input.nextLine();

                System.out.println("State:");
                String state = input.nextLine();

                System.out.println("Zipcode:");
                int zipcode = Integer.parseInt(input.nextLine());



            }
        }
    }
