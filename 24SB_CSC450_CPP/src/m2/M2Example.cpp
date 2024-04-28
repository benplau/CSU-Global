//#include <iostream>
//#include <cstring>
//#include <string>
//
//int main() {
//    // Unsafe string manipulation
//    char buffer[32];
//    std::cout << "Enter your name: ";
//    std::cin.getline(buffer, sizeof(buffer));
//    std::cout << "Hello, " << buffer << "!" << std::endl;
//
//    // Potential buffer overflow vulnerability
//
//    // Safer string manipulation using std::string
//    std::string name;
//    std::cout << "Enter your name: ";
//    std::getline(std::cin, name);
//    std::cout << "Hello, " << name << "!" << std::endl;
//
//    // Using bounded string functions
//    char safeBuffer[32] = {0};
//    std::cout << "Enter your name: ";
//    std::strncpy(safeBuffer, buffer, sizeof(safeBuffer) - 1);
//    safeBuffer[sizeof(safeBuffer) - 1] = '\0'; // Ensure null termination
//    std::cout << "Hello, " << safeBuffer << "!" << std::endl;
//
//    return 0;
//}
//
//
//
//
