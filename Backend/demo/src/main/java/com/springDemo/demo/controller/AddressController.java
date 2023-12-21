package com.springDemo.demo.controller;

import com.springDemo.demo.dto.request.AddressRequest;
import com.springDemo.demo.dto.request.AddressUpdateRequest;
import com.springDemo.demo.dto.request.StudentRequest;
import com.springDemo.demo.dto.response.AddressResponse;
import com.springDemo.demo.dto.response.StudentResponse;
import com.springDemo.demo.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping("/save")
    public AddressResponse save(@RequestBody AddressRequest request){
        return addressService.saveAddress(request);
    }

    @GetMapping("/fetch")
    public List<AddressResponse> getAll(){
        return addressService.getAllAddresses();
    }

    @GetMapping("/fetch/{id}")
    public AddressResponse getById(@PathVariable Integer id){
        return addressService.getById(id);
    }

    @PutMapping("/update")
    public AddressResponse updateAddress(@RequestBody AddressUpdateRequest request){
        return addressService.updateAddress(request);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Integer id){
        return addressService.deleteAddress(id);
    }



}
