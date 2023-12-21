package com.springDemo.demo.dto.response;

import com.springDemo.demo.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Integer id;
    private String country;
    private String state;
    private String city;

    public AddressResponse (Address address){
        this.id = address.getId();
        this.country = address.getCountry();
        this.state = address.getState();
        this.city = address.getCity();
    }
}



