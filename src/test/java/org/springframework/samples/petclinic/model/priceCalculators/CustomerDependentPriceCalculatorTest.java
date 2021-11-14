package org.springframework.samples.petclinic.model.priceCalculators;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.UserType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CustomerDependentPriceCalculatorTest {
    @Test
    public void calcPriceTest_first_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet = mock(Pet.class);
        UserType givenUserType = UserType.GOLD;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 2;
//        System.out.println(new Date(100, Calendar.JANUARY,1));
        when(mockedPet.getType()).thenReturn(mockedPetType);
        when(mockedPet.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPetType.getRare()).thenReturn(Boolean.FALSE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet);
        CustomerDependentPriceCalculator sut = new CustomerDependentPriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 2.92, actualTotalPrice, 0.01);
    }

    @Test
    public void calcPriceTest_second_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet = mock(Pet.class);
        UserType givenUserType = UserType.SILVER;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 10;
//        System.out.println(new Date(100, Calendar.JANUARY,1));
        when(mockedPet.getType()).thenReturn(mockedPetType);
        when(mockedPet.getBirthDate()).thenReturn(new Date(100, Calendar.JANUARY,1));
        when(mockedPetType.getRare()).thenReturn(Boolean.TRUE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet);
        CustomerDependentPriceCalculator sut = new CustomerDependentPriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 12, actualTotalPrice, 0.1);
    }

    @Test
    public void calcPriceTest_third_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet0 = mock(Pet.class);
        Pet mockedPet1 = mock(Pet.class);
        Pet mockedPet2 = mock(Pet.class);
        Pet mockedPet3 = mock(Pet.class);
        Pet mockedPet4 = mock(Pet.class);
        UserType givenUserType = UserType.NEW;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 100;
//        System.out.println(new Date(100, Calendar.JANUARY,1));
        when(mockedPet0.getType()).thenReturn(mockedPetType);
        when(mockedPet0.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet1.getType()).thenReturn(mockedPetType);
        when(mockedPet1.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet2.getType()).thenReturn(mockedPetType);
        when(mockedPet2.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet3.getType()).thenReturn(mockedPetType);
        when(mockedPet3.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet4.getType()).thenReturn(mockedPetType);
        when(mockedPet4.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPetType.getRare()).thenReturn(Boolean.TRUE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet0);
        givenPets.add(mockedPet1);
        givenPets.add(mockedPet2);
        givenPets.add(mockedPet3);
        givenPets.add(mockedPet4);
        CustomerDependentPriceCalculator sut = new CustomerDependentPriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 799, actualTotalPrice, 0.1);
    }

    @Test
    public void calcPriceTest_fourth_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet0 = mock(Pet.class);
        Pet mockedPet1 = mock(Pet.class);
        Pet mockedPet2 = mock(Pet.class);
        Pet mockedPet3 = mock(Pet.class);
        Pet mockedPet4 = mock(Pet.class);
        UserType givenUserType = UserType.GOLD;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 100;
//        System.out.println(new Date(100, Calendar.JANUARY,1));
        when(mockedPet0.getType()).thenReturn(mockedPetType);
        when(mockedPet0.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet1.getType()).thenReturn(mockedPetType);
        when(mockedPet1.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet2.getType()).thenReturn(mockedPetType);
        when(mockedPet2.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet3.getType()).thenReturn(mockedPetType);
        when(mockedPet3.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPet4.getType()).thenReturn(mockedPetType);
        when(mockedPet4.getBirthDate()).thenReturn(new Date(120, Calendar.JANUARY,1));
        when(mockedPetType.getRare()).thenReturn(Boolean.TRUE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet0);
        givenPets.add(mockedPet1);
        givenPets.add(mockedPet2);
        givenPets.add(mockedPet3);
        givenPets.add(mockedPet4);
        CustomerDependentPriceCalculator sut = new CustomerDependentPriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 672.8, actualTotalPrice, 0.1);
    }

    @Test
    public void calcPriceTest_fifth_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet = mock(Pet.class);
        UserType givenUserType = UserType.SILVER;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 2;
//        System.out.println(new Date(100, Calendar.JANUARY,1));
        when(mockedPet.getType()).thenReturn(mockedPetType);
        when(mockedPet.getBirthDate()).thenReturn(new Date(100, Calendar.JANUARY,1));
        when(mockedPetType.getRare()).thenReturn(Boolean.FALSE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet);
        CustomerDependentPriceCalculator sut = new CustomerDependentPriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 2, actualTotalPrice, 0.01);
    }
}
