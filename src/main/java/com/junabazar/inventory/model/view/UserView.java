package com.junabazar.inventory.model.view;

import com.junabazar.inventory.model.db.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by kunal on 11/16/16.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserView {
    private String fullName;
    private String email;
    private String password;
    private String mobileNo;
    private long cityId;
}
