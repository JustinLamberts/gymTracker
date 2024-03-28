package nl.justin.GymTracker.gymTracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Justin Lamberts
 * Purpose for the class
 **/
@Entity
public class Machine {
    @Id @GeneratedValue
    private long machinid;
    private String naam;
    private int verschillendeOefeningen;

    public Machine(int machinid, String naam, int verschillendeOefeningen) {
        this.machinid = machinid;
        this.naam = naam;
        this.verschillendeOefeningen = verschillendeOefeningen;
    }

    public Machine() {
    }

    public long getMachinid() {
        return machinid;
    }

    public void setMachinid(int machinid) {
        this.machinid = machinid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVerschillendeOefeningen() {
        return verschillendeOefeningen;
    }

    public void setVerschillendeOefeningen(int verschillendeOefeningen) {
        this.verschillendeOefeningen = verschillendeOefeningen;
    }
}
