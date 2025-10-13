package pt.com.GuiFcosta.mapper.custom;

import org.springframework.stereotype.Service;
import pt.com.GuiFcosta.data.dto.v1.PersonDTO;
import pt.com.GuiFcosta.model.Person;

@Service
public class PersonMapper {
    public PersonDTO convertEntityToDTO(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTO dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setFirstName(person.getFirstName());
        person.setLastName(person.getLastName());
        person.setAddress(person.getAddress());
        person.setGender(person.getGender());
        return person;
    }
}
