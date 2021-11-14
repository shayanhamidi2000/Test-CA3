package org.springframework.samples.petclinic.model.priceCalculators;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.UserType;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimplePriceCalculatorTest {
    @Test
    public void calcPriceTest_first_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet = mock(Pet.class);
        UserType givenUserType = UserType.SILVER;
        double givenBaseCharge = 1;
        double givenBasePricePerPet = 2;
        when(mockedPet.getType()).thenReturn(mockedPetType);
        when(mockedPetType.getRare()).thenReturn(Boolean.FALSE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet);
        SimplePriceCalculator sut = new SimplePriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 3, actualTotalPrice, 0.1);
    }

    @Test
    public void calcPriceTest_second_path(){
        // Arrange
        PetType mockedPetType = mock(PetType.class);
        Pet mockedPet = mock(Pet.class);
        UserType givenUserType = UserType.NEW;
        double givenBaseCharge = 88;
        double givenBasePricePerPet = 10;
        when(mockedPet.getType()).thenReturn(mockedPetType);
        when(mockedPetType.getRare()).thenReturn(Boolean.TRUE);
        ArrayList<Pet> givenPets = new ArrayList<Pet>();
        givenPets.add(mockedPet);
        SimplePriceCalculator sut = new SimplePriceCalculator();

        // Act
        double actualTotalPrice = sut.calcPrice(givenPets, givenBaseCharge, givenBasePricePerPet, givenUserType);

        // Assert
        Assert.assertEquals("The price does not match!", 95, actualTotalPrice, 0.1);
    }
}
