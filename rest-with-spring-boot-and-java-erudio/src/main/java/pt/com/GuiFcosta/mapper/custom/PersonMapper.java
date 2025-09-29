package pt.com.GuiFcosta.mapper.custom;

import org.springframework.stereotype.Service;
import pt.com.GuiFcosta.data.dto.v2.PersonDTOv2;
import pt.com.GuiFcosta.model.Person;

import java.util.Date;

@Service
public class PersonMapper {
    public PersonDTOv2 convertEntityToDTO(Person person) {
        PersonDTOv2 dto = new PersonDTOv2();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDate(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTOv2 dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setFirstName(person.getFirstName());
        person.setLastName(person.getLastName());
        // person.setBirthDate(new Date());
        person.setAddress(person.getAddress());
        person.setGender(person.getGender());
        return person;
    }
}
