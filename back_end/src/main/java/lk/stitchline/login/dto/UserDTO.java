package lk.stitchline.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
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
