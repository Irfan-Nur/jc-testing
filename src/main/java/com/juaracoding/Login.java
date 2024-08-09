package com.juaracoding;

public class Login {

    public boolean isLogin (String username,String password){
        if (username.equals("admin")&& password.equals("p4ssw0rd")){
            return true;
        }else {
            return false;
        }
    }

    // retur value String
    // buatkan fungsi pesan berhasil login, invalid jika false
    public String messageLogin (boolean isLogin){
        return isLogin ? "Berhasil Login" : "Invalid Login";
    }

}
