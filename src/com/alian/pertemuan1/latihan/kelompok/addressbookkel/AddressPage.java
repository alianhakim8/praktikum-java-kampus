package com.alian.pertemuan1.latihan.kelompok.addressbookkel;

public class AddressPage {
    //attributes
    private String name;
    private String address;
    private int phone;
    private String email;
    private static int nbInstance;

    public AddressPage() {
        name = "";
        address = "";
        phone = 0;
        email = "";
        nbInstance++;
    }

    public AddressPage(AddressPage a) {
        name = a.getName();
        address = a.getAddress();
        phone = a.getPhone();
        email = a.getEmail();
        nbInstance++;
    }

    public AddressPage(String nama, String alamat, int telepon, String mail) {
        name = nama;
        address = alamat;
        phone = telepon;
        email = mail;
        nbInstance++;
    }

    public void setName(String nama) {
        name = nama;
    }

    public void setAddress(String alamat) {
        address = alamat;
    }

    public void setPhone(int telepon) {
        phone = telepon;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public static int getNbInstance() {
        return nbInstance;
    }

    public String toString() {
        return ("\n Name : " + name + "\n Address : " + address + "\n Phone : " + phone + "\n Email : " + email);
    }

    public static int matches(AddressPage a1, AddressPage a2) {
        if (a1.getName().equals(a2.getName()) && a1.getAddress().equals(a2.getAddress()) && a1.getPhone() == (a2.getPhone()) && a1.getEmail().equals(a2.getEmail())) {
            return 1;
        } else {
            return 0;
        }
    }

    public int matches(AddressPage a) {
        if (this.getName().equals(a.getName()) && this.getAddress().equals(a.getAddress()) && this.getPhone() == (a.getPhone()) && this.getEmail().equals(a.getEmail())) {
            return 1;
        } else {
            return 0;
        }
    }
}
