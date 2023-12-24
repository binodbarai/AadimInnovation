package com.springDemo.demo.service;

import com.springDemo.demo.dto.request.AddressRequest;
import com.springDemo.demo.dto.request.AddressUpdateRequest;
import com.springDemo.demo.dto.response.AddressResponse;
import com.springDemo.demo.dto.response.StudentResponse;

import java.util.List;

public interface AddressService {


    AddressResponse saveAddress(AddressRequest request);
    List<AddressResponse> getAllAddresses();

    AddressResponse getById(Integer id);


    AddressResponse updateAddress(AddressUpdateRequest request);

    String deleteAddress(Integer id);


}
