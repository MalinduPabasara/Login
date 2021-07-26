package lk.stitchline.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private String nic;
    private String address;
    private int empNo;
    private String name;
    private String email;
    private int mobile;
    private String userName;
    private String password;
    private String userType;
}
