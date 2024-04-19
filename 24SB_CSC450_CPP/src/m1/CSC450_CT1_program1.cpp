#include <iostream>
#include <string>

int main() {
    std::string firstName, lastName, streetAddress, city, zipCode;

    std::cout << "Enter the first name: ";
    std::getline(std::cin, firstName);

    std::cout << "Enter the last name: ";
    std::getline(std::cin, lastName);

    std::cout << "Enter the street address: ";
    std::getline(std::cin, streetAddress);

    std::cout << "Enter the city: ";
    std::getline(std::cin, city);

    std::cout << "Enter the zip code: ";
    std::getline(std::cin, zipCode);

    std::cout << "\nInformation for the fictional person:" << std::endl;
    std::cout << "First Name: " << firstName << std::endl;
    std::cout << "Last Name: " << lastName << std::endl;
    std::cout << "Street Address: " << streetAddress << std::endl;
    std::cout << "City: " << city << std::endl;
    std::cout << "Zip Code: " << zipCode << std::endl;

    return 0;
}
