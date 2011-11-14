import java.io.Serializable;

public class Address implements Serializable{
    private String    street;
    private int zip;
    
    public Address(String street, int zip){
         this.street = street;
         this.zip = zip;
    }
    

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

}