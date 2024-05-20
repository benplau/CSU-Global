#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>

using namespace std;

void reverseFileContent(const string &inputFile, const string &outputFile) {
    ifstream inFile(inputFile.c_str());
    if (!inFile.is_open()) {
        cerr << "Error opening input file: " << inputFile << endl;
        return;
    }

    string content;
    string line;
    while (getline(inFile, line)) {
        content += line + "\n";
    }
    inFile.close();

    reverse(content.begin(), content.end());

    ofstream outFile(outputFile.c_str());
    if (!outFile.is_open()) {
        cerr << "Error opening output file: " << outputFile << endl;
        return;
    }

    outFile << content;
    outFile.close();
}

int main() {
    const string inputFile = "CSC450_CT5_mod5.txt"; // @suppress("Invalid arguments")
    const string outputFile = "CSC450-mod5-reverse.txt"; // @suppress("Invalid arguments")

    string userInput;
    cout << "Enter text to append to " << inputFile << ": ";
    getline(cin, userInput);

    ofstream outFile(inputFile.c_str(), ios::app);
    if (!outFile.is_open()) {
        cerr << "Error opening file: " << inputFile << endl;
        return 1;
    }

    outFile << userInput << endl;
    outFile.close();

    reverseFileContent(inputFile, outputFile);

    cout << "\nUser input has been appended to " << inputFile << endl;
    cout << "Reversed content has been stored in " << outputFile << endl;

    return 0;
}
