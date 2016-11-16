package com.junabazar.inventory.model.view;

import com.junabazar.inventory.model.db.City;
import lombok.*;

/**
 * Created by kunal on 11/16/16.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserView {
    private String fullName;
    private String email;
    private String password;
    private String mobileNo;
    private long cityId;
}
