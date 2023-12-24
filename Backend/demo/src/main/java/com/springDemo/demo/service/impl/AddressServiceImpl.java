package com.springDemo.demo.service.impl;

import com.springDemo.demo.dto.request.AddressRequest;
import com.springDemo.demo.dto.request.AddressUpdateRequest;
import com.springDemo.demo.dto.response.AddressResponse;
import com.springDemo.demo.dto.response.StudentResponse;
import com.springDemo.demo.entity.Address;
import com.springDemo.demo.entity.Student;
import com.springDemo.demo.repository.AddressRepository;
import com.springDemo.demo.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    @Override
    public AddressResponse saveAddress(AddressRequest request){
        Address address = new Address();
        address.setCountry(request.getCountry());
        address.setState(request.getState());
        address.setCity(request.getCity());

        Address savedAddress = addressRepository.save(address);
        return  new AddressResponse(savedAddress);
    }

    @Override
    public List<AddressResponse> getAllAddresses() {
        List<AddressResponse> addressResponses = new ArrayList<>();
        List<Address> addresses = addressRepository.findAll();
        for(Address address : addresses){
            addressResponses.add(new AddressResponse(address));
        }
        return addressResponses;
    }

    @Override
    public AddressResponse getById(Integer id) {
        Address address = addressRepository.getReferenceById(id);
        return new AddressResponse(address);
    }

    @Override
    public AddressResponse updateAddress(AddressUpdateRequest request) {
        Address address= addressRepository.getReferenceById(request.getId());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setCountry(request.getCountry());
        Address saveAdress = addressRepository.save(address);

        return new AddressResponse(saveAdress);
    }

    @Override
    public String deleteAddress(Integer id) {
        addressRepository.deleteById(id);
        return "Address deleted with id: "+id;
    }
}
