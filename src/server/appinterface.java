package server;
import java.rmi.*;
import java.util.ArrayList;

public interface appinterface extends Remote{
    public String getLoggedUsername() throws RemoteException;
    public String getLoggedID() throws RemoteException;
    public String login(String ID,String password) throws RemoteException;
    public void registerEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID) throws RemoteException;
    public int getNoRequests() throws RemoteException;
    public int getNoClaims() throws RemoteException;
    public String getOvertime() throws RemoteException;
    public String getAbsent() throws RemoteException;
    public String getKwsp() throws RemoteException;
    public String getMtd() throws RemoteException;
    public ArrayList<String> getHRFile() throws RemoteException;
    public void deleteHRUser(String ID) throws RemoteException;
    public void editHRUser(String ID, String username, String password, String name) throws RemoteException;
    public int getNoEmp() throws RemoteException;
    public int getOtherClaims() throws RemoteException;
    public int getOvertimeClaims() throws RemoteException;
    public ArrayList<String> getReqFile() throws RemoteException;
    public void acceptEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID, String salary) throws RemoteException;
    public void deleteRequest(String ID) throws RemoteException;
    public ArrayList<String> getClaimsFile() throws RemoteException;
    public void editClaimsFile(String ID,String status) throws RemoteException;
    public void editPaymentFile(String type,String number) throws RemoteException;
    public ArrayList<String> getPaymentInfo() throws RemoteException;
    public ArrayList<String> getEmpFile() throws RemoteException;
    public void deleteEmpUser(String ID) throws RemoteException;
    public void editEmpFile(String empID,String type,String value) throws RemoteException;
    public ArrayList<String> getEmpData(String ID) throws RemoteException;
    public int getOvertimeEmp(String ID) throws RemoteException;
    public int getOtherEmp(String ID) throws RemoteException;
    public int getOvertimeClaims(String ID) throws RemoteException;
    public int getOtherClaims(String ID) throws RemoteException;
    public void editEmployee(String ID, String first, String last, String phone, String department, String email, String username, String password, String bankNo, String bankID) throws RemoteException;
    public void addClaim(String ID, String date, String ammount, String desc, String type) throws RemoteException;
}
