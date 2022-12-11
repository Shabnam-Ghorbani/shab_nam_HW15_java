package ir.maktab.service;

import ir.maktab.model.Address;
import ir.maktab.repository.AddressRepository;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    private static AddressRepository addressRepository = new AddressRepository();

    @Override
    public void saveAddress(Address address) {
        addressRepository.saveAddress(address);
    }

    @Override
    public Address showAddressFindById(int id) {
        return addressRepository.showAddressFindById(id);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.updateAddress(address);
    }

    @Override
    public void removeAddress(Address address) {
        addressRepository.removeAddress(address);
    }
}
