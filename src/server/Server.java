package server;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Server {
    
    public static void main(String[] args) throws RemoteException{
        Registry reg = LocateRegistry.createRegistry(1040);
        reg.rebind("assignment", new functions());
    }
    
    public static class functions extends UnicastRemoteObject implements appinterface {
        
        private String loggedUsername;
        private String loggedID;
        
        private ArrayList<String> eID = new ArrayList();
        private ArrayList<String> efirst = new ArrayList();
        private ArrayList<String> elast = new ArrayList();
        private ArrayList<String> ephone = new ArrayList();
        private ArrayList<String> edepartment = new ArrayList();
        private ArrayList<String> eemail = new ArrayList();
        private ArrayList<String> eusername = new ArrayList();
        private ArrayList<String> epassword = new ArrayList();
        private ArrayList<String> eBankNo = new ArrayList();
        private ArrayList<String> eBankID = new ArrayList();
        private ArrayList<String> eSalary = new ArrayList();
        private ArrayList<String> eAbsent = new ArrayList();
        private ArrayList<String> eUnpaid = new ArrayList();
        
        private ArrayList<String> hrID = new ArrayList();
        private ArrayList<String> hrusername = new ArrayList();
        private ArrayList<String> hrpassword = new ArrayList();
        private ArrayList<String> hrname = new ArrayList();
        
        private String overtime;
        private String absent;
        private String kwsp;
        private String mtd;
        
        private ArrayList<String> claimID = new ArrayList();
        private ArrayList<String> empID = new ArrayList();
        private ArrayList<String> date = new ArrayList();
        private ArrayList<String> ammount = new ArrayList();
        private ArrayList<String> desc = new ArrayList();
        private ArrayList<String> type = new ArrayList();
        private ArrayList<String> status = new ArrayList();
    
        public functions() throws RemoteException{
            super();
        }

        public void readEmpFile() {   
            eID.clear();
            efirst.clear();
            elast.clear();
            ephone.clear();
            edepartment.clear();
            eemail.clear();
            eusername.clear();
            epassword.clear();
            eBankNo.clear();
            eBankID.clear();
            eSalary.clear();
            eAbsent.clear();
            eUnpaid.clear();
            try ( BufferedReader file = new BufferedReader(new FileReader("EmpUsers.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    eID.add(values[0]);
                    efirst.add(values[1]);
                    elast.add(values[2]);
                    ephone.add(values[3]);
                    edepartment.add(values[4]);
                    eemail.add(values[5]);
                    eusername.add(values[6]);
                    epassword.add(values[7]);
                    eBankNo.add(values[8]);
                    eBankID.add(values[9]);
                    eSalary.add(values[10]);
                    eAbsent.add(values[11]);
                    eUnpaid.add(values[12]);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void readReqFile() {  
            eID.clear();
            efirst.clear();
            elast.clear();
            ephone.clear();
            edepartment.clear();
            eemail.clear();
            eusername.clear();
            epassword.clear();
            eBankNo.clear();
            eBankID.clear();
            eSalary.clear();
            eAbsent.clear();
            eUnpaid.clear();
            try ( BufferedReader file = new BufferedReader(new FileReader("Requests.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    eID.add(values[0]);
                    efirst.add(values[1]);
                    elast.add(values[2]);
                    ephone.add(values[3]);
                    edepartment.add(values[4]);
                    eemail.add(values[5]);
                    eusername.add(values[6]);
                    epassword.add(values[7]);
                    eBankNo.add(values[8]);
                    eBankID.add(values[9]);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void readHRFile() {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("HRUsers.txt"))) {
                List<List<String>> data = (List<List<String>>) in.readObject();
                hrID.clear();
                hrusername.clear();
                hrpassword.clear();
                hrname.clear();
                for (List<String> userData : data) {
                    hrID.add(userData.get(0));
                    hrusername.add(userData.get(1));
                    hrpassword.add(userData.get(2));
                    hrname.add(userData.get(3));
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error reading data from file: " + e.getMessage());
            }
        }
        
        public void readClaimsFile() {     
            claimID.clear();
            empID.clear();
            date.clear();
            ammount.clear();
            desc.clear();
            type.clear();
            status.clear();
            try ( BufferedReader file = new BufferedReader(new FileReader("Claims.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    claimID.add(values[0]);
                    empID.add(values[1]);
                    date.add(values[2]);
                    ammount.add(values[3]);
                    desc.add(values[4]);
                    type.add(values[5]);
                    status.add(values[6]);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void readPaymentFile() {     
            try ( BufferedReader file = new BufferedReader(new FileReader("Payment.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    overtime = values[0];
                    absent = values[1];
                    kwsp = values[2];
                    mtd = values[3];
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void editClaimsFile(String ID,String status){
            readClaimsFile();
            for(int i=0;i<this.claimID.size();i++){
                if(ID.equals(this.claimID.get(i))){
                    this.status.set(i, status);
                }
            }
            try ( FileWriter file = new FileWriter("Claims.txt");) {
                file.write("CLAIM_ID,EMP_ID,DATE,AMMOUNT,DESCRIPTION,TYPE,STATUS\n");
                for (int i = 0; i < this.empID.size(); i++) {
                    file.write(this.claimID.get(i) + "," + this.empID.get(i) + "," + this.date.get(i) + "," + this.ammount.get(i) + "," + this.desc.get(i) + "," + this.type.get(i) + "," + this.status.get(i) + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }

        }
        
        public void editPaymentFile(String type,String number){
            readPaymentFile();
            if(type.equals("overtime")){
                this.overtime = number;
            }else if(type.equals("absent")){
                this.absent = number;
            }else if(type.equals("kwsp")){
                this.kwsp = number;
            }else if(type.equals("mtd")){
                this.mtd = number;
            }
            try ( FileWriter file = new FileWriter("Payment.txt");) {
                file.write("OVERTIME,ABSENT,KWSP,MTD\n");
                file.write(this.overtime + "," + this.absent + "," + this.kwsp + "," + this.mtd);
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }

        }
        
        public void editEmpFile(String empID,String type,String value){
            readEmpFile();
            for(int i=0;i<this.eID.size();i++){
                if(empID.equals(this.eID.get(i))){
                    if(type.equals("salary")){
                        this.eSalary.set(i, value); 
                    }else if (type.equals("absent")){
                        this.eAbsent.set(i, value);
                    }else if (type.equals("unpaid")){
                        this.eUnpaid.set(i, value);
                    }
                }
            }
            try ( FileWriter file = new FileWriter("EmpUsers.txt");) {
                file.write("ID,FIRST_NAME,LAST_NAME,PHONE,DEPARTMENT,EMAIL,USERNAME,PASSWORD,BANK_NUMBER,BANK_ID,SALARY,ABSENT,UNPAID\n");
                for (int i = 0; i < this.eID.size(); i++) {
                    file.write(this.eID.get(i) + ","
                            + this.efirst.get(i) + ","
                            + this.elast.get(i) + ","
                            + this.ephone.get(i) + ","
                            + this.edepartment.get(i) + ","
                            + this.eemail.get(i) + ","
                            + this.eusername.get(i) + ","
                            + this.epassword.get(i) + ","
                            + this.eBankNo.get(i) + ","
                            + this.eBankID.get(i) + ","
                            + this.eSalary.get(i) + ","
                            + this.eAbsent.get(i) + ","
                            + this.eUnpaid.get(i) + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }

        }
        
        public void editHRUser(String ID, String username, String password, String name) {
            readHRFile(); 
            hrID.add(ID);
            hrusername.add(username);
            hrpassword.add(password);
            hrname.add(name);
            serializeData(toDataList());
        }

        public void deleteHRUser(String ID) {
            readHRFile(); // Deserialize data to memory
            int index = hrID.indexOf(ID);
            if (index != -1) {
                hrID.remove(index);
                hrusername.remove(index);
                hrpassword.remove(index);
                hrname.remove(index);
            }
            // Serialize the updated list back to file
            serializeData(toDataList());
        }

        public void deleteEmpUser(String ID) {
            readHRFile();
            for(int i=0;i<this.eID.size();i++){
                if(ID.equals(this.eID.get(i))){
                    this.eID.remove(i);
                    this.efirst.remove(i);
                    this.elast.remove(i);
                    this.ephone.remove(i);
                    this.edepartment.remove(i);
                    this.eemail.remove(i);
                    this.eusername.remove(i);
                    this.epassword.remove(i);
                    this.eBankNo.remove(i);
                    this.eBankID.remove(i);
                    this.eSalary.remove(i);
                    this.eAbsent.remove(i);
                    this.eUnpaid.remove(i);
                }
            }
            try ( FileWriter file = new FileWriter("EmpUsers.txt");) {
                file.write("ID,FIRST_NAME,LAST_NAME,PHONE,DEPARTMENT,EMAIL,USERNAME,PASSWORD,BANK_NUMBER,BANK_ID,SALARY,ABSENT,UNPAID\n");
                for (int i = 0; i < this.eID.size(); i++) {
                    file.write(this.eID.get(i) + ","
                            + this.efirst.get(i) + ","
                            + this.elast.get(i) + ","
                            + this.ephone.get(i) + ","
                            + this.edepartment.get(i) + ","
                            + this.eemail.get(i) + ","
                            + this.eusername.get(i) + ","
                            + this.epassword.get(i) + ","
                            + this.eBankNo.get(i) + ","
                            + this.eBankID.get(i) + ","
                            + this.eSalary.get(i) + ","
                            + this.eAbsent.get(i) + ","
                            + this.eUnpaid.get(i) + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void deleteRequest(String ID) {
            readReqFile();
            for(int i=0;i<this.eID.size();i++){
                if(ID.equals(this.eID.get(i))){
                    eID.remove(i);
                    efirst.remove(i);
                    elast.remove(i);
                    ephone.remove(i);
                    edepartment.remove(i);
                    eemail.remove(i);
                    eusername.remove(i);
                    epassword.remove(i);
                    eBankNo.remove(i);
                    eBankID.remove(i);
                }
            }
            try ( FileWriter file = new FileWriter("Requests.txt");) {
                file.write("ID,FIRST_NAME,LAST_NAME,PHONE,DEPARTMENT,EMAIL,USERNAME,PASSWORD,BANK_NUMBER,BANK_ID\n");
                for (int i = 0; i < this.eID.size(); i++) {
                    file.write(this.eID.get(i) + "," + this.efirst.get(i) + "," + this.elast.get(i) + "," + this.ephone.get(i) + "," + this.edepartment.get(i) + "," + this.eemail.get(i) + "," + this.eusername.get(i) + "," + this.epassword.get(i) + "," + this.eBankNo.get(i) + "," + this.eBankID.get(i) + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public ArrayList<String> getHRFile() {
            ArrayList<String> content = new ArrayList<>();
            content.add("ID,USERNAME,PASSWORD,NAME");
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("HRUsers.txt"))) {
                List<List<String>> data = (List<List<String>>) in.readObject();
                for (List<String> userData : data) {
                    content.add(String.join(",", userData));
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error reading data from file: " + e.getMessage());
            }
            return content;
        }

        public ArrayList<String> getReqFile() {     
            ArrayList<String> content = new ArrayList();
            try ( BufferedReader file = new BufferedReader(new FileReader("Requests.txt"))) {
                String line;
                content.add(file.readLine());
                while ((line = file.readLine()) != null) {
                    content.add(line);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return content;
        }
        
        public ArrayList<String> getEmpFile() {     
            ArrayList<String> content = new ArrayList();
            try ( BufferedReader file = new BufferedReader(new FileReader("EmpUsers.txt"))) {
                String line;
                content.add(file.readLine());
                while ((line = file.readLine()) != null) {
                    content.add(line);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return content;
        }
        
        public ArrayList<String> getClaimsFile() {     
            ArrayList<String> content = new ArrayList();
            try ( BufferedReader file = new BufferedReader(new FileReader("Claims.txt"))) {
                String line;
                content.add(file.readLine());
                while ((line = file.readLine()) != null) {
                    content.add(line);
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return content;
        }
        
        public ArrayList<String> getPaymentInfo() {
            ArrayList<String> content = new ArrayList();
            readPaymentFile();
            content.add(overtime);
            content.add(absent);
            content.add(kwsp);
            content.add(mtd);
            return content;
        }
        
        public String login(String ID,String password){
            readEmpFile();
            readHRFile();
            
            if(ID.equals("admin") && password.equals("admin")){
                return "admin";
            }else{
                for( int i=0;i<this.eusername.size();i++){
                    if(ID.equals(this.eusername.get(i)) && password.equals(this.epassword.get(i))){
                        setLoggedID(eID.get(i));
                        setLoggedUsername(ID);
                        return "emp";
                    }
                }
                for( int i=0;i<this.hrusername.size();i++){
                    if(ID.equals(this.hrusername.get(i)) && password.equals(this.hrpassword.get(i))){
                        setLoggedID(hrID.get(i));
                        setLoggedUsername(hrname.get(i));
                        return "hr";
                    }
                }
            }
            return "false";
        }
        
        public void registerEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID) {
            try ( FileWriter file = new FileWriter("Requests.txt",true);) {
                file.write(ID+","+first+","+last+","+phone+","+department+","+email+","+username+","+password+","+bankNo+","+bankID+"\n");
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void acceptEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID, String salary) {
            try ( FileWriter file = new FileWriter("EmpUsers.txt",true);) {
                file.write(ID+","+first+","+last+","+phone+","+department+","+email+","+username+","+password+","+bankNo+","+bankID+","+salary+",0,0\n");
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void editEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID) {
            readEmpFile();
            int index = eID.indexOf(ID);
            if (index != -1) {
                eID.set(index, ID);
                efirst.set(index, first);
                elast.set(index, last);
                ephone.set(index, phone);
                edepartment.set(index, department);
                eemail.set(index, email);
                eusername.set(index, username);
                epassword.set(index, password);
                eBankNo.set(index, bankNo);
                eBankID.set(index, bankID);
            }
            try ( FileWriter file = new FileWriter("EmpUsers.txt");) {
                file.write("ID,FIRST_NAME,LAST_NAME,PHONE,DEPARTMENT,EMAIL,USERNAME,PASSWORD,BANK_NUMBER,BANK_ID,SALARY,ABSENT,UNPAID\n");
                for (int i = 0; i < this.eID.size(); i++) {
                    file.write(this.eID.get(i) + ","
                            + this.efirst.get(i) + ","
                            + this.elast.get(i) + ","
                            + this.ephone.get(i) + ","
                            + this.edepartment.get(i) + ","
                            + this.eemail.get(i) + ","
                            + this.eusername.get(i) + ","
                            + this.epassword.get(i) + ","
                            + this.eBankNo.get(i) + ","
                            + this.eBankID.get(i) + ","
                            + this.eSalary.get(i) + ","
                            + this.eAbsent.get(i) + ","
                            + this.eUnpaid.get(i) + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public void addClaim(String ID, String date, String ammount, String desc, String type) {
            readClaimsFile();
            try (FileWriter file = new FileWriter("Claims.txt", true);) {
                String claimID = Integer.toString(Integer.parseInt(this.claimID.get(this.claimID.size()-1))+1);
                file.write(claimID + "," + ID + "," + date + "," + ammount + "," + desc + "," + type + ",pending\n");
                file.close();
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
        }
        
        public static void serializeData(List<List<String>> data) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("HRUsers.txt"))) {
                out.writeObject(data);
                System.out.println("Data has been successfully serialized and written to file.");
            } catch (IOException e) {
                System.out.println("Error writing data to file: " + e.getMessage());
            }
        }
        
        private List<List<String>> toDataList() {
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < hrID.size(); i++) {
                List<String> userData = new ArrayList<>();
                userData.add(hrID.get(i));
                userData.add(hrusername.get(i));
                userData.add(hrpassword.get(i));
                userData.add(hrname.get(i));
                data.add(userData);
            }
            return data;
        }
        
        public ArrayList<String> getEmpData(String ID){
            ArrayList<String> content = new ArrayList();
            int index = eID.indexOf(ID);
            content.add(eID.get(index));
            content.add(efirst.get(index));
            content.add(elast.get(index));
            content.add(ephone.get(index));
            content.add(edepartment.get(index));
            content.add(eemail.get(index));
            content.add(eusername.get(index));
            content.add(epassword.get(index));
            content.add(eBankNo.get(index));
            content.add(eBankID.get(index));
            content.add(eSalary.get(index));
            content.add(eAbsent.get(index));
            content.add(eUnpaid.get(index));
            return content;
        }
        
        public int getNoRequests() {
            int number = 0;
            try ( BufferedReader file = new BufferedReader(new FileReader("Requests.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    number++;
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return number;
        }
        
        public int getNoEmp() {
            int number = 0;
            try ( BufferedReader file = new BufferedReader(new FileReader("EmpUsers.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    number++;
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return number;
        }
        
        public int getNoClaims() {
            int number = 0;
            try ( BufferedReader file = new BufferedReader(new FileReader("Claims.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values[6].equals("pending")){
                        number++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return number;
        }
        
        public int getOtherClaims() {
            int number = 0;
            try ( BufferedReader file = new BufferedReader(new FileReader("Claims.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values[5].equals("other")){
                        number++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return number;
        }
        
        public int getOvertimeClaims() {
            int number = 0;
            try ( BufferedReader file = new BufferedReader(new FileReader("Claims.txt"))) {
                String line;
                file.readLine();
                while ((line = file.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values[5].equals("overtime")){
                        number++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Incorrect File Path");
            }
            return number;
        }

        public int getOvertimeEmp(String ID){
            int number = 0;
            readClaimsFile();
            for(int i=0;i<this.empID.size();i++){
                if(ID.equals(empID.get(i))){
                    if(status.get(i).equals("pending") && type.get(i).equals("overtime")){
                        number++;
                    }
                }
            }
            return number;
        }
        
        public int getOtherEmp(String ID){
            int number = 0;
            readClaimsFile();
            for(int i=0;i<this.empID.size();i++){
                if(ID.equals(empID.get(i))){
                    if(status.get(i).equals("pending") && type.get(i).equals("other")){
                        number++;
                    }
                }
            }
            return number;
        }
        
        public String getOvertime() {
            readPaymentFile();
            return overtime;
        }

        public String getAbsent() {
            readPaymentFile();
            return absent;
        }

        public String getKwsp() {
            readPaymentFile();
            return kwsp;
        }

        public String getMtd() {
            readPaymentFile();
            return mtd;
        }
        
        public int getOvertimeClaims(String ID){
            int number = 0;
            readClaimsFile();
            for (int i = 0; i < this.empID.size(); i++) {
                if (ID.equals(empID.get(i))) {
                    if (status.get(i).equals("accepted") && type.get(i).equals("overtime")) {
                        number += Integer.parseInt(ammount.get(i));
                    }
                }
            }
            return number;
        }
        
        public int getOtherClaims(String ID){
            int number = 0;
            readClaimsFile();
            for (int i = 0; i < this.empID.size(); i++) {
                if (ID.equals(empID.get(i))) {
                    if (status.get(i).equals("accepted") && type.get(i).equals("other")) {
                        number += Integer.parseInt(ammount.get(i));
                    }
                }
            }
            return number;
        }

        private void setLoggedUsername(String loggedUsername) {
            this.loggedUsername = loggedUsername;
        }

        public String getLoggedUsername() {
            return loggedUsername;
        }

        public String getLoggedID() {
            return loggedID;
        }

        public void setLoggedID(String loggedID) {
            this.loggedID = loggedID;
        }
    }
    
}

