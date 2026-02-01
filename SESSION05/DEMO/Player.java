package SESSION05.DEMO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Player {
    private String playId;
    private String namePlayer;
    private String genderPlayer;
    private Date birthPlayer;
    private String addressPlayer;
    private String address;
    private double pricePlayer;
    public Player(){}
    public Player(String playId, String namePlayer, String genderPlayer, String birthPlayerStr, String addressPlayer, String address, double pricePlayer) throws ParseException {
        this.playId = playId;
        this.namePlayer = namePlayer;
        this.genderPlayer = genderPlayer;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.birthPlayer = sdf.parse(birthPlayerStr);

        this.addressPlayer = addressPlayer;
        this.address = address;
        this.pricePlayer = pricePlayer;
    }

    public double getPricePlayer() {
        return pricePlayer;
    }

    public void setPricePlayer(double pricePlayer) {
        this.pricePlayer = pricePlayer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressPlayer() {
        return addressPlayer;
    }

    public Date getBirthPlayer() {
        return birthPlayer;
    }

    public void setBirthPlayer(Date birthPlayer) {
        this.birthPlayer = birthPlayer;
    }

    public void setAddressPlayer(String addressPlayer) {
        this.addressPlayer = addressPlayer;
    }

    public String getGenderPlayer() {
        return genderPlayer;
    }

    public void setGenderPlayer(String genderPlayer) {
        this.genderPlayer = genderPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getAllPlayer(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + playId +
                "\nName Player: " + namePlayer +
                "\nGender Player: " + genderPlayer +
                "\nBirth Player: " + sdf.format(birthPlayer) +
                "\nAddress Player: " + addressPlayer +
                "\nAddress: " + address +
                "\nPrice Player: " + pricePlayer;
    }
}
